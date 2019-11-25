///**
// * Copyright (c) Microsoft Corporation. All rights reserved.
// * Licensed under the MIT License. See License.txt in the project root for
// * license information.
// *
// * Code generated by Microsoft (R) AutoRest Code Generator.
// */
//
//package com.microsoft.azure.management.resources;
//
//import com.azure.core.exception.HttpResponseException;
//import com.azure.core.http.HttpResponse;
//
///**
// * Exception thrown for an invalid response with ErrorResponse information.
// */
//public class ErrorResponseException extends HttpResponseException {
//    /**
//     * Initializes a new instance of the ErrorResponseException class.
//     *
//     * @param message the exception message or the response content if a message is not available
//     * @param response the HTTP response
//     */
//    public ErrorResponseException(final String message, final Response<HttpResponse> response) {
//        super(message, response);
//    }
//
//    /**
//     * Initializes a new instance of the ErrorResponseException class.
//     *
//     * @param message the exception message or the response content if a message is not available
//     * @param response the HTTP response
//     * @param body the deserialized response body
//     */
//    public ErrorResponseException(final String message, final Response<ResponseBody> response, final ResourceErrorResponse body) {
//        super(message, response, body);
//    }
//
//    public ResourceErrorResponse body() {
//        return (ResourceErrorResponse) super.body();
//    }
//}
