// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cockroach

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages client CA certs.
type CaCert struct {
	pulumi.CustomResourceState

	// Status of client CA certs on a cluster
	Status pulumi.StringOutput `pulumi:"status"`
	// X509 certificate in PEM format
	X509PemCert pulumi.StringOutput `pulumi:"x509PemCert"`
}

// NewCaCert registers a new resource with the given unique name, arguments, and options.
func NewCaCert(ctx *pulumi.Context,
	name string, args *CaCertArgs, opts ...pulumi.ResourceOption) (*CaCert, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.X509PemCert == nil {
		return nil, errors.New("invalid value for required argument 'X509PemCert'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource CaCert
	err := ctx.RegisterResource("cockroach:index/caCert:CaCert", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCaCert gets an existing CaCert resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCaCert(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CaCertState, opts ...pulumi.ResourceOption) (*CaCert, error) {
	var resource CaCert
	err := ctx.ReadResource("cockroach:index/caCert:CaCert", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CaCert resources.
type caCertState struct {
	// Status of client CA certs on a cluster
	Status *string `pulumi:"status"`
	// X509 certificate in PEM format
	X509PemCert *string `pulumi:"x509PemCert"`
}

type CaCertState struct {
	// Status of client CA certs on a cluster
	Status pulumi.StringPtrInput
	// X509 certificate in PEM format
	X509PemCert pulumi.StringPtrInput
}

func (CaCertState) ElementType() reflect.Type {
	return reflect.TypeOf((*caCertState)(nil)).Elem()
}

type caCertArgs struct {
	// X509 certificate in PEM format
	X509PemCert string `pulumi:"x509PemCert"`
}

// The set of arguments for constructing a CaCert resource.
type CaCertArgs struct {
	// X509 certificate in PEM format
	X509PemCert pulumi.StringInput
}

func (CaCertArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*caCertArgs)(nil)).Elem()
}

type CaCertInput interface {
	pulumi.Input

	ToCaCertOutput() CaCertOutput
	ToCaCertOutputWithContext(ctx context.Context) CaCertOutput
}

func (*CaCert) ElementType() reflect.Type {
	return reflect.TypeOf((**CaCert)(nil)).Elem()
}

func (i *CaCert) ToCaCertOutput() CaCertOutput {
	return i.ToCaCertOutputWithContext(context.Background())
}

func (i *CaCert) ToCaCertOutputWithContext(ctx context.Context) CaCertOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CaCertOutput)
}

// CaCertArrayInput is an input type that accepts CaCertArray and CaCertArrayOutput values.
// You can construct a concrete instance of `CaCertArrayInput` via:
//
//	CaCertArray{ CaCertArgs{...} }
type CaCertArrayInput interface {
	pulumi.Input

	ToCaCertArrayOutput() CaCertArrayOutput
	ToCaCertArrayOutputWithContext(context.Context) CaCertArrayOutput
}

type CaCertArray []CaCertInput

func (CaCertArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CaCert)(nil)).Elem()
}

func (i CaCertArray) ToCaCertArrayOutput() CaCertArrayOutput {
	return i.ToCaCertArrayOutputWithContext(context.Background())
}

func (i CaCertArray) ToCaCertArrayOutputWithContext(ctx context.Context) CaCertArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CaCertArrayOutput)
}

// CaCertMapInput is an input type that accepts CaCertMap and CaCertMapOutput values.
// You can construct a concrete instance of `CaCertMapInput` via:
//
//	CaCertMap{ "key": CaCertArgs{...} }
type CaCertMapInput interface {
	pulumi.Input

	ToCaCertMapOutput() CaCertMapOutput
	ToCaCertMapOutputWithContext(context.Context) CaCertMapOutput
}

type CaCertMap map[string]CaCertInput

func (CaCertMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CaCert)(nil)).Elem()
}

func (i CaCertMap) ToCaCertMapOutput() CaCertMapOutput {
	return i.ToCaCertMapOutputWithContext(context.Background())
}

func (i CaCertMap) ToCaCertMapOutputWithContext(ctx context.Context) CaCertMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CaCertMapOutput)
}

type CaCertOutput struct{ *pulumi.OutputState }

func (CaCertOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CaCert)(nil)).Elem()
}

func (o CaCertOutput) ToCaCertOutput() CaCertOutput {
	return o
}

func (o CaCertOutput) ToCaCertOutputWithContext(ctx context.Context) CaCertOutput {
	return o
}

// Status of client CA certs on a cluster
func (o CaCertOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *CaCert) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// X509 certificate in PEM format
func (o CaCertOutput) X509PemCert() pulumi.StringOutput {
	return o.ApplyT(func(v *CaCert) pulumi.StringOutput { return v.X509PemCert }).(pulumi.StringOutput)
}

type CaCertArrayOutput struct{ *pulumi.OutputState }

func (CaCertArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CaCert)(nil)).Elem()
}

func (o CaCertArrayOutput) ToCaCertArrayOutput() CaCertArrayOutput {
	return o
}

func (o CaCertArrayOutput) ToCaCertArrayOutputWithContext(ctx context.Context) CaCertArrayOutput {
	return o
}

func (o CaCertArrayOutput) Index(i pulumi.IntInput) CaCertOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CaCert {
		return vs[0].([]*CaCert)[vs[1].(int)]
	}).(CaCertOutput)
}

type CaCertMapOutput struct{ *pulumi.OutputState }

func (CaCertMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CaCert)(nil)).Elem()
}

func (o CaCertMapOutput) ToCaCertMapOutput() CaCertMapOutput {
	return o
}

func (o CaCertMapOutput) ToCaCertMapOutputWithContext(ctx context.Context) CaCertMapOutput {
	return o
}

func (o CaCertMapOutput) MapIndex(k pulumi.StringInput) CaCertOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CaCert {
		return vs[0].(map[string]*CaCert)[vs[1].(string)]
	}).(CaCertOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CaCertInput)(nil)).Elem(), &CaCert{})
	pulumi.RegisterInputType(reflect.TypeOf((*CaCertArrayInput)(nil)).Elem(), CaCertArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CaCertMapInput)(nil)).Elem(), CaCertMap{})
	pulumi.RegisterOutputType(CaCertOutput{})
	pulumi.RegisterOutputType(CaCertArrayOutput{})
	pulumi.RegisterOutputType(CaCertMapOutput{})
}
