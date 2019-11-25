/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.implementation;

import com.azure.core.management.Resource;
import com.microsoft.azure.management.resources.DeploymentPropertiesExtended;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deployment information.
 */
public class DeploymentExtendedInner extends Resource {
    /**
     * the location of the deployment.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Deployment properties.
     */
    @JsonProperty(value = "properties")
    private DeploymentPropertiesExtended properties;

    /**
     * Get the location of the deployment.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location of the deployment.
     *
     * @param location the location value to set
     * @return the DeploymentExtendedInner object itself.
     */
    public DeploymentExtendedInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get deployment properties.
     *
     * @return the properties value
     */
    public DeploymentPropertiesExtended properties() {
        return this.properties;
    }

    /**
     * Set deployment properties.
     *
     * @param properties the properties value to set
     * @return the DeploymentExtendedInner object itself.
     */
    public DeploymentExtendedInner withProperties(DeploymentPropertiesExtended properties) {
        this.properties = properties;
        return this;
    }

}
