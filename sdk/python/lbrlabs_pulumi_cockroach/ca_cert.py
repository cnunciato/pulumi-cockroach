# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['CaCertArgs', 'CaCert']

@pulumi.input_type
class CaCertArgs:
    def __init__(__self__, *,
                 x509_pem_cert: pulumi.Input[str]):
        """
        The set of arguments for constructing a CaCert resource.
        :param pulumi.Input[str] x509_pem_cert: X509 certificate in PEM format
        """
        pulumi.set(__self__, "x509_pem_cert", x509_pem_cert)

    @property
    @pulumi.getter(name="x509PemCert")
    def x509_pem_cert(self) -> pulumi.Input[str]:
        """
        X509 certificate in PEM format
        """
        return pulumi.get(self, "x509_pem_cert")

    @x509_pem_cert.setter
    def x509_pem_cert(self, value: pulumi.Input[str]):
        pulumi.set(self, "x509_pem_cert", value)


@pulumi.input_type
class _CaCertState:
    def __init__(__self__, *,
                 status: Optional[pulumi.Input[str]] = None,
                 x509_pem_cert: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering CaCert resources.
        :param pulumi.Input[str] status: Status of client CA certs on a cluster
        :param pulumi.Input[str] x509_pem_cert: X509 certificate in PEM format
        """
        if status is not None:
            pulumi.set(__self__, "status", status)
        if x509_pem_cert is not None:
            pulumi.set(__self__, "x509_pem_cert", x509_pem_cert)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Status of client CA certs on a cluster
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="x509PemCert")
    def x509_pem_cert(self) -> Optional[pulumi.Input[str]]:
        """
        X509 certificate in PEM format
        """
        return pulumi.get(self, "x509_pem_cert")

    @x509_pem_cert.setter
    def x509_pem_cert(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "x509_pem_cert", value)


class CaCert(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 x509_pem_cert: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages client CA certs.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] x509_pem_cert: X509 certificate in PEM format
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CaCertArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages client CA certs.

        :param str resource_name: The name of the resource.
        :param CaCertArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CaCertArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 x509_pem_cert: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CaCertArgs.__new__(CaCertArgs)

            if x509_pem_cert is None and not opts.urn:
                raise TypeError("Missing required property 'x509_pem_cert'")
            __props__.__dict__["x509_pem_cert"] = x509_pem_cert
            __props__.__dict__["status"] = None
        super(CaCert, __self__).__init__(
            'cockroach:index/caCert:CaCert',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            status: Optional[pulumi.Input[str]] = None,
            x509_pem_cert: Optional[pulumi.Input[str]] = None) -> 'CaCert':
        """
        Get an existing CaCert resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] status: Status of client CA certs on a cluster
        :param pulumi.Input[str] x509_pem_cert: X509 certificate in PEM format
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CaCertState.__new__(_CaCertState)

        __props__.__dict__["status"] = status
        __props__.__dict__["x509_pem_cert"] = x509_pem_cert
        return CaCert(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Status of client CA certs on a cluster
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="x509PemCert")
    def x509_pem_cert(self) -> pulumi.Output[str]:
        """
        X509 certificate in PEM format
        """
        return pulumi.get(self, "x509_pem_cert")

