// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cockroach;

import com.pulumi.cockroach.inputs.LogExportConfigGroupArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogExportConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogExportConfigArgs Empty = new LogExportConfigArgs();

    /**
     * Either the AWS Role ARN that identifies a role that the cluster account can assume to write to CloudWatch or the GCP Project ID that the cluster service account has permissions to write to for cloud logging
     * 
     */
    @Import(name="authPrincipal", required=true)
    private Output<String> authPrincipal;

    /**
     * @return Either the AWS Role ARN that identifies a role that the cluster account can assume to write to CloudWatch or the GCP Project ID that the cluster service account has permissions to write to for cloud logging
     * 
     */
    public Output<String> authPrincipal() {
        return this.authPrincipal;
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
    @Import(name="logName", required=true)
    private Output<String> logName;

    /**
     * @return An identifier for the logs in the customer&#39;s log sink
     * 
     */
    public Output<String> logName() {
        return this.logName;
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

    /**
     * The cloud selection that we&#39;re exporting to along with the cloud logging platform. Possible values are `GCP_CLOUD_LOGGING` or `AWS_CLOUDWATCH`
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The cloud selection that we&#39;re exporting to along with the cloud logging platform. Possible values are `GCP_CLOUD_LOGGING` or `AWS_CLOUDWATCH`
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private LogExportConfigArgs() {}

    private LogExportConfigArgs(LogExportConfigArgs $) {
        this.authPrincipal = $.authPrincipal;
        this.groups = $.groups;
        this.logName = $.logName;
        this.redact = $.redact;
        this.region = $.region;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogExportConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogExportConfigArgs $;

        public Builder() {
            $ = new LogExportConfigArgs();
        }

        public Builder(LogExportConfigArgs defaults) {
            $ = new LogExportConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authPrincipal Either the AWS Role ARN that identifies a role that the cluster account can assume to write to CloudWatch or the GCP Project ID that the cluster service account has permissions to write to for cloud logging
         * 
         * @return builder
         * 
         */
        public Builder authPrincipal(Output<String> authPrincipal) {
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
        public Builder logName(Output<String> logName) {
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

        /**
         * @param type The cloud selection that we&#39;re exporting to along with the cloud logging platform. Possible values are `GCP_CLOUD_LOGGING` or `AWS_CLOUDWATCH`
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
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

        public LogExportConfigArgs build() {
            $.authPrincipal = Objects.requireNonNull($.authPrincipal, "expected parameter 'authPrincipal' to be non-null");
            $.logName = Objects.requireNonNull($.logName, "expected parameter 'logName' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
