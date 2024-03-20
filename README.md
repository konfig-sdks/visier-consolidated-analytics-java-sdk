<div align="center">

[![Visit Visier](./header.png)](https://visier.com)

# [Visier](https://visier.com)

Visier APIs for managing consolidated analytics (CA) tenants.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Visier&serviceName=ConsolidatedAnalytics&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>visier-consolidated-analytics-java-sdk</artifactId>
  <version>22222222.99201.1200</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:visier-consolidated-analytics-java-sdk:22222222.99201.1200"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/visier-consolidated-analytics-java-sdk-22222222.99201.1200.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierConsolidatedAnalytics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConsolidatedAnalyticsV1AlphaApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    VisierConsolidatedAnalytics client = new VisierConsolidatedAnalytics(configuration);
    List<String> excludedSources = Arrays.asList(); // A list of a CA tenant's excluded sources.
    String tenantId = "tenantId_example"; // The ID of the tenant. For example, WFF_{XXX}~CA{YYY} where {XXX} is the administrating tenant code and {YYY}  is the consolidated analytic tenant code.
    try {
      ConsolidatedAnalyticsAPIExcludedSourcesListDTO result = client
              .consolidatedAnalyticsV1Alpha
              .addExcludedSources()
              .excludedSources(excludedSources)
              .tenantId(tenantId)
              .execute();
      System.out.println(result);
      System.out.println(result.getExcludedSources());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsolidatedAnalyticsV1AlphaApi#addExcludedSources");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConsolidatedAnalyticsAPIExcludedSourcesListDTO> response = client
              .consolidatedAnalyticsV1Alpha
              .addExcludedSources()
              .excludedSources(excludedSources)
              .tenantId(tenantId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsolidatedAnalyticsV1AlphaApi#addExcludedSources");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://vanity.api.visier.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ConsolidatedAnalyticsV1AlphaApi* | [**addExcludedSources**](docs/ConsolidatedAnalyticsV1AlphaApi.md#addExcludedSources) | **PATCH** /v1alpha/admin/consolidated-analytics/tenants/:tenantId/excluded-sources | Add excluded sources to a consolidated analytics tenant
*ConsolidatedAnalyticsV1AlphaApi* | [**addSourceTenants**](docs/ConsolidatedAnalyticsV1AlphaApi.md#addSourceTenants) | **PATCH** /v1alpha/admin/consolidated-analytics/tenants/:tenantId/source-tenants | Add source tenants to a consolidated analytics tenant
*ConsolidatedAnalyticsV1AlphaApi* | [**createTenant**](docs/ConsolidatedAnalyticsV1AlphaApi.md#createTenant) | **POST** /v1alpha/admin/consolidated-analytics/tenants | Create a consolidated analytics tenant
*ConsolidatedAnalyticsV1AlphaApi* | [**listExcludedSources**](docs/ConsolidatedAnalyticsV1AlphaApi.md#listExcludedSources) | **GET** /v1alpha/admin/consolidated-analytics/tenants/:tenantId/excluded-sources | Retrieve a consolidated analytics tenant&#39;s excluded sources
*ConsolidatedAnalyticsV1AlphaApi* | [**listSourceTenants**](docs/ConsolidatedAnalyticsV1AlphaApi.md#listSourceTenants) | **GET** /v1alpha/admin/consolidated-analytics/tenants/:tenantId/source-tenants | Retrieve a consolidated analytics tenant&#39;s source tenants
*ConsolidatedAnalyticsV1AlphaApi* | [**listTenants**](docs/ConsolidatedAnalyticsV1AlphaApi.md#listTenants) | **GET** /v1alpha/admin/consolidated-analytics/tenants | Retrieve a list of all consolidated analytics tenants
*ConsolidatedAnalyticsV1AlphaApi* | [**removeExcludedSources**](docs/ConsolidatedAnalyticsV1AlphaApi.md#removeExcludedSources) | **DELETE** /v1alpha/admin/consolidated-analytics/tenants/:tenantId/excluded-sources | Remove excluded sources from a consolidated analytics tenants
*ConsolidatedAnalyticsV1AlphaApi* | [**removeSourceTenants**](docs/ConsolidatedAnalyticsV1AlphaApi.md#removeSourceTenants) | **DELETE** /v1alpha/admin/consolidated-analytics/tenants/:tenantId/source-tenants | Remove source tenants from a consolidated analytics tenants
*ConsolidatedAnalyticsV1AlphaApi* | [**setExcludedSources**](docs/ConsolidatedAnalyticsV1AlphaApi.md#setExcludedSources) | **PUT** /v1alpha/admin/consolidated-analytics/tenants/:tenantId/excluded-sources | Set a consolidated analytics tenant&#39;s excluded sources
*ConsolidatedAnalyticsV1AlphaApi* | [**setSourceTenants**](docs/ConsolidatedAnalyticsV1AlphaApi.md#setSourceTenants) | **PUT** /v1alpha/admin/consolidated-analytics/tenants/:tenantId/source-tenants | Set a consolidated analytics tenant&#39;s source tenants


## Documentation for Models

 - [ConsolidatedAnalyticsAPIExcludedSourcesListDTO](docs/ConsolidatedAnalyticsAPIExcludedSourcesListDTO.md)
 - [ConsolidatedAnalyticsAPISourceTenantListDTO](docs/ConsolidatedAnalyticsAPISourceTenantListDTO.md)
 - [ConsolidatedAnalyticsAPITenantCreateRequestDTO](docs/ConsolidatedAnalyticsAPITenantCreateRequestDTO.md)
 - [ConsolidatedAnalyticsAPITenantListResponseDTO](docs/ConsolidatedAnalyticsAPITenantListResponseDTO.md)
 - [ExcludedSourcesBody](docs/ExcludedSourcesBody.md)
 - [GoogleProtobufAny](docs/GoogleProtobufAny.md)
 - [Status](docs/Status.md)
 - [TenantCodeBody](docs/TenantCodeBody.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
