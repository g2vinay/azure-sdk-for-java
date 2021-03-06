/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2019_08_01.implementation.AvailableServiceAliasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_08_01.implementation.NetworkManager;

/**
 * Type representing AvailableServiceAlias.
 */
public interface AvailableServiceAlias extends HasInner<AvailableServiceAliasInner>, HasManager<NetworkManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the resourceName value.
     */
    String resourceName();

    /**
     * @return the type value.
     */
    String type();

}
