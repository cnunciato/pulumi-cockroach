// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cockroach

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// SQL user and password
type SqlUser struct {
	pulumi.CustomResourceState

	ClusterId pulumi.StringOutput `pulumi:"clusterId"`
	Name      pulumi.StringOutput `pulumi:"name"`
	// If provided, this field sets the password of the SQL user when created. If omitted, a random password is generated, but
	// not saved to Terraform state. The password must be changed via the CockroachDB cloud console.
	Password pulumi.StringPtrOutput `pulumi:"password"`
}

// NewSqlUser registers a new resource with the given unique name, arguments, and options.
func NewSqlUser(ctx *pulumi.Context,
	name string, args *SqlUserArgs, opts ...pulumi.ResourceOption) (*SqlUser, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"password",
	})
	opts = append(opts, secrets)
	opts = pkgResourceDefaultOpts(opts)
	var resource SqlUser
	err := ctx.RegisterResource("cockroach:index/sqlUser:SqlUser", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSqlUser gets an existing SqlUser resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSqlUser(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SqlUserState, opts ...pulumi.ResourceOption) (*SqlUser, error) {
	var resource SqlUser
	err := ctx.ReadResource("cockroach:index/sqlUser:SqlUser", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SqlUser resources.
type sqlUserState struct {
	ClusterId *string `pulumi:"clusterId"`
	Name      *string `pulumi:"name"`
	// If provided, this field sets the password of the SQL user when created. If omitted, a random password is generated, but
	// not saved to Terraform state. The password must be changed via the CockroachDB cloud console.
	Password *string `pulumi:"password"`
}

type SqlUserState struct {
	ClusterId pulumi.StringPtrInput
	Name      pulumi.StringPtrInput
	// If provided, this field sets the password of the SQL user when created. If omitted, a random password is generated, but
	// not saved to Terraform state. The password must be changed via the CockroachDB cloud console.
	Password pulumi.StringPtrInput
}

func (SqlUserState) ElementType() reflect.Type {
	return reflect.TypeOf((*sqlUserState)(nil)).Elem()
}

type sqlUserArgs struct {
	ClusterId string `pulumi:"clusterId"`
	Name      string `pulumi:"name"`
	// If provided, this field sets the password of the SQL user when created. If omitted, a random password is generated, but
	// not saved to Terraform state. The password must be changed via the CockroachDB cloud console.
	Password *string `pulumi:"password"`
}

// The set of arguments for constructing a SqlUser resource.
type SqlUserArgs struct {
	ClusterId pulumi.StringInput
	Name      pulumi.StringInput
	// If provided, this field sets the password of the SQL user when created. If omitted, a random password is generated, but
	// not saved to Terraform state. The password must be changed via the CockroachDB cloud console.
	Password pulumi.StringPtrInput
}

func (SqlUserArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sqlUserArgs)(nil)).Elem()
}

type SqlUserInput interface {
	pulumi.Input

	ToSqlUserOutput() SqlUserOutput
	ToSqlUserOutputWithContext(ctx context.Context) SqlUserOutput
}

func (*SqlUser) ElementType() reflect.Type {
	return reflect.TypeOf((**SqlUser)(nil)).Elem()
}

func (i *SqlUser) ToSqlUserOutput() SqlUserOutput {
	return i.ToSqlUserOutputWithContext(context.Background())
}

func (i *SqlUser) ToSqlUserOutputWithContext(ctx context.Context) SqlUserOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlUserOutput)
}

// SqlUserArrayInput is an input type that accepts SqlUserArray and SqlUserArrayOutput values.
// You can construct a concrete instance of `SqlUserArrayInput` via:
//
//	SqlUserArray{ SqlUserArgs{...} }
type SqlUserArrayInput interface {
	pulumi.Input

	ToSqlUserArrayOutput() SqlUserArrayOutput
	ToSqlUserArrayOutputWithContext(context.Context) SqlUserArrayOutput
}

type SqlUserArray []SqlUserInput

func (SqlUserArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SqlUser)(nil)).Elem()
}

func (i SqlUserArray) ToSqlUserArrayOutput() SqlUserArrayOutput {
	return i.ToSqlUserArrayOutputWithContext(context.Background())
}

func (i SqlUserArray) ToSqlUserArrayOutputWithContext(ctx context.Context) SqlUserArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlUserArrayOutput)
}

// SqlUserMapInput is an input type that accepts SqlUserMap and SqlUserMapOutput values.
// You can construct a concrete instance of `SqlUserMapInput` via:
//
//	SqlUserMap{ "key": SqlUserArgs{...} }
type SqlUserMapInput interface {
	pulumi.Input

	ToSqlUserMapOutput() SqlUserMapOutput
	ToSqlUserMapOutputWithContext(context.Context) SqlUserMapOutput
}

type SqlUserMap map[string]SqlUserInput

func (SqlUserMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SqlUser)(nil)).Elem()
}

func (i SqlUserMap) ToSqlUserMapOutput() SqlUserMapOutput {
	return i.ToSqlUserMapOutputWithContext(context.Background())
}

func (i SqlUserMap) ToSqlUserMapOutputWithContext(ctx context.Context) SqlUserMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlUserMapOutput)
}

type SqlUserOutput struct{ *pulumi.OutputState }

func (SqlUserOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SqlUser)(nil)).Elem()
}

func (o SqlUserOutput) ToSqlUserOutput() SqlUserOutput {
	return o
}

func (o SqlUserOutput) ToSqlUserOutputWithContext(ctx context.Context) SqlUserOutput {
	return o
}

func (o SqlUserOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlUser) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

func (o SqlUserOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlUser) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// If provided, this field sets the password of the SQL user when created. If omitted, a random password is generated, but
// not saved to Terraform state. The password must be changed via the CockroachDB cloud console.
func (o SqlUserOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SqlUser) pulumi.StringPtrOutput { return v.Password }).(pulumi.StringPtrOutput)
}

type SqlUserArrayOutput struct{ *pulumi.OutputState }

func (SqlUserArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SqlUser)(nil)).Elem()
}

func (o SqlUserArrayOutput) ToSqlUserArrayOutput() SqlUserArrayOutput {
	return o
}

func (o SqlUserArrayOutput) ToSqlUserArrayOutputWithContext(ctx context.Context) SqlUserArrayOutput {
	return o
}

func (o SqlUserArrayOutput) Index(i pulumi.IntInput) SqlUserOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SqlUser {
		return vs[0].([]*SqlUser)[vs[1].(int)]
	}).(SqlUserOutput)
}

type SqlUserMapOutput struct{ *pulumi.OutputState }

func (SqlUserMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SqlUser)(nil)).Elem()
}

func (o SqlUserMapOutput) ToSqlUserMapOutput() SqlUserMapOutput {
	return o
}

func (o SqlUserMapOutput) ToSqlUserMapOutputWithContext(ctx context.Context) SqlUserMapOutput {
	return o
}

func (o SqlUserMapOutput) MapIndex(k pulumi.StringInput) SqlUserOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SqlUser {
		return vs[0].(map[string]*SqlUser)[vs[1].(string)]
	}).(SqlUserOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SqlUserInput)(nil)).Elem(), &SqlUser{})
	pulumi.RegisterInputType(reflect.TypeOf((*SqlUserArrayInput)(nil)).Elem(), SqlUserArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SqlUserMapInput)(nil)).Elem(), SqlUserMap{})
	pulumi.RegisterOutputType(SqlUserOutput{})
	pulumi.RegisterOutputType(SqlUserArrayOutput{})
	pulumi.RegisterOutputType(SqlUserMapOutput{})
}
