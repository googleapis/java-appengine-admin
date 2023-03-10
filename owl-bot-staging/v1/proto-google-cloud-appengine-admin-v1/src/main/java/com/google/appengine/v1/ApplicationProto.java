// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/application.proto

package com.google.appengine.v1;

public final class ApplicationProto {
  private ApplicationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_appengine_v1_Application_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_Application_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_appengine_v1_Application_IdentityAwareProxy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_Application_IdentityAwareProxy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_appengine_v1_Application_FeatureSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_Application_FeatureSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_appengine_v1_UrlDispatchRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_UrlDispatchRule_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%google/appengine/v1/application.proto\022" +
      "\023google.appengine.v1\032\036google/protobuf/du" +
      "ration.proto\"\211\010\n\013Application\022\014\n\004name\030\001 \001" +
      "(\t\022\n\n\002id\030\002 \001(\t\022<\n\016dispatch_rules\030\003 \003(\0132$" +
      ".google.appengine.v1.UrlDispatchRule\022\023\n\013" +
      "auth_domain\030\006 \001(\t\022\023\n\013location_id\030\007 \001(\t\022\023" +
      "\n\013code_bucket\030\010 \001(\t\022<\n\031default_cookie_ex" +
      "piration\030\t \001(\0132\031.google.protobuf.Duratio" +
      "n\022F\n\016serving_status\030\n \001(\0162..google.appen" +
      "gine.v1.Application.ServingStatus\022\030\n\020def" +
      "ault_hostname\030\013 \001(\t\022\026\n\016default_bucket\030\014 " +
      "\001(\t\022\027\n\017service_account\030\r \001(\t\022@\n\003iap\030\016 \001(" +
      "\01323.google.appengine.v1.Application.Iden" +
      "tityAwareProxy\022\022\n\ngcr_domain\030\020 \001(\t\022D\n\rda" +
      "tabase_type\030\021 \001(\0162-.google.appengine.v1." +
      "Application.DatabaseType\022J\n\020feature_sett" +
      "ings\030\022 \001(\01320.google.appengine.v1.Applica" +
      "tion.FeatureSettings\032\202\001\n\022IdentityAwarePr" +
      "oxy\022\017\n\007enabled\030\001 \001(\010\022\030\n\020oauth2_client_id" +
      "\030\002 \001(\t\022\034\n\024oauth2_client_secret\030\003 \001(\t\022#\n\033" +
      "oauth2_client_secret_sha256\030\004 \001(\t\032R\n\017Fea" +
      "tureSettings\022\033\n\023split_health_checks\030\001 \001(" +
      "\010\022\"\n\032use_container_optimized_os\030\002 \001(\010\"U\n" +
      "\rServingStatus\022\017\n\013UNSPECIFIED\020\000\022\013\n\007SERVI" +
      "NG\020\001\022\021\n\rUSER_DISABLED\020\002\022\023\n\017SYSTEM_DISABL" +
      "ED\020\003\"z\n\014DatabaseType\022\035\n\031DATABASE_TYPE_UN" +
      "SPECIFIED\020\000\022\023\n\017CLOUD_DATASTORE\020\001\022\023\n\017CLOU" +
      "D_FIRESTORE\020\002\022!\n\035CLOUD_DATASTORE_COMPATI" +
      "BILITY\020\003\"@\n\017UrlDispatchRule\022\016\n\006domain\030\001 " +
      "\001(\t\022\014\n\004path\030\002 \001(\t\022\017\n\007service\030\003 \001(\tB\302\001\n\027c" +
      "om.google.appengine.v1B\020ApplicationProto" +
      "P\001Z<google.golang.org/genproto/googleapi" +
      "s/appengine/v1;appengine\252\002\031Google.Cloud." +
      "AppEngine.V1\312\002\031Google\\Cloud\\AppEngine\\V1" +
      "\352\002\034Google::Cloud::AppEngine::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DurationProto.getDescriptor(),
        });
    internal_static_google_appengine_v1_Application_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_appengine_v1_Application_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_appengine_v1_Application_descriptor,
        new java.lang.String[] { "Name", "Id", "DispatchRules", "AuthDomain", "LocationId", "CodeBucket", "DefaultCookieExpiration", "ServingStatus", "DefaultHostname", "DefaultBucket", "ServiceAccount", "Iap", "GcrDomain", "DatabaseType", "FeatureSettings", });
    internal_static_google_appengine_v1_Application_IdentityAwareProxy_descriptor =
      internal_static_google_appengine_v1_Application_descriptor.getNestedTypes().get(0);
    internal_static_google_appengine_v1_Application_IdentityAwareProxy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_appengine_v1_Application_IdentityAwareProxy_descriptor,
        new java.lang.String[] { "Enabled", "Oauth2ClientId", "Oauth2ClientSecret", "Oauth2ClientSecretSha256", });
    internal_static_google_appengine_v1_Application_FeatureSettings_descriptor =
      internal_static_google_appengine_v1_Application_descriptor.getNestedTypes().get(1);
    internal_static_google_appengine_v1_Application_FeatureSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_appengine_v1_Application_FeatureSettings_descriptor,
        new java.lang.String[] { "SplitHealthChecks", "UseContainerOptimizedOs", });
    internal_static_google_appengine_v1_UrlDispatchRule_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_appengine_v1_UrlDispatchRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_appengine_v1_UrlDispatchRule_descriptor,
        new java.lang.String[] { "Domain", "Path", "Service", });
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
