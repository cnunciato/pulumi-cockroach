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

    public sealed class CmekRegionKeyArgs : global::Pulumi.ResourceArgs
    {
        [Input("authPrincipal", required: true)]
        public Input<string> AuthPrincipal { get; set; } = null!;

        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// Aggregated status of the cluster's encryption key(s)
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        [Input("uri", required: true)]
        public Input<string> Uri { get; set; } = null!;

        [Input("userMessage")]
        public Input<string>? UserMessage { get; set; }

        public CmekRegionKeyArgs()
        {
        }
        public static new CmekRegionKeyArgs Empty => new CmekRegionKeyArgs();
    }
}
