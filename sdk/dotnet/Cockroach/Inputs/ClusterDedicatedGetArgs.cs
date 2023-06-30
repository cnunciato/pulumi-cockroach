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

    public sealed class ClusterDedicatedGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("diskIops")]
        public Input<int>? DiskIops { get; set; }

        [Input("machineType")]
        public Input<string>? MachineType { get; set; }

        [Input("memoryGib")]
        public Input<double>? MemoryGib { get; set; }

        [Input("numVirtualCpus")]
        public Input<int>? NumVirtualCpus { get; set; }

        /// <summary>
        /// Set to true to assign private IP addresses to nodes. Required for CMEK and other advanced networking features.
        /// </summary>
        [Input("privateNetworkVisibility")]
        public Input<bool>? PrivateNetworkVisibility { get; set; }

        [Input("storageGib")]
        public Input<int>? StorageGib { get; set; }

        public ClusterDedicatedGetArgs()
        {
        }
        public static new ClusterDedicatedGetArgs Empty => new ClusterDedicatedGetArgs();
    }
}
