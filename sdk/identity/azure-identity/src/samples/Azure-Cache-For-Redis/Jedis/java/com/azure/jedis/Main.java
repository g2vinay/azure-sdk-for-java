// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.jedis;

import com.azure.core.credential.AccessToken;
import com.azure.core.credential.TokenCredential;
import com.azure.core.credential.TokenRequestContext;
import com.azure.identity.ClientCertificateCredential;
import com.azure.identity.ClientCertificateCredentialBuilder;
import com.azure.identity.ClientSecretCredential;
import com.azure.identity.ClientSecretCredentialBuilder;
import redis.clients.jedis.DefaultJedisClientConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.exceptions.JedisException;

public class Main {
    public static void main(String[] args) {

        ClientSecretCredential clientSecretCredential = new ClientSecretCredentialBuilder()
            .clientSecret("xoA8Q~Q_lqQoDtDZMzli.W04if8pmOkQKw11RaAd")
            .clientId("27d85698-74dd-4dd9-9f2d-8ae0e0e0ac4f")
            .tenantId("72f988bf-86f1-41af-91ab-2d7cd011db47")
            .build();

        Jedis jedisClient = new AzureJedisClientBuilder()
            .cacheHostName("vigera-aad-rcache-v6.redis.cache.windows.net")
            .port(6380)
            .username("vservPrinc")
            .credential(clientSecretCredential)
            .build();

        jedisClient.set("Az:key", "sample");
        jedisClient.close();
    }
}
