// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cockroach;

import com.pulumi.cockroach.PrivateEndpointConnectionArgs;
import com.pulumi.cockroach.Utilities;
import com.pulumi.cockroach.inputs.PrivateEndpointConnectionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * AWS PrivateLink Endpoint Connection
 * 
 */
@ResourceType(type="cockroach:index/privateEndpointConnection:PrivateEndpointConnection")
public class PrivateEndpointConnection extends com.pulumi.resources.CustomResource {
    @Export(name="cloudProvider", type=String.class, parameters={})
    private Output<String> cloudProvider;

    public Output<String> cloudProvider() {
        return this.cloudProvider;
    }
    @Export(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    public Output<String> clusterId() {
        return this.clusterId;
    }
    @Export(name="endpointId", type=String.class, parameters={})
    private Output<String> endpointId;

    public Output<String> endpointId() {
        return this.endpointId;
    }
    @Export(name="regionName", type=String.class, parameters={})
    private Output<String> regionName;

    public Output<String> regionName() {
        return this.regionName;
    }
    @Export(name="serviceId", type=String.class, parameters={})
    private Output<String> serviceId;

    public Output<String> serviceId() {
        return this.serviceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateEndpointConnection(String name) {
        this(name, PrivateEndpointConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateEndpointConnection(String name, PrivateEndpointConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateEndpointConnection(String name, PrivateEndpointConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cockroach:index/privateEndpointConnection:PrivateEndpointConnection", name, args == null ? PrivateEndpointConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrivateEndpointConnection(String name, Output<String> id, @Nullable PrivateEndpointConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cockroach:index/privateEndpointConnection:PrivateEndpointConnection", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PrivateEndpointConnection get(String name, Output<String> id, @Nullable PrivateEndpointConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PrivateEndpointConnection(name, id, state, options);
    }
}
