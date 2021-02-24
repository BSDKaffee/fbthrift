/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.basic_swift_bean;

import java.util.*;

public class LegacyServiceAsyncReactiveWrapper 
    implements LegacyService.Reactive {
    private final LegacyService.Async _delegate;

    public LegacyServiceAsyncReactiveWrapper(LegacyService.Async _delegate) {
        
        this._delegate = _delegate;
    }

    @java.lang.Override
    public void close() {
        _delegate.close();
    }

    @java.lang.Override
    public reactor.core.publisher.Mono<Map<String, List<Integer>>> getPoints(final Set<String> key, final long legacyStuff) {
        return com.facebook.swift.transport.util.FutureUtil.toMono(_delegate.getPoints(key, legacyStuff));
    }

}
