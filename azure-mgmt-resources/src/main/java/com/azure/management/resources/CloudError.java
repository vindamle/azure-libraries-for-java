// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CloudError model.
 */
@Fluent
public final class CloudError {
    /*
     * The resource management error response.
     */
    @JsonProperty(value = "error")
    private ErrorResponse error;

    /**
     * Get the error property: The resource management error response.
     * 
     * @return the error value.
     */
    public ErrorResponse getError() {
        return this.error;
    }

    /**
     * Set the error property: The resource management error response.
     * 
     * @param error the error value to set.
     * @return the CloudError object itself.
     */
    public CloudError setError(ErrorResponse error) {
        this.error = error;
        return this;
    }
}