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
    /// PrivateEndpointServices contains services that allow for VPC communication, either via PrivateLink (AWS) or Peering (GCP)
    /// </summary>
    [CockroachResourceType("cockroach:index/privateEndpointServices:PrivateEndpointServices")]
    public partial class PrivateEndpointServices : global::Pulumi.CustomResource
    {
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        [Output("services")]
        public Output<ImmutableArray<Outputs.PrivateEndpointServicesService>> Services { get; private set; } = null!;


        /// <summary>
        /// Create a PrivateEndpointServices resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PrivateEndpointServices(string name, PrivateEndpointServicesArgs args, CustomResourceOptions? options = null)
            : base("cockroach:index/privateEndpointServices:PrivateEndpointServices", name, args ?? new PrivateEndpointServicesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PrivateEndpointServices(string name, Input<string> id, PrivateEndpointServicesState? state = null, CustomResourceOptions? options = null)
            : base("cockroach:index/privateEndpointServices:PrivateEndpointServices", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PrivateEndpointServices resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PrivateEndpointServices Get(string name, Input<string> id, PrivateEndpointServicesState? state = null, CustomResourceOptions? options = null)
        {
            return new PrivateEndpointServices(name, id, state, options);
        }
    }

    public sealed class PrivateEndpointServicesArgs : global::Pulumi.ResourceArgs
    {
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        public PrivateEndpointServicesArgs()
        {
        }
        public static new PrivateEndpointServicesArgs Empty => new PrivateEndpointServicesArgs();
    }

    public sealed class PrivateEndpointServicesState : global::Pulumi.ResourceArgs
    {
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        [Input("services")]
        private InputList<Inputs.PrivateEndpointServicesServiceGetArgs>? _services;
        public InputList<Inputs.PrivateEndpointServicesServiceGetArgs> Services
        {
            get => _services ?? (_services = new InputList<Inputs.PrivateEndpointServicesServiceGetArgs>());
            set => _services = value;
        }

        public PrivateEndpointServicesState()
        {
        }
        public static new PrivateEndpointServicesState Empty => new PrivateEndpointServicesState();
    }
}
