// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/location.proto

package com.google.appengine.v1;

public final class LocationProto {
  private LocationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_appengine_v1_LocationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_LocationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"google/appengine/v1/location.proto\022\023go" +
      "ogle.appengine.v1\032\037google/api/field_beha" +
      "vior.proto\032\034google/api/annotations.proto" +
      "\"\205\001\n\020LocationMetadata\022&\n\036standard_enviro" +
      "nment_available\030\002 \001(\010\022&\n\036flexible_enviro" +
      "nment_available\030\004 \001(\010\022!\n\024search_api_avai" +
      "lable\030\006 \001(\010B\003\340A\003B\277\001\n\027com.google.appengin" +
      "e.v1B\rLocationProtoP\001Z<google.golang.org" +
      "/genproto/googleapis/appengine/v1;appeng" +
      "ine\252\002\031Google.Cloud.AppEngine.V1\312\002\031Google" +
      "\\Cloud\\AppEngine\\V1\352\002\034Google::Cloud::App" +
      "Engine::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_appengine_v1_LocationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_appengine_v1_LocationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_appengine_v1_LocationMetadata_descriptor,
        new java.lang.String[] { "StandardEnvironmentAvailable", "FlexibleEnvironmentAvailable", "SearchApiAvailable", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
