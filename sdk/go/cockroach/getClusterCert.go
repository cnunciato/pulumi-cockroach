// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cockroach

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// TLS certificate for the specified CockroachDB cluster. Certificates for dedicated clusters should be written to `$HOME/Library/CockroachCloud/certs/<cluster name>-ca.crt` on MacOS or Linux, or `$env:appdata\CockroachCloud\certs\<cluster name>-ca.crt` on Windows.
//
// Serverless clusters use the root PostgreSQL CA cert. If it isn't already installed, the certificate can be appended to `$HOME/.postgresql/root.crt` on MacOS or Linux, or `$env:appdata\postgresql\root.crt` on Windows.
func GetClusterCert(ctx *pulumi.Context, args *GetClusterCertArgs, opts ...pulumi.InvokeOption) (*GetClusterCertResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetClusterCertResult
	err := ctx.Invoke("cockroach:index/getClusterCert:getClusterCert", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getClusterCert.
type GetClusterCertArgs struct {
	// Cluster ID
	Id string `pulumi:"id"`
}

// A collection of values returned by getClusterCert.
type GetClusterCertResult struct {
	Cert string `pulumi:"cert"`
	// Cluster ID
	Id string `pulumi:"id"`
}

func GetClusterCertOutput(ctx *pulumi.Context, args GetClusterCertOutputArgs, opts ...pulumi.InvokeOption) GetClusterCertResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetClusterCertResult, error) {
			args := v.(GetClusterCertArgs)
			r, err := GetClusterCert(ctx, &args, opts...)
			var s GetClusterCertResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetClusterCertResultOutput)
}

// A collection of arguments for invoking getClusterCert.
type GetClusterCertOutputArgs struct {
	// Cluster ID
	Id pulumi.StringInput `pulumi:"id"`
}

func (GetClusterCertOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetClusterCertArgs)(nil)).Elem()
}

// A collection of values returned by getClusterCert.
type GetClusterCertResultOutput struct{ *pulumi.OutputState }

func (GetClusterCertResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetClusterCertResult)(nil)).Elem()
}

func (o GetClusterCertResultOutput) ToGetClusterCertResultOutput() GetClusterCertResultOutput {
	return o
}

func (o GetClusterCertResultOutput) ToGetClusterCertResultOutputWithContext(ctx context.Context) GetClusterCertResultOutput {
	return o
}

func (o GetClusterCertResultOutput) Cert() pulumi.StringOutput {
	return o.ApplyT(func(v GetClusterCertResult) string { return v.Cert }).(pulumi.StringOutput)
}

// Cluster ID
func (o GetClusterCertResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetClusterCertResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetClusterCertResultOutput{})
}