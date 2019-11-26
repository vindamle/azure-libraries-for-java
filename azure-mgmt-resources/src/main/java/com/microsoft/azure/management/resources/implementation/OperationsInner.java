/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.implementation;


import com.azure.core.annotation.*;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.Page;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined
 * in Operations.
 */
public class OperationsInner {
    /** The Retrofit service to perform REST calls. */
    private OperationsService service;
    /** The service client containing this operation class. */
    private ResourceManagementClientImpl client;

    /**
     * Initializes an instance of OperationsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public OperationsInner(HttpPipeline pipeline, ResourceManagementClientImpl client) {
        this.service = RestProxy.create(OperationsInner.OperationsService.class, pipeline);;;
        this.client = client;
    }

    /**
     * The interface defining all the services for Operations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface OperationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.Operations list" })
        @Get("providers/Microsoft.Resources/operations")
        Mono<Response<Page<OperationInner>>> list(@QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.Operations listNext" })
        @Get("{nextUrl}")
        Mono<Response<Page<OperationInner>>> listNext(@PathParam("nextUrl") String nextUrl, @HeaderParam("accept-language") String acceptLanguage, @HeaderParam("User-Agent") String userAgent);

    }


}