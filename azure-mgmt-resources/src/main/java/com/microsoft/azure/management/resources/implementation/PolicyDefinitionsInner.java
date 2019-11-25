/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * <p>
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.implementation;


import com.azure.core.annotation.*;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.implementation.RestProxy;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined
 * in PolicyDefinitions.
 */
public class PolicyDefinitionsInner {
    /** The Retrofit service to perform REST calls. */
    private PolicyDefinitionsService service;
    /** The service client containing this operation class. */
    private PolicyClientImpl client;

    /**
     * Initializes an instance of PolicyDefinitionsInner.
     *
     * @param httpPipeline the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PolicyDefinitionsInner(HttpPipeline httpPipeline, PolicyClientImpl client) {
        this.service = RestProxy.create(PolicyDefinitionsService.class, httpPipeline);
        this.client = client;
    }

    /**
     * The interface defining all the services for PolicyDefinitions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PolicyDefinitionsService {
        @Headers({"Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.PolicyDefinitions createOrUpdate"})
        @Put("subscriptions/{subscriptionId}/providers/Microsoft.Authorization/policyDefinitions/{policyDefinitionName}")
        Mono<Response<PolicyDefinitionInner>> createOrUpdate(@PathParam("policyDefinitionName") String policyDefinitionName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("body") PolicyDefinitionInner parameters, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({"Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.PolicyDefinitions delete"})
        @Delete("subscriptions/{subscriptionId}/providers/Microsoft.Authorization/policyDefinitions/{policyDefinitionName}")
        Mono<Response<Void>> delete(@PathParam("policyDefinitionName") String policyDefinitionName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({"Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.PolicyDefinitions get"})
        @Get("subscriptions/{subscriptionId}/providers/Microsoft.Authorization/policyDefinitions/{policyDefinitionName}")
        Mono<Response<PolicyDefinitionInner>> get(@PathParam("policyDefinitionName") String policyDefinitionName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({"Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.PolicyDefinitions getBuiltIn"})
        @Get("providers/Microsoft.Authorization/policyDefinitions/{policyDefinitionName}")
        Mono<Response<PolicyDefinitionInner>> getBuiltIn(@PathParam("policyDefinitionName") String policyDefinitionName, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({"Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.PolicyDefinitions createOrUpdateAtManagementGroup"})
        @Put("providers/Microsoft.Management/managementgroups/{managementGroupId}/providers/Microsoft.Authorization/policyDefinitions/{policyDefinitionName}")
        Mono<Response<PolicyDefinitionInner>> createOrUpdateAtManagementGroup(@PathParam("policyDefinitionName") String policyDefinitionName, @PathParam("managementGroupId") String managementGroupId, @BodyParam("body") PolicyDefinitionInner parameters, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({"Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.PolicyDefinitions deleteAtManagementGroup"})
        @Delete("providers/Microsoft.Management/managementgroups/{managementGroupId}/providers/Microsoft.Authorization/policyDefinitions/{policyDefinitionName}")
        Mono<Response<Void>> deleteAtManagementGroup(@PathParam("policyDefinitionName") String policyDefinitionName, @PathParam("managementGroupId") String managementGroupId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({"Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.PolicyDefinitions getAtManagementGroup"})
        @Get("providers/Microsoft.Management/managementgroups/{managementGroupId}/providers/Microsoft.Authorization/policyDefinitions/{policyDefinitionName}")
        Mono<Response<PolicyDefinitionInner>> getAtManagementGroup(@PathParam("policyDefinitionName") String policyDefinitionName, @PathParam("managementGroupId") String managementGroupId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({"Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.PolicyDefinitions list"})
        @Get("subscriptions/{subscriptionId}/providers/Microsoft.Authorization/policyDefinitions")
        Mono<PagedResponse<PolicyDefinitionInner>> list(@PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({"Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.PolicyDefinitions listBuiltIn"})
        @Get("providers/Microsoft.Authorization/policyDefinitions")
        Mono<PagedResponse<PolicyDefinitionInner>> listBuiltIn(@QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({"Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.PolicyDefinitions listByManagementGroup"})
        @Get("providers/Microsoft.Management/managementgroups/{managementGroupId}/providers/Microsoft.Authorization/policyDefinitions")
        Mono<PagedResponse<PolicyDefinitionInner>> listByManagementGroup(@PathParam("managementGroupId") String managementGroupId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({"Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.PolicyDefinitions listNext"})
        @Get("{nextUrl}")
        Mono<PagedResponse<PolicyDefinitionInner>> listNext(@PathParam("nextUrl") String nextUrl, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({"Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.PolicyDefinitions listBuiltInNext"})
        @Get("{nextUrl}")
        Mono<PagedResponse<PolicyDefinitionInner>> listBuiltInNext(@PathParam("nextUrl") String nextUrl, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({"Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.PolicyDefinitions listByManagementGroupNext"})
        @Get("{nextUrl}")
        Mono<PagedResponse<PolicyDefinitionInner>> listByManagementGroupNext(@PathParam("nextUrl") String nextUrl, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

    }

}
