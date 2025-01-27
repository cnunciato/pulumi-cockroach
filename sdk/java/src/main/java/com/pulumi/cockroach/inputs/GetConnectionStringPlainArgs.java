// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cockroach.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConnectionStringPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectionStringPlainArgs Empty = new GetConnectionStringPlainArgs();

    /**
     * Database to connect to. Defaults to &#39;defaultdb&#39;.
     * 
     */
    @Import(name="database")
    private @Nullable String database;

    /**
     * @return Database to connect to. Defaults to &#39;defaultdb&#39;.
     * 
     */
    public Optional<String> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * Cluster ID
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return Cluster ID
     * 
     */
    public String id() {
        return this.id;
    }

    @Import(name="os")
    private @Nullable String os;

    public Optional<String> os() {
        return Optional.ofNullable(this.os);
    }

    /**
     * Database user password. Must also include `sql_user`.
     * 
     */
    @Import(name="password")
    private @Nullable String password;

    /**
     * @return Database user password. Must also include `sql_user`.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Database username.
     * 
     */
    @Import(name="sqlUser")
    private @Nullable String sqlUser;

    /**
     * @return Database username.
     * 
     */
    public Optional<String> sqlUser() {
        return Optional.ofNullable(this.sqlUser);
    }

    private GetConnectionStringPlainArgs() {}

    private GetConnectionStringPlainArgs(GetConnectionStringPlainArgs $) {
        this.database = $.database;
        this.id = $.id;
        this.os = $.os;
        this.password = $.password;
        this.sqlUser = $.sqlUser;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectionStringPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectionStringPlainArgs $;

        public Builder() {
            $ = new GetConnectionStringPlainArgs();
        }

        public Builder(GetConnectionStringPlainArgs defaults) {
            $ = new GetConnectionStringPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param database Database to connect to. Defaults to &#39;defaultdb&#39;.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable String database) {
            $.database = database;
            return this;
        }

        /**
         * @param id Cluster ID
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public Builder os(@Nullable String os) {
            $.os = os;
            return this;
        }

        /**
         * @param password Database user password. Must also include `sql_user`.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable String password) {
            $.password = password;
            return this;
        }

        /**
         * @param sqlUser Database username.
         * 
         * @return builder
         * 
         */
        public Builder sqlUser(@Nullable String sqlUser) {
            $.sqlUser = sqlUser;
            return this;
        }

        public GetConnectionStringPlainArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
