// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.resources;

import com.azure.core.http.rest.PagedIterable;
import com.azure.management.RestClient;
import com.azure.management.resources.core.TestBase;
import com.azure.management.resources.core.TestUtilities;
import com.azure.management.resources.implementation.ResourceManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubscriptionsTests extends TestBase {
    protected static ResourceManager.Authenticated resourceManager;

    @Override
    protected void initializeClients(RestClient restClient, String defaultSubscription, String domain) {
        resourceManager = ResourceManager
                .authenticate(restClient);
    }

    @Override
    protected void cleanUpResources() {

    }

    @Test
    public void canListSubscriptions() throws Exception {
        PagedIterable<Subscription> subscriptions = resourceManager.subscriptions().list();
        Assertions.assertTrue(TestUtilities.getPagedIterableSize(subscriptions) > 0);
    }

    @Test
    public void canListLocations() throws Exception {
        PagedIterable<Location> locations = resourceManager.subscriptions().list().iterator().next().listLocations();
        Assertions.assertTrue(TestUtilities.getPagedIterableSize(locations) > 0);
    }
}