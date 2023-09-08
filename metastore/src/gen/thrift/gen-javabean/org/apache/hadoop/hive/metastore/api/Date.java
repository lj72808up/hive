/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)")
public class Date implements org.apache.thrift.TBase<Date, Date._Fields>, java.io.Serializable, Cloneable, Comparable<Date> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Date");

  private static final org.apache.thrift.protocol.TField DAYS_SINCE_EPOCH_FIELD_DESC = new org.apache.thrift.protocol.TField("daysSinceEpoch", org.apache.thrift.protocol.TType.I64, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DateStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DateTupleSchemeFactory();

  private long daysSinceEpoch; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DAYS_SINCE_EPOCH((short)1, "daysSinceEpoch");

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
        case 1: // DAYS_SINCE_EPOCH
          return DAYS_SINCE_EPOCH;
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
  private static final int __DAYSSINCEEPOCH_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DAYS_SINCE_EPOCH, new org.apache.thrift.meta_data.FieldMetaData("daysSinceEpoch", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Date.class, metaDataMap);
  }

  public Date() {
  }

  public Date(
    long daysSinceEpoch)
  {
    this();
    this.daysSinceEpoch = daysSinceEpoch;
    setDaysSinceEpochIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Date(Date other) {
    __isset_bitfield = other.__isset_bitfield;
    this.daysSinceEpoch = other.daysSinceEpoch;
  }

  public Date deepCopy() {
    return new Date(this);
  }

  @Override
  public void clear() {
    setDaysSinceEpochIsSet(false);
    this.daysSinceEpoch = 0;
  }

  public long getDaysSinceEpoch() {
    return this.daysSinceEpoch;
  }

  public void setDaysSinceEpoch(long daysSinceEpoch) {
    this.daysSinceEpoch = daysSinceEpoch;
    setDaysSinceEpochIsSet(true);
  }

  public void unsetDaysSinceEpoch() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DAYSSINCEEPOCH_ISSET_ID);
  }

  /** Returns true if field daysSinceEpoch is set (has been assigned a value) and false otherwise */
  public boolean isSetDaysSinceEpoch() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DAYSSINCEEPOCH_ISSET_ID);
  }

  public void setDaysSinceEpochIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DAYSSINCEEPOCH_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case DAYS_SINCE_EPOCH:
      if (value == null) {
        unsetDaysSinceEpoch();
      } else {
        setDaysSinceEpoch((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case DAYS_SINCE_EPOCH:
      return getDaysSinceEpoch();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case DAYS_SINCE_EPOCH:
      return isSetDaysSinceEpoch();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof Date)
      return this.equals((Date)that);
    return false;
  }

  public boolean equals(Date that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_daysSinceEpoch = true;
    boolean that_present_daysSinceEpoch = true;
    if (this_present_daysSinceEpoch || that_present_daysSinceEpoch) {
      if (!(this_present_daysSinceEpoch && that_present_daysSinceEpoch))
        return false;
      if (this.daysSinceEpoch != that.daysSinceEpoch)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(daysSinceEpoch);

    return hashCode;
  }

  @Override
  public int compareTo(Date other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetDaysSinceEpoch(), other.isSetDaysSinceEpoch());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDaysSinceEpoch()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.daysSinceEpoch, other.daysSinceEpoch);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Date(");
    boolean first = true;

    sb.append("daysSinceEpoch:");
    sb.append(this.daysSinceEpoch);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetDaysSinceEpoch()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'daysSinceEpoch' is unset! Struct:" + toString());
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DateStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DateStandardScheme getScheme() {
      return new DateStandardScheme();
    }
  }

  private static class DateStandardScheme extends org.apache.thrift.scheme.StandardScheme<Date> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Date struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DAYS_SINCE_EPOCH
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.daysSinceEpoch = iprot.readI64();
              struct.setDaysSinceEpochIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Date struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(DAYS_SINCE_EPOCH_FIELD_DESC);
      oprot.writeI64(struct.daysSinceEpoch);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DateTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public DateTupleScheme getScheme() {
      return new DateTupleScheme();
    }
  }

  private static class DateTupleScheme extends org.apache.thrift.scheme.TupleScheme<Date> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Date struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI64(struct.daysSinceEpoch);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Date struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.daysSinceEpoch = iprot.readI64();
      struct.setDaysSinceEpochIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

