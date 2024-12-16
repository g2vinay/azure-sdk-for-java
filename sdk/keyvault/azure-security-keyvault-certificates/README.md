# Azure Key Vault Secret client library for Java

**Links:** [Source][source_code] | [Maven][maven_package] | [Ref Docs][api_documentation] | [Product Docs][product_docs] | [Samples][samples] | [Troubleshooting][kv_troubleshooting-guide] | [Changelog][changelog]

[Azure Key Vault][product_docs] allows you to securely manage and tightly control your certificates. The Azure Key Vault Certificate client library supports certificates backed by RSA and EC keys.

Multiple certificates and multiple versions of the same certificate can be kept in the Key Vault. Cryptographic keys in Azure Key Vault backing the certificates are represented as [JSON Web Key (JWK)][jwk_specification] objects. This library offers operations to create, retrieve, update, delete, purge, backup, restore, and list the certificates, as well as its versions.

## Getting started

The Azure SDK for Java offers a comprehensive collection of libraries, all of which are conveniently accessible on Maven Central under the [com.azure](https://central.sonatype.com/namespace/com.azure) namespace. The `azure-security-keyvault-secrets` library is available [here on Maven Central][maven_package]. In addition to this, the library is also referenced in the `azure-sdk-bom`, making it easier for you to navigate and locate the latest versions of all libraries. Microsoft Azure SDK best practice is to use the Azure SDK BOM to manage your dependencies. To use the Azure SDK BOM, follow our [Maven][bom_maven] and [Gradle][bom_gradle] docs. With the Azure SDK for Java BOM, you would add the following to your Maven *pom.xml* file:

```xml
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>com.azure</groupId>
            <artifactId>azure-sdk-bom</artifactId>
            <version>{bom_version_to_target}</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>

<dependencies>
    <dependency>
        <groupId>com.azure</groupId>
        <artifactId>azure-security-keyvault-certificates</artifactId>
    </dependency>
</dependencies>
```

Additionally, for projects using Maven as their build tool, Microsoft Azure SDK best practice is to use the [Maven Build Tool plugin][maven_build_tool], as this will ensure all Azure SDK best practices are being followed.

## Authentication

This client library supports the authentication via Microsoft Entra ID.

Authentication is a complex topic, but fortunately there are [conceptual docs][azure_identity_concepts] and detailed [reference docs][azure_identity_ref_docs]. You can also [read through the samples for this library][samples], as these show precisely how to authenticate clients in this library.

## Creating a Client

With all of the links provided above, you should have ample guidance on most aspects of using this library. To make this concrete, the code snippets below show the critical code required to create a new client, including authentication. For more in-depth code snippets, refer to the [samples][samples] package.

### Using Microsoft Entra ID Token

Here we demonstrate using [DefaultAzureCredential][azure_identity_DAC] to authenticate as a service principal. However, the configuration client accepts any [azure-identity credential][azure_identity_concepts].

Once you perform [the authentication set up that suits you best][default_azure_credential] and replaced **your-key-vault-url** with the URL for your key vault, you can create the `CertificateClient`:

```java readme-sample-createCertificateClient
CertificateClient certificateClient = new CertificateClientBuilder()
    .vaultUrl("<your-key-vault-url>")
    .credential(new DefaultAzureCredentialBuilder().build())
    .buildClient();
```

> NOTE: For using an asynchronous client use `CertificateAsyncClient` instead of `CertificateClient` and call `buildAsyncClient()`.

## Key concepts

Key concepts, code examples, and usage instructions for this library are discussed in great detail in the [Key Vault ref docs][api_documentation].

## Examples

There are comprehensive code samples available from the following links:

- [Create a certificate][sample_create_certificate]
- [Retrieve a certificate][sample_retrieve_certificate]
- [Update an existing certificate][sample_update_existing_certificate]
- [Delete a certificate][sample_delete_certificate]
- [List certificates][sample_list_certificates]


## Troubleshooting
See our [Key Vault Secrets troubleshooting guide][kv_troubleshooting-guide] for details on how to diagnose various failure scenarios related specifically to this library. Additionally, refer to the [Azure SDK for Java troubleshooting][troubleshooting-guide] page to learn more about how to get started with troubleshooting issues when using the Azure SDK for Java client libraries.


## Next steps

* [Quickstart: Azure Key Vault Certificate client library for Java (Certificates)][quickstart]
* Comprehensive code samples are available [here][samples].
* Detailed reference docs and usage examples for the API in this library are provided [here][api_documentation].


## Contributing
This project welcomes contributions and suggestions. Most contributions require you to agree to a Contributor License Agreement (CLA) declaring that you have the right to, and actually do, grant us the rights to use your contribution. For details, visit https://cla.microsoft.com.

When you submit a pull request, a CLA-bot will automatically determine whether you need to provide a CLA and decorate the PR appropriately (e.g., label, comment). Simply follow the instructions provided by the bot. You will only need to do this once across all repos using our CLA.

This project has adopted the [Microsoft Open Source Code of Conduct][microsoft_code_of_conduct]. For more information see the Code of Conduct FAQ or contact <opencode@microsoft.com> with any additional questions or comments.

<!-- LINKS -->
[source_code]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/keyvault/azure-security-keyvault-certificates/src
[api_documentation]: https://learn.microsoft.com/java/api/com.azure.security.keyvault.certificates
[azure_identity]: https://github.com/Azure/azure-sdk-for-java/tree/main/sdk/identity/azure-identity
[azkeyvault_docs]: https://docs.microsoft.com/azure/key-vault/
[azure_identity_concepts]: https://learn.microsoft.com/azure/developer/java/sdk/identity
[azure_identity_DAC]: https://learn.microsoft.com/java/api/com.azure.identity.defaultazurecredential
[azure_identity_ref_docs]: https://learn.microsoft.com/java/api/com.azure.identity
[bom_maven]: https://learn.microsoft.com/azure/developer/java/sdk/get-started-maven#add-azure-sdk-for-java-to-an-existing-project
[bom_gradle]: https://learn.microsoft.com/azure/developer/java/sdk/get-started-gradle
[changelog]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/keyvault/azure-security-keyvault-certificates/CHANGELOG.md
[maven_build_tool]: https://learn.microsoft.com/azure/developer/java/sdk/get-started-maven#use-the-azure-sdk-for-java-build-tool
[maven_package]: https://central.sonatype.com/artifact/com.azure/azure-security-keyvault-certificates
[microsoft_code_of_conduct]: https://opensource.microsoft.com/codeofconduct/
[product_docs]: https://docs.microsoft.com/azure/key-vault/
[source_code]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/keyvault/azure-security-keyvault-secrets/src
[quickstart]: https://learn.microsoft.com/azure/key-vault/certificates/quick-create-java?tabs=azure-cli
[troubleshooting-guide]: https://learn.microsoft.com/azure/developer/java/sdk/troubleshooting-overview
[kv_troubleshooting-guide]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/keyvault/TROUBLESHOOTING.md
[jwk_specification]: https://tools.ietf.org/html/rfc7517


[samples]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/keyvault/azure-security-keyvault-certificates/src/samples/java/com/azure/security/keyvault/certificates
[sample_create_certificate]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/keyvault/azure-security-keyvault-secrets/src/samples/java/com/azure/security/keyvault/secrets/ReadmeSamples.java#L36
[sample_retrieve_certificate]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/keyvault/azure-security-keyvault-secrets/src/samples/java/com/azure/security/keyvault/secrets/ReadmeSamples.java#L43
[sample_update_existing_certificate]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/keyvault/azure-security-keyvault-secrets/src/samples/java/com/azure/security/keyvault/secrets/ReadmeSamples.java#L50
[sample_delete_certificate]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/keyvault/azure-security-keyvault-secrets/src/samples/java/com/azure/security/keyvault/secrets/ReadmeSamples.java#L61
[sample_list_certificates]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/keyvault/azure-security-keyvault-secrets/src/samples/java/com/azure/security/keyvault/secrets/ReadmeSamples.java#L76


![Impressions](https://azure-sdk-impressions.azurewebsites.net/api/impressions/azure-sdk-for-java%2Fsdk%2Fkeyvault%2Fazure-security-keyvault-certificates%2FREADME.png)
