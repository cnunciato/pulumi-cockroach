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
    public sealed class PrivateEndpointServicesServiceAws
    {
        public readonly ImmutableArray<string> AvailabilityZoneIds;
        public readonly string? ServiceId;
        public readonly string? ServiceName;

        [OutputConstructor]
        private PrivateEndpointServicesServiceAws(
            ImmutableArray<string> availabilityZoneIds,

            string? serviceId,

            string? serviceName)
        {
            AvailabilityZoneIds = availabilityZoneIds;
            ServiceId = serviceId;
            ServiceName = serviceName;
        }
    }
}