// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cockroach.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AllowListState extends com.pulumi.resources.ResourceArgs {

    public static final AllowListState Empty = new AllowListState();

    @Import(name="cidrIp")
    private @Nullable Output<String> cidrIp;

    public Optional<Output<String>> cidrIp() {
        return Optional.ofNullable(this.cidrIp);
    }

    @Import(name="cidrMask")
    private @Nullable Output<Integer> cidrMask;

    public Optional<Output<Integer>> cidrMask() {
        return Optional.ofNullable(this.cidrMask);
    }

    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="sql")
    private @Nullable Output<Boolean> sql;

    public Optional<Output<Boolean>> sql() {
        return Optional.ofNullable(this.sql);
    }

    @Import(name="ui")
    private @Nullable Output<Boolean> ui;

    public Optional<Output<Boolean>> ui() {
        return Optional.ofNullable(this.ui);
    }

    private AllowListState() {}

    private AllowListState(AllowListState $) {
        this.cidrIp = $.cidrIp;
        this.cidrMask = $.cidrMask;
        this.clusterId = $.clusterId;
        this.name = $.name;
        this.sql = $.sql;
        this.ui = $.ui;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AllowListState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AllowListState $;

        public Builder() {
            $ = new AllowListState();
        }

        public Builder(AllowListState defaults) {
            $ = new AllowListState(Objects.requireNonNull(defaults));
        }

        public Builder cidrIp(@Nullable Output<String> cidrIp) {
            $.cidrIp = cidrIp;
            return this;
        }

        public Builder cidrIp(String cidrIp) {
            return cidrIp(Output.of(cidrIp));
        }

        public Builder cidrMask(@Nullable Output<Integer> cidrMask) {
            $.cidrMask = cidrMask;
            return this;
        }

        public Builder cidrMask(Integer cidrMask) {
            return cidrMask(Output.of(cidrMask));
        }

        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder sql(@Nullable Output<Boolean> sql) {
            $.sql = sql;
            return this;
        }

        public Builder sql(Boolean sql) {
            return sql(Output.of(sql));
        }

        public Builder ui(@Nullable Output<Boolean> ui) {
            $.ui = ui;
            return this;
        }

        public Builder ui(Boolean ui) {
            return ui(Output.of(ui));
        }

        public AllowListState build() {
            return $;
        }
    }

}
