/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/instance.proto

package com.google.appengine.v1;

public final class InstanceProto {
  private InstanceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_Instance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_Instance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_Instance_Liveness_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_Instance_Liveness_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\"google/appengine/v1/instance.proto\022\023go"
          + "ogle.appengine.v1\032\037google/api/field_beha"
          + "vior.proto\032\031google/api/resource.proto\032\037g"
          + "oogle/protobuf/timestamp.proto\032\034google/a"
          + "pi/annotations.proto\"\316\006\n\010Instance\022\021\n\004nam"
          + "e\030\001 \001(\tB\003\340A\003\022\017\n\002id\030\002 \001(\tB\003\340A\003\022\037\n\022app_eng"
          + "ine_release\030\003 \001(\tB\003\340A\003\022E\n\014availability\030\004"
          + " \001(\0162*.google.appengine.v1.Instance.Avai"
          + "labilityB\003\340A\003\022\024\n\007vm_name\030\005 \001(\tB\003\340A\003\022\031\n\014v"
          + "m_zone_name\030\006 \001(\tB\003\340A\003\022\022\n\005vm_id\030\007 \001(\tB\003\340"
          + "A\003\0223\n\nstart_time\030\010 \001(\0132\032.google.protobuf"
          + ".TimestampB\003\340A\003\022\025\n\010requests\030\t \001(\005B\003\340A\003\022\023"
          + "\n\006errors\030\n \001(\005B\003\340A\003\022\020\n\003qps\030\013 \001(\002B\003\340A\003\022\034\n"
          + "\017average_latency\030\014 \001(\005B\003\340A\003\022\031\n\014memory_us"
          + "age\030\r \001(\003B\003\340A\003\022\026\n\tvm_status\030\016 \001(\tB\003\340A\003\022\035"
          + "\n\020vm_debug_enabled\030\017 \001(\010B\003\340A\003\022\022\n\005vm_ip\030\020"
          + " \001(\tB\003\340A\003\022N\n\013vm_liveness\030\021 \001(\01624.google."
          + "appengine.v1.Instance.Liveness.LivenessS"
          + "tateB\003\340A\003\032\177\n\010Liveness\"s\n\rLivenessState\022\036"
          + "\n\032LIVENESS_STATE_UNSPECIFIED\020\000\022\013\n\007UNKNOW"
          + "N\020\001\022\013\n\007HEALTHY\020\002\022\r\n\tUNHEALTHY\020\003\022\014\n\010DRAIN"
          + "ING\020\004\022\013\n\007TIMEOUT\020\005\":\n\014Availability\022\017\n\013UN"
          + "SPECIFIED\020\000\022\014\n\010RESIDENT\020\001\022\013\n\007DYNAMIC\020\002:m"
          + "\352Aj\n!appengine.googleapis.com/Instance\022E"
          + "apps/{app}/services/{service}/versions/{"
          + "version}/instances/{instance}B\277\001\n\027com.go"
          + "ogle.appengine.v1B\rInstanceProtoP\001Z<goog"
          + "le.golang.org/genproto/googleapis/appeng"
          + "ine/v1;appengine\252\002\031Google.Cloud.AppEngin"
          + "e.V1\312\002\031Google\\Cloud\\AppEngine\\V1\352\002\034Googl"
          + "e::Cloud::AppEngine::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_appengine_v1_Instance_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_appengine_v1_Instance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_Instance_descriptor,
            new java.lang.String[] {
              "Name",
              "Id",
              "AppEngineRelease",
              "Availability",
              "VmName",
              "VmZoneName",
              "VmId",
              "StartTime",
              "Requests",
              "Errors",
              "Qps",
              "AverageLatency",
              "MemoryUsage",
              "VmStatus",
              "VmDebugEnabled",
              "VmIp",
              "VmLiveness",
            });
    internal_static_google_appengine_v1_Instance_Liveness_descriptor =
        internal_static_google_appengine_v1_Instance_descriptor.getNestedTypes().get(0);
    internal_static_google_appengine_v1_Instance_Liveness_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_Instance_Liveness_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
