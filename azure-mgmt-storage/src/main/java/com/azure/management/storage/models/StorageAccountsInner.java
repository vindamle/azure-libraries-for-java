// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.management.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.management.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.management.resources.fluentcore.collection.InnerSupportsListing;
import com.azure.management.storage.AccountSasParameters;
import com.azure.management.storage.ServiceSasParameters;
import com.azure.management.storage.StorageAccountCheckNameAvailabilityParameters;
import com.azure.management.storage.StorageAccountCreateParameters;
import com.azure.management.storage.StorageAccountRegenerateKeyParameters;
import com.azure.management.storage.StorageAccountUpdateParameters;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * StorageAccounts.
 */
public final class StorageAccountsInner implements InnerSupportsGet<StorageAccountInner>, InnerSupportsDelete<Void>, InnerSupportsListing<StorageAccountInner> {
    /**
     * The proxy service used to perform REST calls.
     */
    private StorageAccountsService service;

    /**
     * The service client containing this operation class.
     */
    private StorageManagementClientImpl client;

    /**
     * Initializes an instance of StorageAccountsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public StorageAccountsInner(StorageManagementClientImpl client) {
        this.service = RestProxy.create(StorageAccountsService.class, client.getHttpPipeline());
        this.client = client;
    }

    // FIXME: Need this two methods auto-generated.
    @Override
    public StorageAccountInner getByResourceGroup(String resourceGroupName, String resourceName) {
        return null;
    }

    @Override
    public Mono<StorageAccountInner> getByResourceGroupAsync(String resourceGroupName, String resourceName) {
        return null;
    }

    /**
     * The interface defining all the services for
     * StorageManagementClientStorageAccounts to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "StorageManagementClientStorageAccounts")
    private interface StorageAccountsService {
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.Storage/checkNameAvailability")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<CheckNameAvailabilityResultInner>> checkNameAvailability(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") StorageAccountCheckNameAvailabilityParameters accountName, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<StorageAccountInner>> create(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("accountName") String accountName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") StorageAccountCreateParameters parameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("accountName") String accountName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<StorageAccountInner>> getProperties(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("accountName") String accountName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("$expand") String expand, @QueryParam("api-version") String apiVersion);

        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<StorageAccountInner>> update(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("accountName") String accountName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") StorageAccountUpdateParameters parameters, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Storage/storageAccounts")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<StorageAccountListResultInner>> list(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<StorageAccountListResultInner>> listByResourceGroup(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}/listKeys")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<StorageAccountListKeysResultInner>> listKeys(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("accountName") String accountName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}/regenerateKey")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<StorageAccountListKeysResultInner>> regenerateKey(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("accountName") String accountName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") StorageAccountRegenerateKeyParameters regenerateKey, @QueryParam("api-version") String apiVersion);

        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}/ListAccountSas")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ListAccountSasResponseInner>> listAccountSAS(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("accountName") String accountName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") AccountSasParameters parameters, @QueryParam("api-version") String apiVersion);

        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}/ListServiceSas")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ListServiceSasResponseInner>> listServiceSAS(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("accountName") String accountName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") ServiceSasParameters parameters, @QueryParam("api-version") String apiVersion);

        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}/failover")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> failover(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("accountName") String accountName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}/revokeUserDelegationKeys")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> revokeUserDelegationKeys(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("accountName") String accountName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<StorageAccountInner>> beginCreate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("accountName") String accountName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") StorageAccountCreateParameters parameters, @QueryParam("api-version") String apiVersion);

        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}/failover")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginFailover(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("accountName") String accountName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<CheckNameAvailabilityResultInner>> checkNameAvailabilityWithResponseAsync(StorageAccountCheckNameAvailabilityParameters accountName) {
        return service.checkNameAvailability(this.client.getHost(), this.client.getSubscriptionId(), accountName, this.client.getApiVersion());
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CheckNameAvailabilityResultInner> checkNameAvailabilityAsync(StorageAccountCheckNameAvailabilityParameters accountName) {
        return checkNameAvailabilityWithResponseAsync(accountName)
            .flatMap((SimpleResponse<CheckNameAvailabilityResultInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckNameAvailabilityResultInner checkNameAvailability(StorageAccountCheckNameAvailabilityParameters accountName) {
        return checkNameAvailabilityAsync(accountName).block();
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<StorageAccountInner>> createWithResponseAsync(String resourceGroupName, String accountName, StorageAccountCreateParameters parameters) {
        return service.create(this.client.getHost(), resourceGroupName, accountName, this.client.getSubscriptionId(), parameters, this.client.getApiVersion());
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<StorageAccountInner> createAsync(String resourceGroupName, String accountName, StorageAccountCreateParameters parameters) {
        return createWithResponseAsync(resourceGroupName, accountName, parameters)
            .flatMap((SimpleResponse<StorageAccountInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public StorageAccountInner create(String resourceGroupName, String accountName, StorageAccountCreateParameters parameters) {
        return createAsync(resourceGroupName, accountName, parameters).block();
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String accountName) {
        return service.delete(this.client.getHost(), resourceGroupName, accountName, this.client.getSubscriptionId(), this.client.getApiVersion());
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String accountName) {
        return deleteWithResponseAsync(resourceGroupName, accountName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String accountName) {
        deleteAsync(resourceGroupName, accountName).block();
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<StorageAccountInner>> getPropertiesWithResponseAsync(String resourceGroupName, String accountName) {
        final String expand = "geoReplicationStats";
        return service.getProperties(this.client.getHost(), resourceGroupName, accountName, this.client.getSubscriptionId(), expand, this.client.getApiVersion());
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<StorageAccountInner> getPropertiesAsync(String resourceGroupName, String accountName) {
        return getPropertiesWithResponseAsync(resourceGroupName, accountName)
            .flatMap((SimpleResponse<StorageAccountInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public StorageAccountInner getProperties(String resourceGroupName, String accountName) {
        return getPropertiesAsync(resourceGroupName, accountName).block();
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<StorageAccountInner>> updateWithResponseAsync(String resourceGroupName, String accountName, StorageAccountUpdateParameters parameters) {
        return service.update(this.client.getHost(), resourceGroupName, accountName, this.client.getSubscriptionId(), parameters, this.client.getApiVersion());
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<StorageAccountInner> updateAsync(String resourceGroupName, String accountName, StorageAccountUpdateParameters parameters) {
        return updateWithResponseAsync(resourceGroupName, accountName, parameters)
            .flatMap((SimpleResponse<StorageAccountInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public StorageAccountInner update(String resourceGroupName, String accountName, StorageAccountUpdateParameters parameters) {
        return updateAsync(resourceGroupName, accountName, parameters).block();
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<StorageAccountInner>> listSinglePageAsync() {
        return service.list(this.client.getHost(), this.client.getSubscriptionId(), this.client.getApiVersion()).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            null,
            null));
    }

    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<StorageAccountInner> listAsync() {
        return new PagedFlux<>(
            () -> listSinglePageAsync());
    }

    /**
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<StorageAccountInner> list() {
        return new PagedIterable<>(listAsync());
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<StorageAccountInner>> listByResourceGroupSinglePageAsync(String resourceGroupName) {
        return service.listByResourceGroup(this.client.getHost(), resourceGroupName, this.client.getSubscriptionId(), this.client.getApiVersion()).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().getValue(),
            null,
            null));
    }

    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<StorageAccountInner> listByResourceGroupAsync(String resourceGroupName) {
        return new PagedFlux<>(
            () -> listByResourceGroupSinglePageAsync(resourceGroupName));
    }

    /**
     * @param resourceGroupName null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<StorageAccountInner> listByResourceGroup(String resourceGroupName) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName));
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<StorageAccountListKeysResultInner>> listKeysWithResponseAsync(String resourceGroupName, String accountName) {
        return service.listKeys(this.client.getHost(), resourceGroupName, accountName, this.client.getSubscriptionId(), this.client.getApiVersion());
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<StorageAccountListKeysResultInner> listKeysAsync(String resourceGroupName, String accountName) {
        return listKeysWithResponseAsync(resourceGroupName, accountName)
            .flatMap((SimpleResponse<StorageAccountListKeysResultInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public StorageAccountListKeysResultInner listKeys(String resourceGroupName, String accountName) {
        return listKeysAsync(resourceGroupName, accountName).block();
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<StorageAccountListKeysResultInner>> regenerateKeyWithResponseAsync(String resourceGroupName, String accountName, StorageAccountRegenerateKeyParameters regenerateKey) {
        return service.regenerateKey(this.client.getHost(), resourceGroupName, accountName, this.client.getSubscriptionId(), regenerateKey, this.client.getApiVersion());
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<StorageAccountListKeysResultInner> regenerateKeyAsync(String resourceGroupName, String accountName, StorageAccountRegenerateKeyParameters regenerateKey) {
        return regenerateKeyWithResponseAsync(resourceGroupName, accountName, regenerateKey)
            .flatMap((SimpleResponse<StorageAccountListKeysResultInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public StorageAccountListKeysResultInner regenerateKey(String resourceGroupName, String accountName, StorageAccountRegenerateKeyParameters regenerateKey) {
        return regenerateKeyAsync(resourceGroupName, accountName, regenerateKey).block();
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ListAccountSasResponseInner>> listAccountSASWithResponseAsync(String resourceGroupName, String accountName, AccountSasParameters parameters) {
        return service.listAccountSAS(this.client.getHost(), resourceGroupName, accountName, this.client.getSubscriptionId(), parameters, this.client.getApiVersion());
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ListAccountSasResponseInner> listAccountSASAsync(String resourceGroupName, String accountName, AccountSasParameters parameters) {
        return listAccountSASWithResponseAsync(resourceGroupName, accountName, parameters)
            .flatMap((SimpleResponse<ListAccountSasResponseInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public ListAccountSasResponseInner listAccountSAS(String resourceGroupName, String accountName, AccountSasParameters parameters) {
        return listAccountSASAsync(resourceGroupName, accountName, parameters).block();
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<ListServiceSasResponseInner>> listServiceSASWithResponseAsync(String resourceGroupName, String accountName, ServiceSasParameters parameters) {
        return service.listServiceSAS(this.client.getHost(), resourceGroupName, accountName, this.client.getSubscriptionId(), parameters, this.client.getApiVersion());
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ListServiceSasResponseInner> listServiceSASAsync(String resourceGroupName, String accountName, ServiceSasParameters parameters) {
        return listServiceSASWithResponseAsync(resourceGroupName, accountName, parameters)
            .flatMap((SimpleResponse<ListServiceSasResponseInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public ListServiceSasResponseInner listServiceSAS(String resourceGroupName, String accountName, ServiceSasParameters parameters) {
        return listServiceSASAsync(resourceGroupName, accountName, parameters).block();
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> failoverWithResponseAsync(String resourceGroupName, String accountName) {
        return service.failover(this.client.getHost(), resourceGroupName, accountName, this.client.getSubscriptionId(), this.client.getApiVersion());
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> failoverAsync(String resourceGroupName, String accountName) {
        return failoverWithResponseAsync(resourceGroupName, accountName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public void failover(String resourceGroupName, String accountName) {
        failoverAsync(resourceGroupName, accountName).block();
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> revokeUserDelegationKeysWithResponseAsync(String resourceGroupName, String accountName) {
        return service.revokeUserDelegationKeys(this.client.getHost(), resourceGroupName, accountName, this.client.getSubscriptionId(), this.client.getApiVersion());
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> revokeUserDelegationKeysAsync(String resourceGroupName, String accountName) {
        return revokeUserDelegationKeysWithResponseAsync(resourceGroupName, accountName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public void revokeUserDelegationKeys(String resourceGroupName, String accountName) {
        revokeUserDelegationKeysAsync(resourceGroupName, accountName).block();
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<StorageAccountInner>> beginCreateWithResponseAsync(String resourceGroupName, String accountName, StorageAccountCreateParameters parameters) {
        return service.beginCreate(this.client.getHost(), resourceGroupName, accountName, this.client.getSubscriptionId(), parameters, this.client.getApiVersion());
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<StorageAccountInner> beginCreateAsync(String resourceGroupName, String accountName, StorageAccountCreateParameters parameters) {
        return beginCreateWithResponseAsync(resourceGroupName, accountName, parameters)
            .flatMap((SimpleResponse<StorageAccountInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public StorageAccountInner beginCreate(String resourceGroupName, String accountName, StorageAccountCreateParameters parameters) {
        return beginCreateAsync(resourceGroupName, accountName, parameters).block();
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginFailoverWithResponseAsync(String resourceGroupName, String accountName) {
        return service.beginFailover(this.client.getHost(), resourceGroupName, accountName, this.client.getSubscriptionId(), this.client.getApiVersion());
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginFailoverAsync(String resourceGroupName, String accountName) {
        return beginFailoverWithResponseAsync(resourceGroupName, accountName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginFailover(String resourceGroupName, String accountName) {
        beginFailoverAsync(resourceGroupName, accountName).block();
    }
}
