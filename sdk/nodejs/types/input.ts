// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";

export interface ClusterDedicated {
    diskIops?: pulumi.Input<number>;
    machineType?: pulumi.Input<string>;
    memoryGib?: pulumi.Input<number>;
    numVirtualCpus?: pulumi.Input<number>;
    /**
     * Set to true to assign private IP addresses to nodes. Required for CMEK and other advanced networking features.
     */
    privateNetworkVisibility?: pulumi.Input<boolean>;
    storageGib?: pulumi.Input<number>;
}

export interface ClusterRegion {
    /**
     * Name of cluster
     */
    name: pulumi.Input<string>;
    nodeCount?: pulumi.Input<number>;
    /**
     * Set to true to mark this region as the primary for a Serverless cluster. Exactly one region must be primary. Dedicated clusters expect to have no primary region.
     */
    primary?: pulumi.Input<boolean>;
    sqlDns?: pulumi.Input<string>;
    uiDns?: pulumi.Input<string>;
}

export interface ClusterServerless {
    routingId?: pulumi.Input<string>;
    /**
     * Spend limit in US cents.
     */
    spendLimit?: pulumi.Input<number>;
    usageLimits?: pulumi.Input<inputs.ClusterServerlessUsageLimits>;
}

export interface ClusterServerlessUsageLimits {
    requestUnitLimit: pulumi.Input<number>;
    storageMibLimit: pulumi.Input<number>;
}

export interface CmekAdditionalRegion {
    name: pulumi.Input<string>;
    nodeCount?: pulumi.Input<number>;
    /**
     * Set to true to mark this region as the primary for a Serverless cluster. Exactly one region must be primary. Dedicated clusters expect to have no primary region.
     */
    primary?: pulumi.Input<boolean>;
    sqlDns?: pulumi.Input<string>;
    uiDns?: pulumi.Input<string>;
}

export interface CmekRegion {
    key: pulumi.Input<inputs.CmekRegionKey>;
    region: pulumi.Input<string>;
    /**
     * Aggregated status of the cluster's encryption key(s)
     */
    status?: pulumi.Input<string>;
}

export interface CmekRegionKey {
    authPrincipal: pulumi.Input<string>;
    createdAt?: pulumi.Input<string>;
    /**
     * Aggregated status of the cluster's encryption key(s)
     */
    status?: pulumi.Input<string>;
    type: pulumi.Input<string>;
    updatedAt?: pulumi.Input<string>;
    uri: pulumi.Input<string>;
    userMessage?: pulumi.Input<string>;
}

export interface LogExportConfigGroup {
    /**
     * A list of CRDB log channels to include in this group
     */
    channels: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the group, reflected in the log sink
     */
    logName: pulumi.Input<string>;
    /**
     * The minimum log level to filter to this log group
     */
    minLevel?: pulumi.Input<string>;
    /**
     * Governs whether this log group should aggregate redacted logs if unset
     */
    redact?: pulumi.Input<boolean>;
}

export interface PrivateEndpointServicesService {
    aws?: pulumi.Input<inputs.PrivateEndpointServicesServiceAws>;
    cloudProvider?: pulumi.Input<string>;
    regionName?: pulumi.Input<string>;
    status?: pulumi.Input<string>;
}

export interface PrivateEndpointServicesServiceAws {
    availabilityZoneIds?: pulumi.Input<pulumi.Input<string>[]>;
    serviceId?: pulumi.Input<string>;
    serviceName?: pulumi.Input<string>;
}

export interface UserRoleGrantsRole {
    resourceId?: pulumi.Input<string>;
    resourceType: pulumi.Input<string>;
    roleName: pulumi.Input<string>;
}