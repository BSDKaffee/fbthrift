/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.inheritance;

import java.util.*;

public class MyLeafAsyncReactiveWrapper  extends test.fixtures.inheritance.MyNodeAsyncReactiveWrapper
    implements MyLeaf.Reactive {
    private final MyLeaf.Async _delegate;

    public MyLeafAsyncReactiveWrapper(MyLeaf.Async _delegate) {
        super(_delegate);
        this._delegate = _delegate;
    }

    @java.lang.Override
    public void close() {
        _delegate.close();
    }

    @java.lang.Override
    public reactor.core.publisher.Mono<Void> doLeaf() {
        return com.facebook.swift.transport.util.FutureUtil.toMono(_delegate.doLeaf());
    }

}
