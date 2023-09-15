// @generated by Thrift for [[[ program path ]]]
// This file is probably not the place you want to edit!

package includes // [[[ program thrift source path ]]]

import (
    "fmt"
    "strings"

    transitive "transitive"
    thrift "github.com/facebook/fbthrift/thrift/lib/go/thrift"
)

var _ = transitive.GoUnusedProtection__

// (needed to ensure safety because of naive import list construction)
var _ = fmt.Printf
var _ = thrift.ZERO
var _ = strings.Split


type IncludedInt64 = int64

func NewIncludedInt64() IncludedInt64 {
    return 0
}

func WriteIncludedInt64(item IncludedInt64, p thrift.Protocol) error {
    if err := p.WriteI64(item); err != nil {
    return err
}
    return nil
}

func ReadIncludedInt64(p thrift.Protocol) (IncludedInt64, error) {
    var decodeResult IncludedInt64
    decodeErr := func() error {
        result, err := p.ReadI64()
if err != nil {
    return err
}
        decodeResult = result
        return nil
    }()
    return decodeResult, decodeErr
}

type TransitiveFoo = transitive.Foo

func NewTransitiveFoo() *TransitiveFoo {
    return transitive.NewFoo()
}

func WriteTransitiveFoo(item *TransitiveFoo, p thrift.Protocol) error {
    if err := item.Write(p); err != nil {
    return err
}
    return nil
}

func ReadTransitiveFoo(p thrift.Protocol) (TransitiveFoo, error) {
    var decodeResult TransitiveFoo
    decodeErr := func() error {
        result := *transitive.NewFoo()
err := result.Read(p)
if err != nil {
    return err
}
        decodeResult = result
        return nil
    }()
    return decodeResult, decodeErr
}

type Included struct {
    MyIntField int64 `thrift:"MyIntField,1" json:"MyIntField" db:"MyIntField"`
    MyTransitiveField *transitive.Foo `thrift:"MyTransitiveField,2" json:"MyTransitiveField" db:"MyTransitiveField"`
}
// Compile time interface enforcer
var _ thrift.Struct = &Included{}

func NewIncluded() *Included {
    return (&Included{}).
        SetMyIntFieldNonCompat(0).
        SetMyTransitiveFieldNonCompat(
              *transitive.ExampleFoo,
          )
}

func (x *Included) GetMyIntFieldNonCompat() int64 {
    return x.MyIntField
}

func (x *Included) GetMyIntField() int64 {
    return x.MyIntField
}

func (x *Included) GetMyTransitiveFieldNonCompat() *transitive.Foo {
    return x.MyTransitiveField
}

func (x *Included) GetMyTransitiveField() *transitive.Foo {
    if !x.IsSetMyTransitiveField() {
        return nil
    }

    return x.MyTransitiveField
}

func (x *Included) SetMyIntFieldNonCompat(value int64) *Included {
    x.MyIntField = value
    return x
}

func (x *Included) SetMyIntField(value int64) *Included {
    x.MyIntField = value
    return x
}

func (x *Included) SetMyTransitiveFieldNonCompat(value transitive.Foo) *Included {
    x.MyTransitiveField = &value
    return x
}

func (x *Included) SetMyTransitiveField(value *transitive.Foo) *Included {
    x.MyTransitiveField = value
    return x
}

func (x *Included) IsSetMyTransitiveField() bool {
    return x.MyTransitiveField != nil
}

func (x *Included) writeField1(p thrift.Protocol) error {  // MyIntField
    if err := p.WriteFieldBegin("MyIntField", thrift.I64, 1); err != nil {
        return thrift.PrependError(fmt.Sprintf("%T write field begin error: ", x), err)
    }

    item := x.GetMyIntFieldNonCompat()
    if err := p.WriteI64(item); err != nil {
    return err
}

    if err := p.WriteFieldEnd(); err != nil {
        return thrift.PrependError(fmt.Sprintf("%T write field end error: ", x), err)
    }
    return nil
}

func (x *Included) writeField2(p thrift.Protocol) error {  // MyTransitiveField
    if !x.IsSetMyTransitiveField() {
        return nil
    }

    if err := p.WriteFieldBegin("MyTransitiveField", thrift.STRUCT, 2); err != nil {
        return thrift.PrependError(fmt.Sprintf("%T write field begin error: ", x), err)
    }

    item := x.GetMyTransitiveFieldNonCompat()
    if err := item.Write(p); err != nil {
    return err
}

    if err := p.WriteFieldEnd(); err != nil {
        return thrift.PrependError(fmt.Sprintf("%T write field end error: ", x), err)
    }
    return nil
}

func (x *Included) readField1(p thrift.Protocol) error {  // MyIntField
    result, err := p.ReadI64()
if err != nil {
    return err
}

    x.SetMyIntFieldNonCompat(result)
    return nil
}

func (x *Included) readField2(p thrift.Protocol) error {  // MyTransitiveField
    result := *transitive.NewFoo()
err := result.Read(p)
if err != nil {
    return err
}

    x.SetMyTransitiveFieldNonCompat(result)
    return nil
}

func (x *Included) toString1() string {  // MyIntField
    return fmt.Sprintf("%v", x.GetMyIntFieldNonCompat())
}

func (x *Included) toString2() string {  // MyTransitiveField
    return fmt.Sprintf("%v", x.GetMyTransitiveFieldNonCompat())
}

// Deprecated: Use NewIncluded().GetMyTransitiveField() instead.
var Included_MyTransitiveField_DEFAULT = NewIncluded().GetMyTransitiveField()

// Deprecated: Use NewIncluded().GetMyTransitiveField() instead.
func (x *Included) DefaultGetMyTransitiveField() *transitive.Foo {
    if !x.IsSetMyTransitiveField() {
        return transitive.NewFoo()
    }
    return x.MyTransitiveField
}


// Deprecated: Use Included.Set* methods instead or set the fields directly.
type IncludedBuilder struct {
    obj *Included
}

func NewIncludedBuilder() *IncludedBuilder {
    return &IncludedBuilder{
        obj: NewIncluded(),
    }
}

func (x *IncludedBuilder) MyIntField(value int64) *IncludedBuilder {
    x.obj.MyIntField = value
    return x
}

func (x *IncludedBuilder) MyTransitiveField(value *transitive.Foo) *IncludedBuilder {
    x.obj.MyTransitiveField = value
    return x
}

func (x *IncludedBuilder) Emit() *Included {
    var objCopy Included = *x.obj
    return &objCopy
}

func (x *Included) Write(p thrift.Protocol) error {
    if err := p.WriteStructBegin("Included"); err != nil {
        return thrift.PrependError(fmt.Sprintf("%T write struct begin error: ", x), err)
    }

    if err := x.writeField1(p); err != nil {
        return err
    }

    if err := x.writeField2(p); err != nil {
        return err
    }

    if err := p.WriteFieldStop(); err != nil {
        return thrift.PrependError(fmt.Sprintf("%T write field stop error: ", x), err)
    }

    if err := p.WriteStructEnd(); err != nil {
        return thrift.PrependError(fmt.Sprintf("%T write struct end error: ", x), err)
    }
    return nil
}

func (x *Included) Read(p thrift.Protocol) error {
    if _, err := p.ReadStructBegin(); err != nil {
        return thrift.PrependError(fmt.Sprintf("%T read error: ", x), err)
    }

    for {
        _, wireType, id, err := p.ReadFieldBegin()
        if err != nil {
            return thrift.PrependError(fmt.Sprintf("%T field %d read error: ", x, id), err)
        }

        if wireType == thrift.STOP {
            break;
        }

        switch id {
        case 1:  // MyIntField
            expectedType := thrift.Type(thrift.I64)
            if wireType == expectedType {
                if err := x.readField1(p); err != nil {
                   return err
                }
            } else {
                if err := p.Skip(wireType); err != nil {
                    return err
                }
            }
        case 2:  // MyTransitiveField
            expectedType := thrift.Type(thrift.STRUCT)
            if wireType == expectedType {
                if err := x.readField2(p); err != nil {
                   return err
                }
            } else {
                if err := p.Skip(wireType); err != nil {
                    return err
                }
            }
        default:
            if err := p.Skip(wireType); err != nil {
                return err
            }
        }
    }

    if err := p.ReadFieldEnd(); err != nil {
        return err
    }

    if err := p.ReadStructEnd(); err != nil {
        return thrift.PrependError(fmt.Sprintf("%T read struct end error: ", x), err)
    }

    return nil
}

func (x *Included) String() string {
    if x == nil {
        return "<nil>"
    }

    var sb strings.Builder

    sb.WriteString("Included({")
    sb.WriteString(fmt.Sprintf("MyIntField:%s ", x.toString1()))
    sb.WriteString(fmt.Sprintf("MyTransitiveField:%s", x.toString2()))
    sb.WriteString("})")

    return sb.String()
}

// RegisterTypes registers types found in this file that have a thrift_uri with the passed in registry.
func RegisterTypes(registry interface {
	  RegisterType(name string, initializer func() any)
}) {

}
