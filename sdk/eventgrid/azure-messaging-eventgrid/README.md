# Azure Event Grid client library for Java

**Links:** [Source][source_code] | [Maven][maven_package] | [Ref Docs][api_documentation] | [Product Docs][product_docs] | [Samples][samples] | [Troubleshooting][kv_troubleshooting-guide] | [Changelog][changelog]

Azure Event Grid allows you to easily build applications with event-based architectures. The Event Grid service fully 
manages all routing of events from any source, to any destination, for any application. 
Azure service events and custom events can be published directly to the service, where the events can then be filtered 
and sent to various recipients, such as built-in handlers or custom webhooks. 
To learn more about Azure Event Grid: [What is Event Grid?](https://docs.microsoft.com/azure/event-grid/overview)

Use the client library for Azure Event Grid to:
- Publish events to the Event Grid service using the Event Grid Event, Cloud Event 1.0, or custom schemas
- Consume events that have been delivered to event handlers
- Generate SAS tokens to authenticate the client publishing events to Azure Event Grid topics


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
        <artifactId>azure-messaging-eventgrid</artifactId>
    </dependency>
</dependencies>
```

Additionally, for projects using Maven as their build tool, Microsoft Azure SDK best practice is to use the [Maven Build Tool plugin][maven_build_tool], as this will ensure all Azure SDK best practices are being followed.
## Authentication

This client library supports the authentication methods listed below:

* Entra ID
* API Key
* Shared Access Signature

Authentication is a complex topic, but fortunately there are [conceptual docs][azure_identity_concepts] and detailed [reference docs][azure_identity_ref_docs]. You can also [read through the samples for this library][samples], as these show precisely how to authenticate clients in this library.

## Creating a Client

With all of the links provided above, you should have ample guidance on most aspects of using this library. To make this concrete, the code snippets below show the critical code required to create a new client, including authentication. For more in-depth code snippets, refer to the [samples][samples] package.

### Using Microsoft Entra ID Token

Here we demonstrate using [DefaultAzureCredential][azure_identity_DAC] to authenticate as a service principal. However, the configuration client accepts any [azure-identity credential][azure_identity_concepts].

```java readme-sample-createSecretClient
SecretClient secretClient = new SecretClientBuilder()
    .vaultUrl("<your-key-vault-url>")
    .credential(new DefaultAzureCredentialBuilder().build())
    .buildClient();
```
> NOTE: For using an asynchronous client use `SecretAsyncClient` instead of `SecretClient` and call `buildAsyncClient()`.

### Using Entra ID token credential to create the client
To use the Entra ID token credential, include `azure-identity` artifact as a dependency. Refer to
[azure-identity README](https://docs.microsoft.com/java/api/overview/azure/identity-readme) for details.

```java readme-sample-createPublisherClientWithTokenCredential
EventGridPublisherClient<CloudEvent> cloudEventClient = new EventGridPublisherClientBuilder()
    .endpoint("<endpoint of your event grid topic/domain that accepts CloudEvent schema>")
    .credential(new DefaultAzureCredentialBuilder().build())
    .buildCloudEventPublisherClient();
```


### Using access key to create the client
Once you have your access key and topic endpoint, you can create the publisher client as follows:

```java readme-sample-createCloudEventPublisherClient
// For CloudEvent
EventGridPublisherClient<CloudEvent> cloudEventClient = new EventGridPublisherClientBuilder()
    .endpoint("<endpoint of your event grid topic/domain that accepts CloudEvent schema>")
    .credential(new AzureKeyCredential("<key for the endpoint>"))
    .buildCloudEventPublisherClient();
```

##### Using SAS token to create the client
If you have a SAS (**Shared Access Signature**) that can be used to send events to an Event Grid Topic or Domain for
limited time, you can use it to create the publisher client:

```java readme-sample-createPublisherClientWithSas
EventGridPublisherClient<CloudEvent> cloudEventClient = new EventGridPublisherClientBuilder()
    .endpoint("<endpoint of your event grid topic/domain that accepts CloudEvent schema>")
    .credential(new AzureSasCredential("<sas token that can access the endpoint>"))
    .buildCloudEventPublisherClient();
```


## Key concepts
Key concepts, code examples, and usage instructions for this library are discussed in great detail in the [Concepts in Azure Event Grid](https://docs.microsoft.com/azure/event-grid/concepts).

## Examples

There are comprehensive code samples available from the following links:

- Sending Events To Event Grid Topics
  - [Sending `EventGridEvent` to a topic that accepts EventGridEvent schema]
  - [Sending `CloudEvent` to a topic that accepts CloudEvent schema]
  - [Sending Custom Events to a topic that accepts custom event schema]

- [Sending Events To Event Grid Domain]
- Receiving and Consuming Events 
  - [Deserialize `EventGridEvent` or `CloudEvent` from a Json String] 
  - [Deserialize data from a `CloudEvent` or `EventGridEvent`]
  - [Deserialize system event data from `CloudEvent` or `EventGridEvent`]

Some additional sample code can be found [here][samples].

## Troubleshooting

See our [Event Grid troubleshooting guide](TROUBLESHOOTING.md) for details on how to diagnose various failure scenarios related specifically to this library. Additionally, refer to the [Azure SDK for Java troubleshooting][troubleshooting-guide] page to learn more about how to get started with troubleshooting issues when using the Azure SDK for Java client libraries.

## Next steps

- [Azure Java SDKs](https://docs.microsoft.com/java/azure/)
- If you don't have a Microsoft Azure subscription you can get a FREE trial account [here](https://go.microsoft.com/fwlink/?LinkId=330212)
- Some additional sample code can be found [here][samples]
- Additional Event Grid tutorials can be found [here][service_docs]

## Contributing

For details on contributing to this repository, see the [contributing guide](https://github.com/Azure/azure-sdk-for-java/blob/main/CONTRIBUTING.md).

1. Fork it
2. Create your feature branch (`git checkout -b my-new-feature`)
3. Commit your changes (`git commit -am 'Add some feature'`)
4. Push to the branch (`git push origin my-new-feature`)
5. Create new Pull Request

---

This project has adopted the [Microsoft Open Source Code of Conduct](https://opensource.microsoft.com/codeofconduct/). For more information see the [Code of Conduct FAQ](https://opensource.microsoft.com/codeofconduct/faq/) or contact [opencode@microsoft.com](mailto:opencode@microsoft.com) with any additional questions or comments.


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
[product_docs]:  https://docs.microsoft.com/azure/event-grid/
[source_code]: https://github.com/Azure/azure-sdk-for-java/tree/main/sdk/eventgrid/azure-messaging-eventgrid/src
[spring_quickstart]: https://learn.microsoft.com/azure/developer/java/spring-framework/configure-spring-boot-starter-java-app-with-azure-key-vault
[troubleshooting-guide]: https://learn.microsoft.com/azure/developer/java/sdk/troubleshooting-overview
[troubleshooting]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/keyvault/TROUBLESHOOTING.md
[samples]: https://github.com/Azure/azure-sdk-for-java/blob/main/sdk/eventgrid/azure-messaging-eventgrid/src/samples/java/com/azure/messaging/eventgrid


![Impressions](https://azure-sdk-impressions.azurewebsites.net/api/impressions/azure-sdk-for-java%2Fsdk%2Feventgrid%2Fazure-messaging-eventgrid%2FREADME.png)
