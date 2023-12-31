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
package org.apache.hadoop.hive.llap.metrics;

import org.apache.hadoop.metrics2.MetricsInfo;

import org.apache.hive.common.guava.Objects;

/**
 * Llap daemon I/O elevator metrics
 */
public enum LlapDaemonIOInfo implements MetricsInfo {
  IOMetrics("Llap daemon I/O elevator metrics"),
  PercentileDecodingTime("Percentile decoding time for encoded column batch"),
  MaxDecodingTime("Max time for decoding an encoded column batch");

  private final String desc;

  LlapDaemonIOInfo(String desc) {
    this.desc = desc;
  }

  @Override
  public String description() {
    return desc;
  }

  @Override
  public String toString() {
    return Objects.toStringHelper(this)
        .add("name", name()).add("description", desc)
        .toString();
  }
}
