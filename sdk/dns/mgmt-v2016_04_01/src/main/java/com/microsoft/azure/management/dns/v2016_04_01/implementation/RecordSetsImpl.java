/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.dns.v2016_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.dns.v2016_04_01.RecordSets;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.dns.v2016_04_01.RecordSet;
import rx.Completable;
import com.microsoft.azure.management.dns.v2016_04_01.RecordType;

class RecordSetsImpl extends WrapperImpl<RecordSetsInner> implements RecordSets {
    private final NetworkManager manager;

    RecordSetsImpl(NetworkManager manager) {
        super(manager.inner().recordSets());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    private RecordSetImpl wrapModel(RecordSetInner inner) {
        return  new RecordSetImpl(inner, manager());
    }

    @Override
    public Observable<RecordSet> listByDnsZoneAsync(final String resourceGroupName, final String zoneName) {
        RecordSetsInner client = this.inner();
        return client.listByDnsZoneAsync(resourceGroupName, zoneName)
        .flatMapIterable(new Func1<Page<RecordSetInner>, Iterable<RecordSetInner>>() {
            @Override
            public Iterable<RecordSetInner> call(Page<RecordSetInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RecordSetInner, RecordSet>() {
            @Override
            public RecordSet call(RecordSetInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<RecordSet> updateAsync(String resourceGroupName, String zoneName, String relativeRecordSetName, RecordType recordType, RecordSetInner parameters) {
        RecordSetsInner client = this.inner();
        return client.updateAsync(resourceGroupName, zoneName, relativeRecordSetName, recordType, parameters)
        .map(new Func1<RecordSetInner, RecordSet>() {
            @Override
            public RecordSet call(RecordSetInner inner) {
                return new RecordSetImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RecordSet> createOrUpdateAsync(String resourceGroupName, String zoneName, String relativeRecordSetName, RecordType recordType, RecordSetInner parameters) {
        RecordSetsInner client = this.inner();
        return client.createOrUpdateAsync(resourceGroupName, zoneName, relativeRecordSetName, recordType, parameters)
        .map(new Func1<RecordSetInner, RecordSet>() {
            @Override
            public RecordSet call(RecordSetInner inner) {
                return new RecordSetImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String zoneName, String relativeRecordSetName, RecordType recordType) {
        RecordSetsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, zoneName, relativeRecordSetName, recordType).toCompletable();
    }

    @Override
    public Observable<RecordSet> getAsync(String resourceGroupName, String zoneName, String relativeRecordSetName, RecordType recordType) {
        RecordSetsInner client = this.inner();
        return client.getAsync(resourceGroupName, zoneName, relativeRecordSetName, recordType)
        .map(new Func1<RecordSetInner, RecordSet>() {
            @Override
            public RecordSet call(RecordSetInner inner) {
                return new RecordSetImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RecordSet> listByTypeAsync(final String resourceGroupName, final String zoneName, final RecordType recordType) {
        RecordSetsInner client = this.inner();
        return client.listByTypeAsync(resourceGroupName, zoneName, recordType)
        .flatMapIterable(new Func1<Page<RecordSetInner>, Iterable<RecordSetInner>>() {
            @Override
            public Iterable<RecordSetInner> call(Page<RecordSetInner> page) {
                return page.items();
            }
        })    .map(new Func1<RecordSetInner, RecordSet>() {
            @Override
            public RecordSet call(RecordSetInner inner) {
                return new RecordSetImpl(inner, manager());
            }
        });
    }

}
