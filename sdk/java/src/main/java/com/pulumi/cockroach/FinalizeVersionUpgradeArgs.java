// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cockroach;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FinalizeVersionUpgradeArgs extends com.pulumi.resources.ResourceArgs {

    public static final FinalizeVersionUpgradeArgs Empty = new FinalizeVersionUpgradeArgs();

    @Import(name="cockroachVersion", required=true)
    private Output<String> cockroachVersion;

    public Output<String> cockroachVersion() {
        return this.cockroachVersion;
    }

    private FinalizeVersionUpgradeArgs() {}

    private FinalizeVersionUpgradeArgs(FinalizeVersionUpgradeArgs $) {
        this.cockroachVersion = $.cockroachVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FinalizeVersionUpgradeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FinalizeVersionUpgradeArgs $;

        public Builder() {
            $ = new FinalizeVersionUpgradeArgs();
        }

        public Builder(FinalizeVersionUpgradeArgs defaults) {
            $ = new FinalizeVersionUpgradeArgs(Objects.requireNonNull(defaults));
        }

        public Builder cockroachVersion(Output<String> cockroachVersion) {
            $.cockroachVersion = cockroachVersion;
            return this;
        }

        public Builder cockroachVersion(String cockroachVersion) {
            return cockroachVersion(Output.of(cockroachVersion));
        }

        public FinalizeVersionUpgradeArgs build() {
            $.cockroachVersion = Objects.requireNonNull($.cockroachVersion, "expected parameter 'cockroachVersion' to be non-null");
            return $;
        }
    }

}