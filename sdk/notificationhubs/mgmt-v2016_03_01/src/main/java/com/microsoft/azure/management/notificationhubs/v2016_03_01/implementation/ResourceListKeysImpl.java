/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2016_03_01.implementation;

import com.microsoft.azure.management.notificationhubs.v2016_03_01.ResourceListKeys;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class ResourceListKeysImpl extends WrapperImpl<ResourceListKeysInner> implements ResourceListKeys {
    private final NotificationHubsManager manager;
    ResourceListKeysImpl(ResourceListKeysInner inner, NotificationHubsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NotificationHubsManager manager() {
        return this.manager;
    }

    @Override
    public String keyName() {
        return this.inner().keyName();
    }

    @Override
    public String primaryConnectionString() {
        return this.inner().primaryConnectionString();
    }

    @Override
    public String primaryKey() {
        return this.inner().primaryKey();
    }

    @Override
    public String secondaryConnectionString() {
        return this.inner().secondaryConnectionString();
    }

    @Override
    public String secondaryKey() {
        return this.inner().secondaryKey();
    }

}
