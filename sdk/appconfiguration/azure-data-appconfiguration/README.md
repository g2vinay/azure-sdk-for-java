# Azure App Configuration client library for Java

**Links:** [Source][source_code] | [Maven][package] | [Ref Docs][api_documentation] | [Product Docs][app_config_docs] | [Samples][samples] | [Troubleshooting][troubleshooting] | [Changelog][changelog]

Azure App Configuration is a managed service that helps developers centralize their application configurations simply and securely.

Modern programs, especially programs running in a cloud, generally have many components that are distributed in nature. Spreading configuration settings across these components can lead to hard-to-troubleshoot errors during an application deployment. Use App Configuration to store all the settings for your application and secure their accesses in one place.

Use the client library for App Configuration to create and manage application configuration settings.

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
        <artifactId>azure-data-appconfiguration</artifactId>
    </dependency>
</dependencies>
```

Additionally, for projects using Maven as their build tool, Microsoft Azure SDK best practice is to use the [Maven Build Tool plugin][maven_build_tool], as this will ensure all Azure SDK best practices are being followed.
## Authentication

This client library supports the authentication methods listed below:

* Azure Active Directory
* Connection strings

Authentication is a complex topic, but fortunately there are [conceptual docs][azure_identity_concepts] and detailed [reference docs][azure_identity_ref_docs]. You can also [read through the samples for this library][samples], as these show precisely how to authenticate clients in this library.

## Creating a Client

With all of the links provided above, you should have ample guidance on most aspects of using this library. To make this concrete, the code snippets below show the critical code required to create a new client, including authentication. For more in-depth code snippets, refer to the [samples][samples] package.

### Using a Connection String

```java
ConfigurationClient configurationClient = new ConfigurationClientBuilder()
    .connectionString(connectionString)
    .buildClient();
```

> **Note** Connection strings are a great way to get started quickly on a new project, but are not recommended when your application is deployed to production. Consider using another authentication method at that stage.

### Using an Azure Active Directory (AAD) Token

Here we demonstrate using [DefaultAzureCredential][azure_identity_DAC] to authenticate as a service principal. However, the configuration client accepts any [azure-identity credential][azure_identity_concepts].

```java
DefaultAzureCredential credential = new DefaultAzureCredentialBuilder().build();
    ConfigurationClient configurationClient = new ConfigurationClientBuilder()
    .credential(credential)
    .endpoint(endpoint)
    .buildClient();
```

## Key concepts

Key concepts, code examples, and usage instructions for this library are discussed in great detail in the [Key Vault ref docs][api_documentation].

## Examples

There are comprehensive code samples available from the following links:

* [Create a configuration setting][sample_hello_world]
* [Retrieve a configuration setting][sample_hello_world]
* [Update an existing configuration setting][sample_hello_world]
* [Delete a configuration setting][sample_hello_world]
* [List configuration settings with multiple keys][sample_list_configuration_settings]
* [List revisions of multiple configuration settings][sample_read_revision_history]
* [Set a configuration setting to read only][sample_read_only]
* [Clear read only from a configuration setting][sample_read_only]
* [Conditional request a configuration setting][sample_conditional_request]
* [AAD Authentication][sample_aad]
* [HTTP client with proxy option][sample_proxy_option]
* [Feature Flag configuration setting][sample_feature_flag_setting]
* [Secret Reference configuration setting][sample_secret_reference_setting]


## Troubleshooting

See our [App Configuration troubleshooting guide](TROUBLESHOOTING.md) for details on how to diagnose various failure scenarios related specifically to this library. Additionally, refer to the [Azure SDK for Java troubleshooting][troubleshooting-guide] page to learn more about how to get started with troubleshooting issues when using the Azure SDK for Java client libraries.


## Next steps

* [Quickstart: Create a Java Spring app with App Configuration][spring_quickstart]
* Comprehensive code samples are available [here][samples].
* Detailed reference docs and usage examples for the API in this library are provided [here][api_documentation].

## Contributing

This project welcomes contributions and suggestions. Most contributions require you to agree to a [Contributor License Agreement (CLA)][cla] declaring that you have the right to, and actually do, grant us the rights to use your contribution.

When you submit a pull request, a CLA-bot will automatically determine whether you need to provide a CLA and decorate the PR appropriately (e.g., label, comment). Simply follow the instructions provided by the bot. You will only need to do this once across all repos using our CLA.

This project has adopted the [Microsoft Open Source Code of Conduct][coc]. For more information see the [Code of Conduct FAQ][coc_faq] or contact [opencode@microsoft.com][coc_contact] with any additional questions or comments.

<!-- LINKS -->
[add_headers_from_context_policy]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/core/azure-core/src/main/java/com/azure/core/http/policy/AddHeadersFromContextPolicy.java
[api_documentation]: https://learn.microsoft.com/java/api/com.azure.data.appconfiguration
[azure_identity]: https://github.com/Azure/azure-sdk-for-java/tree/main/sdk/identity/azure-identity
[azure_identity_concepts]: https://learn.microsoft.com/azure/developer/java/sdk/identity
[azure_identity_DAC]: https://learn.microsoft.com/java/api/com.azure.identity.defaultazurecredential
[azure_identity_ref_docs]: https://learn.microsoft.com/java/api/com.azure.identity
[bom_maven]: https://learn.microsoft.com/azure/developer/java/sdk/get-started-maven#add-azure-sdk-for-java-to-an-existing-project
[bom_gradle]: https://learn.microsoft.com/azure/developer/java/sdk/get-started-gradle
[changelog]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/appconfiguration/azure-data-appconfiguration/CHANGELOG.md
[maven_build_tool]: https://learn.microsoft.com/azure/developer/java/sdk/get-started-maven#use-the-azure-sdk-for-java-build-tool
[maven_package]: https://central.sonatype.com/artifact/com.azure/azure-data-appconfiguration/
[product_docs]: https://docs.microsoft.com/azure/azure-app-configuration
[source_code]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/appconfiguration/azure-data-appconfiguration/src
[spring_quickstart]: https://docs.microsoft.com/azure/azure-app-configuration/quickstart-java-spring-app
[troubleshooting]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/appconfiguration/azure-data-appconfiguration/TROUBLESHOOTING.md

[samples]: #examples
[sample_proxy_option]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/appconfiguration/azure-data-appconfiguration/src/samples/java/com/azure/data/appconfiguration/ProxyOptionsSample.java
[sample_hello_world]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/appconfiguration/azure-data-appconfiguration/src/samples/java/com/azure/data/appconfiguration/HelloWorld.java
[sample_list_configuration_settings]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/appconfiguration/azure-data-appconfiguration/src/samples/java/com/azure/data/appconfiguration/ConfigurationSets.java
[sample_conditional_request]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/appconfiguration/azure-data-appconfiguration/src/samples/java/com/azure/data/appconfiguration/ConditionalRequest.java
[sample_read_only]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/appconfiguration/azure-data-appconfiguration/src/samples/java/com/azure/data/appconfiguration/ReadOnlySample.java
[sample_read_revision_history]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/appconfiguration/azure-data-appconfiguration/src/samples/java/com/azure/data/appconfiguration/ReadRevisionHistory.java
[sample_aad]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/appconfiguration/azure-data-appconfiguration/src/samples/java/com/azure/data/appconfiguration/AadAuthentication.java
[sample_feature_flag_setting]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/appconfiguration/azure-data-appconfiguration/src/samples/java/com/azure/data/appconfiguration/FeatureFlagConfigurationSettingSample.java
[sample_secret_reference_setting]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/appconfiguration/azure-data-appconfiguration/src/samples/java/com/azure/data/appconfiguration/SecretReferenceConfigurationSettingSample.java

![Impressions](https://azure-sdk-impressions.azurewebsites.net/api/impressions/azure-sdk-for-java%2Fsdk%2Fappconfiguration%2Fazure-data-appconfiguration%2FREADME.png)
