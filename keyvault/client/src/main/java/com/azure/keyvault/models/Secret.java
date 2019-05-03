// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.keyvault.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 *  Secret is the resource consisting of name, value and its attributes inherited from {@link SecretBase}.
 *  It is managed by Secret Service.
 */
public class Secret extends SecretBase {

    /**
     * The secret value.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Creates an empty instance of the Secret.
     */
    public Secret() {

    }

    /**
     * Creates a Secret with {@code name} and {@code value}.
     *
     * @param name The name of the secret.
     * @param value The value of the secret.
     */
    public Secret(String name, String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Get the secret value.
     *
     * @return the secret value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the enabled value.
     *
     * @param enabled the enabled value to set
     * @return the Secret object itself.
     */
    @Override
    public Secret enabled(Boolean enabled) {
        super.enabled(enabled);
        return this;
    }

    /**
     * Set the {@link OffsetDateTime notBefore} time value. The time value gets converted to UTC time.
     *
     * @param notBefore the not before time value to set
     * @return the Secret object itself.
     */
    @Override
    public Secret notBefore(OffsetDateTime notBefore) {
        super.notBefore(notBefore);
        return this;
    }

    /**
     * Set the {@link OffsetDateTime expires} time value. The time value gets converted to UTC time.
     *
     * @param expires the expiry time value to set
     * @return the Secret object itself.
     */
    @Override
    public Secret expires(OffsetDateTime expires) {
        super.expires(expires);
        return this;
    }

    /**
     * Set the secret identifier value.
     *
     * @param id the secret identifier value to set
     * @return the Secret object itself.
     */
    @Override
    public Secret id(String id) {
        super.id(id);
        return this;
    }

    /**
     * Set the contentType value. It represents the type of the secret's value.
     *
     * @param contentType the content type value to set
     * @return the Secret object itself.
     */
    @Override
    public Secret contentType(String contentType) {
        super.contentType(contentType);
        return this;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the Secret object itself.
     */
    @Override
    public Secret tags(Map<String, String> tags) {
        super.tags(tags);
        return this;
    }

}

