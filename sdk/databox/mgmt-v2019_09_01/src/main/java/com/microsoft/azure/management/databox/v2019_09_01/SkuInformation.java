/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox.v2019_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.databox.v2019_09_01.implementation.DataBoxManager;
import com.microsoft.azure.management.databox.v2019_09_01.implementation.SkuInformationInner;
import java.util.List;

/**
 * Type representing SkuInformation.
 */
public interface SkuInformation extends HasInner<SkuInformationInner>, HasManager<DataBoxManager> {
    /**
     * @return the apiVersions value.
     */
    List<String> apiVersions();

    /**
     * @return the capacity value.
     */
    SkuCapacity capacity();

    /**
     * @return the costs value.
     */
    List<SkuCost> costs();

    /**
     * @return the destinationToServiceLocationMap value.
     */
    List<DestinationToServiceLocationMap> destinationToServiceLocationMap();

    /**
     * @return the disabledReason value.
     */
    SkuDisabledReason disabledReason();

    /**
     * @return the disabledReasonMessage value.
     */
    String disabledReasonMessage();

    /**
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * @return the requiredFeature value.
     */
    String requiredFeature();

    /**
     * @return the sku value.
     */
    Sku sku();

}
