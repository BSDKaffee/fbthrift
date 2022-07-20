/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.basic;

import com.facebook.nifty.client.RequestChannel;
import com.facebook.swift.codec.*;
import com.facebook.swift.service.*;
import com.facebook.swift.service.metadata.*;
import com.facebook.thrift.client.*;
import com.facebook.thrift.util.FutureUtil;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.*;
import java.lang.reflect.Method;
import java.util.*;
import org.apache.thrift.ProtocolId;
import reactor.core.publisher.Mono;

@SwiftGenerated
@Deprecated
public class MyServiceAsyncClientImpl extends AbstractThriftClient implements MyService.Async {

    // Method Handlers
    private ThriftMethodHandler pingMethodHandler;
    private ThriftMethodHandler getRandomDataMethodHandler;
    private ThriftMethodHandler sinkMethodHandler;
    private ThriftMethodHandler putDataByIdMethodHandler;
    private ThriftMethodHandler hasDataByIdMethodHandler;
    private ThriftMethodHandler getDataByIdMethodHandler;
    private ThriftMethodHandler deleteDataByIdMethodHandler;
    private ThriftMethodHandler lobDataByIdMethodHandler;
    private ThriftMethodHandler invalidReturnForHackMethodHandler;
    private ThriftMethodHandler rpcSkippedCodegenMethodHandler;

    // Method Exceptions
    private static final Class[] pingExceptions = new Class[] {
        org.apache.thrift.TException.class};
    private static final Class[] getRandomDataExceptions = new Class[] {
        org.apache.thrift.TException.class};
    private static final Class[] sinkExceptions = new Class[] {
        org.apache.thrift.TException.class};
    private static final Class[] putDataByIdExceptions = new Class[] {
        org.apache.thrift.TException.class};
    private static final Class[] hasDataByIdExceptions = new Class[] {
        org.apache.thrift.TException.class};
    private static final Class[] getDataByIdExceptions = new Class[] {
        org.apache.thrift.TException.class};
    private static final Class[] deleteDataByIdExceptions = new Class[] {
        org.apache.thrift.TException.class};
    private static final Class[] lobDataByIdExceptions = new Class[] {
        org.apache.thrift.TException.class};
    private static final Class[] invalidReturnForHackExceptions = new Class[] {
        org.apache.thrift.TException.class};
    private static final Class[] rpcSkippedCodegenExceptions = new Class[] {
        org.apache.thrift.TException.class};

    public MyServiceAsyncClientImpl(
        RequestChannel channel,
        Map<Method, ThriftMethodHandler> methods,
        Map<String, String> headers,
        Map<String, String> persistentHeaders,
        List<? extends ThriftClientEventHandler> eventHandlers) {
      this("MyService", channel, methods, headers, persistentHeaders, eventHandlers);
    }

    public MyServiceAsyncClientImpl(
        String serviceName,
        RequestChannel channel,
        Map<Method, ThriftMethodHandler> methods,
        Map<String, String> headers,
        Map<String, String> persistentHeaders,
        List<? extends ThriftClientEventHandler> eventHandlers) {
      super(serviceName, channel, headers, persistentHeaders, eventHandlers);

      Map<String, ThriftMethodHandler> methodHandlerMap = new HashMap<>();
      methods.forEach(
          (key, value) -> {
            methodHandlerMap.put(key.getName(), value);
          });

      // Set method handlers
      pingMethodHandler = methodHandlerMap.get("ping");
      getRandomDataMethodHandler = methodHandlerMap.get("getRandomData");
      sinkMethodHandler = methodHandlerMap.get("sink");
      putDataByIdMethodHandler = methodHandlerMap.get("putDataById");
      hasDataByIdMethodHandler = methodHandlerMap.get("hasDataById");
      getDataByIdMethodHandler = methodHandlerMap.get("getDataById");
      deleteDataByIdMethodHandler = methodHandlerMap.get("deleteDataById");
      lobDataByIdMethodHandler = methodHandlerMap.get("lobDataById");
      invalidReturnForHackMethodHandler = methodHandlerMap.get("invalidReturnForHack");
      rpcSkippedCodegenMethodHandler = methodHandlerMap.get("rpcSkippedCodegen");
    }

    @java.lang.Override
    public void close() {
        super.close();
    }


    @java.lang.Override
    public ListenableFuture<Void> ping() {
        return ping(RpcOptions.EMPTY);
    }

    @java.lang.Override
    public ListenableFuture<Void> ping(
        RpcOptions rpcOptions) {
        return FutureUtil.transform(pingWrapper(rpcOptions));
    }

    @java.lang.Override
    public ListenableFuture<ResponseWrapper<Void>> pingWrapper(
        RpcOptions rpcOptions) {
        try {
          return executeWrapperWithOptions(pingMethodHandler, pingExceptions, rpcOptions);
        } catch (Throwable t) {
          throw new RuntimeTException(t.getMessage(), t);
        }
    }

    @java.lang.Override
    public ListenableFuture<String> getRandomData() {
        return getRandomData(RpcOptions.EMPTY);
    }

    @java.lang.Override
    public ListenableFuture<String> getRandomData(
        RpcOptions rpcOptions) {
        return FutureUtil.transform(getRandomDataWrapper(rpcOptions));
    }

    @java.lang.Override
    public ListenableFuture<ResponseWrapper<String>> getRandomDataWrapper(
        RpcOptions rpcOptions) {
        try {
          return executeWrapperWithOptions(getRandomDataMethodHandler, getRandomDataExceptions, rpcOptions);
        } catch (Throwable t) {
          throw new RuntimeTException(t.getMessage(), t);
        }
    }

    @java.lang.Override
    public ListenableFuture<Void> sink(
        long sink) {
        return sink(sink, RpcOptions.EMPTY);
    }

    @java.lang.Override
    public ListenableFuture<Void> sink(
        long sink,
        RpcOptions rpcOptions) {
        return FutureUtil.transform(sinkWrapper(sink, rpcOptions));
    }

    @java.lang.Override
    public ListenableFuture<ResponseWrapper<Void>> sinkWrapper(
        long sink,
        RpcOptions rpcOptions) {
        try {
          return executeWrapperWithOptions(sinkMethodHandler, sinkExceptions, rpcOptions, sink);
        } catch (Throwable t) {
          throw new RuntimeTException(t.getMessage(), t);
        }
    }

    @java.lang.Override
    public ListenableFuture<Void> putDataById(
        long id,
        String data) {
        return putDataById(id, data, RpcOptions.EMPTY);
    }

    @java.lang.Override
    public ListenableFuture<Void> putDataById(
        long id,
        String data,
        RpcOptions rpcOptions) {
        return FutureUtil.transform(putDataByIdWrapper(id, data, rpcOptions));
    }

    @java.lang.Override
    public ListenableFuture<ResponseWrapper<Void>> putDataByIdWrapper(
        long id,
        String data,
        RpcOptions rpcOptions) {
        try {
          return executeWrapperWithOptions(putDataByIdMethodHandler, putDataByIdExceptions, rpcOptions, id, data);
        } catch (Throwable t) {
          throw new RuntimeTException(t.getMessage(), t);
        }
    }

    @java.lang.Override
    public ListenableFuture<Boolean> hasDataById(
        long id) {
        return hasDataById(id, RpcOptions.EMPTY);
    }

    @java.lang.Override
    public ListenableFuture<Boolean> hasDataById(
        long id,
        RpcOptions rpcOptions) {
        return FutureUtil.transform(hasDataByIdWrapper(id, rpcOptions));
    }

    @java.lang.Override
    public ListenableFuture<ResponseWrapper<Boolean>> hasDataByIdWrapper(
        long id,
        RpcOptions rpcOptions) {
        try {
          return executeWrapperWithOptions(hasDataByIdMethodHandler, hasDataByIdExceptions, rpcOptions, id);
        } catch (Throwable t) {
          throw new RuntimeTException(t.getMessage(), t);
        }
    }

    @java.lang.Override
    public ListenableFuture<String> getDataById(
        long id) {
        return getDataById(id, RpcOptions.EMPTY);
    }

    @java.lang.Override
    public ListenableFuture<String> getDataById(
        long id,
        RpcOptions rpcOptions) {
        return FutureUtil.transform(getDataByIdWrapper(id, rpcOptions));
    }

    @java.lang.Override
    public ListenableFuture<ResponseWrapper<String>> getDataByIdWrapper(
        long id,
        RpcOptions rpcOptions) {
        try {
          return executeWrapperWithOptions(getDataByIdMethodHandler, getDataByIdExceptions, rpcOptions, id);
        } catch (Throwable t) {
          throw new RuntimeTException(t.getMessage(), t);
        }
    }

    @java.lang.Override
    public ListenableFuture<Void> deleteDataById(
        long id) {
        return deleteDataById(id, RpcOptions.EMPTY);
    }

    @java.lang.Override
    public ListenableFuture<Void> deleteDataById(
        long id,
        RpcOptions rpcOptions) {
        return FutureUtil.transform(deleteDataByIdWrapper(id, rpcOptions));
    }

    @java.lang.Override
    public ListenableFuture<ResponseWrapper<Void>> deleteDataByIdWrapper(
        long id,
        RpcOptions rpcOptions) {
        try {
          return executeWrapperWithOptions(deleteDataByIdMethodHandler, deleteDataByIdExceptions, rpcOptions, id);
        } catch (Throwable t) {
          throw new RuntimeTException(t.getMessage(), t);
        }
    }

    @java.lang.Override
    public ListenableFuture<Void> lobDataById(
        long id,
        String data) {
        return lobDataById(id, data, RpcOptions.EMPTY);
    }

    @java.lang.Override
    public ListenableFuture<Void> lobDataById(
        long id,
        String data,
        RpcOptions rpcOptions) {
        return FutureUtil.transform(lobDataByIdWrapper(id, data, rpcOptions));
    }

    @java.lang.Override
    public ListenableFuture<ResponseWrapper<Void>> lobDataByIdWrapper(
        long id,
        String data,
        RpcOptions rpcOptions) {
        try {
          return executeWrapperWithOptions(lobDataByIdMethodHandler, lobDataByIdExceptions, rpcOptions, id, data);
        } catch (Throwable t) {
          throw new RuntimeTException(t.getMessage(), t);
        }
    }

    @java.lang.Override
    public ListenableFuture<Set<Float>> invalidReturnForHack() {
        return invalidReturnForHack(RpcOptions.EMPTY);
    }

    @java.lang.Override
    public ListenableFuture<Set<Float>> invalidReturnForHack(
        RpcOptions rpcOptions) {
        return FutureUtil.transform(invalidReturnForHackWrapper(rpcOptions));
    }

    @java.lang.Override
    public ListenableFuture<ResponseWrapper<Set<Float>>> invalidReturnForHackWrapper(
        RpcOptions rpcOptions) {
        try {
          return executeWrapperWithOptions(invalidReturnForHackMethodHandler, invalidReturnForHackExceptions, rpcOptions);
        } catch (Throwable t) {
          throw new RuntimeTException(t.getMessage(), t);
        }
    }

    @java.lang.Override
    public ListenableFuture<Void> rpcSkippedCodegen() {
        return rpcSkippedCodegen(RpcOptions.EMPTY);
    }

    @java.lang.Override
    public ListenableFuture<Void> rpcSkippedCodegen(
        RpcOptions rpcOptions) {
        return FutureUtil.transform(rpcSkippedCodegenWrapper(rpcOptions));
    }

    @java.lang.Override
    public ListenableFuture<ResponseWrapper<Void>> rpcSkippedCodegenWrapper(
        RpcOptions rpcOptions) {
        try {
          return executeWrapperWithOptions(rpcSkippedCodegenMethodHandler, rpcSkippedCodegenExceptions, rpcOptions);
        } catch (Throwable t) {
          throw new RuntimeTException(t.getMessage(), t);
        }
    }
}
