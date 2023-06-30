// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Cockroach.Outputs
{

    [OutputType]
    public sealed class ClusterDedicated
    {
        public readonly int? DiskIops;
        public readonly string? MachineType;
        public readonly double? MemoryGib;
        public readonly int? NumVirtualCpus;
        /// <summary>
        /// Set to true to assign private IP addresses to nodes. Required for CMEK and other advanced networking features.
        /// </summary>
        public readonly bool? PrivateNetworkVisibility;
        public readonly int? StorageGib;

        [OutputConstructor]
        private ClusterDedicated(
            int? diskIops,

            string? machineType,

            double? memoryGib,

            int? numVirtualCpus,

            bool? privateNetworkVisibility,

            int? storageGib)
        {
            DiskIops = diskIops;
            MachineType = machineType;
            MemoryGib = memoryGib;
            NumVirtualCpus = numVirtualCpus;
            PrivateNetworkVisibility = privateNetworkVisibility;
            StorageGib = storageGib;
        }
    }
}
