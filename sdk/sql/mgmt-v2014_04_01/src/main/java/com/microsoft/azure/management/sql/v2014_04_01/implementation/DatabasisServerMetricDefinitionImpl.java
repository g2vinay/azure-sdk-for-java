/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.management.sql.v2014_04_01.DatabasisServerMetricDefinition;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.sql.v2014_04_01.MetricAvailability;
import com.microsoft.azure.management.sql.v2014_04_01.MetricName;
import com.microsoft.azure.management.sql.v2014_04_01.PrimaryAggregationType;
import com.microsoft.azure.management.sql.v2014_04_01.UnitDefinitionType;

class DatabasisServerMetricDefinitionImpl extends WrapperImpl<MetricDefinitionInner> implements DatabasisServerMetricDefinition {
    private final SqlManager manager;

    DatabasisServerMetricDefinitionImpl(MetricDefinitionInner inner,  SqlManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }



    @Override
    public List<MetricAvailability> metricAvailabilities() {
        return this.inner().metricAvailabilities();
    }

    @Override
    public MetricName name() {
        return this.inner().name();
    }

    @Override
    public PrimaryAggregationType primaryAggregationType() {
        return this.inner().primaryAggregationType();
    }

    @Override
    public String resourceUri() {
        return this.inner().resourceUri();
    }

    @Override
    public UnitDefinitionType unit() {
        return this.inner().unit();
    }

}
