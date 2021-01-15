/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.annotation;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import com.google.common.collect.*;
import java.util.*;
import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.server.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;
import org.apache.thrift.meta_data.FieldValueMetaData;
import static com.google.common.base.MoreObjects.toStringHelper;
import static com.google.common.base.MoreObjects.ToStringHelper;

@SwiftGenerated
@com.facebook.swift.codec.ThriftStruct(value="MyStruct", builder=MyStruct.Builder.class) @com.foo.Enabled @com.bar.AnotherAnnotation(val = 1) 
public final class MyStruct {

    @ThriftConstructor
    public MyStruct(
        @com.facebook.swift.codec.ThriftField(value=1, name="intField", requiredness=Requiredness.NONE) final long intField,
        @com.facebook.swift.codec.ThriftField(value=2, name="stringField", requiredness=Requiredness.NONE) final String stringField,
        @com.facebook.swift.codec.ThriftField(value=3, name="detailField", requiredness=Requiredness.NONE) final String detailField,
        @com.facebook.swift.codec.ThriftField(value=4, name="detailMap", requiredness=Requiredness.NONE) final com.foo.FastIntLongMap detailMap,
        @com.facebook.swift.codec.ThriftField(value=5, name="titi", requiredness=Requiredness.NONE) final String toto,
        @com.facebook.swift.codec.ThriftField(value=6, name="password", requiredness=Requiredness.NONE) final String password
    ) {
        this.intField = intField;
        this.stringField = stringField;
        this.detailField = detailField;
        this.detailMap = detailMap;
        this.toto = toto;
        this.password = password;
    }
    
    @ThriftConstructor
    protected MyStruct() {
      this.intField = 0L;
      this.stringField = null;
      this.detailField = null;
      this.detailMap = null;
      this.toto = null;
      this.password = null;
    }
    
    public static class Builder {
    
        private long intField = 0L;
        private String stringField = null;
        private String detailField = null;
        private com.foo.FastIntLongMap detailMap = null;
        private String toto = null;
        private String password = null;
    
        @com.facebook.swift.codec.ThriftField(value=1, name="intField", requiredness=Requiredness.NONE)
        public Builder setIntField(long intField) {
            this.intField = intField;
            return this;
        }
    
        public long getIntField() { return intField; }
    
            @com.facebook.swift.codec.ThriftField(value=2, name="stringField", requiredness=Requiredness.NONE)
        public Builder setStringField(String stringField) {
            this.stringField = stringField;
            return this;
        }
    
        public String getStringField() { return stringField; }
    
            @com.facebook.swift.codec.ThriftField(value=3, name="detailField", requiredness=Requiredness.NONE)
        public Builder setDetailField(String detailField) {
            this.detailField = detailField;
            return this;
        }
    
        public String getDetailField() { return detailField; }
    
            @com.facebook.swift.codec.ThriftField(value=4, name="detailMap", requiredness=Requiredness.NONE)
        public Builder setDetailMap(com.foo.FastIntLongMap detailMap) {
            this.detailMap = detailMap;
            return this;
        }
    
        public com.foo.FastIntLongMap getDetailMap() { return detailMap; }
    
            @com.facebook.swift.codec.ThriftField(value=5, name="titi", requiredness=Requiredness.NONE)
        public Builder setToto(String toto) {
            this.toto = toto;
            return this;
        }
    
        public String getToto() { return toto; }
    
            @com.facebook.swift.codec.ThriftField(value=6, name="password", requiredness=Requiredness.NONE)
        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }
    
        public String getPassword() { return password; }
    
        public Builder() { }
        public Builder(MyStruct other) {
            this.intField = other.intField;
            this.stringField = other.stringField;
            this.detailField = other.detailField;
            this.detailMap = other.detailMap;
            this.toto = other.toto;
            this.password = other.password;
        }
    
        @ThriftConstructor
        public MyStruct build() {
            MyStruct result = new MyStruct (
                this.intField,
                this.stringField,
                this.detailField,
                this.detailMap,
                this.toto,
                this.password
            );
            return result;
        }
    }
    
    public static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final TStruct STRUCT_DESC = new TStruct("MyStruct");
    private final long intField;
    public static final int _INTFIELD = 1;
    private static final TField INT_FIELD_FIELD_DESC = new TField("intField", TType.I64, (short)1);
        @com.foo.Bar("BAZ") private final String stringField;
    public static final int _STRINGFIELD = 2;
    private static final TField STRING_FIELD_FIELD_DESC = new TField("stringField", TType.STRING, (short)2);
        @com.foo.Ignored private final String detailField;
    public static final int _DETAILFIELD = 3;
    private static final TField DETAIL_FIELD_FIELD_DESC = new TField("detailField", TType.STRING, (short)3);
        @com.foo.Ignored private final com.foo.FastIntLongMap detailMap;
    public static final int _DETAILMAP = 4;
    private static final TField DETAIL_MAP_FIELD_DESC = new TField("detailMap", TType.MAP, (short)4);
        private final String toto;
    public static final int _TITI = 5;
    private static final TField TITI_FIELD_DESC = new TField("titi", TType.STRING, (short)5);
        private final String password;
    public static final int _PASSWORD = 6;
    private static final TField PASSWORD_FIELD_DESC = new TField("password", TType.STRING, (short)6);
    static {
      NAMES_TO_IDS.put("intField", 1);
      FIELD_METADATA.put(1, INT_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("stringField", 2);
      FIELD_METADATA.put(2, STRING_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("detailField", 3);
      FIELD_METADATA.put(3, DETAIL_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("detailMap", 4);
      FIELD_METADATA.put(4, DETAIL_MAP_FIELD_DESC);
      NAMES_TO_IDS.put("toto", 5);
      FIELD_METADATA.put(5, TITI_FIELD_DESC);
      NAMES_TO_IDS.put("password", 6);
      FIELD_METADATA.put(6, PASSWORD_FIELD_DESC);
    }
    
    @com.facebook.swift.codec.ThriftField(value=1, name="intField", requiredness=Requiredness.NONE)
    public long getIntField() { return intField; }
    
    
    @com.facebook.swift.codec.ThriftField(value=2, name="stringField", requiredness=Requiredness.NONE)
    public String getStringField() { return stringField; }
    
    
    @com.facebook.swift.codec.ThriftField(value=3, name="detailField", requiredness=Requiredness.NONE)
    public String getDetailField() { return detailField; }
    
    
    @com.facebook.swift.codec.ThriftField(value=4, name="detailMap", requiredness=Requiredness.NONE)
    public com.foo.FastIntLongMap getDetailMap() { return detailMap; }
    
    
    @com.facebook.swift.codec.ThriftField(value=5, name="titi", requiredness=Requiredness.NONE)
    public String getToto() { return toto; }
    
    
    @com.facebook.swift.codec.ThriftField(value=6, name="password", requiredness=Requiredness.NONE)
    public String getPassword() { return password; }
    
    @java.lang.Override
    public String toString() {
        ToStringHelper helper = toStringHelper(this);
        helper.add("intField", intField);
        helper.add("stringField", stringField);
        helper.add("detailField", detailField);
        helper.add("detailMap", detailMap);
        helper.add("toto", toto);
        helper.add("password", "<SENSITIVE FIELD>");
        return helper.toString();
    }
    
    @java.lang.Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    
        MyStruct other = (MyStruct)o;
    
        return
            Objects.equals(intField, other.intField) &&
            Objects.equals(stringField, other.stringField) &&
            Objects.equals(detailField, other.detailField) &&
            Objects.equals(detailMap, other.detailMap) &&
            Objects.equals(toto, other.toto) &&
            Objects.equals(password, other.password) &&
            true;
    }
    
    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            intField,
            stringField,
            detailField,
            detailMap,
            toto,
            password
        });
    }
    
    
    public static MyStruct read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin(MyStruct.NAMES_TO_IDS, MyStruct.FIELD_METADATA);
      MyStruct.Builder builder = new MyStruct.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _INTFIELD:
          if (__field.type == TType.I64) {
            long intField = oprot.readI64();
            builder.setIntField(intField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _STRINGFIELD:
          if (__field.type == TType.STRING) {
            String stringField = oprot.readString();
            builder.setStringField(stringField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _DETAILFIELD:
          if (__field.type == TType.STRING) {
            String detailField = oprot.readString();
            builder.setDetailField(detailField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _DETAILMAP:
          if (__field.type == TType.MAP) {
            com.foo.FastIntLongMap detailMap;
            {
            TMap _map = oprot.readMapBegin();
            detailMap = new com.foo.FastIntLongMap();
            for (int _i = 0; (_map.size < 0) ? oprot.peekMap() : (_i < _map.size); _i++) {
                
                int _key1 = oprot.readI32();
                long _value1 = oprot.readI64();
                detailMap.put(_key1, _value1);
            }
            }
            oprot.readMapEnd();
            builder.setDetailMap(detailMap);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _TITI:
          if (__field.type == TType.STRING) {
            String toto = oprot.readString();
            builder.setToto(toto);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _PASSWORD:
          if (__field.type == TType.STRING) {
            String password = oprot.readString();
            builder.setPassword(password);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(oprot, __field.type);
          break;
        }
        oprot.readFieldEnd();
      }
      oprot.readStructEnd();
      return builder.build();
    }
    
    public void write0(TProtocol oprot) throws TException {
      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(INT_FIELD_FIELD_DESC);
      oprot.writeI64(this.intField);
      oprot.writeFieldEnd();
      if (this.stringField != null) {
        oprot.writeFieldBegin(STRING_FIELD_FIELD_DESC);
        oprot.writeString(this.stringField);
        oprot.writeFieldEnd();
      }
      if (this.detailField != null) {
        oprot.writeFieldBegin(DETAIL_FIELD_FIELD_DESC);
        oprot.writeString(this.detailField);
        oprot.writeFieldEnd();
      }
      if (this.detailMap != null) {
        oprot.writeFieldBegin(DETAIL_MAP_FIELD_DESC);
        com.foo.FastIntLongMap _iter0 = this.detailMap;
        oprot.writeMapBegin(new TMap(TType.I32, TType.I64, _iter0.size()));
        for (Map.Entry<Integer, Long> _iter1 : _iter0.entrySet()) {
          oprot.writeI32(_iter1.getKey());
          oprot.writeI64(_iter1.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();
      }
      if (this.toto != null) {
        oprot.writeFieldBegin(TITI_FIELD_DESC);
        oprot.writeString(this.toto);
        oprot.writeFieldEnd();
      }
      if (this.password != null) {
        oprot.writeFieldBegin(PASSWORD_FIELD_DESC);
        oprot.writeString(this.password);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
}
