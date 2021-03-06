/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_02_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.network.v2019_02_01.implementation.NetworkInterfaceTapConfigurationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing NetworkInterfaceTapConfigurations.
 */
public interface NetworkInterfaceTapConfigurations extends SupportsCreating<NetworkInterfaceTapConfiguration.DefinitionStages.Blank>, HasInner<NetworkInterfaceTapConfigurationsInner> {
    /**
     * Get the specified tap configuration on a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param tapConfigurationName The name of the tap configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NetworkInterfaceTapConfiguration> getAsync(String resourceGroupName, String networkInterfaceName, String tapConfigurationName);

    /**
     * Get all Tap configurations in a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NetworkInterfaceTapConfiguration> listAsync(final String resourceGroupName, final String networkInterfaceName);

    /**
     * Deletes the specified tap configuration from the NetworkInterface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param tapConfigurationName The name of the tap configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String networkInterfaceName, String tapConfigurationName);

}
