// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cockroach;

import com.pulumi.cockroach.inputs.CmekAdditionalRegionArgs;
import com.pulumi.cockroach.inputs.CmekRegionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CmekArgs extends com.pulumi.resources.ResourceArgs {

    public static final CmekArgs Empty = new CmekArgs();

    /**
     * Once CMEK is enabled for a cluster, no new regions can be added to the cluster resource, since they need encryption key info stored in the CMEK resource. New regions can be added and maintained here instead.
     * 
     */
    @Import(name="additionalRegions")
    private @Nullable Output<List<CmekAdditionalRegionArgs>> additionalRegions;

    /**
     * @return Once CMEK is enabled for a cluster, no new regions can be added to the cluster resource, since they need encryption key info stored in the CMEK resource. New regions can be added and maintained here instead.
     * 
     */
    public Optional<Output<List<CmekAdditionalRegionArgs>>> additionalRegions() {
        return Optional.ofNullable(this.additionalRegions);
    }

    @Import(name="regions", required=true)
    private Output<List<CmekRegionArgs>> regions;

    public Output<List<CmekRegionArgs>> regions() {
        return this.regions;
    }

    /**
     * Aggregated status of the cluster&#39;s encryption key(s)
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Aggregated status of the cluster&#39;s encryption key(s)
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private CmekArgs() {}

    private CmekArgs(CmekArgs $) {
        this.additionalRegions = $.additionalRegions;
        this.regions = $.regions;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CmekArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CmekArgs $;

        public Builder() {
            $ = new CmekArgs();
        }

        public Builder(CmekArgs defaults) {
            $ = new CmekArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalRegions Once CMEK is enabled for a cluster, no new regions can be added to the cluster resource, since they need encryption key info stored in the CMEK resource. New regions can be added and maintained here instead.
         * 
         * @return builder
         * 
         */
        public Builder additionalRegions(@Nullable Output<List<CmekAdditionalRegionArgs>> additionalRegions) {
            $.additionalRegions = additionalRegions;
            return this;
        }

        /**
         * @param additionalRegions Once CMEK is enabled for a cluster, no new regions can be added to the cluster resource, since they need encryption key info stored in the CMEK resource. New regions can be added and maintained here instead.
         * 
         * @return builder
         * 
         */
        public Builder additionalRegions(List<CmekAdditionalRegionArgs> additionalRegions) {
            return additionalRegions(Output.of(additionalRegions));
        }

        /**
         * @param additionalRegions Once CMEK is enabled for a cluster, no new regions can be added to the cluster resource, since they need encryption key info stored in the CMEK resource. New regions can be added and maintained here instead.
         * 
         * @return builder
         * 
         */
        public Builder additionalRegions(CmekAdditionalRegionArgs... additionalRegions) {
            return additionalRegions(List.of(additionalRegions));
        }

        public Builder regions(Output<List<CmekRegionArgs>> regions) {
            $.regions = regions;
            return this;
        }

        public Builder regions(List<CmekRegionArgs> regions) {
            return regions(Output.of(regions));
        }

        public Builder regions(CmekRegionArgs... regions) {
            return regions(List.of(regions));
        }

        /**
         * @param status Aggregated status of the cluster&#39;s encryption key(s)
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Aggregated status of the cluster&#39;s encryption key(s)
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public CmekArgs build() {
            $.regions = Objects.requireNonNull($.regions, "expected parameter 'regions' to be non-null");
            return $;
        }
    }

}
