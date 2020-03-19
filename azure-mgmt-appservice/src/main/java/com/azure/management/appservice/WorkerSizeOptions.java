// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for WorkerSizeOptions.
 */
public enum WorkerSizeOptions {
    /**
     * Enum value Small.
     */
    SMALL("Small"),

    /**
     * Enum value Medium.
     */
    MEDIUM("Medium"),

    /**
     * Enum value Large.
     */
    LARGE("Large"),

    /**
     * Enum value D1.
     */
    D1("D1"),

    /**
     * Enum value D2.
     */
    D2("D2"),

    /**
     * Enum value D3.
     */
    D3("D3"),

    /**
     * Enum value NestedSmall.
     */
    NESTED_SMALL("NestedSmall"),

    /**
     * Enum value Default.
     */
    DEFAULT("Default");

    /**
     * The actual serialized value for a WorkerSizeOptions instance.
     */
    private final String value;

    WorkerSizeOptions(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a WorkerSizeOptions instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed WorkerSizeOptions object, or null if unable to parse.
     */
    @JsonCreator
    public static WorkerSizeOptions fromString(String value) {
        WorkerSizeOptions[] items = WorkerSizeOptions.values();
        for (WorkerSizeOptions item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}