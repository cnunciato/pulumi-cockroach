// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cockroach.inputs;

import com.pulumi.cockroach.inputs.PrivateEndpointServicesServiceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateEndpointServicesState extends com.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointServicesState Empty = new PrivateEndpointServicesState();

    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    @Import(name="services")
    private @Nullable Output<List<PrivateEndpointServicesServiceArgs>> services;

    public Optional<Output<List<PrivateEndpointServicesServiceArgs>>> services() {
        return Optional.ofNullable(this.services);
    }

    private PrivateEndpointServicesState() {}

    private PrivateEndpointServicesState(PrivateEndpointServicesState $) {
        this.clusterId = $.clusterId;
        this.services = $.services;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointServicesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointServicesState $;

        public Builder() {
            $ = new PrivateEndpointServicesState();
        }

        public Builder(PrivateEndpointServicesState defaults) {
            $ = new PrivateEndpointServicesState(Objects.requireNonNull(defaults));
        }

        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        public Builder services(@Nullable Output<List<PrivateEndpointServicesServiceArgs>> services) {
            $.services = services;
            return this;
        }

        public Builder services(List<PrivateEndpointServicesServiceArgs> services) {
            return services(Output.of(services));
        }

        public Builder services(PrivateEndpointServicesServiceArgs... services) {
            return services(List.of(services));
        }

        public PrivateEndpointServicesState build() {
            return $;
        }
    }

}
