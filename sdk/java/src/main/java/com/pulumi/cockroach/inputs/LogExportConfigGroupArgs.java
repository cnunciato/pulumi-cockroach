// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cockroach.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogExportConfigGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogExportConfigGroupArgs Empty = new LogExportConfigGroupArgs();

    /**
     * A list of CRDB log channels to include in this group
     * 
     */
    @Import(name="channels", required=true)
    private Output<List<String>> channels;

    /**
     * @return A list of CRDB log channels to include in this group
     * 
     */
    public Output<List<String>> channels() {
        return this.channels;
    }

    /**
     * The name of the group, reflected in the log sink
     * 
     */
    @Import(name="logName", required=true)
    private Output<String> logName;

    /**
     * @return The name of the group, reflected in the log sink
     * 
     */
    public Output<String> logName() {
        return this.logName;
    }

    /**
     * The minimum log level to filter to this log group
     * 
     */
    @Import(name="minLevel")
    private @Nullable Output<String> minLevel;

    /**
     * @return The minimum log level to filter to this log group
     * 
     */
    public Optional<Output<String>> minLevel() {
        return Optional.ofNullable(this.minLevel);
    }

    /**
     * Governs whether this log group should aggregate redacted logs if unset
     * 
     */
    @Import(name="redact")
    private @Nullable Output<Boolean> redact;

    /**
     * @return Governs whether this log group should aggregate redacted logs if unset
     * 
     */
    public Optional<Output<Boolean>> redact() {
        return Optional.ofNullable(this.redact);
    }

    private LogExportConfigGroupArgs() {}

    private LogExportConfigGroupArgs(LogExportConfigGroupArgs $) {
        this.channels = $.channels;
        this.logName = $.logName;
        this.minLevel = $.minLevel;
        this.redact = $.redact;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogExportConfigGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogExportConfigGroupArgs $;

        public Builder() {
            $ = new LogExportConfigGroupArgs();
        }

        public Builder(LogExportConfigGroupArgs defaults) {
            $ = new LogExportConfigGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param channels A list of CRDB log channels to include in this group
         * 
         * @return builder
         * 
         */
        public Builder channels(Output<List<String>> channels) {
            $.channels = channels;
            return this;
        }

        /**
         * @param channels A list of CRDB log channels to include in this group
         * 
         * @return builder
         * 
         */
        public Builder channels(List<String> channels) {
            return channels(Output.of(channels));
        }

        /**
         * @param channels A list of CRDB log channels to include in this group
         * 
         * @return builder
         * 
         */
        public Builder channels(String... channels) {
            return channels(List.of(channels));
        }

        /**
         * @param logName The name of the group, reflected in the log sink
         * 
         * @return builder
         * 
         */
        public Builder logName(Output<String> logName) {
            $.logName = logName;
            return this;
        }

        /**
         * @param logName The name of the group, reflected in the log sink
         * 
         * @return builder
         * 
         */
        public Builder logName(String logName) {
            return logName(Output.of(logName));
        }

        /**
         * @param minLevel The minimum log level to filter to this log group
         * 
         * @return builder
         * 
         */
        public Builder minLevel(@Nullable Output<String> minLevel) {
            $.minLevel = minLevel;
            return this;
        }

        /**
         * @param minLevel The minimum log level to filter to this log group
         * 
         * @return builder
         * 
         */
        public Builder minLevel(String minLevel) {
            return minLevel(Output.of(minLevel));
        }

        /**
         * @param redact Governs whether this log group should aggregate redacted logs if unset
         * 
         * @return builder
         * 
         */
        public Builder redact(@Nullable Output<Boolean> redact) {
            $.redact = redact;
            return this;
        }

        /**
         * @param redact Governs whether this log group should aggregate redacted logs if unset
         * 
         * @return builder
         * 
         */
        public Builder redact(Boolean redact) {
            return redact(Output.of(redact));
        }

        public LogExportConfigGroupArgs build() {
            $.channels = Objects.requireNonNull($.channels, "expected parameter 'channels' to be non-null");
            $.logName = Objects.requireNonNull($.logName, "expected parameter 'logName' to be non-null");
            return $;
        }
    }

}
