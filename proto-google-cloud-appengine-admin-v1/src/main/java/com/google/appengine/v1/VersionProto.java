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
// source: google/appengine/v1/version.proto

package com.google.appengine.v1;

public final class VersionProto {
  private VersionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_Version_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_Version_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_Version_BetaSettingsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_Version_BetaSettingsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_Version_EnvVariablesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_Version_EnvVariablesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_Version_BuildEnvVariablesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_Version_BuildEnvVariablesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_EndpointsApiService_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_EndpointsApiService_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_AutomaticScaling_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_AutomaticScaling_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_BasicScaling_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_BasicScaling_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_ManualScaling_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_ManualScaling_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_CpuUtilization_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_CpuUtilization_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_RequestUtilization_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_RequestUtilization_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_DiskUtilization_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_DiskUtilization_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_NetworkUtilization_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_NetworkUtilization_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_StandardSchedulerSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_StandardSchedulerSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_Network_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_Network_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_Volume_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_Volume_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_Resources_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_Resources_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_VpcAccessConnector_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_VpcAccessConnector_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_Entrypoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_Entrypoint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n!google/appengine/v1/version.proto\022\023goo"
          + "gle.appengine.v1\032\"google/appengine/v1/ap"
          + "p_yaml.proto\032 google/appengine/v1/deploy"
          + ".proto\032*google/appengine/v1/network_sett"
          + "ings.proto\032\036google/protobuf/duration.pro"
          + "to\032\037google/protobuf/timestamp.proto\032\034goo"
          + "gle/api/annotations.proto\"\365\016\n\007Version\022\014\n"
          + "\004name\030\001 \001(\t\022\n\n\002id\030\002 \001(\t\022B\n\021automatic_sca"
          + "ling\030\003 \001(\0132%.google.appengine.v1.Automat"
          + "icScalingH\000\022:\n\rbasic_scaling\030\004 \001(\0132!.goo"
          + "gle.appengine.v1.BasicScalingH\000\022<\n\016manua"
          + "l_scaling\030\005 \001(\0132\".google.appengine.v1.Ma"
          + "nualScalingH\000\022A\n\020inbound_services\030\006 \003(\0162"
          + "\'.google.appengine.v1.InboundServiceType"
          + "\022\026\n\016instance_class\030\007 \001(\t\022-\n\007network\030\010 \001("
          + "\0132\034.google.appengine.v1.Network\022\r\n\005zones"
          + "\030v \003(\t\0221\n\tresources\030\t \001(\0132\036.google.appen"
          + "gine.v1.Resources\022\017\n\007runtime\030\n \001(\t\022\027\n\017ru"
          + "ntime_channel\030u \001(\t\022\022\n\nthreadsafe\030\013 \001(\010\022"
          + "\n\n\002vm\030\014 \001(\010\022E\n\rbeta_settings\030\r \003(\0132..goo"
          + "gle.appengine.v1.Version.BetaSettingsEnt"
          + "ry\022\013\n\003env\030\016 \001(\t\022:\n\016serving_status\030\017 \001(\0162"
          + "\".google.appengine.v1.ServingStatus\022\022\n\nc"
          + "reated_by\030\020 \001(\t\022/\n\013create_time\030\021 \001(\0132\032.g"
          + "oogle.protobuf.Timestamp\022\030\n\020disk_usage_b"
          + "ytes\030\022 \001(\003\022\033\n\023runtime_api_version\030\025 \001(\t\022"
          + "$\n\034runtime_main_executable_path\030\026 \001(\t\022\027\n"
          + "\017service_account\030\177 \001(\t\022-\n\010handlers\030d \003(\013"
          + "2\033.google.appengine.v1.UrlMap\0229\n\016error_h"
          + "andlers\030e \003(\0132!.google.appengine.v1.Erro"
          + "rHandler\022/\n\tlibraries\030f \003(\0132\034.google.app"
          + "engine.v1.Library\0229\n\napi_config\030g \001(\0132%."
          + "google.appengine.v1.ApiConfigHandler\022E\n\r"
          + "env_variables\030h \003(\0132..google.appengine.v"
          + "1.Version.EnvVariablesEntry\022P\n\023build_env"
          + "_variables\030} \003(\01323.google.appengine.v1.V"
          + "ersion.BuildEnvVariablesEntry\0225\n\022default"
          + "_expiration\030i \001(\0132\031.google.protobuf.Dura"
          + "tion\0226\n\014health_check\030j \001(\0132 .google.appe"
          + "ngine.v1.HealthCheck\022<\n\017readiness_check\030"
          + "p \001(\0132#.google.appengine.v1.ReadinessChe"
          + "ck\022:\n\016liveness_check\030q \001(\0132\".google.appe"
          + "ngine.v1.LivenessCheck\022\033\n\023nobuild_files_"
          + "regex\030k \001(\t\0223\n\ndeployment\030l \001(\0132\037.google"
          + ".appengine.v1.Deployment\022\023\n\013version_url\030"
          + "m \001(\t\022G\n\025endpoints_api_service\030n \001(\0132(.g"
          + "oogle.appengine.v1.EndpointsApiService\0223"
          + "\n\nentrypoint\030z \001(\0132\037.google.appengine.v1"
          + ".Entrypoint\022E\n\024vpc_access_connector\030y \001("
          + "\0132\'.google.appengine.v1.VpcAccessConnect"
          + "or\0323\n\021BetaSettingsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005"
          + "value\030\002 \001(\t:\0028\001\0323\n\021EnvVariablesEntry\022\013\n\003"
          + "key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\0328\n\026BuildEnv"
          + "VariablesEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001"
          + "(\t:\0028\001B\t\n\007scaling\"\367\001\n\023EndpointsApiServic"
          + "e\022\014\n\004name\030\001 \001(\t\022\021\n\tconfig_id\030\002 \001(\t\022R\n\020ro"
          + "llout_strategy\030\003 \001(\01628.google.appengine."
          + "v1.EndpointsApiService.RolloutStrategy\022\036"
          + "\n\026disable_trace_sampling\030\004 \001(\010\"K\n\017Rollou"
          + "tStrategy\022 \n\034UNSPECIFIED_ROLLOUT_STRATEG"
          + "Y\020\000\022\t\n\005FIXED\020\001\022\013\n\007MANAGED\020\002\"\251\005\n\020Automati"
          + "cScaling\0223\n\020cool_down_period\030\001 \001(\0132\031.goo"
          + "gle.protobuf.Duration\022<\n\017cpu_utilization"
          + "\030\002 \001(\0132#.google.appengine.v1.CpuUtilizat"
          + "ion\022\037\n\027max_concurrent_requests\030\003 \001(\005\022\032\n\022"
          + "max_idle_instances\030\004 \001(\005\022\033\n\023max_total_in"
          + "stances\030\005 \001(\005\0226\n\023max_pending_latency\030\006 \001"
          + "(\0132\031.google.protobuf.Duration\022\032\n\022min_idl"
          + "e_instances\030\007 \001(\005\022\033\n\023min_total_instances"
          + "\030\010 \001(\005\0226\n\023min_pending_latency\030\t \001(\0132\031.go"
          + "ogle.protobuf.Duration\022D\n\023request_utiliz"
          + "ation\030\n \001(\0132\'.google.appengine.v1.Reques"
          + "tUtilization\022>\n\020disk_utilization\030\013 \001(\0132$"
          + ".google.appengine.v1.DiskUtilization\022D\n\023"
          + "network_utilization\030\014 \001(\0132\'.google.appen"
          + "gine.v1.NetworkUtilization\022S\n\033standard_s"
          + "cheduler_settings\030\024 \001(\0132..google.appengi"
          + "ne.v1.StandardSchedulerSettings\"V\n\014Basic"
          + "Scaling\022/\n\014idle_timeout\030\001 \001(\0132\031.google.p"
          + "rotobuf.Duration\022\025\n\rmax_instances\030\002 \001(\005\""
          + "\"\n\rManualScaling\022\021\n\tinstances\030\001 \001(\005\"j\n\016C"
          + "puUtilization\022<\n\031aggregation_window_leng"
          + "th\030\001 \001(\0132\031.google.protobuf.Duration\022\032\n\022t"
          + "arget_utilization\030\002 \001(\001\"a\n\022RequestUtiliz"
          + "ation\022\'\n\037target_request_count_per_second"
          + "\030\001 \001(\005\022\"\n\032target_concurrent_requests\030\002 \001"
          + "(\005\"\247\001\n\017DiskUtilization\022%\n\035target_write_b"
          + "ytes_per_second\030\016 \001(\005\022#\n\033target_write_op"
          + "s_per_second\030\017 \001(\005\022$\n\034target_read_bytes_"
          + "per_second\030\020 \001(\005\022\"\n\032target_read_ops_per_"
          + "second\030\021 \001(\005\"\270\001\n\022NetworkUtilization\022$\n\034t"
          + "arget_sent_bytes_per_second\030\001 \001(\005\022&\n\036tar"
          + "get_sent_packets_per_second\030\013 \001(\005\022(\n tar"
          + "get_received_bytes_per_second\030\014 \001(\005\022*\n\"t"
          + "arget_received_packets_per_second\030\r \001(\005\""
          + "\220\001\n\031StandardSchedulerSettings\022\036\n\026target_"
          + "cpu_utilization\030\001 \001(\001\022%\n\035target_throughp"
          + "ut_utilization\030\002 \001(\001\022\025\n\rmin_instances\030\003 "
          + "\001(\005\022\025\n\rmax_instances\030\004 \001(\005\"y\n\007Network\022\027\n"
          + "\017forwarded_ports\030\001 \003(\t\022\024\n\014instance_tag\030\002"
          + " \001(\t\022\014\n\004name\030\003 \001(\t\022\027\n\017subnetwork_name\030\004 "
          + "\001(\t\022\030\n\020session_affinity\030\005 \001(\010\"<\n\006Volume\022"
          + "\014\n\004name\030\001 \001(\t\022\023\n\013volume_type\030\002 \001(\t\022\017\n\007si"
          + "ze_gb\030\003 \001(\001\"\205\001\n\tResources\022\013\n\003cpu\030\001 \001(\001\022\017"
          + "\n\007disk_gb\030\002 \001(\001\022\021\n\tmemory_gb\030\003 \001(\001\022,\n\007vo"
          + "lumes\030\004 \003(\0132\033.google.appengine.v1.Volume"
          + "\022\031\n\021kms_key_reference\030\005 \001(\t\"\"\n\022VpcAccess"
          + "Connector\022\014\n\004name\030\001 \001(\t\"(\n\nEntrypoint\022\017\n"
          + "\005shell\030\001 \001(\tH\000B\t\n\007command*\273\002\n\022InboundSer"
          + "viceType\022\037\n\033INBOUND_SERVICE_UNSPECIFIED\020"
          + "\000\022\030\n\024INBOUND_SERVICE_MAIL\020\001\022\037\n\033INBOUND_S"
          + "ERVICE_MAIL_BOUNCE\020\002\022\036\n\032INBOUND_SERVICE_"
          + "XMPP_ERROR\020\003\022 \n\034INBOUND_SERVICE_XMPP_MES"
          + "SAGE\020\004\022\"\n\036INBOUND_SERVICE_XMPP_SUBSCRIBE"
          + "\020\005\022!\n\035INBOUND_SERVICE_XMPP_PRESENCE\020\006\022$\n"
          + " INBOUND_SERVICE_CHANNEL_PRESENCE\020\007\022\032\n\026I"
          + "NBOUND_SERVICE_WARMUP\020\t*I\n\rServingStatus"
          + "\022\036\n\032SERVING_STATUS_UNSPECIFIED\020\000\022\013\n\007SERV"
          + "ING\020\001\022\013\n\007STOPPED\020\002B\276\001\n\027com.google.appeng"
          + "ine.v1B\014VersionProtoP\001Z<google.golang.or"
          + "g/genproto/googleapis/appengine/v1;appen"
          + "gine\252\002\031Google.Cloud.AppEngine.V1\312\002\031Googl"
          + "e\\Cloud\\AppEngine\\V1\352\002\034Google::Cloud::Ap"
          + "pEngine::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.appengine.v1.AppYamlProto.getDescriptor(),
              com.google.appengine.v1.DeployProto.getDescriptor(),
              com.google.appengine.v1.NetworkSettingsProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_appengine_v1_Version_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_appengine_v1_Version_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_Version_descriptor,
            new java.lang.String[] {
              "Name",
              "Id",
              "AutomaticScaling",
              "BasicScaling",
              "ManualScaling",
              "InboundServices",
              "InstanceClass",
              "Network",
              "Zones",
              "Resources",
              "Runtime",
              "RuntimeChannel",
              "Threadsafe",
              "Vm",
              "BetaSettings",
              "Env",
              "ServingStatus",
              "CreatedBy",
              "CreateTime",
              "DiskUsageBytes",
              "RuntimeApiVersion",
              "RuntimeMainExecutablePath",
              "ServiceAccount",
              "Handlers",
              "ErrorHandlers",
              "Libraries",
              "ApiConfig",
              "EnvVariables",
              "BuildEnvVariables",
              "DefaultExpiration",
              "HealthCheck",
              "ReadinessCheck",
              "LivenessCheck",
              "NobuildFilesRegex",
              "Deployment",
              "VersionUrl",
              "EndpointsApiService",
              "Entrypoint",
              "VpcAccessConnector",
              "Scaling",
            });
    internal_static_google_appengine_v1_Version_BetaSettingsEntry_descriptor =
        internal_static_google_appengine_v1_Version_descriptor.getNestedTypes().get(0);
    internal_static_google_appengine_v1_Version_BetaSettingsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_Version_BetaSettingsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_appengine_v1_Version_EnvVariablesEntry_descriptor =
        internal_static_google_appengine_v1_Version_descriptor.getNestedTypes().get(1);
    internal_static_google_appengine_v1_Version_EnvVariablesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_Version_EnvVariablesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_appengine_v1_Version_BuildEnvVariablesEntry_descriptor =
        internal_static_google_appengine_v1_Version_descriptor.getNestedTypes().get(2);
    internal_static_google_appengine_v1_Version_BuildEnvVariablesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_Version_BuildEnvVariablesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_appengine_v1_EndpointsApiService_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_appengine_v1_EndpointsApiService_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_EndpointsApiService_descriptor,
            new java.lang.String[] {
              "Name", "ConfigId", "RolloutStrategy", "DisableTraceSampling",
            });
    internal_static_google_appengine_v1_AutomaticScaling_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_appengine_v1_AutomaticScaling_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_AutomaticScaling_descriptor,
            new java.lang.String[] {
              "CoolDownPeriod",
              "CpuUtilization",
              "MaxConcurrentRequests",
              "MaxIdleInstances",
              "MaxTotalInstances",
              "MaxPendingLatency",
              "MinIdleInstances",
              "MinTotalInstances",
              "MinPendingLatency",
              "RequestUtilization",
              "DiskUtilization",
              "NetworkUtilization",
              "StandardSchedulerSettings",
            });
    internal_static_google_appengine_v1_BasicScaling_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_appengine_v1_BasicScaling_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_BasicScaling_descriptor,
            new java.lang.String[] {
              "IdleTimeout", "MaxInstances",
            });
    internal_static_google_appengine_v1_ManualScaling_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_appengine_v1_ManualScaling_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_ManualScaling_descriptor,
            new java.lang.String[] {
              "Instances",
            });
    internal_static_google_appengine_v1_CpuUtilization_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_appengine_v1_CpuUtilization_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_CpuUtilization_descriptor,
            new java.lang.String[] {
              "AggregationWindowLength", "TargetUtilization",
            });
    internal_static_google_appengine_v1_RequestUtilization_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_appengine_v1_RequestUtilization_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_RequestUtilization_descriptor,
            new java.lang.String[] {
              "TargetRequestCountPerSecond", "TargetConcurrentRequests",
            });
    internal_static_google_appengine_v1_DiskUtilization_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_appengine_v1_DiskUtilization_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_DiskUtilization_descriptor,
            new java.lang.String[] {
              "TargetWriteBytesPerSecond",
              "TargetWriteOpsPerSecond",
              "TargetReadBytesPerSecond",
              "TargetReadOpsPerSecond",
            });
    internal_static_google_appengine_v1_NetworkUtilization_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_appengine_v1_NetworkUtilization_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_NetworkUtilization_descriptor,
            new java.lang.String[] {
              "TargetSentBytesPerSecond",
              "TargetSentPacketsPerSecond",
              "TargetReceivedBytesPerSecond",
              "TargetReceivedPacketsPerSecond",
            });
    internal_static_google_appengine_v1_StandardSchedulerSettings_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_appengine_v1_StandardSchedulerSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_StandardSchedulerSettings_descriptor,
            new java.lang.String[] {
              "TargetCpuUtilization", "TargetThroughputUtilization", "MinInstances", "MaxInstances",
            });
    internal_static_google_appengine_v1_Network_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_appengine_v1_Network_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_Network_descriptor,
            new java.lang.String[] {
              "ForwardedPorts", "InstanceTag", "Name", "SubnetworkName", "SessionAffinity",
            });
    internal_static_google_appengine_v1_Volume_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_appengine_v1_Volume_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_Volume_descriptor,
            new java.lang.String[] {
              "Name", "VolumeType", "SizeGb",
            });
    internal_static_google_appengine_v1_Resources_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_appengine_v1_Resources_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_Resources_descriptor,
            new java.lang.String[] {
              "Cpu", "DiskGb", "MemoryGb", "Volumes", "KmsKeyReference",
            });
    internal_static_google_appengine_v1_VpcAccessConnector_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_appengine_v1_VpcAccessConnector_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_VpcAccessConnector_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_appengine_v1_Entrypoint_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_appengine_v1_Entrypoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_Entrypoint_descriptor,
            new java.lang.String[] {
              "Shell", "Command",
            });
    com.google.appengine.v1.AppYamlProto.getDescriptor();
    com.google.appengine.v1.DeployProto.getDescriptor();
    com.google.appengine.v1.NetworkSettingsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
