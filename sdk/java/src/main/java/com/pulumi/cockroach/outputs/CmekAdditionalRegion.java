// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cockroach.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CmekAdditionalRegion {
    private String name;
    private @Nullable Integer nodeCount;
    /**
     * @return Set to true to mark this region as the primary for a Serverless cluster. Exactly one region must be primary. Dedicated clusters expect to have no primary region.
     * 
     */
    private @Nullable Boolean primary;
    private @Nullable String sqlDns;
    private @Nullable String uiDns;

    private CmekAdditionalRegion() {}
    public String name() {
        return this.name;
    }
    public Optional<Integer> nodeCount() {
        return Optional.ofNullable(this.nodeCount);
    }
    /**
     * @return Set to true to mark this region as the primary for a Serverless cluster. Exactly one region must be primary. Dedicated clusters expect to have no primary region.
     * 
     */
    public Optional<Boolean> primary() {
        return Optional.ofNullable(this.primary);
    }
    public Optional<String> sqlDns() {
        return Optional.ofNullable(this.sqlDns);
    }
    public Optional<String> uiDns() {
        return Optional.ofNullable(this.uiDns);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CmekAdditionalRegion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private @Nullable Integer nodeCount;
        private @Nullable Boolean primary;
        private @Nullable String sqlDns;
        private @Nullable String uiDns;
        public Builder() {}
        public Builder(CmekAdditionalRegion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.nodeCount = defaults.nodeCount;
    	      this.primary = defaults.primary;
    	      this.sqlDns = defaults.sqlDns;
    	      this.uiDns = defaults.uiDns;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder nodeCount(@Nullable Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        @CustomType.Setter
        public Builder primary(@Nullable Boolean primary) {
            this.primary = primary;
            return this;
        }
        @CustomType.Setter
        public Builder sqlDns(@Nullable String sqlDns) {
            this.sqlDns = sqlDns;
            return this;
        }
        @CustomType.Setter
        public Builder uiDns(@Nullable String uiDns) {
            this.uiDns = uiDns;
            return this;
        }
        public CmekAdditionalRegion build() {
            final var o = new CmekAdditionalRegion();
            o.name = name;
            o.nodeCount = nodeCount;
            o.primary = primary;
            o.sqlDns = sqlDns;
            o.uiDns = uiDns;
            return o;
        }
    }
}
