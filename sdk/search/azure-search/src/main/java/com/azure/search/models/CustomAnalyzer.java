// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Allows you to take control over the process of converting text into
 * indexable/searchable tokens. It's a user-defined configuration consisting of
 * a single predefined tokenizer and one or more filters. The tokenizer is
 * responsible for breaking text into tokens, and the filters for modifying
 * tokens emitted by the tokenizer.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Azure.Search.CustomAnalyzer")
@Fluent
public final class CustomAnalyzer extends Analyzer {
    /*
     * The name of the tokenizer to use to divide continuous text into a
     * sequence of tokens, such as breaking a sentence into words.
     */
    @JsonProperty(value = "tokenizer", required = true)
    private String tokenizer;

    /*
     * A list of token filters used to filter out or modify the tokens
     * generated by a tokenizer. For example, you can specify a lowercase
     * filter that converts all characters to lowercase. The filters are run in
     * the order in which they are listed.
     */
    @JsonProperty(value = "tokenFilters")
    private List<String> tokenFilters;

    /*
     * A list of character filters used to prepare input text before it is
     * processed by the tokenizer. For instance, they can replace certain
     * characters or symbols. The filters are run in the order in which they
     * are listed.
     */
    @JsonProperty(value = "charFilters")
    private List<String> charFilters;

    /**
     * Get the tokenizer property: The name of the tokenizer to use to divide
     * continuous text into a sequence of tokens, such as breaking a sentence
     * into words.
     *
     * @return the tokenizer value.
     */
    public String getTokenizer() {
        return this.tokenizer;
    }

    /**
     * Set the tokenizer property: The name of the tokenizer to use to divide
     * continuous text into a sequence of tokens, such as breaking a sentence
     * into words.
     *
     * @param tokenizer the tokenizer value to set.
     * @return the CustomAnalyzer object itself.
     */
    public CustomAnalyzer setTokenizer(String tokenizer) {
        this.tokenizer = tokenizer;
        return this;
    }

    /**
     * Get the tokenFilters property: A list of token filters used to filter
     * out or modify the tokens generated by a tokenizer. For example, you can
     * specify a lowercase filter that converts all characters to lowercase.
     * The filters are run in the order in which they are listed.
     *
     * @return the tokenFilters value.
     */
    public List<String> getTokenFilters() {
        return this.tokenFilters;
    }

    /**
     * Set the tokenFilters property: A list of token filters used to filter
     * out or modify the tokens generated by a tokenizer. For example, you can
     * specify a lowercase filter that converts all characters to lowercase.
     * The filters are run in the order in which they are listed.
     *
     * @param tokenFilters the tokenFilters value to set.
     * @return the CustomAnalyzer object itself.
     */
    public CustomAnalyzer setTokenFilters(List<String> tokenFilters) {
        this.tokenFilters = tokenFilters;
        return this;
    }

    /**
     * Get the charFilters property: A list of character filters used to
     * prepare input text before it is processed by the tokenizer. For
     * instance, they can replace certain characters or symbols. The filters
     * are run in the order in which they are listed.
     *
     * @return the charFilters value.
     */
    public List<String> getCharFilters() {
        return this.charFilters;
    }

    /**
     * Set the charFilters property: A list of character filters used to
     * prepare input text before it is processed by the tokenizer. For
     * instance, they can replace certain characters or symbols. The filters
     * are run in the order in which they are listed.
     *
     * @param charFilters the charFilters value to set.
     * @return the CustomAnalyzer object itself.
     */
    public CustomAnalyzer setCharFilters(List<String> charFilters) {
        this.charFilters = charFilters;
        return this;
    }
}
