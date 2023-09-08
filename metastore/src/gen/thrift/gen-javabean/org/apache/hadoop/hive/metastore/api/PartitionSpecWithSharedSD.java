/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)")
public class PartitionSpecWithSharedSD implements org.apache.thrift.TBase<PartitionSpecWithSharedSD, PartitionSpecWithSharedSD._Fields>, java.io.Serializable, Cloneable, Comparable<PartitionSpecWithSharedSD> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PartitionSpecWithSharedSD");

  private static final org.apache.thrift.protocol.TField PARTITIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("partitions", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField SD_FIELD_DESC = new org.apache.thrift.protocol.TField("sd", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PartitionSpecWithSharedSDStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PartitionSpecWithSharedSDTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.List<PartitionWithoutSD> partitions; // required
  private @org.apache.thrift.annotation.Nullable StorageDescriptor sd; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PARTITIONS((short)1, "partitions"),
    SD((short)2, "sd");

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
        case 1: // PARTITIONS
          return PARTITIONS;
        case 2: // SD
          return SD;
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
    tmpMap.put(_Fields.PARTITIONS, new org.apache.thrift.meta_data.FieldMetaData("partitions", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PartitionWithoutSD.class))));
    tmpMap.put(_Fields.SD, new org.apache.thrift.meta_data.FieldMetaData("sd", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StorageDescriptor.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PartitionSpecWithSharedSD.class, metaDataMap);
  }

  public PartitionSpecWithSharedSD() {
  }

  public PartitionSpecWithSharedSD(
    java.util.List<PartitionWithoutSD> partitions,
    StorageDescriptor sd)
  {
    this();
    this.partitions = partitions;
    this.sd = sd;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PartitionSpecWithSharedSD(PartitionSpecWithSharedSD other) {
    if (other.isSetPartitions()) {
      java.util.List<PartitionWithoutSD> __this__partitions = new java.util.ArrayList<PartitionWithoutSD>(other.partitions.size());
      for (PartitionWithoutSD other_element : other.partitions) {
        __this__partitions.add(new PartitionWithoutSD(other_element));
      }
      this.partitions = __this__partitions;
    }
    if (other.isSetSd()) {
      this.sd = new StorageDescriptor(other.sd);
    }
  }

  public PartitionSpecWithSharedSD deepCopy() {
    return new PartitionSpecWithSharedSD(this);
  }

  @Override
  public void clear() {
    this.partitions = null;
    this.sd = null;
  }

  public int getPartitionsSize() {
    return (this.partitions == null) ? 0 : this.partitions.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<PartitionWithoutSD> getPartitionsIterator() {
    return (this.partitions == null) ? null : this.partitions.iterator();
  }

  public void addToPartitions(PartitionWithoutSD elem) {
    if (this.partitions == null) {
      this.partitions = new java.util.ArrayList<PartitionWithoutSD>();
    }
    this.partitions.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<PartitionWithoutSD> getPartitions() {
    return this.partitions;
  }

  public void setPartitions(@org.apache.thrift.annotation.Nullable java.util.List<PartitionWithoutSD> partitions) {
    this.partitions = partitions;
  }

  public void unsetPartitions() {
    this.partitions = null;
  }

  /** Returns true if field partitions is set (has been assigned a value) and false otherwise */
  public boolean isSetPartitions() {
    return this.partitions != null;
  }

  public void setPartitionsIsSet(boolean value) {
    if (!value) {
      this.partitions = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public StorageDescriptor getSd() {
    return this.sd;
  }

  public void setSd(@org.apache.thrift.annotation.Nullable StorageDescriptor sd) {
    this.sd = sd;
  }

  public void unsetSd() {
    this.sd = null;
  }

  /** Returns true if field sd is set (has been assigned a value) and false otherwise */
  public boolean isSetSd() {
    return this.sd != null;
  }

  public void setSdIsSet(boolean value) {
    if (!value) {
      this.sd = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PARTITIONS:
      if (value == null) {
        unsetPartitions();
      } else {
        setPartitions((java.util.List<PartitionWithoutSD>)value);
      }
      break;

    case SD:
      if (value == null) {
        unsetSd();
      } else {
        setSd((StorageDescriptor)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PARTITIONS:
      return getPartitions();

    case SD:
      return getSd();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PARTITIONS:
      return isSetPartitions();
    case SD:
      return isSetSd();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof PartitionSpecWithSharedSD)
      return this.equals((PartitionSpecWithSharedSD)that);
    return false;
  }

  public boolean equals(PartitionSpecWithSharedSD that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_partitions = true && this.isSetPartitions();
    boolean that_present_partitions = true && that.isSetPartitions();
    if (this_present_partitions || that_present_partitions) {
      if (!(this_present_partitions && that_present_partitions))
        return false;
      if (!this.partitions.equals(that.partitions))
        return false;
    }

    boolean this_present_sd = true && this.isSetSd();
    boolean that_present_sd = true && that.isSetSd();
    if (this_present_sd || that_present_sd) {
      if (!(this_present_sd && that_present_sd))
        return false;
      if (!this.sd.equals(that.sd))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPartitions()) ? 131071 : 524287);
    if (isSetPartitions())
      hashCode = hashCode * 8191 + partitions.hashCode();

    hashCode = hashCode * 8191 + ((isSetSd()) ? 131071 : 524287);
    if (isSetSd())
      hashCode = hashCode * 8191 + sd.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(PartitionSpecWithSharedSD other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetPartitions(), other.isSetPartitions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartitions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partitions, other.partitions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetSd(), other.isSetSd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSd()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sd, other.sd);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PartitionSpecWithSharedSD(");
    boolean first = true;

    sb.append("partitions:");
    if (this.partitions == null) {
      sb.append("null");
    } else {
      sb.append(this.partitions);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sd:");
    if (this.sd == null) {
      sb.append("null");
    } else {
      sb.append(this.sd);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (sd != null) {
      sd.validate();
    }
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

  private static class PartitionSpecWithSharedSDStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PartitionSpecWithSharedSDStandardScheme getScheme() {
      return new PartitionSpecWithSharedSDStandardScheme();
    }
  }

  private static class PartitionSpecWithSharedSDStandardScheme extends org.apache.thrift.scheme.StandardScheme<PartitionSpecWithSharedSD> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PartitionSpecWithSharedSD struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARTITIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list244 = iprot.readListBegin();
                struct.partitions = new java.util.ArrayList<PartitionWithoutSD>(_list244.size);
                @org.apache.thrift.annotation.Nullable PartitionWithoutSD _elem245;
                for (int _i246 = 0; _i246 < _list244.size; ++_i246)
                {
                  _elem245 = new PartitionWithoutSD();
                  _elem245.read(iprot);
                  struct.partitions.add(_elem245);
                }
                iprot.readListEnd();
              }
              struct.setPartitionsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.sd = new StorageDescriptor();
              struct.sd.read(iprot);
              struct.setSdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PartitionSpecWithSharedSD struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.partitions != null) {
        oprot.writeFieldBegin(PARTITIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.partitions.size()));
          for (PartitionWithoutSD _iter247 : struct.partitions)
          {
            _iter247.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.sd != null) {
        oprot.writeFieldBegin(SD_FIELD_DESC);
        struct.sd.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PartitionSpecWithSharedSDTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PartitionSpecWithSharedSDTupleScheme getScheme() {
      return new PartitionSpecWithSharedSDTupleScheme();
    }
  }

  private static class PartitionSpecWithSharedSDTupleScheme extends org.apache.thrift.scheme.TupleScheme<PartitionSpecWithSharedSD> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PartitionSpecWithSharedSD struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPartitions()) {
        optionals.set(0);
      }
      if (struct.isSetSd()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetPartitions()) {
        {
          oprot.writeI32(struct.partitions.size());
          for (PartitionWithoutSD _iter248 : struct.partitions)
          {
            _iter248.write(oprot);
          }
        }
      }
      if (struct.isSetSd()) {
        struct.sd.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PartitionSpecWithSharedSD struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list249 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
          struct.partitions = new java.util.ArrayList<PartitionWithoutSD>(_list249.size);
          @org.apache.thrift.annotation.Nullable PartitionWithoutSD _elem250;
          for (int _i251 = 0; _i251 < _list249.size; ++_i251)
          {
            _elem250 = new PartitionWithoutSD();
            _elem250.read(iprot);
            struct.partitions.add(_elem250);
          }
        }
        struct.setPartitionsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.sd = new StorageDescriptor();
        struct.sd.read(iprot);
        struct.setSdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

