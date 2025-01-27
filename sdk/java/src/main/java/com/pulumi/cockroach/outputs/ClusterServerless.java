// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cockroach.outputs;

import com.pulumi.cockroach.outputs.ClusterServerlessUsageLimits;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterServerless {
    private @Nullable String routingId;
    /**
     * @return Spend limit in US cents.
     * 
     */
    private @Nullable Integer spendLimit;
    private @Nullable ClusterServerlessUsageLimits usageLimits;

    private ClusterServerless() {}
    public Optional<String> routingId() {
        return Optional.ofNullable(this.routingId);
    }
    /**
     * @return Spend limit in US cents.
     * 
     */
    public Optional<Integer> spendLimit() {
        return Optional.ofNullable(this.spendLimit);
    }
    public Optional<ClusterServerlessUsageLimits> usageLimits() {
        return Optional.ofNullable(this.usageLimits);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterServerless defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String routingId;
        private @Nullable Integer spendLimit;
        private @Nullable ClusterServerlessUsageLimits usageLimits;
        public Builder() {}
        public Builder(ClusterServerless defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.routingId = defaults.routingId;
    	      this.spendLimit = defaults.spendLimit;
    	      this.usageLimits = defaults.usageLimits;
        }

        @CustomType.Setter
        public Builder routingId(@Nullable String routingId) {
            this.routingId = routingId;
            return this;
        }
        @CustomType.Setter
        public Builder spendLimit(@Nullable Integer spendLimit) {
            this.spendLimit = spendLimit;
            return this;
        }
        @CustomType.Setter
        public Builder usageLimits(@Nullable ClusterServerlessUsageLimits usageLimits) {
            this.usageLimits = usageLimits;
            return this;
        }
        public ClusterServerless build() {
            final var o = new ClusterServerless();
            o.routingId = routingId;
            o.spendLimit = spendLimit;
            o.usageLimits = usageLimits;
            return o;
        }
    }
}
