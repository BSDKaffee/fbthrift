/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.service_schema;

import static com.facebook.swift.service.SwiftConstants.STICKY_HASH_KEY;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.thrift.protocol.*;
import org.apache.thrift.ClientPushMetadata;
import org.apache.thrift.InteractionCreate;
import org.apache.thrift.InteractionTerminate;
import com.facebook.thrift.client.ResponseWrapper;
import com.facebook.thrift.client.RpcOptions;
import com.facebook.thrift.util.Readers;

public class PrimitivesServiceReactiveClient 
  implements PrimitivesService.Reactive {
  private static final AtomicLong _interactionCounter = new AtomicLong(0);

  protected final org.apache.thrift.ProtocolId _protocolId;
  protected final reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient;
  protected final reactor.core.publisher.Mono<Map<String, String>> _headersMono;
  protected final reactor.core.publisher.Mono<Map<String, String>> _persistentHeadersMono;
  protected final Set<Long> _activeInteractions;

  private static final TField _init_PARAM0_FIELD_DESC = new TField("param0", TType.I64, (short)1);
  private static final TField _init_PARAM1_FIELD_DESC = new TField("param1", TType.I64, (short)2);
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _init_EXCEPTION_READERS = java.util.Collections.emptyMap();
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _methodThatThrows_EXCEPTION_READERS = new HashMap<>();
  private static final com.facebook.thrift.payload.Reader _methodThatThrows_EXCEPTION_READER0 = Readers.wrap(test.fixtures.service_schema.CustomException.asReader());
  private static final TField _returnVoidMethod_ID_FIELD_DESC = new TField("id", TType.I64, (short)1);
  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _returnVoidMethod_EXCEPTION_READERS = java.util.Collections.emptyMap();

  static {
    _methodThatThrows_EXCEPTION_READERS.put((short)1, _methodThatThrows_EXCEPTION_READER0);
  }

  public PrimitivesServiceReactiveClient(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient) {
    
    this._protocolId = _protocolId;
    this._rpcClient = _rpcClient;
    this._headersMono = reactor.core.publisher.Mono.empty();
    this._persistentHeadersMono = reactor.core.publisher.Mono.empty();
    this._activeInteractions = ConcurrentHashMap.newKeySet();
  }

  public PrimitivesServiceReactiveClient(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient, Map<String, String> _headers, Map<String, String> _persistentHeaders) {
    this(_protocolId, _rpcClient, reactor.core.publisher.Mono.just(_headers != null ? _headers : java.util.Collections.emptyMap()), reactor.core.publisher.Mono.just(_persistentHeaders != null ? _persistentHeaders : java.util.Collections.emptyMap()), new AtomicLong(), ConcurrentHashMap.newKeySet());
  }

  public PrimitivesServiceReactiveClient(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient, reactor.core.publisher.Mono<Map<String, String>> _headersMono, reactor.core.publisher.Mono<Map<String, String>> _persistentHeadersMono) {
    this(_protocolId, _rpcClient, _headersMono, _persistentHeadersMono, new AtomicLong(), ConcurrentHashMap.newKeySet());
  }

  public PrimitivesServiceReactiveClient(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient, Map<String, String> _headers, Map<String, String> _persistentHeaders, AtomicLong interactionCounter, Set<Long> activeInteractions) {
    this(_protocolId,_rpcClient, reactor.core.publisher.Mono.just(_headers != null ? _headers : java.util.Collections.emptyMap()), reactor.core.publisher.Mono.just(_persistentHeaders != null ? _persistentHeaders : java.util.Collections.emptyMap()), interactionCounter, activeInteractions);
  }

  public PrimitivesServiceReactiveClient(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient, reactor.core.publisher.Mono<Map<String, String>> _headersMono, reactor.core.publisher.Mono<Map<String, String>> _persistentHeadersMono, AtomicLong interactionCounter, Set<Long> activeInteractions) {
    
    this._protocolId = _protocolId;
    this._rpcClient = _rpcClient;
    this._headersMono = _headersMono;
    this._persistentHeadersMono = _persistentHeadersMono;
    this._activeInteractions = activeInteractions;
  }

  @java.lang.Override
  public void dispose() {}

  private com.facebook.thrift.payload.Writer _createinitWriter(final long param0, final long param1) {
    return oprot -> {
      try {
        {
          oprot.writeFieldBegin(_init_PARAM0_FIELD_DESC);

          long _iter0 = param0;

          oprot.writeI64(param0);
          oprot.writeFieldEnd();
        }

        {
          oprot.writeFieldBegin(_init_PARAM1_FIELD_DESC);

          long _iter0 = param1;

          oprot.writeI64(param1);
          oprot.writeFieldEnd();
        }


      } catch (Throwable _e) {
        com.facebook.thrift.util.NettyUtil.releaseIfByteBufTProtocol(oprot);
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }

  private static final com.facebook.thrift.payload.Reader _init_READER = Readers.i64Reader();

  @java.lang.Override
  public reactor.core.publisher.Mono<com.facebook.thrift.client.ResponseWrapper<Long>> initWrapper(final long param0, final long param1,  final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return _rpcClient
      .flatMap(_rpc -> getHeaders(rpcOptions).flatMap(headers -> {
        org.apache.thrift.RequestRpcMetadata _metadata = new org.apache.thrift.RequestRpcMetadata.Builder()
                .setName("init")
                .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_SINGLE_RESPONSE)
                .setOtherMetadata(headers)
                .setProtocol(_protocolId)
                .build();

            com.facebook.thrift.payload.ClientRequestPayload<Long> _crp =
                com.facebook.thrift.payload.ClientRequestPayload.create(
                    "PrimitivesService",
                    _createinitWriter(param0, param1),
                    _init_READER,
                    _init_EXCEPTION_READERS,
                    _metadata,
                    java.util.Collections.emptyMap());

            return _rpc
                .singleRequestSingleResponse(_crp, rpcOptions).transform(com.facebook.thrift.util.MonoPublishingTransformer.getInstance()).doOnNext(_p -> {if(_p.getException() != null) throw com.facebook.thrift.util.ExceptionUtil.propagate(_p);});
      }));
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Long> init(final long param0, final long param1,  final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return initWrapper(param0, param1,  rpcOptions).map(_p -> _p.getData());
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Long> init(final long param0, final long param1) {
    return init(param0, param1,  com.facebook.thrift.client.RpcOptions.EMPTY);
  }

  private com.facebook.thrift.payload.Writer _createmethodThatThrowsWriter() {
    return oprot -> {
      try {

      } catch (Throwable _e) {
        com.facebook.thrift.util.NettyUtil.releaseIfByteBufTProtocol(oprot);
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }

  private static final com.facebook.thrift.payload.Reader _methodThatThrows_READER = Readers.wrap(test.fixtures.service_schema.Result.asReader());

  @java.lang.Override
  public reactor.core.publisher.Mono<com.facebook.thrift.client.ResponseWrapper<test.fixtures.service_schema.Result>> methodThatThrowsWrapper( final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return _rpcClient
      .flatMap(_rpc -> getHeaders(rpcOptions).flatMap(headers -> {
        org.apache.thrift.RequestRpcMetadata _metadata = new org.apache.thrift.RequestRpcMetadata.Builder()
                .setName("method_that_throws")
                .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_SINGLE_RESPONSE)
                .setOtherMetadata(headers)
                .setProtocol(_protocolId)
                .build();

            com.facebook.thrift.payload.ClientRequestPayload<test.fixtures.service_schema.Result> _crp =
                com.facebook.thrift.payload.ClientRequestPayload.create(
                    "PrimitivesService",
                    _createmethodThatThrowsWriter(),
                    _methodThatThrows_READER,
                    _methodThatThrows_EXCEPTION_READERS,
                    _metadata,
                    java.util.Collections.emptyMap());

            return _rpc
                .singleRequestSingleResponse(_crp, rpcOptions).transform(com.facebook.thrift.util.MonoPublishingTransformer.getInstance()).doOnNext(_p -> {if(_p.getException() != null) throw com.facebook.thrift.util.ExceptionUtil.propagate(_p);});
      }));
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<test.fixtures.service_schema.Result> methodThatThrows( final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return methodThatThrowsWrapper( rpcOptions).map(_p -> _p.getData());
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<test.fixtures.service_schema.Result> methodThatThrows() {
    return methodThatThrows( com.facebook.thrift.client.RpcOptions.EMPTY);
  }

  private com.facebook.thrift.payload.Writer _createreturnVoidMethodWriter(final long id) {
    return oprot -> {
      try {
        {
          oprot.writeFieldBegin(_returnVoidMethod_ID_FIELD_DESC);

          long _iter0 = id;

          oprot.writeI64(id);
          oprot.writeFieldEnd();
        }


      } catch (Throwable _e) {
        com.facebook.thrift.util.NettyUtil.releaseIfByteBufTProtocol(oprot);
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }

  private static final com.facebook.thrift.payload.Reader _returnVoidMethod_READER = Readers.voidReader();

  @java.lang.Override
  public reactor.core.publisher.Mono<com.facebook.thrift.client.ResponseWrapper<Void>> returnVoidMethodWrapper(final long id,  final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return _rpcClient
      .flatMap(_rpc -> getHeaders(rpcOptions).flatMap(headers -> {
        org.apache.thrift.RequestRpcMetadata _metadata = new org.apache.thrift.RequestRpcMetadata.Builder()
                .setName("return_void_method")
                .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_SINGLE_RESPONSE)
                .setOtherMetadata(headers)
                .setProtocol(_protocolId)
                .build();

            com.facebook.thrift.payload.ClientRequestPayload<Void> _crp =
                com.facebook.thrift.payload.ClientRequestPayload.create(
                    "PrimitivesService",
                    _createreturnVoidMethodWriter(id),
                    _returnVoidMethod_READER,
                    _returnVoidMethod_EXCEPTION_READERS,
                    _metadata,
                    java.util.Collections.emptyMap());

            return _rpc
                .singleRequestSingleResponse(_crp, rpcOptions).transform(com.facebook.thrift.util.MonoPublishingTransformer.getInstance()).doOnNext(_p -> {if(_p.getException() != null) throw com.facebook.thrift.util.ExceptionUtil.propagate(_p);});
      }));
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Void> returnVoidMethod(final long id,  final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return returnVoidMethodWrapper(id,  rpcOptions).then();
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Void> returnVoidMethod(final long id) {
    return returnVoidMethod(id,  com.facebook.thrift.client.RpcOptions.EMPTY);
  }



  private reactor.core.publisher.Mono<Map<String, String>> getHeaders(com.facebook.thrift.client.RpcOptions rpcOptions) {
      Map<String, String> requestHeaders = new HashMap<>();
      if (rpcOptions.getRequestHeaders() != null && !rpcOptions.getRequestHeaders().isEmpty()) {
          requestHeaders.putAll(rpcOptions.getRequestHeaders());
      }

      return _headersMono.defaultIfEmpty(java.util.Collections.emptyMap()).zipWith(_persistentHeadersMono.defaultIfEmpty(java.util.Collections.emptyMap()), (headers, persistentHeaders) -> {
          Map<String, String> result = new HashMap<>();
          result.putAll(requestHeaders);
          result.putAll(headers);
          result.putAll(persistentHeaders);
          return result;
      });
  }
}
