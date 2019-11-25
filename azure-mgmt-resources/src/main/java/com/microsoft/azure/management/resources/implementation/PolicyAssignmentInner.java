/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.implementation;

import java.util.List;
import com.microsoft.azure.management.resources.PolicySku;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The policy assignment.
 */
public class PolicyAssignmentInner extends ProxyResource {
    /**
     * The display name of the policy assignment.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * The ID of the policy definition.
     */
    @JsonProperty(value = "properties.policyDefinitionId")
    private String policyDefinitionId;

    /**
     * The scope for the policy assignment.
     */
    @JsonProperty(value = "properties.scope")
    private String scope;

    /**
     * The policy's excluded scopes.
     */
    @JsonProperty(value = "properties.notScopes")
    private List<String> notScopes;

    /**
     * Required if a parameter is used in policy rule.
     */
    @JsonProperty(value = "properties.parameters")
    private Object parameters;

    /**
     * This message will be part of response in case of policy violation.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The policy assignment metadata.
     */
    @JsonProperty(value = "properties.metadata")
    private Object metadata;

    /**
     * The policy sku.
     */
    @JsonProperty(value = "sku")
    private PolicySku sku;

    /**
     * Get the display name of the policy assignment.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name of the policy assignment.
     *
     * @param displayName the displayName value to set
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the ID of the policy definition.
     *
     * @return the policyDefinitionId value
     */
    public String policyDefinitionId() {
        return this.policyDefinitionId;
    }

    /**
     * Set the ID of the policy definition.
     *
     * @param policyDefinitionId the policyDefinitionId value to set
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
        return this;
    }

    /**
     * Get the scope for the policy assignment.
     *
     * @return the scope value
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope for the policy assignment.
     *
     * @param scope the scope value to set
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the policy's excluded scopes.
     *
     * @return the notScopes value
     */
    public List<String> notScopes() {
        return this.notScopes;
    }

    /**
     * Set the policy's excluded scopes.
     *
     * @param notScopes the notScopes value to set
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withNotScopes(List<String> notScopes) {
        this.notScopes = notScopes;
        return this;
    }

    /**
     * Get required if a parameter is used in policy rule.
     *
     * @return the parameters value
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Set required if a parameter is used in policy rule.
     *
     * @param parameters the parameters value to set
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get this message will be part of response in case of policy violation.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set this message will be part of response in case of policy violation.
     *
     * @param description the description value to set
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the policy assignment metadata.
     *
     * @return the metadata value
     */
    public Object metadata() {
        return this.metadata;
    }

    /**
     * Set the policy assignment metadata.
     *
     * @param metadata the metadata value to set
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the policy sku.
     *
     * @return the sku value
     */
    public PolicySku sku() {
        return this.sku;
    }

    /**
     * Set the policy sku.
     *
     * @param sku the sku value to set
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withSku(PolicySku sku) {
        this.sku = sku;
        return this;
    }

}
