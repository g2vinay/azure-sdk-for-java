# Azure Container Registry client library for Java

**Links:** [Source][source_code] | [Maven][package] | [Ref Docs][api_documentation] | [Product Docs][product_docs] | [Samples][samples] | [Troubleshooting][troubleshooting] | [Changelog][changelog]

[Azure Container Registry][product_docs] allows you to store and manage container images and artifacts in a private registry for all types of container deployments.

Use the client library for Azure Container Registry to:

- List images or artifacts in a registry
- Upload, download, and delete images and artifacts, repositories and tags
- Obtain metadata for images and artifacts, repositories and tags
- Set read/write/delete properties on registry items

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
        <artifactId>azure-containers-containerregistry</artifactId>
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

```java readme-sample-createClient
DefaultAzureCredential credential = new DefaultAzureCredentialBuilder().build();
ContainerRegistryClient registryClient = new ContainerRegistryClientBuilder()
    .endpoint(endpoint)
    .credential(credential)
    .buildClient();
```

## Key concepts

Key concepts, code examples, and usage instructions for this library are discussed in great detail in the [Container Registry Concepts](https://docs.microsoft.com/azure/container-registry/container-registry-concepts).

## Examples

There are comprehensive code samples available from the following links:

- Registry operations:
  - [List repository names](https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/containerregistry/azure-containers-containerregistry/src/samples/java/com/azure/containers/containerregistry/ReadmeSamples.java#L82)
  - [List artifact tags with anonymous access](https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/containerregistry/azure-containers-containerregistry/src/samples/java/com/azure/containers/containerregistry/ReadmeSamples.java#L185)
  - [Set artifact properties](https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/containerregistry/azure-containers-containerregistry/src/samples/java/com/azure/containers/containerregistry/ReadmeSamples.java#L164)
  - [Delete images](https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/containerregistry/azure-containers-containerregistry/src/samples/java/com/azure/containers/containerregistry/ReadmeSamples.java#L128)
  - [Delete repository with anonymous access throws](#delete-a-repository-with-anonymous-access-throws)
- Blob and manifest operations:
  - [Upload images](https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/containerregistry/azure-containers-containerregistry/src/samples/java/com/azure/containers/containerregistry/UploadImage.java)
  - [Download images](https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/containerregistry/azure-containers-containerregistry/src/samples/java/com/azure/containers/containerregistry/DownloadImage.java)
  - [Delete manifest](https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/containerregistry/azure-containers-containerregistry/src/samples/java/com/azure/containers/containerregistry/ReadmeSamples.java#L310)
  - [Delete blob](https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/containerregistry/azure-containers-containerregistry/src/samples/java/com/azure/containers/containerregistry/ReadmeSamples.java#L293)
- Authentication
  - [Authenticate With ARM Entra ID Token](https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/containerregistry/azure-containers-containerregistry/src/samples/java/com/azure/containers/containerregistry/ReadmeSamples.java#L279)
  - [Authenticate With National Clouds](https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/containerregistry/azure-containers-containerregistry/src/samples/java/com/azure/containers/containerregistry/NationalCloudSample.java)


## Troubleshooting
See our [Azure Container Registry troubleshooting guide](https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/containerregistry/azure-containers-containerregistry/TROUBLESHOOTING.md) for details on how to diagnose various failure scenarios related specifically to this library. Additionally, refer to the [Azure SDK for Java troubleshooting][troubleshooting-guide] page to learn more about how to get started with troubleshooting issues when using the Azure SDK for Java client libraries.


## Next steps

- Go further with azure-containers-containerregistry and our [samples][samples]
- Watch a [demo or deep dive video](https://azure.microsoft.com/resources/videos/index/?service=container-registry)
- Read more about the [Azure Container Registry service](https://docs.microsoft.com/azure/container-registry/container-registry-intro)
- Comprehensive code samples are available [here][samples].

## Contributing

This project welcomes contributions and suggestions.  Most contributions require
you to agree to a Contributor License Agreement (CLA) declaring that you have
the right to, and actually do, grant us the rights to use your contribution. For
details, visit [cla.microsoft.com][cla].

This project has adopted the [Microsoft Open Source Code of Conduct][coc].
For more information see the [Code of Conduct FAQ][coc_faq]
or contact [opencode@microsoft.com][coc_contact] with any
additional questions or comments.

<!-- LINKS -->
[api_documentation]: https://learn.microsoft.com/java/api/com.azure.security.keyvault.secrets
[azure_identity]: https://github.com/Azure/azure-sdk-for-java/tree/main/sdk/identity/azure-identity
[azure_identity_concepts]: https://learn.microsoft.com/azure/developer/java/sdk/identity
[azure_identity_DAC]: https://learn.microsoft.com/java/api/com.azure.identity.defaultazurecredential
[azure_identity_ref_docs]: https://learn.microsoft.com/java/api/com.azure.identity
[bom_maven]: https://learn.microsoft.com/azure/developer/java/sdk/get-started-maven#add-azure-sdk-for-java-to-an-existing-project
[bom_gradle]: https://learn.microsoft.com/azure/developer/java/sdk/get-started-gradle
[changelog]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/keyvault/azure-security-keyvault-secrets/CHANGELOG.md
[maven_build_tool]: https://learn.microsoft.com/azure/developer/java/sdk/get-started-maven#use-the-azure-sdk-for-java-build-tool
[maven_package]: https://central.sonatype.com/artifact/com.azure/azure-security-keyvault-secrets
[microsoft_code_of_conduct]: https://opensource.microsoft.com/codeofconduct/
[product_docs]:  https://docs.microsoft.com/azure/container-registry
[source_code]: https://github.com/Azure/azure-sdk-for-java/tree/main/sdk/containerregistry/azure-containers-containerregistry/src
[spring_quickstart]: https://learn.microsoft.com/azure/developer/java/spring-framework/configure-spring-boot-starter-java-app-with-azure-key-vault
[troubleshooting-guide]: https://learn.microsoft.com/azure/developer/java/sdk/troubleshooting-overview
[kv_troubleshooting-guide]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/keyvault/TROUBLESHOOTING.md
[samples]: https://github.com/Azure/azure-sdk-for-java/tree/main/sdk/containerregistry/azure-containers-containerregistry/src/samples/
[cla]: https://cla.microsoft.com
[coc]: https://opensource.microsoft.com/codeofconduct/
[coc_faq]: https://opensource.microsoft.com/codeofconduct/faq/
[coc_contact]: mailto:opencode@microsoft.com


![Impressions](https://azure-sdk-impressions.azurewebsites.net/api/impressions/azure-sdk-for-java%2Fsdk%2Fcontainerregistry%2Fazure-contianers-containerregistry%2FREADME.png)
