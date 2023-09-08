/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hive.service.rpc.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)")
public class TTypeQualifiers implements org.apache.thrift.TBase<TTypeQualifiers, TTypeQualifiers._Fields>, java.io.Serializable, Cloneable, Comparable<TTypeQualifiers> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTypeQualifiers");

  private static final org.apache.thrift.protocol.TField QUALIFIERS_FIELD_DESC = new org.apache.thrift.protocol.TField("qualifiers", org.apache.thrift.protocol.TType.MAP, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TTypeQualifiersStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TTypeQualifiersTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,TTypeQualifierValue> qualifiers; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    QUALIFIERS((short)1, "qualifiers");

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
        case 1: // QUALIFIERS
          return QUALIFIERS;
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
    tmpMap.put(_Fields.QUALIFIERS, new org.apache.thrift.meta_data.FieldMetaData("qualifiers", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTypeQualifierValue.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTypeQualifiers.class, metaDataMap);
  }

  public TTypeQualifiers() {
  }

  public TTypeQualifiers(
    java.util.Map<java.lang.String,TTypeQualifierValue> qualifiers)
  {
    this();
    this.qualifiers = qualifiers;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTypeQualifiers(TTypeQualifiers other) {
    if (other.isSetQualifiers()) {
      java.util.Map<java.lang.String,TTypeQualifierValue> __this__qualifiers = new java.util.HashMap<java.lang.String,TTypeQualifierValue>(other.qualifiers.size());
      for (java.util.Map.Entry<java.lang.String, TTypeQualifierValue> other_element : other.qualifiers.entrySet()) {

        java.lang.String other_element_key = other_element.getKey();
        TTypeQualifierValue other_element_value = other_element.getValue();

        java.lang.String __this__qualifiers_copy_key = other_element_key;

        TTypeQualifierValue __this__qualifiers_copy_value = new TTypeQualifierValue(other_element_value);

        __this__qualifiers.put(__this__qualifiers_copy_key, __this__qualifiers_copy_value);
      }
      this.qualifiers = __this__qualifiers;
    }
  }

  public TTypeQualifiers deepCopy() {
    return new TTypeQualifiers(this);
  }

  @Override
  public void clear() {
    this.qualifiers = null;
  }

  public int getQualifiersSize() {
    return (this.qualifiers == null) ? 0 : this.qualifiers.size();
  }

  public void putToQualifiers(java.lang.String key, TTypeQualifierValue val) {
    if (this.qualifiers == null) {
      this.qualifiers = new java.util.HashMap<java.lang.String,TTypeQualifierValue>();
    }
    this.qualifiers.put(key, val);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Map<java.lang.String,TTypeQualifierValue> getQualifiers() {
    return this.qualifiers;
  }

  public void setQualifiers(@org.apache.thrift.annotation.Nullable java.util.Map<java.lang.String,TTypeQualifierValue> qualifiers) {
    this.qualifiers = qualifiers;
  }

  public void unsetQualifiers() {
    this.qualifiers = null;
  }

  /** Returns true if field qualifiers is set (has been assigned a value) and false otherwise */
  public boolean isSetQualifiers() {
    return this.qualifiers != null;
  }

  public void setQualifiersIsSet(boolean value) {
    if (!value) {
      this.qualifiers = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case QUALIFIERS:
      if (value == null) {
        unsetQualifiers();
      } else {
        setQualifiers((java.util.Map<java.lang.String,TTypeQualifierValue>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case QUALIFIERS:
      return getQualifiers();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case QUALIFIERS:
      return isSetQualifiers();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TTypeQualifiers)
      return this.equals((TTypeQualifiers)that);
    return false;
  }

  public boolean equals(TTypeQualifiers that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_qualifiers = true && this.isSetQualifiers();
    boolean that_present_qualifiers = true && that.isSetQualifiers();
    if (this_present_qualifiers || that_present_qualifiers) {
      if (!(this_present_qualifiers && that_present_qualifiers))
        return false;
      if (!this.qualifiers.equals(that.qualifiers))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetQualifiers()) ? 131071 : 524287);
    if (isSetQualifiers())
      hashCode = hashCode * 8191 + qualifiers.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TTypeQualifiers other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetQualifiers(), other.isSetQualifiers());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQualifiers()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.qualifiers, other.qualifiers);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TTypeQualifiers(");
    boolean first = true;

    sb.append("qualifiers:");
    if (this.qualifiers == null) {
      sb.append("null");
    } else {
      sb.append(this.qualifiers);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetQualifiers()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'qualifiers' is unset! Struct:" + toString());
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

  private static class TTypeQualifiersStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTypeQualifiersStandardScheme getScheme() {
      return new TTypeQualifiersStandardScheme();
    }
  }

  private static class TTypeQualifiersStandardScheme extends org.apache.thrift.scheme.StandardScheme<TTypeQualifiers> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTypeQualifiers struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // QUALIFIERS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.qualifiers = new java.util.HashMap<java.lang.String,TTypeQualifierValue>(2*_map0.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _key1;
                @org.apache.thrift.annotation.Nullable TTypeQualifierValue _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readString();
                  _val2 = new TTypeQualifierValue();
                  _val2.read(iprot);
                  struct.qualifiers.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setQualifiersIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTypeQualifiers struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.qualifiers != null) {
        oprot.writeFieldBegin(QUALIFIERS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.qualifiers.size()));
          for (java.util.Map.Entry<java.lang.String, TTypeQualifierValue> _iter4 : struct.qualifiers.entrySet())
          {
            oprot.writeString(_iter4.getKey());
            _iter4.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTypeQualifiersTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTypeQualifiersTupleScheme getScheme() {
      return new TTypeQualifiersTupleScheme();
    }
  }

  private static class TTypeQualifiersTupleScheme extends org.apache.thrift.scheme.TupleScheme<TTypeQualifiers> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTypeQualifiers struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.qualifiers.size());
        for (java.util.Map.Entry<java.lang.String, TTypeQualifierValue> _iter5 : struct.qualifiers.entrySet())
        {
          oprot.writeString(_iter5.getKey());
          _iter5.getValue().write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTypeQualifiers struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map6 = iprot.readMapBegin(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT); 
        struct.qualifiers = new java.util.HashMap<java.lang.String,TTypeQualifierValue>(2*_map6.size);
        @org.apache.thrift.annotation.Nullable java.lang.String _key7;
        @org.apache.thrift.annotation.Nullable TTypeQualifierValue _val8;
        for (int _i9 = 0; _i9 < _map6.size; ++_i9)
        {
          _key7 = iprot.readString();
          _val8 = new TTypeQualifierValue();
          _val8.read(iprot);
          struct.qualifiers.put(_key7, _val8);
        }
      }
      struct.setQualifiersIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
