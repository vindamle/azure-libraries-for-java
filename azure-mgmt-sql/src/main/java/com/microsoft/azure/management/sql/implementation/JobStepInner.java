/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import com.microsoft.azure.management.sql.JobStepAction;
import com.microsoft.azure.management.sql.JobStepOutput;
import com.microsoft.azure.management.sql.JobStepExecutionOptions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * A job step.
 */
@JsonFlatten
public class JobStepInner extends ProxyResourceInner {
    /**
     * The job step's index within the job. If not specified when creating the
     * job step, it will be created as the last step. If not specified when
     * updating the job step, the step id is not modified.
     */
    @JsonProperty(value = "properties.stepId")
    private Integer stepId;

    /**
     * The resource ID of the target group that the job step will be executed
     * on.
     */
    @JsonProperty(value = "properties.targetGroup", required = true)
    private String targetGroup;

    /**
     * The resource ID of the job credential that will be used to connect to
     * the targets.
     */
    @JsonProperty(value = "properties.credential", required = true)
    private String credential;

    /**
     * The action payload of the job step.
     */
    @JsonProperty(value = "properties.action", required = true)
    private JobStepAction action;

    /**
     * Output destination properties of the job step.
     */
    @JsonProperty(value = "properties.output")
    private JobStepOutput output;

    /**
     * Execution options for the job step.
     */
    @JsonProperty(value = "properties.executionOptions")
    private JobStepExecutionOptions executionOptions;

    /**
     * Get the stepId value.
     *
     * @return the stepId value
     */
    public Integer stepId() {
        return this.stepId;
    }

    /**
     * Set the stepId value.
     *
     * @param stepId the stepId value to set
     * @return the JobStepInner object itself.
     */
    public JobStepInner withStepId(Integer stepId) {
        this.stepId = stepId;
        return this;
    }

    /**
     * Get the targetGroup value.
     *
     * @return the targetGroup value
     */
    public String targetGroup() {
        return this.targetGroup;
    }

    /**
     * Set the targetGroup value.
     *
     * @param targetGroup the targetGroup value to set
     * @return the JobStepInner object itself.
     */
    public JobStepInner withTargetGroup(String targetGroup) {
        this.targetGroup = targetGroup;
        return this;
    }

    /**
     * Get the credential value.
     *
     * @return the credential value
     */
    public String credential() {
        return this.credential;
    }

    /**
     * Set the credential value.
     *
     * @param credential the credential value to set
     * @return the JobStepInner object itself.
     */
    public JobStepInner withCredential(String credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Get the action value.
     *
     * @return the action value
     */
    public JobStepAction action() {
        return this.action;
    }

    /**
     * Set the action value.
     *
     * @param action the action value to set
     * @return the JobStepInner object itself.
     */
    public JobStepInner withAction(JobStepAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get the output value.
     *
     * @return the output value
     */
    public JobStepOutput output() {
        return this.output;
    }

    /**
     * Set the output value.
     *
     * @param output the output value to set
     * @return the JobStepInner object itself.
     */
    public JobStepInner withOutput(JobStepOutput output) {
        this.output = output;
        return this;
    }

    /**
     * Get the executionOptions value.
     *
     * @return the executionOptions value
     */
    public JobStepExecutionOptions executionOptions() {
        return this.executionOptions;
    }

    /**
     * Set the executionOptions value.
     *
     * @param executionOptions the executionOptions value to set
     * @return the JobStepInner object itself.
     */
    public JobStepInner withExecutionOptions(JobStepExecutionOptions executionOptions) {
        this.executionOptions = executionOptions;
        return this;
    }

}