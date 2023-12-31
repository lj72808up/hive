/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hive.common.jsonexplain.tez;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.hadoop.hive.common.jsonexplain.tez.Op.OpType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class Vertex implements Comparable<Vertex>{
  public final String name;
  //tezJsonParser
  public final TezJsonParser parser;
  // vertex's parent connections.
  public final List<Connection> parentConnections = new ArrayList<>();
  // vertex's children vertex.
  public final List<Vertex> children = new ArrayList<>();
  // the jsonObject for this vertex
  public final JSONObject vertexObject;
  // whether this vertex is dummy (which does not really exists but is created),
  // e.g., a dummy vertex for a mergejoin branch
  public boolean dummy;
  // the rootOps in this vertex
  public final List<Op> rootOps = new ArrayList<>();
  // we create a dummy vertex for a mergejoin branch for a self join if this
  // vertex is a mergejoin
  public final List<Vertex> mergeJoinDummyVertexs = new ArrayList<>();
  // whether this vertex has multiple reduce operators
  public boolean hasMultiReduceOp = false;
  // execution mode
  public String executionMode = "";
  // tagToInput for reduce work
  public Map<String, String> tagToInput = new LinkedHashMap<>();
  // tag
  public String tag;

  public static enum VertexType {
    MAP, REDUCE, UNION, UNKNOWN
  };
  public VertexType vertexType;

  public static enum EdgeType {
    BROADCAST, SHUFFLE, MULTICAST, PARTITION_ONLY_SHUFFLE, UNKNOWN
  };
  public EdgeType edgeType;

  public Vertex(String name, JSONObject vertexObject, TezJsonParser tezJsonParser) {
    super();
    this.name = name;
    if (this.name != null) {
      if (this.name.contains("Map")) {
        this.vertexType = VertexType.MAP;
      } else if (this.name.contains("Reduce")) {
        this.vertexType = VertexType.REDUCE;
      } else if (this.name.contains("Union")) {
        this.vertexType = VertexType.UNION;
      } else {
        this.vertexType = VertexType.UNKNOWN;
      }
    } else {
      this.vertexType = VertexType.UNKNOWN;
    }
    this.dummy = false;
    this.vertexObject = vertexObject;
    parser = tezJsonParser;
  }

  public void addDependency(Connection connection) throws JSONException {
    this.parentConnections.add(connection);
  }

  /**
   * @throws Exception
   *           We assume that there is a single top-level Map Operator Tree or a
   *           Reduce Operator Tree in a vertex
   */
  public void extractOpTree() throws Exception {
    if (vertexObject.length() != 0) {
      for (String key : JSONObject.getNames(vertexObject)) {
        if (key.equals("Map Operator Tree:")) {
          extractOp(vertexObject.getJSONArray(key).getJSONObject(0));
        } else if (key.equals("Reduce Operator Tree:") || key.equals("Processor Tree:")) {
          extractOp(vertexObject.getJSONObject(key));
        } else if (key.equals("Join:")) {
          // this is the case when we have a map-side SMB join
          // one input of the join is treated as a dummy vertex
          JSONArray array = vertexObject.getJSONArray(key);
          for (int index = 0; index < array.length(); index++) {
            JSONObject mpOpTree = array.getJSONObject(index);
            Vertex v = new Vertex(null, mpOpTree, parser);
            v.extractOpTree();
            v.dummy = true;
            mergeJoinDummyVertexs.add(v);
          }
        } else if (key.equals("Merge File Operator")) {
          JSONObject opTree = vertexObject.getJSONObject(key);
          if (opTree.has("Map Operator Tree:")) {
            extractOp(opTree.getJSONArray("Map Operator Tree:").getJSONObject(0));
          } else {
            throw new Exception("Merge File Operator does not have a Map Operator Tree");
          }
        } else if (key.equals("Execution mode:")) {
          executionMode = " " + vertexObject.getString(key);
        } else if (key.equals("tagToInput:")) {
          JSONObject tagToInput = vertexObject.getJSONObject(key);
          for (String tag : JSONObject.getNames(tagToInput)) {
            this.tagToInput.put(tag, (String) tagToInput.get(tag));
          }
        } else if (key.equals("tag:")) {
          this.tag = vertexObject.getString(key);
        } else {
          throw new Exception("Unsupported operator tree in vertex " + this.name);
        }
      }
    }
  }

  /**
   * @param operator
   * @param parent
   * @return
   * @throws Exception
   *           assumption: each operator only has one parent but may have many
   *           children
   */
  Op extractOp(JSONObject operator) throws Exception {
    String[] names = JSONObject.getNames(operator);
    if (names.length != 1) {
      throw new Exception("Expect only one operator in " + operator.toString());
    } else {
      String opName = names[0];
      JSONObject attrObj = (JSONObject) operator.get(opName);
      Map<String, String> attrs = new TreeMap<>();
      List<Op> children = new ArrayList<>();
      String id = null;
      String outputVertexName = null;
      for (String attrName : JSONObject.getNames(attrObj)) {
        if (attrName.equals("children")) {
          Object childrenObj = attrObj.get(attrName);
          if (childrenObj instanceof JSONObject) {
            if (((JSONObject) childrenObj).length() != 0) {
              children.add(extractOp((JSONObject) childrenObj));
            }
          } else if (childrenObj instanceof JSONArray) {
            if (((JSONArray) childrenObj).length() != 0) {
              JSONArray array = ((JSONArray) childrenObj);
              for (int index = 0; index < array.length(); index++) {
                children.add(extractOp(array.getJSONObject(index)));
              }
            }
          } else {
            throw new Exception("Unsupported operator " + this.name
                + "'s children operator is neither a jsonobject nor a jsonarray");
          }
        } else {
          if (attrName.equals("OperatorId:")) {
            id = attrObj.get(attrName).toString();
          } else if (attrName.equals("outputname:")) {
            outputVertexName = attrObj.get(attrName).toString();
          } else {
            if (!attrObj.get(attrName).toString().isEmpty()) {
              attrs.put(attrName, attrObj.get(attrName).toString());
            }
          }
        }
      }
      Op op = new Op(opName, id, outputVertexName, children, attrs, operator, this, parser);
      if (!children.isEmpty()) {
        for (Op child : children) {
          child.parent = op;
        }
      } else {
        this.rootOps.add(op);
      }
      return op;
    }
  }

  public void print(Printer printer, int indentFlag, String type, Vertex callingVertex) throws Exception {
    // print vertexname
    if (parser.printSet.contains(this) && !hasMultiReduceOp) {
      if (type != null) {
        printer.println(TezJsonParser.prefixString(indentFlag, "<-")
            + " Please refer to the previous " + this.name + " [" + type + "]");
      } else {
        printer.println(TezJsonParser.prefixString(indentFlag, "<-")
            + " Please refer to the previous " + this.name);
      }
      return;
    }
    parser.printSet.add(this);
    if (type != null) {
      printer.println(TezJsonParser.prefixString(indentFlag, "<-") + this.name + " [" + type + "]"
          + this.executionMode);
    } else if (this.name != null) {
      printer.println(TezJsonParser.prefixString(indentFlag) + this.name + this.executionMode);
    }
    // print operators
    if (hasMultiReduceOp && !(callingVertex.vertexType == VertexType.UNION)) {
      // find the right op
      Op choose = null;
      for (Op op : this.rootOps) {
        if (op.outputVertexName.equals(callingVertex.name)) {
          choose = op;
        }
      }
      if (choose != null) {
        choose.print(printer, indentFlag, false);
      } else {
        throw new Exception("Can not find the right reduce output operator for vertex " + this.name);
      }
    } else {
      for (Op op : this.rootOps) {
        // dummy vertex is treated as a branch of a join operator
        if (this.dummy) {
          op.print(printer, indentFlag, true);
        } else {
          op.print(printer, indentFlag, false);
        }
      }
    }
    if (vertexType == VertexType.UNION) {
      // print dependent vertexs
      indentFlag++;
      for (int index = 0; index < this.parentConnections.size(); index++) {
        Connection connection = this.parentConnections.get(index);
        connection.from.print(printer, indentFlag, connection.type, this);
      }
    }
  }

  /**
   * We check if a vertex has multiple reduce operators.
   */
  public void checkMultiReduceOperator() {
    // check if it is a reduce vertex and its children is more than 1;
    if (!this.name.contains("Reduce") || this.rootOps.size() < 2) {
      return;
    }
    // check if all the child ops are reduce output operators
    for (Op op : this.rootOps) {
      if (op.type != OpType.RS) {
        return;
      }
    }
    this.hasMultiReduceOp = true;
  }

  public void setType(String type) {
    switch (type) {
    case "BROADCAST_EDGE":
      this.edgeType = EdgeType.BROADCAST;
      break;
    case "SIMPLE_EDGE":
      this.edgeType = EdgeType.SHUFFLE;
      break;
    case "CUSTOM_SIMPLE_EDGE":
      this.edgeType = EdgeType.PARTITION_ONLY_SHUFFLE;
      break;
    case "CUSTOM_EDGE":
      this.edgeType = EdgeType.MULTICAST;
      break;
    default:
      this.edgeType = EdgeType.UNKNOWN;
    }
  }

  //The following code should be gone after HIVE-11075 using topological order
  @Override
  public int compareTo(Vertex o) {
    return this.name.compareTo(o.name);
  }

  public Op getSingleRSOp() {
    if (rootOps.size() == 0) {
      return null;
    } else {
      Op ret = null;
      for (Op op : rootOps) {
        if (op.type == OpType.RS) {
          if (ret == null) {
            ret = op;
          } else {
            // find more than one RS Op
            return null;
          }
        }
      }
      return ret;
    }
  }
}
