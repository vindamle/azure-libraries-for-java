// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DateAfterCreation model.
 */
@Fluent
public final class DateAfterCreation {
    /*
     * Integer value indicating the age in days after creation
     */
    @JsonProperty(value = "daysAfterCreationGreaterThan", required = true)
    private int daysAfterCreationGreaterThan;

    /**
     * Get the daysAfterCreationGreaterThan property: Integer value indicating
     * the age in days after creation.
     * 
     * @return the daysAfterCreationGreaterThan value.
     */
    public int getDaysAfterCreationGreaterThan() {
        return this.daysAfterCreationGreaterThan;
    }

    /**
     * Set the daysAfterCreationGreaterThan property: Integer value indicating
     * the age in days after creation.
     * 
     * @param daysAfterCreationGreaterThan the daysAfterCreationGreaterThan
     * value to set.
     * @return the DateAfterCreation object itself.
     */
    public DateAfterCreation setDaysAfterCreationGreaterThan(int daysAfterCreationGreaterThan) {
        this.daysAfterCreationGreaterThan = daysAfterCreationGreaterThan;
        return this;
    }
}
