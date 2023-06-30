// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cockroach.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrivateEndpointServicesServiceAws {
    private @Nullable List<String> availabilityZoneIds;
    private @Nullable String serviceId;
    private @Nullable String serviceName;

    private PrivateEndpointServicesServiceAws() {}
    public List<String> availabilityZoneIds() {
        return this.availabilityZoneIds == null ? List.of() : this.availabilityZoneIds;
    }
    public Optional<String> serviceId() {
        return Optional.ofNullable(this.serviceId);
    }
    public Optional<String> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointServicesServiceAws defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> availabilityZoneIds;
        private @Nullable String serviceId;
        private @Nullable String serviceName;
        public Builder() {}
        public Builder(PrivateEndpointServicesServiceAws defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZoneIds = defaults.availabilityZoneIds;
    	      this.serviceId = defaults.serviceId;
    	      this.serviceName = defaults.serviceName;
        }

        @CustomType.Setter
        public Builder availabilityZoneIds(@Nullable List<String> availabilityZoneIds) {
            this.availabilityZoneIds = availabilityZoneIds;
            return this;
        }
        public Builder availabilityZoneIds(String... availabilityZoneIds) {
            return availabilityZoneIds(List.of(availabilityZoneIds));
        }
        @CustomType.Setter
        public Builder serviceId(@Nullable String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        @CustomType.Setter
        public Builder serviceName(@Nullable String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public PrivateEndpointServicesServiceAws build() {
            final var o = new PrivateEndpointServicesServiceAws();
            o.availabilityZoneIds = availabilityZoneIds;
            o.serviceId = serviceId;
            o.serviceName = serviceName;
            return o;
        }
    }
}