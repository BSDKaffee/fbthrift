/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.inheritance;

import java.util.*;

public class MyNodeAsyncReactiveWrapper  extends test.fixtures.inheritance.MyRootAsyncReactiveWrapper
    implements MyNode.Reactive {
    private final MyNode.Async _delegate;

    public MyNodeAsyncReactiveWrapper(MyNode.Async _delegate) {
        super(_delegate);
        this._delegate = _delegate;
    }

    @java.lang.Override
    public void close() {
        _delegate.close();
    }

    @java.lang.Override
    public reactor.core.publisher.Mono<Void> doMid() {
        return com.facebook.swift.transport.util.FutureUtil.toMono(_delegate.doMid());
    }

}
