#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

from __future__ import absolute_import
import sys
from thrift.util.Recursive import fix_spec
from thrift.Thrift import TType, TMessageType, TPriority, TRequestContext, TProcessorEventHandler, TServerInterface, TProcessor, TException, TApplicationException, UnimplementedTypedef
from thrift.protocol.TProtocol import TProtocolException


from .ttypes import UTF8STRINGS, IncludesIncluded, IncludesTransitiveFoo
import module.ttypes
import includes.ttypes

from thrift.Thrift import TProcessor
import pprint
import warnings
from thrift import Thrift
from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol
from thrift.protocol import TCompactProtocol
from thrift.protocol import THeaderProtocol
fastproto = None
try:
  from thrift.protocol import fastproto
except ImportError:
  pass

all_structs = []
UTF8STRINGS = bool(0) or sys.version_info.major >= 3

from thrift.util.Decorators import (
  future_process_main,
  future_process_method,
  process_main as thrift_process_main,
  process_method as thrift_process_method,
  should_run_on_thread,
  write_results_after_future,
)

class Iface:
  """
  This is a service-level docblock
  """
  def query(self, s=None, i=None):
    """
    This is a function-level docblock
    
    Parameters:
     - s
     - i
    """
    pass

  def has_arg_docs(self, s=None, i=None):
    """
    Parameters:
     - s
     - i: arg doc
    """
    pass


class ContextIface:
  """
  This is a service-level docblock
  """
  def query(self, handler_ctx, s=None, i=None):
    """
    This is a function-level docblock
    
    Parameters:
     - s
     - i
    """
    pass

  def has_arg_docs(self, handler_ctx, s=None, i=None):
    """
    Parameters:
     - s
     - i: arg doc
    """
    pass


# HELPER FUNCTIONS AND STRUCTURES

class query_args:
  """
  Attributes:
   - s
   - i
  """

  thrift_spec = None
  thrift_field_annotations = None
  thrift_struct_annotations = None
  __init__ = None
  @staticmethod
  def isUnion():
    return False

  def read(self, iprot):
    if (isinstance(iprot, TBinaryProtocol.TBinaryProtocolAccelerated) or (isinstance(iprot, THeaderProtocol.THeaderProtocolAccelerate) and iprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_BINARY_PROTOCOL)) and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastproto is not None:
      fastproto.decode(self, iprot.trans, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=0)
      return
    if (isinstance(iprot, TCompactProtocol.TCompactProtocolAccelerated) or (isinstance(iprot, THeaderProtocol.THeaderProtocolAccelerate) and iprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_COMPACT_PROTOCOL)) and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastproto is not None:
      fastproto.decode(self, iprot.trans, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=2)
      return
    iprot.readStructBegin()
    while True:
      (fname, ftype, fid) = iprot.readFieldBegin()
      if ftype == TType.STOP:
        break
      if fid == 1:
        if ftype == TType.STRUCT:
          self.s = module.ttypes.MyStruct()
          self.s.read(iprot)
        else:
          iprot.skip(ftype)
      elif fid == 2:
        if ftype == TType.STRUCT:
          self.i = includes.ttypes.Included()
          self.i.read(iprot)
        else:
          iprot.skip(ftype)
      else:
        iprot.skip(ftype)
      iprot.readFieldEnd()
    iprot.readStructEnd()

  def write(self, oprot):
    if (isinstance(oprot, TBinaryProtocol.TBinaryProtocolAccelerated) or (isinstance(oprot, THeaderProtocol.THeaderProtocolAccelerate) and oprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_BINARY_PROTOCOL)) and self.thrift_spec is not None and fastproto is not None:
      oprot.trans.write(fastproto.encode(self, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=0))
      return
    if (isinstance(oprot, TCompactProtocol.TCompactProtocolAccelerated) or (isinstance(oprot, THeaderProtocol.THeaderProtocolAccelerate) and oprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_COMPACT_PROTOCOL)) and self.thrift_spec is not None and fastproto is not None:
      oprot.trans.write(fastproto.encode(self, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=2))
      return
    oprot.writeStructBegin('query_args')
    if self.s != None:
      oprot.writeFieldBegin('s', TType.STRUCT, 1)
      self.s.write(oprot)
      oprot.writeFieldEnd()
    if self.i != None:
      oprot.writeFieldBegin('i', TType.STRUCT, 2)
      self.i.write(oprot)
      oprot.writeFieldEnd()
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def __repr__(self):
    L = []
    padding = ' ' * 4
    if self.s is not None:
      value = pprint.pformat(self.s, indent=0)
      value = padding.join(value.splitlines(True))
      L.append('    s=%s' % (value))
    if self.i is not None:
      value = pprint.pformat(self.i, indent=0)
      value = padding.join(value.splitlines(True))
      L.append('    i=%s' % (value))
    return "%s(%s)" % (self.__class__.__name__, "\n" + ",\n".join(L) if L else '')

  def __eq__(self, other):
    if not isinstance(other, self.__class__):
      return False

    return self.__dict__ == other.__dict__ 

  def __ne__(self, other):
    return not (self == other)

  # Override the __hash__ function for Python3 - t10434117
  __hash__ = object.__hash__

all_structs.append(query_args)
query_args.thrift_spec = (
  None, # 0
  (1, TType.STRUCT, 's', [module.ttypes.MyStruct, module.ttypes.MyStruct.thrift_spec, False], None, 2, ), # 1
  (2, TType.STRUCT, 'i', [includes.ttypes.Included, includes.ttypes.Included.thrift_spec, False], None, 2, ), # 2
)

query_args.thrift_struct_annotations = {
}
query_args.thrift_field_annotations = {
}

def query_args__init__(self, s=None, i=None,):
  self.s = s
  self.i = i

query_args.__init__ = query_args__init__

def query_args__setstate__(self, state):
  state.setdefault('s', None)
  state.setdefault('i', None)
  self.__dict__ = state

query_args.__getstate__ = lambda self: self.__dict__.copy()
query_args.__setstate__ = query_args__setstate__

class query_result:

  thrift_spec = None
  thrift_field_annotations = None
  thrift_struct_annotations = None
  @staticmethod
  def isUnion():
    return False

  def read(self, iprot):
    if (isinstance(iprot, TBinaryProtocol.TBinaryProtocolAccelerated) or (isinstance(iprot, THeaderProtocol.THeaderProtocolAccelerate) and iprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_BINARY_PROTOCOL)) and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastproto is not None:
      fastproto.decode(self, iprot.trans, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=0)
      return
    if (isinstance(iprot, TCompactProtocol.TCompactProtocolAccelerated) or (isinstance(iprot, THeaderProtocol.THeaderProtocolAccelerate) and iprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_COMPACT_PROTOCOL)) and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastproto is not None:
      fastproto.decode(self, iprot.trans, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=2)
      return
    iprot.readStructBegin()
    while True:
      (fname, ftype, fid) = iprot.readFieldBegin()
      if ftype == TType.STOP:
        break
      else:
        iprot.skip(ftype)
      iprot.readFieldEnd()
    iprot.readStructEnd()

  def write(self, oprot):
    if (isinstance(oprot, TBinaryProtocol.TBinaryProtocolAccelerated) or (isinstance(oprot, THeaderProtocol.THeaderProtocolAccelerate) and oprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_BINARY_PROTOCOL)) and self.thrift_spec is not None and fastproto is not None:
      oprot.trans.write(fastproto.encode(self, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=0))
      return
    if (isinstance(oprot, TCompactProtocol.TCompactProtocolAccelerated) or (isinstance(oprot, THeaderProtocol.THeaderProtocolAccelerate) and oprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_COMPACT_PROTOCOL)) and self.thrift_spec is not None and fastproto is not None:
      oprot.trans.write(fastproto.encode(self, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=2))
      return
    oprot.writeStructBegin('query_result')
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def __repr__(self):
    L = []
    padding = ' ' * 4
    return "%s(%s)" % (self.__class__.__name__, "\n" + ",\n".join(L) if L else '')

  def __eq__(self, other):
    if not isinstance(other, self.__class__):
      return False

    return self.__dict__ == other.__dict__ 

  def __ne__(self, other):
    return not (self == other)

  # Override the __hash__ function for Python3 - t10434117
  __hash__ = object.__hash__

all_structs.append(query_result)
query_result.thrift_spec = (
)

query_result.thrift_struct_annotations = {
}
query_result.thrift_field_annotations = {
}

class has_arg_docs_args:
  """
  Attributes:
   - s
   - i: arg doc
  """

  thrift_spec = None
  thrift_field_annotations = None
  thrift_struct_annotations = None
  __init__ = None
  @staticmethod
  def isUnion():
    return False

  def read(self, iprot):
    if (isinstance(iprot, TBinaryProtocol.TBinaryProtocolAccelerated) or (isinstance(iprot, THeaderProtocol.THeaderProtocolAccelerate) and iprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_BINARY_PROTOCOL)) and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastproto is not None:
      fastproto.decode(self, iprot.trans, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=0)
      return
    if (isinstance(iprot, TCompactProtocol.TCompactProtocolAccelerated) or (isinstance(iprot, THeaderProtocol.THeaderProtocolAccelerate) and iprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_COMPACT_PROTOCOL)) and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastproto is not None:
      fastproto.decode(self, iprot.trans, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=2)
      return
    iprot.readStructBegin()
    while True:
      (fname, ftype, fid) = iprot.readFieldBegin()
      if ftype == TType.STOP:
        break
      if fid == 1:
        if ftype == TType.STRUCT:
          self.s = module.ttypes.MyStruct()
          self.s.read(iprot)
        else:
          iprot.skip(ftype)
      elif fid == 2:
        if ftype == TType.STRUCT:
          self.i = includes.ttypes.Included()
          self.i.read(iprot)
        else:
          iprot.skip(ftype)
      else:
        iprot.skip(ftype)
      iprot.readFieldEnd()
    iprot.readStructEnd()

  def write(self, oprot):
    if (isinstance(oprot, TBinaryProtocol.TBinaryProtocolAccelerated) or (isinstance(oprot, THeaderProtocol.THeaderProtocolAccelerate) and oprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_BINARY_PROTOCOL)) and self.thrift_spec is not None and fastproto is not None:
      oprot.trans.write(fastproto.encode(self, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=0))
      return
    if (isinstance(oprot, TCompactProtocol.TCompactProtocolAccelerated) or (isinstance(oprot, THeaderProtocol.THeaderProtocolAccelerate) and oprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_COMPACT_PROTOCOL)) and self.thrift_spec is not None and fastproto is not None:
      oprot.trans.write(fastproto.encode(self, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=2))
      return
    oprot.writeStructBegin('has_arg_docs_args')
    if self.s != None:
      oprot.writeFieldBegin('s', TType.STRUCT, 1)
      self.s.write(oprot)
      oprot.writeFieldEnd()
    if self.i != None:
      oprot.writeFieldBegin('i', TType.STRUCT, 2)
      self.i.write(oprot)
      oprot.writeFieldEnd()
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def __repr__(self):
    L = []
    padding = ' ' * 4
    if self.s is not None:
      value = pprint.pformat(self.s, indent=0)
      value = padding.join(value.splitlines(True))
      L.append('    s=%s' % (value))
    if self.i is not None:
      value = pprint.pformat(self.i, indent=0)
      value = padding.join(value.splitlines(True))
      L.append('    i=%s' % (value))
    return "%s(%s)" % (self.__class__.__name__, "\n" + ",\n".join(L) if L else '')

  def __eq__(self, other):
    if not isinstance(other, self.__class__):
      return False

    return self.__dict__ == other.__dict__ 

  def __ne__(self, other):
    return not (self == other)

  # Override the __hash__ function for Python3 - t10434117
  __hash__ = object.__hash__

all_structs.append(has_arg_docs_args)
has_arg_docs_args.thrift_spec = (
  None, # 0
  (1, TType.STRUCT, 's', [module.ttypes.MyStruct, module.ttypes.MyStruct.thrift_spec, False], None, 2, ), # 1
  (2, TType.STRUCT, 'i', [includes.ttypes.Included, includes.ttypes.Included.thrift_spec, False], None, 2, ), # 2
)

has_arg_docs_args.thrift_struct_annotations = {
}
has_arg_docs_args.thrift_field_annotations = {
}

def has_arg_docs_args__init__(self, s=None, i=None,):
  self.s = s
  self.i = i

has_arg_docs_args.__init__ = has_arg_docs_args__init__

def has_arg_docs_args__setstate__(self, state):
  state.setdefault('s', None)
  state.setdefault('i', None)
  self.__dict__ = state

has_arg_docs_args.__getstate__ = lambda self: self.__dict__.copy()
has_arg_docs_args.__setstate__ = has_arg_docs_args__setstate__

class has_arg_docs_result:

  thrift_spec = None
  thrift_field_annotations = None
  thrift_struct_annotations = None
  @staticmethod
  def isUnion():
    return False

  def read(self, iprot):
    if (isinstance(iprot, TBinaryProtocol.TBinaryProtocolAccelerated) or (isinstance(iprot, THeaderProtocol.THeaderProtocolAccelerate) and iprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_BINARY_PROTOCOL)) and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastproto is not None:
      fastproto.decode(self, iprot.trans, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=0)
      return
    if (isinstance(iprot, TCompactProtocol.TCompactProtocolAccelerated) or (isinstance(iprot, THeaderProtocol.THeaderProtocolAccelerate) and iprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_COMPACT_PROTOCOL)) and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastproto is not None:
      fastproto.decode(self, iprot.trans, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=2)
      return
    iprot.readStructBegin()
    while True:
      (fname, ftype, fid) = iprot.readFieldBegin()
      if ftype == TType.STOP:
        break
      else:
        iprot.skip(ftype)
      iprot.readFieldEnd()
    iprot.readStructEnd()

  def write(self, oprot):
    if (isinstance(oprot, TBinaryProtocol.TBinaryProtocolAccelerated) or (isinstance(oprot, THeaderProtocol.THeaderProtocolAccelerate) and oprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_BINARY_PROTOCOL)) and self.thrift_spec is not None and fastproto is not None:
      oprot.trans.write(fastproto.encode(self, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=0))
      return
    if (isinstance(oprot, TCompactProtocol.TCompactProtocolAccelerated) or (isinstance(oprot, THeaderProtocol.THeaderProtocolAccelerate) and oprot.get_protocol_id() == THeaderProtocol.THeaderProtocol.T_COMPACT_PROTOCOL)) and self.thrift_spec is not None and fastproto is not None:
      oprot.trans.write(fastproto.encode(self, [self.__class__, self.thrift_spec, False], utf8strings=UTF8STRINGS, protoid=2))
      return
    oprot.writeStructBegin('has_arg_docs_result')
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def __repr__(self):
    L = []
    padding = ' ' * 4
    return "%s(%s)" % (self.__class__.__name__, "\n" + ",\n".join(L) if L else '')

  def __eq__(self, other):
    if not isinstance(other, self.__class__):
      return False

    return self.__dict__ == other.__dict__ 

  def __ne__(self, other):
    return not (self == other)

  # Override the __hash__ function for Python3 - t10434117
  __hash__ = object.__hash__

all_structs.append(has_arg_docs_result)
has_arg_docs_result.thrift_spec = (
)

has_arg_docs_result.thrift_struct_annotations = {
}
has_arg_docs_result.thrift_field_annotations = {
}

class Client(Iface):
  """
  This is a service-level docblock
  """
  _fbthrift_force_cpp_transport = False

  def __enter__(self):
    if self._fbthrift_cpp_transport:
      self._fbthrift_cpp_transport.__enter__()
    return self

  def __exit__(self, type, value, tb):
    if self._fbthrift_cpp_transport:
      self._fbthrift_cpp_transport.__exit__(type, value, tb)
    if self._iprot:
      self._iprot.trans.close()
    if self._oprot and self._iprot is not self._oprot:
      self._oprot.trans.close()

  def __init__(self, iprot=None, oprot=None, cpp_transport=None):
    self._iprot = self._oprot = iprot
    if oprot != None:
      self._oprot = oprot
    self._seqid = 0
    self._fbthrift_cpp_transport = cpp_transport

  def set_persistent_header(self, key, value):
    if self._fbthrift_cpp_transport:
      self._fbthrift_cpp_transport.set_persistent_header(key, value)
    else:
      try:
        self._oprot.trans.set_persistent_header(key, value)
      except AttributeError:
        pass

  def get_persistent_headers(self):
    if self._fbthrift_cpp_transport:
      return self._fbthrift_cpp_transport.get_persistent_headers()
    try:
      return self._oprot.trans.get_write_persistent_headers()
    except AttributeError:
      return {}

  def clear_persistent_headers(self):
    if self._fbthrift_cpp_transport:
      self._fbthrift_cpp_transport.clear_persistent_headers()
    else:
      try:
        self._oprot.trans.clear_persistent_headers()
      except AttributeError:
        pass

  def set_onetime_header(self, key, value):
    if self._fbthrift_cpp_transport:
      self._fbthrift_cpp_transport.set_onetime_header(key, value)
    else:
      try:
        self._oprot.trans.set_header(key, value)
      except AttributeError:
        pass

  def get_last_response_headers(self):
    if self._fbthrift_cpp_transport:
      return self._fbthrift_cpp_transport.get_last_response_headers()
    try:
      return self._iprot.trans.get_headers()
    except AttributeError:
      return {}

  def set_max_frame_size(self, size):
    if self._fbthrift_cpp_transport:
      pass
    else:
      try:
        self._oprot.trans.set_max_frame_size(size)
      except AttributeError:
        pass

  def query(self, s=None, i=None):
    """
    This is a function-level docblock
    
    Parameters:
     - s
     - i
    """
    if (self._fbthrift_cpp_transport):
      args = query_args()
      args.s = s
      args.i = i
      result = self._fbthrift_cpp_transport._send_request("MyService", "query", args, query_result)
      return None
    self.send_query(s, i)
    self.recv_query()

  def send_query(self, s=None, i=None):
    self._oprot.writeMessageBegin('query', TMessageType.CALL, self._seqid)
    args = query_args()
    args.s = s
    args.i = i
    args.write(self._oprot)
    self._oprot.writeMessageEnd()
    self._oprot.trans.flush()

  def recv_query(self, ):
    (fname, mtype, rseqid) = self._iprot.readMessageBegin()
    if mtype == TMessageType.EXCEPTION:
      x = TApplicationException()
      x.read(self._iprot)
      self._iprot.readMessageEnd()
      raise x
    result = query_result()
    result.read(self._iprot)
    self._iprot.readMessageEnd()
    return

  def has_arg_docs(self, s=None, i=None):
    """
    Parameters:
     - s
     - i: arg doc
    """
    if (self._fbthrift_cpp_transport):
      args = has_arg_docs_args()
      args.s = s
      args.i = i
      result = self._fbthrift_cpp_transport._send_request("MyService", "has_arg_docs", args, has_arg_docs_result)
      return None
    self.send_has_arg_docs(s, i)
    self.recv_has_arg_docs()

  def send_has_arg_docs(self, s=None, i=None):
    self._oprot.writeMessageBegin('has_arg_docs', TMessageType.CALL, self._seqid)
    args = has_arg_docs_args()
    args.s = s
    args.i = i
    args.write(self._oprot)
    self._oprot.writeMessageEnd()
    self._oprot.trans.flush()

  def recv_has_arg_docs(self, ):
    (fname, mtype, rseqid) = self._iprot.readMessageBegin()
    if mtype == TMessageType.EXCEPTION:
      x = TApplicationException()
      x.read(self._iprot)
      self._iprot.readMessageEnd()
      raise x
    result = has_arg_docs_result()
    result.read(self._iprot)
    self._iprot.readMessageEnd()
    return


class Processor(Iface, TProcessor):
  _onewayMethods = ()

  def __init__(self, handler):
    TProcessor.__init__(self)
    self._handler = handler
    self._processMap = {}
    self._priorityMap = {}
    self._processMap["query"] = Processor.process_query
    self._priorityMap["query"] = TPriority.NORMAL
    self._processMap["has_arg_docs"] = Processor.process_has_arg_docs
    self._priorityMap["has_arg_docs"] = TPriority.NORMAL

  def onewayMethods(self):
    l = []
    l.extend(Processor._onewayMethods)
    return tuple(l)

  @thrift_process_main()
  def process(self,): pass

  @thrift_process_method(query_args, oneway=False)
  def process_query(self, args, handler_ctx):
    result = query_result()
    try:
      self._handler.query(args.s, args.i)
    except:
      ex = sys.exc_info()[1]
      self._event_handler.handlerError(handler_ctx, 'query', ex)
      result = Thrift.TApplicationException(message=repr(ex))
    return result

  @thrift_process_method(has_arg_docs_args, oneway=False)
  def process_has_arg_docs(self, args, handler_ctx):
    result = has_arg_docs_result()
    try:
      self._handler.has_arg_docs(args.s, args.i)
    except:
      ex = sys.exc_info()[1]
      self._event_handler.handlerError(handler_ctx, 'has_arg_docs', ex)
      result = Thrift.TApplicationException(message=repr(ex))
    return result

Iface._processor_type = Processor

class ContextProcessor(ContextIface, TProcessor):
  _onewayMethods = ()

  def __init__(self, handler):
    TProcessor.__init__(self)
    self._handler = handler
    self._processMap = {}
    self._priorityMap = {}
    self._processMap["query"] = ContextProcessor.process_query
    self._priorityMap["query"] = TPriority.NORMAL
    self._processMap["has_arg_docs"] = ContextProcessor.process_has_arg_docs
    self._priorityMap["has_arg_docs"] = TPriority.NORMAL

  def onewayMethods(self):
    l = []
    l.extend(ContextProcessor._onewayMethods)
    return tuple(l)

  @thrift_process_main()
  def process(self,): pass

  @thrift_process_method(query_args, oneway=False)
  def process_query(self, args, handler_ctx):
    result = query_result()
    try:
      self._handler.query(handler_ctx, args.s, args.i)
    except:
      ex = sys.exc_info()[1]
      self._event_handler.handlerError(handler_ctx, 'query', ex)
      result = Thrift.TApplicationException(message=repr(ex))
    return result

  @thrift_process_method(has_arg_docs_args, oneway=False)
  def process_has_arg_docs(self, args, handler_ctx):
    result = has_arg_docs_result()
    try:
      self._handler.has_arg_docs(handler_ctx, args.s, args.i)
    except:
      ex = sys.exc_info()[1]
      self._event_handler.handlerError(handler_ctx, 'has_arg_docs', ex)
      result = Thrift.TApplicationException(message=repr(ex))
    return result

ContextIface._processor_type = ContextProcessor

fix_spec(all_structs)
del all_structs

