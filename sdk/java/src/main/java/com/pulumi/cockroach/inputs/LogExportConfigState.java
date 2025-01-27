// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cockroach.inputs;

import com.pulumi.cockroach.inputs.LogExportConfigGroupArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogExportConfigState extends com.pulumi.resources.ResourceArgs {

    public static final LogExportConfigState Empty = new LogExportConfigState();

    /**
     * Either the AWS Role ARN that identifies a role that the cluster account can assume to write to CloudWatch or the GCP Project ID that the cluster service account has permissions to write to for cloud logging
     * 
     */
    @Import(name="authPrincipal")
    private @Nullable Output<String> authPrincipal;

    /**
     * @return Either the AWS Role ARN that identifies a role that the cluster account can assume to write to CloudWatch or the GCP Project ID that the cluster service account has permissions to write to for cloud logging
     * 
     */
    public Optional<Output<String>> authPrincipal() {
        return Optional.ofNullable(this.authPrincipal);
    }

    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    @Import(name="groups")
    private @Nullable Output<List<LogExportConfigGroupArgs>> groups;

    public Optional<Output<List<LogExportConfigGroupArgs>>> groups() {
        return Optional.ofNullable(this.groups);
    }

    /**
     * An identifier for the logs in the customer&#39;s log sink
     * 
     */
    @Import(name="logName")
    private @Nullable Output<String> logName;

    /**
     * @return An identifier for the logs in the customer&#39;s log sink
     * 
     */
    public Optional<Output<String>> logName() {
        return Optional.ofNullable(this.logName);
    }

    /**
     * Controls whether logs are redacted before forwarding to customer sinks
     * 
     */
    @Import(name="redact")
    private @Nullable Output<Boolean> redact;

    /**
     * @return Controls whether logs are redacted before forwarding to customer sinks
     * 
     */
    public Optional<Output<Boolean>> redact() {
        return Optional.ofNullable(this.redact);
    }

    /**
     * Controls whether all logs are sent to a specific region in the customer sink
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Controls whether all logs are sent to a specific region in the customer sink
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    @Import(name="status")
    private @Nullable Output<String> status;

    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The cloud selection that we&#39;re exporting to along with the cloud logging platform. Possible values are `GCP_CLOUD_LOGGING` or `AWS_CLOUDWATCH`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The cloud selection that we&#39;re exporting to along with the cloud logging platform. Possible values are `GCP_CLOUD_LOGGING` or `AWS_CLOUDWATCH`
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    @Import(name="userMessage")
    private @Nullable Output<String> userMessage;

    public Optional<Output<String>> userMessage() {
        return Optional.ofNullable(this.userMessage);
    }

    private LogExportConfigState() {}

    private LogExportConfigState(LogExportConfigState $) {
        this.authPrincipal = $.authPrincipal;
        this.createdAt = $.createdAt;
        this.groups = $.groups;
        this.logName = $.logName;
        this.redact = $.redact;
        this.region = $.region;
        this.status = $.status;
        this.type = $.type;
        this.updatedAt = $.updatedAt;
        this.userMessage = $.userMessage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogExportConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogExportConfigState $;

        public Builder() {
            $ = new LogExportConfigState();
        }

        public Builder(LogExportConfigState defaults) {
            $ = new LogExportConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param authPrincipal Either the AWS Role ARN that identifies a role that the cluster account can assume to write to CloudWatch or the GCP Project ID that the cluster service account has permissions to write to for cloud logging
         * 
         * @return builder
         * 
         */
        public Builder authPrincipal(@Nullable Output<String> authPrincipal) {
            $.authPrincipal = authPrincipal;
            return this;
        }

        /**
         * @param authPrincipal Either the AWS Role ARN that identifies a role that the cluster account can assume to write to CloudWatch or the GCP Project ID that the cluster service account has permissions to write to for cloud logging
         * 
         * @return builder
         * 
         */
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

        public Builder groups(@Nullable Output<List<LogExportConfigGroupArgs>> groups) {
            $.groups = groups;
            return this;
        }

        public Builder groups(List<LogExportConfigGroupArgs> groups) {
            return groups(Output.of(groups));
        }

        public Builder groups(LogExportConfigGroupArgs... groups) {
            return groups(List.of(groups));
        }

        /**
         * @param logName An identifier for the logs in the customer&#39;s log sink
         * 
         * @return builder
         * 
         */
        public Builder logName(@Nullable Output<String> logName) {
            $.logName = logName;
            return this;
        }

        /**
         * @param logName An identifier for the logs in the customer&#39;s log sink
         * 
         * @return builder
         * 
         */
        public Builder logName(String logName) {
            return logName(Output.of(logName));
        }

        /**
         * @param redact Controls whether logs are redacted before forwarding to customer sinks
         * 
         * @return builder
         * 
         */
        public Builder redact(@Nullable Output<Boolean> redact) {
            $.redact = redact;
            return this;
        }

        /**
         * @param redact Controls whether logs are redacted before forwarding to customer sinks
         * 
         * @return builder
         * 
         */
        public Builder redact(Boolean redact) {
            return redact(Output.of(redact));
        }

        /**
         * @param region Controls whether all logs are sent to a specific region in the customer sink
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Controls whether all logs are sent to a specific region in the customer sink
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param type The cloud selection that we&#39;re exporting to along with the cloud logging platform. Possible values are `GCP_CLOUD_LOGGING` or `AWS_CLOUDWATCH`
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The cloud selection that we&#39;re exporting to along with the cloud logging platform. Possible values are `GCP_CLOUD_LOGGING` or `AWS_CLOUDWATCH`
         * 
         * @return builder
         * 
         */
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

        public Builder userMessage(@Nullable Output<String> userMessage) {
            $.userMessage = userMessage;
            return this;
        }

        public Builder userMessage(String userMessage) {
            return userMessage(Output.of(userMessage));
        }

        public LogExportConfigState build() {
            return $;
        }
    }

}
