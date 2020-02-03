// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.identity;

import com.azure.core.annotation.Immutable;
import com.azure.core.credential.AccessToken;
import com.azure.core.credential.TokenCredential;
import com.azure.core.credential.TokenRequestContext;
import com.azure.identity.implementation.IdentityClient;
import com.azure.identity.implementation.IdentityClientBuilder;
import com.azure.identity.implementation.IdentityClientOptions;
import reactor.core.publisher.Mono;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/**
 * An AAD credential that acquires a token with a client certificate for an AAD application.
 *
 * <p><strong>Sample: Construct a simple ClientCertificateCredential</strong></p>
 * {@codesnippet com.azure.identity.credential.clientcertificatecredential.construct}
 *
 * <p><strong>Sample: Construct a ClientCertificateCredential behind a proxy</strong></p>
 * {@codesnippet com.azure.identity.credential.clientcertificatecredential.constructwithproxy}
 */
@Immutable
public class ClientCertificateCredential implements TokenCredential {
    private final String clientCertificate;
    private final String clientCertificatePassword;
    private final IdentityClient identityClient;
    private final AtomicReference<AccessToken> cachedToken;


    /**
     * Creates a ClientSecretCredential with default identity client options.
     * @param tenantId the tenant ID of the application
     * @param clientId the client ID of the application
     * @param certificatePath the PEM file or PFX file containing the certificate
     * @param certificatePassword the password protecting the PFX file
     * @param identityClientOptions the options to configure the identity client
     */
    ClientCertificateCredential(String tenantId, String clientId, String certificatePath, String certificatePassword,
                                IdentityClientOptions identityClientOptions) {
        Objects.requireNonNull(certificatePath, "'certificatePath' cannot be null.");
        this.clientCertificate = certificatePath;
        this.clientCertificatePassword = certificatePassword;
        identityClient =
            new IdentityClientBuilder()
                .tenantId(tenantId)
                .clientId(clientId)
                .identityClientOptions(identityClientOptions)
                .build();
        cachedToken = new AtomicReference<>();
    }

    @Override
    public Mono<AccessToken> getToken(TokenRequestContext request) {
        return Mono.defer(() -> {
            if (cachedToken.get() != null && !cachedToken.get().isExpired()) {
                return Mono.just(cachedToken.get());
            } else {
                return Mono.empty();
            }
        }).switchIfEmpty(Mono.defer(() -> {
            if (clientCertificatePassword != null) {
                return identityClient.authenticateWithPfxCertificate(clientCertificate, clientCertificatePassword, request)
                    .map(accessToken -> {
                        cachedToken.set(accessToken);
                        return accessToken;
                    });
            } else {
                return identityClient.authenticateWithPemCertificate(clientCertificate, request)
                    .map(accessToken -> {
                        cachedToken.set(accessToken);
                        return accessToken;
                    });
            }
        }));
    }
}
