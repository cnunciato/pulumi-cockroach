// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Cockroach.Inputs
{

    public sealed class ClusterRegionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of cluster
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("nodeCount")]
        public Input<int>? NodeCount { get; set; }

        /// <summary>
        /// Set to true to mark this region as the primary for a Serverless cluster. Exactly one region must be primary. Dedicated clusters expect to have no primary region.
        /// </summary>
        [Input("primary")]
        public Input<bool>? Primary { get; set; }

        [Input("sqlDns")]
        public Input<string>? SqlDns { get; set; }

        [Input("uiDns")]
        public Input<string>? UiDns { get; set; }

        public ClusterRegionGetArgs()
        {
        }
        public static new ClusterRegionGetArgs Empty => new ClusterRegionGetArgs();
    }
}
