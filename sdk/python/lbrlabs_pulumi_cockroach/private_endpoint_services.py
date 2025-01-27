# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['PrivateEndpointServicesArgs', 'PrivateEndpointServices']

@pulumi.input_type
class PrivateEndpointServicesArgs:
    def __init__(__self__, *,
                 cluster_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a PrivateEndpointServices resource.
        """
        pulumi.set(__self__, "cluster_id", cluster_id)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "cluster_id", value)


@pulumi.input_type
class _PrivateEndpointServicesState:
    def __init__(__self__, *,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 services: Optional[pulumi.Input[Sequence[pulumi.Input['PrivateEndpointServicesServiceArgs']]]] = None):
        """
        Input properties used for looking up and filtering PrivateEndpointServices resources.
        """
        if cluster_id is not None:
            pulumi.set(__self__, "cluster_id", cluster_id)
        if services is not None:
            pulumi.set(__self__, "services", services)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter
    def services(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['PrivateEndpointServicesServiceArgs']]]]:
        return pulumi.get(self, "services")

    @services.setter
    def services(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['PrivateEndpointServicesServiceArgs']]]]):
        pulumi.set(self, "services", value)


class PrivateEndpointServices(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        PrivateEndpointServices contains services that allow for VPC communication, either via PrivateLink (AWS) or Peering (GCP)

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PrivateEndpointServicesArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        PrivateEndpointServices contains services that allow for VPC communication, either via PrivateLink (AWS) or Peering (GCP)

        :param str resource_name: The name of the resource.
        :param PrivateEndpointServicesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PrivateEndpointServicesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PrivateEndpointServicesArgs.__new__(PrivateEndpointServicesArgs)

            if cluster_id is None and not opts.urn:
                raise TypeError("Missing required property 'cluster_id'")
            __props__.__dict__["cluster_id"] = cluster_id
            __props__.__dict__["services"] = None
        super(PrivateEndpointServices, __self__).__init__(
            'cockroach:index/privateEndpointServices:PrivateEndpointServices',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            services: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['PrivateEndpointServicesServiceArgs']]]]] = None) -> 'PrivateEndpointServices':
        """
        Get an existing PrivateEndpointServices resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PrivateEndpointServicesState.__new__(_PrivateEndpointServicesState)

        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["services"] = services
        return PrivateEndpointServices(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter
    def services(self) -> pulumi.Output[Sequence['outputs.PrivateEndpointServicesService']]:
        return pulumi.get(self, "services")

