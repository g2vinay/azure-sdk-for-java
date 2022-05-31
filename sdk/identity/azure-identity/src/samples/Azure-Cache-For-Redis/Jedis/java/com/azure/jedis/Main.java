// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.jedis;

import com.azure.core.credential.AccessToken;
import com.azure.core.credential.TokenCredential;
import com.azure.core.credential.TokenRequestContext;
import com.azure.identity.ClientCertificateCredential;
import com.azure.identity.ClientCertificateCredentialBuilder;
import redis.clients.jedis.DefaultJedisClientConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.exceptions.JedisException;

public class Main {
    public static void main(String[] args) {

        ClientCertificateCredential clientCertificateCredential = new ClientCertificateCredentialBuilder()
            .clientId("<clientId>")
            .pfxCertificate("<Cert-File-Path>", "<Cert-Password-if-Applicable>")
            .tenantId("<tenantId>")
            .build();

        Jedis jedisClient = new AzureJedisClientBuilder()
            .cacheHostName("<cache host name>")
            .port(6380)
            .username("<username>")
            .credential(clientCertificateCredential)
            .build();

        jedisClient.set("Az:key", "sample");
        jedisClient.close();
    }


    // Helper Code
    private static Jedis createJedisClient(String cacheHostname, int port, String username, AccessToken accessToken, boolean useSsl) {
        return new Jedis(cacheHostname, port, DefaultJedisClientConfig.builder()
            .password(accessToken.getToken())
            .user(username)
            .ssl(useSsl)
            .build());
    }

    private static AccessToken getAccessToken(TokenCredential tokenCredential, TokenRequestContext trc) {
        return tokenCredential.getToken(trc).block();
    }
}
