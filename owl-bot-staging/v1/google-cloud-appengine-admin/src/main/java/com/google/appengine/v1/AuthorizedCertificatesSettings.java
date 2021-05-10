/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.appengine.v1;

import static com.google.appengine.v1.AuthorizedCertificatesClient.ListAuthorizedCertificatesPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.appengine.v1.stub.AuthorizedCertificatesStubSettings;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link AuthorizedCertificatesClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li> The default service address (appengine.googleapis.com) and default port (443) are used.
 *   <li> Credentials are acquired automatically through Application Default Credentials.
 *   <li> Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getAuthorizedCertificate to 30 seconds:
 *
 * <pre>{@code
 * AuthorizedCertificatesSettings.Builder authorizedCertificatesSettingsBuilder =
 *     AuthorizedCertificatesSettings.newBuilder();
 * authorizedCertificatesSettingsBuilder
 *     .getAuthorizedCertificateSettings()
 *     .setRetrySettings(
 *         authorizedCertificatesSettingsBuilder
 *             .getAuthorizedCertificateSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * AuthorizedCertificatesSettings authorizedCertificatesSettings =
 *     authorizedCertificatesSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class AuthorizedCertificatesSettings extends ClientSettings<AuthorizedCertificatesSettings> {

  /** Returns the object with the settings used for calls to listAuthorizedCertificates. */
  public PagedCallSettings<
          ListAuthorizedCertificatesRequest, ListAuthorizedCertificatesResponse,
          ListAuthorizedCertificatesPagedResponse>
      listAuthorizedCertificatesSettings() {
    return ((AuthorizedCertificatesStubSettings) getStubSettings())
        .listAuthorizedCertificatesSettings();
  }

  /** Returns the object with the settings used for calls to getAuthorizedCertificate. */
  public UnaryCallSettings<GetAuthorizedCertificateRequest, AuthorizedCertificate>
      getAuthorizedCertificateSettings() {
    return ((AuthorizedCertificatesStubSettings) getStubSettings())
        .getAuthorizedCertificateSettings();
  }

  /** Returns the object with the settings used for calls to createAuthorizedCertificate. */
  public UnaryCallSettings<CreateAuthorizedCertificateRequest, AuthorizedCertificate>
      createAuthorizedCertificateSettings() {
    return ((AuthorizedCertificatesStubSettings) getStubSettings())
        .createAuthorizedCertificateSettings();
  }

  /** Returns the object with the settings used for calls to updateAuthorizedCertificate. */
  public UnaryCallSettings<UpdateAuthorizedCertificateRequest, AuthorizedCertificate>
      updateAuthorizedCertificateSettings() {
    return ((AuthorizedCertificatesStubSettings) getStubSettings())
        .updateAuthorizedCertificateSettings();
  }

  /** Returns the object with the settings used for calls to deleteAuthorizedCertificate. */
  public UnaryCallSettings<DeleteAuthorizedCertificateRequest, Empty>
      deleteAuthorizedCertificateSettings() {
    return ((AuthorizedCertificatesStubSettings) getStubSettings())
        .deleteAuthorizedCertificateSettings();
  }

  public static final AuthorizedCertificatesSettings create(AuthorizedCertificatesStubSettings stub)
      throws IOException {
    return new AuthorizedCertificatesSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return AuthorizedCertificatesStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return AuthorizedCertificatesStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return AuthorizedCertificatesStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return AuthorizedCertificatesStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return AuthorizedCertificatesStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return AuthorizedCertificatesStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return AuthorizedCertificatesStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected AuthorizedCertificatesSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for AuthorizedCertificatesSettings. */
  public static class Builder
      extends ClientSettings.Builder<AuthorizedCertificatesSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(AuthorizedCertificatesStubSettings.newBuilder(clientContext));
    }

    protected Builder(AuthorizedCertificatesSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(AuthorizedCertificatesStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(AuthorizedCertificatesStubSettings.newBuilder());
    }

    public AuthorizedCertificatesStubSettings.Builder getStubSettingsBuilder() {
      return ((AuthorizedCertificatesStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'.
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to listAuthorizedCertificates. */
    public PagedCallSettings.Builder<
            ListAuthorizedCertificatesRequest, ListAuthorizedCertificatesResponse,
            ListAuthorizedCertificatesPagedResponse>
        listAuthorizedCertificatesSettings() {
      return getStubSettingsBuilder().listAuthorizedCertificatesSettings();
    }

    /** Returns the builder for the settings used for calls to getAuthorizedCertificate. */
    public UnaryCallSettings.Builder<GetAuthorizedCertificateRequest, AuthorizedCertificate>
        getAuthorizedCertificateSettings() {
      return getStubSettingsBuilder().getAuthorizedCertificateSettings();
    }

    /** Returns the builder for the settings used for calls to createAuthorizedCertificate. */
    public UnaryCallSettings.Builder<CreateAuthorizedCertificateRequest, AuthorizedCertificate>
        createAuthorizedCertificateSettings() {
      return getStubSettingsBuilder().createAuthorizedCertificateSettings();
    }

    /** Returns the builder for the settings used for calls to updateAuthorizedCertificate. */
    public UnaryCallSettings.Builder<UpdateAuthorizedCertificateRequest, AuthorizedCertificate>
        updateAuthorizedCertificateSettings() {
      return getStubSettingsBuilder().updateAuthorizedCertificateSettings();
    }

    /** Returns the builder for the settings used for calls to deleteAuthorizedCertificate. */
    public UnaryCallSettings.Builder<DeleteAuthorizedCertificateRequest, Empty>
        deleteAuthorizedCertificateSettings() {
      return getStubSettingsBuilder().deleteAuthorizedCertificateSettings();
    }

    @Override
    public AuthorizedCertificatesSettings build() throws IOException {
      return new AuthorizedCertificatesSettings(this);
    }
  }
}
