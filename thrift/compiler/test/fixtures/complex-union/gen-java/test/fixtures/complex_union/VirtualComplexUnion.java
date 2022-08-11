/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.complex_union;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;
import org.apache.thrift.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

import static com.google.common.base.MoreObjects.toStringHelper;

@SwiftGenerated
@ThriftUnion("VirtualComplexUnion")
public final class VirtualComplexUnion implements com.facebook.thrift.payload.ThriftSerializable {
    private static final TStruct STRUCT_DESC = new TStruct("VirtualComplexUnion");
    private static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<String, Integer> THRIFT_NAMES_TO_IDS = new HashMap();
    private static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final VirtualComplexUnion _DEFAULT = new VirtualComplexUnion();

    public static final int _THINGONE = 1;
    private static final TField THING_ONE_FIELD_DESC = new TField("thingOne", TType.STRING, (short)1);
    public static final int _THINGTWO = 2;
    private static final TField THING_TWO_FIELD_DESC = new TField("thingTwo", TType.STRING, (short)2);

    static {
      NAMES_TO_IDS.put("thingOne", 1);
      THRIFT_NAMES_TO_IDS.put("thingOne", 1);
      FIELD_METADATA.put(1, THING_ONE_FIELD_DESC);
      NAMES_TO_IDS.put("thingTwo", 2);
      THRIFT_NAMES_TO_IDS.put("thingTwo", 2);
      FIELD_METADATA.put(2, THING_TWO_FIELD_DESC);
    }

    private java.lang.Object value;
    private short id;

    public static VirtualComplexUnion from(int _id, java.lang.Object _field) {
        return from((short) _id, _field);
    }

    public static VirtualComplexUnion from(short _id, java.lang.Object _field) {
        java.util.Objects.requireNonNull(_field);
        if (!FIELD_METADATA.containsKey(Integer.valueOf(_id))) {
            throw new java.lang.IllegalArgumentException("unknown field " + _id);
        }

        VirtualComplexUnion _u = new  VirtualComplexUnion();

        try {
            switch(_id) {
                case 1:
                    _u.id = _id;
                    _u.value = (String) _field;
                    return _u;
                case 2:
                    _u.id = _id;
                    _u.value = (String) _field;
                    return _u;
                default:
                throw new IllegalArgumentException("invalid type " + _field.getClass().getName() + " for field " + _id);
            }
        } catch (Exception t) {
            throw new IllegalArgumentException("invalid type " + _field.getClass().getName() + " for field " + _id);
        }
    }

    @ThriftConstructor
    public VirtualComplexUnion() {
    }
    
    public static VirtualComplexUnion fromThingOne(final String thingOne) {
        VirtualComplexUnion res = new VirtualComplexUnion();
        res.value = thingOne;
        res.id = 1;
        return res;
    }
    
    public static VirtualComplexUnion fromThingTwo(final String thingTwo) {
        VirtualComplexUnion res = new VirtualComplexUnion();
        res.value = thingTwo;
        res.id = 2;
        return res;
    }
    
    @com.facebook.swift.codec.ThriftField
    @Deprecated
    public void setThingOne(final String thingOne) {
        this.value = thingOne;
        this.id = 1;
    }
    @com.facebook.swift.codec.ThriftField
    @Deprecated
    public void setThingTwo(final String thingTwo) {
        this.value = thingTwo;
        this.id = 2;
    }

    @com.facebook.swift.codec.ThriftField(value=1, name="thingOne", requiredness=Requiredness.NONE)
    public String getThingOne() {
        if (this.id != 1) {
            throw new IllegalStateException("Not a thingOne element!");
        }
        return (String) value;
    }

    public boolean isSetThingOne() {
        return this.id == 1;
    }

    @com.facebook.swift.codec.ThriftField(value=2, name="thingTwo", requiredness=Requiredness.NONE)
    public String getThingTwo() {
        if (this.id != 2) {
            throw new IllegalStateException("Not a thingTwo element!");
        }
        return (String) value;
    }

    public boolean isSetThingTwo() {
        return this.id == 2;
    }

    @ThriftUnionId
    public short getThriftId() {
        return this.id;
    }

    public String getThriftName() {
        TField tField = (TField) FIELD_METADATA.get((int) this.id);
        if (tField == null) {
            return "null";
        } else {
            return tField.name;
        }
    }

    public void accept(Visitor visitor) {
        if (isSetThingOne()) {
            visitor.visitThingOne(getThingOne());
            return;
        }
        if (isSetThingTwo()) {
            visitor.visitThingTwo(getThingTwo());
            return;
        }
    }

    @java.lang.Override
    public String toString() {
        return toStringHelper(this)
            .add("value", value)
            .add("id", id)
            .add("name", getThriftName())
            .add("type", value == null ? "<null>" : value.getClass().getSimpleName())
            .toString();
    }

    @java.lang.Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        VirtualComplexUnion other = (VirtualComplexUnion)o;

        return Objects.equals(this.id, other.id)
                && Objects.deepEquals(this.value, other.value);
    }

    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new java.lang.Object[] {
            id,
            value,
        });
    }

    public interface Visitor {
        void visitThingOne(String thingOne);
        void visitThingTwo(String thingTwo);
    }

    public void write0(TProtocol oprot) throws TException {
      if (this.id != 0 && this.value == null ){
         return;
      }
      oprot.writeStructBegin(STRUCT_DESC);
      switch (this.id) {
      case _THINGONE: {
        oprot.writeFieldBegin(THING_ONE_FIELD_DESC);
        String thingOne = (String)this.value;
        oprot.writeString(thingOne);
        oprot.writeFieldEnd();
        break;
      }
      case _THINGTWO: {
        oprot.writeFieldBegin(THING_TWO_FIELD_DESC);
        String thingTwo = (String)this.value;
        oprot.writeString(thingTwo);
        oprot.writeFieldEnd();
        break;
      }
      default:
          // ignore unknown field
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    
    public static com.facebook.thrift.payload.Reader<VirtualComplexUnion> asReader() {
      return VirtualComplexUnion::read0;
    }
    
    public static VirtualComplexUnion read0(TProtocol oprot) throws TException {
      VirtualComplexUnion res = new VirtualComplexUnion();
      res.value = null;
      res.id = (short) 0;
      oprot.readStructBegin(VirtualComplexUnion.NAMES_TO_IDS, VirtualComplexUnion.THRIFT_NAMES_TO_IDS, VirtualComplexUnion.FIELD_METADATA);
      TField __field = oprot.readFieldBegin();
      if (__field.type != TType.STOP) {
          switch (__field.id) {
          case _THINGONE:
            if (__field.type == THING_ONE_FIELD_DESC.type) {
              String thingOne = oprot.readString();
              res.value = thingOne;
            }
            break;
          case _THINGTWO:
            if (__field.type == THING_TWO_FIELD_DESC.type) {
              String thingTwo = oprot.readString();
              res.value = thingTwo;
            }
            break;
          default:
            TProtocolUtil.skip(oprot, __field.type);
          }
        if (res.value != null) {
          res.id = __field.id;
        }
        oprot.readFieldEnd();
        TField __stopField = oprot.readFieldBegin(); // Consume the STOP byte
        if (__stopField.type != TType.STOP) {
          throw new TProtocolException(TProtocolException.INVALID_DATA, "Union 'VirtualComplexUnion' is missing a STOP byte");
        }
      }
      oprot.readStructEnd();
      return res;
    }
    public static VirtualComplexUnion defaultInstance() {
        return _DEFAULT;
    }

}
