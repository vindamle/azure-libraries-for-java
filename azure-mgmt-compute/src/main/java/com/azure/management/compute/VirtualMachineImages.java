/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.azure.management.resources.fluentcore.arm.Region;
import com.azure.management.resources.fluentcore.collection.SupportsSimpleListingByRegion;

/**
 *  Entry point to virtual machine image management API.
 */
@Fluent
public interface VirtualMachineImages extends SupportsSimpleListingByRegion<VirtualMachineImage> {
    /**
     * Gets a virtual machine image.
     *
     * @param region the region
     * @param publisherName publisher name
     * @param offerName offer name
     * @param skuName SKU name
     * @param version version name
     * @return the virtual machine image
     */
    VirtualMachineImage getImage(Region region, String publisherName, String offerName, String skuName, String version);

    /**
     * Gets a virtual machine image.
     *
     * @param region the region
     * @param publisherName publisher name
     * @param offerName offer name
     * @param skuName SKU name
     * @param version version name
     * @return the virtual machine image
     */
    VirtualMachineImage getImage(String region, String publisherName, String offerName, String skuName, String version);

    /**
     * @return entry point to virtual machine image publishers
     */
    VirtualMachinePublishers publishers();
}