// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Cockroach
{
    /// <summary>
    /// Allow list of IP range
    /// </summary>
    [CockroachResourceType("cockroach:index/allowList:AllowList")]
    public partial class AllowList : global::Pulumi.CustomResource
    {
        [Output("cidrIp")]
        public Output<string> CidrIp { get; private set; } = null!;

        [Output("cidrMask")]
        public Output<int> CidrMask { get; private set; } = null!;

        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        [Output("name")]
        public Output<string?> Name { get; private set; } = null!;

        [Output("sql")]
        public Output<bool> Sql { get; private set; } = null!;

        [Output("ui")]
        public Output<bool> Ui { get; private set; } = null!;


        /// <summary>
        /// Create a AllowList resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AllowList(string name, AllowListArgs args, CustomResourceOptions? options = null)
            : base("cockroach:index/allowList:AllowList", name, args ?? new AllowListArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AllowList(string name, Input<string> id, AllowListState? state = null, CustomResourceOptions? options = null)
            : base("cockroach:index/allowList:AllowList", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AllowList resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AllowList Get(string name, Input<string> id, AllowListState? state = null, CustomResourceOptions? options = null)
        {
            return new AllowList(name, id, state, options);
        }
    }

    public sealed class AllowListArgs : global::Pulumi.ResourceArgs
    {
        [Input("cidrIp", required: true)]
        public Input<string> CidrIp { get; set; } = null!;

        [Input("cidrMask", required: true)]
        public Input<int> CidrMask { get; set; } = null!;

        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("sql", required: true)]
        public Input<bool> Sql { get; set; } = null!;

        [Input("ui", required: true)]
        public Input<bool> Ui { get; set; } = null!;

        public AllowListArgs()
        {
        }
        public static new AllowListArgs Empty => new AllowListArgs();
    }

    public sealed class AllowListState : global::Pulumi.ResourceArgs
    {
        [Input("cidrIp")]
        public Input<string>? CidrIp { get; set; }

        [Input("cidrMask")]
        public Input<int>? CidrMask { get; set; }

        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("sql")]
        public Input<bool>? Sql { get; set; }

        [Input("ui")]
        public Input<bool>? Ui { get; set; }

        public AllowListState()
        {
        }
        public static new AllowListState Empty => new AllowListState();
    }
}
