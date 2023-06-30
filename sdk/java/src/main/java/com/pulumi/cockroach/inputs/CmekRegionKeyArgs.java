// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cockroach.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CmekRegionKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final CmekRegionKeyArgs Empty = new CmekRegionKeyArgs();

    @Import(name="authPrincipal", required=true)
    private Output<String> authPrincipal;

    public Output<String> authPrincipal() {
        return this.authPrincipal;
    }

    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
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

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    @Import(name="uri", required=true)
    private Output<String> uri;

    public Output<String> uri() {
        return this.uri;
    }

    @Import(name="userMessage")
    private @Nullable Output<String> userMessage;

    public Optional<Output<String>> userMessage() {
        return Optional.ofNullable(this.userMessage);
    }

    private CmekRegionKeyArgs() {}

    private CmekRegionKeyArgs(CmekRegionKeyArgs $) {
        this.authPrincipal = $.authPrincipal;
        this.createdAt = $.createdAt;
        this.status = $.status;
        this.type = $.type;
        this.updatedAt = $.updatedAt;
        this.uri = $.uri;
        this.userMessage = $.userMessage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CmekRegionKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CmekRegionKeyArgs $;

        public Builder() {
            $ = new CmekRegionKeyArgs();
        }

        public Builder(CmekRegionKeyArgs defaults) {
            $ = new CmekRegionKeyArgs(Objects.requireNonNull(defaults));
        }

        public Builder authPrincipal(Output<String> authPrincipal) {
            $.authPrincipal = authPrincipal;
            return this;
        }

        public Builder authPrincipal(String authPrincipal) {
            return authPrincipal(Output.of(authPrincipal));
        }

        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
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

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        public Builder uri(Output<String> uri) {
            $.uri = uri;
            return this;
        }

        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public Builder userMessage(@Nullable Output<String> userMessage) {
            $.userMessage = userMessage;
            return this;
        }

        public Builder userMessage(String userMessage) {
            return userMessage(Output.of(userMessage));
        }

        public CmekRegionKeyArgs build() {
            $.authPrincipal = Objects.requireNonNull($.authPrincipal, "expected parameter 'authPrincipal' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}
