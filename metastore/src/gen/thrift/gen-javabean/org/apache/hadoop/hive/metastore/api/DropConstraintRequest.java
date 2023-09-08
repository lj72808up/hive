/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)")
public class DropConstraintRequest implements org.apache.thrift.TBase<DropConstraintRequest, DropConstraintRequest._Fields>, java.io.Serializable, Cloneable, Comparable<DropConstraintRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DropConstraintRequest");

  private static final org.apache.thrift.protocol.TField DBNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("dbname", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TABLENAME_FIELD_DESC = new org.apache.thrift.protocol.TField("tablename", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CONSTRAINTNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("constraintname", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DropConstraintRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DropConstraintRequestTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.lang.String dbname; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String tablename; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String constraintname; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DBNAME((short)1, "dbname"),
    TABLENAME((short)2, "tablename"),
    CONSTRAINTNAME((short)3, "constraintname");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // DBNAME
          return DBNAME;
        case 2: // TABLENAME
          return TABLENAME;
        case 3: // CONSTRAINTNAME
          return CONSTRAINTNAME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DBNAME, new org.apache.thrift.meta_data.FieldMetaData("dbname", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLENAME, new org.apache.thrift.meta_data.FieldMetaData("tablename", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONSTRAINTNAME, new org.apache.thrift.meta_data.FieldMetaData("constraintname", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DropConstraintRequest.class, metaDataMap);
  }

  public DropConstraintRequest() {
  }

  public DropConstraintRequest(
    java.lang.String dbname,
    java.lang.String tablename,
    java.lang.String constraintname)
  {
    this();
    this.dbname = dbname;
    this.tablename = tablename;
    this.constraintname = constraintname;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DropConstraintRequest(DropConstraintRequest other) {
    if (other.isSetDbname()) {
      this.dbname = other.dbname;
    }
    if (other.isSetTablename()) {
      this.tablename = other.tablename;
    }
    if (other.isSetConstraintname()) {
      this.constraintname = other.constraintname;
    }
  }

  public DropConstraintRequest deepCopy() {
    return new DropConstraintRequest(this);
  }

  @Override
  public void clear() {
    this.dbname = null;
    this.tablename = null;
    this.constraintname = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDbname() {
    return this.dbname;
  }

  public void setDbname(@org.apache.thrift.annotation.Nullable java.lang.String dbname) {
    this.dbname = dbname;
  }

  public void unsetDbname() {
    this.dbname = null;
  }

  /** Returns true if field dbname is set (has been assigned a value) and false otherwise */
  public boolean isSetDbname() {
    return this.dbname != null;
  }

  public void setDbnameIsSet(boolean value) {
    if (!value) {
      this.dbname = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTablename() {
    return this.tablename;
  }

  public void setTablename(@org.apache.thrift.annotation.Nullable java.lang.String tablename) {
    this.tablename = tablename;
  }

  public void unsetTablename() {
    this.tablename = null;
  }

  /** Returns true if field tablename is set (has been assigned a value) and false otherwise */
  public boolean isSetTablename() {
    return this.tablename != null;
  }

  public void setTablenameIsSet(boolean value) {
    if (!value) {
      this.tablename = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getConstraintname() {
    return this.constraintname;
  }

  public void setConstraintname(@org.apache.thrift.annotation.Nullable java.lang.String constraintname) {
    this.constraintname = constraintname;
  }

  public void unsetConstraintname() {
    this.constraintname = null;
  }

  /** Returns true if field constraintname is set (has been assigned a value) and false otherwise */
  public boolean isSetConstraintname() {
    return this.constraintname != null;
  }

  public void setConstraintnameIsSet(boolean value) {
    if (!value) {
      this.constraintname = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case DBNAME:
      if (value == null) {
        unsetDbname();
      } else {
        setDbname((java.lang.String)value);
      }
      break;

    case TABLENAME:
      if (value == null) {
        unsetTablename();
      } else {
        setTablename((java.lang.String)value);
      }
      break;

    case CONSTRAINTNAME:
      if (value == null) {
        unsetConstraintname();
      } else {
        setConstraintname((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case DBNAME:
      return getDbname();

    case TABLENAME:
      return getTablename();

    case CONSTRAINTNAME:
      return getConstraintname();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case DBNAME:
      return isSetDbname();
    case TABLENAME:
      return isSetTablename();
    case CONSTRAINTNAME:
      return isSetConstraintname();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof DropConstraintRequest)
      return this.equals((DropConstraintRequest)that);
    return false;
  }

  public boolean equals(DropConstraintRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_dbname = true && this.isSetDbname();
    boolean that_present_dbname = true && that.isSetDbname();
    if (this_present_dbname || that_present_dbname) {
      if (!(this_present_dbname && that_present_dbname))
        return false;
      if (!this.dbname.equals(that.dbname))
        return false;
    }

    boolean this_present_tablename = true && this.isSetTablename();
    boolean that_present_tablename = true && that.isSetTablename();
    if (this_present_tablename || that_present_tablename) {
      if (!(this_present_tablename && that_present_tablename))
        return false;
      if (!this.tablename.equals(that.tablename))
        return false;
    }

    boolean this_present_constraintname = true && this.isSetConstraintname();
    boolean that_present_constraintname = true && that.isSetConstraintname();
    if (this_present_constraintname || that_present_constraintname) {
      if (!(this_present_constraintname && that_present_constraintname))
        return false;
      if (!this.constraintname.equals(that.constraintname))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetDbname()) ? 131071 : 524287);
    if (isSetDbname())
      hashCode = hashCode * 8191 + dbname.hashCode();

    hashCode = hashCode * 8191 + ((isSetTablename()) ? 131071 : 524287);
    if (isSetTablename())
      hashCode = hashCode * 8191 + tablename.hashCode();

    hashCode = hashCode * 8191 + ((isSetConstraintname()) ? 131071 : 524287);
    if (isSetConstraintname())
      hashCode = hashCode * 8191 + constraintname.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(DropConstraintRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetDbname(), other.isSetDbname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbname, other.dbname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTablename(), other.isSetTablename());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTablename()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tablename, other.tablename);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetConstraintname(), other.isSetConstraintname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConstraintname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.constraintname, other.constraintname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("DropConstraintRequest(");
    boolean first = true;

    sb.append("dbname:");
    if (this.dbname == null) {
      sb.append("null");
    } else {
      sb.append(this.dbname);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tablename:");
    if (this.tablename == null) {
      sb.append("null");
    } else {
      sb.append(this.tablename);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("constraintname:");
    if (this.constraintname == null) {
      sb.append("null");
    } else {
      sb.append(this.constraintname);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetDbname()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dbname' is unset! Struct:" + toString());
    }

    if (!isSetTablename()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tablename' is unset! Struct:" + toString());
    }

    if (!isSetConstraintname()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'constraintname' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DropConstraintRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DropConstraintRequestStandardScheme getScheme() {
      return new DropConstraintRequestStandardScheme();
    }
  }

  private static class DropConstraintRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<DropConstraintRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DropConstraintRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DBNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dbname = iprot.readString();
              struct.setDbnameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TABLENAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tablename = iprot.readString();
              struct.setTablenameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONSTRAINTNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.constraintname = iprot.readString();
              struct.setConstraintnameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DropConstraintRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.dbname != null) {
        oprot.writeFieldBegin(DBNAME_FIELD_DESC);
        oprot.writeString(struct.dbname);
        oprot.writeFieldEnd();
      }
      if (struct.tablename != null) {
        oprot.writeFieldBegin(TABLENAME_FIELD_DESC);
        oprot.writeString(struct.tablename);
        oprot.writeFieldEnd();
      }
      if (struct.constraintname != null) {
        oprot.writeFieldBegin(CONSTRAINTNAME_FIELD_DESC);
        oprot.writeString(struct.constraintname);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DropConstraintRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DropConstraintRequestTupleScheme getScheme() {
      return new DropConstraintRequestTupleScheme();
    }
  }

  private static class DropConstraintRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<DropConstraintRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DropConstraintRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.dbname);
      oprot.writeString(struct.tablename);
      oprot.writeString(struct.constraintname);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DropConstraintRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.dbname = iprot.readString();
      struct.setDbnameIsSet(true);
      struct.tablename = iprot.readString();
      struct.setTablenameIsSet(true);
      struct.constraintname = iprot.readString();
      struct.setConstraintnameIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

