// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Subnet of container group.
 */
@Fluent
public final class Subnet {
    /*
     * Specifies ARM resource id of the subnet.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Creates an instance of Subnet class.
     */
    public Subnet() {
    }

    /**
     * Get the id property: Specifies ARM resource id of the subnet.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Specifies ARM resource id of the subnet.
     * 
     * @param id the id value to set.
     * @return the Subnet object itself.
     */
    public Subnet withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (id() == null) {
            throw LOGGER.atError().log(new IllegalArgumentException("Missing required property id in model Subnet"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Subnet.class);
}
