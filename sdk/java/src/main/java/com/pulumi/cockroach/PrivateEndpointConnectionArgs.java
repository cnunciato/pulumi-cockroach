// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cockroach;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PrivateEndpointConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    public Output<String> clusterId() {
        return this.clusterId;
    }

    @Import(name="endpointId", required=true)
    private Output<String> endpointId;

    public Output<String> endpointId() {
        return this.endpointId;
    }

    private PrivateEndpointConnectionArgs() {}

    private PrivateEndpointConnectionArgs(PrivateEndpointConnectionArgs $) {
        this.clusterId = $.clusterId;
        this.endpointId = $.endpointId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointConnectionArgs $;

        public Builder() {
            $ = new PrivateEndpointConnectionArgs();
        }

        public Builder(PrivateEndpointConnectionArgs defaults) {
            $ = new PrivateEndpointConnectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterId(Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        public Builder endpointId(Output<String> endpointId) {
            $.endpointId = endpointId;
            return this;
        }

        public Builder endpointId(String endpointId) {
            return endpointId(Output.of(endpointId));
        }

        public PrivateEndpointConnectionArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            $.endpointId = Objects.requireNonNull($.endpointId, "expected parameter 'endpointId' to be non-null");
            return $;
        }
    }

}
