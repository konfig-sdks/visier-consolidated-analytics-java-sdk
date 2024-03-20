# ConsolidatedAnalyticsV1AlphaApi

All URIs are relative to *https://vanity.api.visier.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addExcludedSources**](ConsolidatedAnalyticsV1AlphaApi.md#addExcludedSources) | **PATCH** /v1alpha/admin/consolidated-analytics/tenants/:tenantId/excluded-sources | Add excluded sources to a consolidated analytics tenant |
| [**addSourceTenants**](ConsolidatedAnalyticsV1AlphaApi.md#addSourceTenants) | **PATCH** /v1alpha/admin/consolidated-analytics/tenants/:tenantId/source-tenants | Add source tenants to a consolidated analytics tenant |
| [**createTenant**](ConsolidatedAnalyticsV1AlphaApi.md#createTenant) | **POST** /v1alpha/admin/consolidated-analytics/tenants | Create a consolidated analytics tenant |
| [**listExcludedSources**](ConsolidatedAnalyticsV1AlphaApi.md#listExcludedSources) | **GET** /v1alpha/admin/consolidated-analytics/tenants/:tenantId/excluded-sources | Retrieve a consolidated analytics tenant&#39;s excluded sources |
| [**listSourceTenants**](ConsolidatedAnalyticsV1AlphaApi.md#listSourceTenants) | **GET** /v1alpha/admin/consolidated-analytics/tenants/:tenantId/source-tenants | Retrieve a consolidated analytics tenant&#39;s source tenants |
| [**listTenants**](ConsolidatedAnalyticsV1AlphaApi.md#listTenants) | **GET** /v1alpha/admin/consolidated-analytics/tenants | Retrieve a list of all consolidated analytics tenants |
| [**removeExcludedSources**](ConsolidatedAnalyticsV1AlphaApi.md#removeExcludedSources) | **DELETE** /v1alpha/admin/consolidated-analytics/tenants/:tenantId/excluded-sources | Remove excluded sources from a consolidated analytics tenants |
| [**removeSourceTenants**](ConsolidatedAnalyticsV1AlphaApi.md#removeSourceTenants) | **DELETE** /v1alpha/admin/consolidated-analytics/tenants/:tenantId/source-tenants | Remove source tenants from a consolidated analytics tenants |
| [**setExcludedSources**](ConsolidatedAnalyticsV1AlphaApi.md#setExcludedSources) | **PUT** /v1alpha/admin/consolidated-analytics/tenants/:tenantId/excluded-sources | Set a consolidated analytics tenant&#39;s excluded sources |
| [**setSourceTenants**](ConsolidatedAnalyticsV1AlphaApi.md#setSourceTenants) | **PUT** /v1alpha/admin/consolidated-analytics/tenants/:tenantId/source-tenants | Set a consolidated analytics tenant&#39;s source tenants |


<a name="addExcludedSources"></a>
# **addExcludedSources**
> ConsolidatedAnalyticsAPIExcludedSourcesListDTO addExcludedSources(excludedSourcesBody).tenantId(tenantId).execute();

Add excluded sources to a consolidated analytics tenant

This API adds excluded sources to the list of excluded sources for a consolidated analytics tenant.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **alpha**. While in alpha, APIs may change in a breaking way without notice; functionality may be removed, and no deprecation notices will be issued.  If you are interested in using this API, please contact your Customer Success Manager (CSM).&lt;/em&gt;

### Example
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **excludedSourcesBody** | [**ExcludedSourcesBody**](ExcludedSourcesBody.md)|  | |
| **tenantId** | **String**| The ID of the tenant. For example, WFF_{XXX}~CA{YYY} where {XXX} is the administrating tenant code and {YYY}  is the consolidated analytic tenant code. | [optional] |

### Return type

[**ConsolidatedAnalyticsAPIExcludedSourcesListDTO**](ConsolidatedAnalyticsAPIExcludedSourcesListDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="addSourceTenants"></a>
# **addSourceTenants**
> ConsolidatedAnalyticsAPISourceTenantListDTO addSourceTenants(tenantCodeBody).tenantId(tenantId).limit(limit).execute();

Add source tenants to a consolidated analytics tenant

This API adds source tenants to the list of source tenants for a consolidated analytics tenant.   If successful, the response returns an updated list of source tenants.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **alpha**. While in alpha, APIs may change in a breaking way without notice; functionality may be removed, and no deprecation notices will be issued.  If you are interested in using this API, please contact your Customer Success Manager (CSM).&lt;/em&gt;

### Example
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
    List<String> tenantCodes = Arrays.asList(); // A list of a CA tenant's source tenants codes. The maximum length is 1000.
    String tenantId = "tenantId_example"; // The ID of the tenant. For example, WFF_{XXX}~CA{YYY} where {XXX} is the administrating tenant code and {YYY}  is the consolidated analytic tenant code.
    Integer limit = 56; // The maximum number of source tenants to return. The maximum value is 1000. Default is 400.
    try {
      ConsolidatedAnalyticsAPISourceTenantListDTO result = client
              .consolidatedAnalyticsV1Alpha
              .addSourceTenants()
              .tenantCodes(tenantCodes)
              .tenantId(tenantId)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenantCodes());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsolidatedAnalyticsV1AlphaApi#addSourceTenants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConsolidatedAnalyticsAPISourceTenantListDTO> response = client
              .consolidatedAnalyticsV1Alpha
              .addSourceTenants()
              .tenantCodes(tenantCodes)
              .tenantId(tenantId)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsolidatedAnalyticsV1AlphaApi#addSourceTenants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantCodeBody** | [**TenantCodeBody**](TenantCodeBody.md)|  | |
| **tenantId** | **String**| The ID of the tenant. For example, WFF_{XXX}~CA{YYY} where {XXX} is the administrating tenant code and {YYY}  is the consolidated analytic tenant code. | [optional] |
| **limit** | **Integer**| The maximum number of source tenants to return. The maximum value is 1000. Default is 400. | [optional] |

### Return type

[**ConsolidatedAnalyticsAPISourceTenantListDTO**](ConsolidatedAnalyticsAPISourceTenantListDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="createTenant"></a>
# **createTenant**
> ConsolidatedAnalyticsAPITenantCreateRequestDTO createTenant(consolidatedAnalyticsAPITenantCreateRequestDTO).execute();

Create a consolidated analytics tenant

This API allows you to create a consolidated analytics tenant.   A new CA tenant has no source tenants and no excluded sources.   **Note:** CA tenant codes must have a prefix of CA. For example, WFF_{XXX}~CA{YYY} where {XXX} is the administrating tenant code and {YYY}  is the consolidated analytic tenant code.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **alpha**. While in alpha, APIs may change in a breaking way without notice; functionality may be removed, and no deprecation notices will be issued.  If you are interested in using this API, please contact your Customer Success Manager (CSM).&lt;/em&gt;

### Example
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
    String tenantCode = "tenantCode_example"; // The ID of the tenant. For example, WFF_{XXX}~CA{YYY} where {XXX} is the administrating tenant code and {YYY}  is the consolidated analytic tenant code.
    try {
      ConsolidatedAnalyticsAPITenantCreateRequestDTO result = client
              .consolidatedAnalyticsV1Alpha
              .createTenant()
              .tenantCode(tenantCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenantCode());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsolidatedAnalyticsV1AlphaApi#createTenant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConsolidatedAnalyticsAPITenantCreateRequestDTO> response = client
              .consolidatedAnalyticsV1Alpha
              .createTenant()
              .tenantCode(tenantCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsolidatedAnalyticsV1AlphaApi#createTenant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **consolidatedAnalyticsAPITenantCreateRequestDTO** | [**ConsolidatedAnalyticsAPITenantCreateRequestDTO**](ConsolidatedAnalyticsAPITenantCreateRequestDTO.md)|  | |

### Return type

[**ConsolidatedAnalyticsAPITenantCreateRequestDTO**](ConsolidatedAnalyticsAPITenantCreateRequestDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="listExcludedSources"></a>
# **listExcludedSources**
> ConsolidatedAnalyticsAPIExcludedSourcesListDTO listExcludedSources().tenantId(tenantId).execute();

Retrieve a consolidated analytics tenant&#39;s excluded sources

This API allows you to retrieve a CA tenant&#39;s excluded sources.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **alpha**. While in alpha, APIs may change in a breaking way without notice; functionality may be removed, and no deprecation notices will be issued.  If you are interested in using this API, please contact your Customer Success Manager (CSM).&lt;/em&gt;

### Example
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
    String tenantId = "tenantId_example"; // The ID of the tenant. For example, WFF_{XXX}~CA{YYY} where {XXX} is the administrating tenant code and {YYY}  is the consolidated analytic tenant code.
    try {
      ConsolidatedAnalyticsAPIExcludedSourcesListDTO result = client
              .consolidatedAnalyticsV1Alpha
              .listExcludedSources()
              .tenantId(tenantId)
              .execute();
      System.out.println(result);
      System.out.println(result.getExcludedSources());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsolidatedAnalyticsV1AlphaApi#listExcludedSources");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConsolidatedAnalyticsAPIExcludedSourcesListDTO> response = client
              .consolidatedAnalyticsV1Alpha
              .listExcludedSources()
              .tenantId(tenantId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsolidatedAnalyticsV1AlphaApi#listExcludedSources");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**| The ID of the tenant. For example, WFF_{XXX}~CA{YYY} where {XXX} is the administrating tenant code and {YYY}  is the consolidated analytic tenant code. | [optional] |

### Return type

[**ConsolidatedAnalyticsAPIExcludedSourcesListDTO**](ConsolidatedAnalyticsAPIExcludedSourcesListDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="listSourceTenants"></a>
# **listSourceTenants**
> ConsolidatedAnalyticsAPISourceTenantListDTO listSourceTenants().tenantId(tenantId).limit(limit).start(start).execute();

Retrieve a consolidated analytics tenant&#39;s source tenants

This API allows you to retrieve a CA tenant&#39;s source tenants.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **alpha**. While in alpha, APIs may change in a breaking way without notice; functionality may be removed, and no deprecation notices will be issued.  If you are interested in using this API, please contact your Customer Success Manager (CSM).&lt;/em&gt;

### Example
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
    String tenantId = "tenantId_example"; // The ID of the tenant. For example, WFF_{XXX}~CA{YYY} where {XXX} is the administrating tenant code and {YYY}  is the consolidated analytic tenant code.
    Integer limit = 56; // The maximum number of source tenants to return. The maximum value is 1000. Default is 400.
    Integer start = 56; // The starting index of the first source tenant to return. Default is 0.
    try {
      ConsolidatedAnalyticsAPISourceTenantListDTO result = client
              .consolidatedAnalyticsV1Alpha
              .listSourceTenants()
              .tenantId(tenantId)
              .limit(limit)
              .start(start)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenantCodes());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsolidatedAnalyticsV1AlphaApi#listSourceTenants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConsolidatedAnalyticsAPISourceTenantListDTO> response = client
              .consolidatedAnalyticsV1Alpha
              .listSourceTenants()
              .tenantId(tenantId)
              .limit(limit)
              .start(start)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsolidatedAnalyticsV1AlphaApi#listSourceTenants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**| The ID of the tenant. For example, WFF_{XXX}~CA{YYY} where {XXX} is the administrating tenant code and {YYY}  is the consolidated analytic tenant code. | [optional] |
| **limit** | **Integer**| The maximum number of source tenants to return. The maximum value is 1000. Default is 400. | [optional] |
| **start** | **Integer**| The starting index of the first source tenant to return. Default is 0. | [optional] |

### Return type

[**ConsolidatedAnalyticsAPISourceTenantListDTO**](ConsolidatedAnalyticsAPISourceTenantListDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="listTenants"></a>
# **listTenants**
> ConsolidatedAnalyticsAPITenantListResponseDTO listTenants().limit(limit).start(start).execute();

Retrieve a list of all consolidated analytics tenants

This API allows you to retrieve the full list of consolidated analytics tenants in your administrating tenant.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **alpha**. While in alpha, APIs may change in a breaking way without notice; functionality may be removed, and no deprecation notices will be issued.  If you are interested in using this API, please contact your Customer Success Manager (CSM).&lt;/em&gt;

### Example
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
    Integer limit = 56; // The maximum number of tenants to return. The maximum value is 1000. Default is 400.
    Integer start = 56; // The starting index of the first tenant to return. Default is 0.
    try {
      ConsolidatedAnalyticsAPITenantListResponseDTO result = client
              .consolidatedAnalyticsV1Alpha
              .listTenants()
              .limit(limit)
              .start(start)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenantCodes());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsolidatedAnalyticsV1AlphaApi#listTenants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConsolidatedAnalyticsAPITenantListResponseDTO> response = client
              .consolidatedAnalyticsV1Alpha
              .listTenants()
              .limit(limit)
              .start(start)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsolidatedAnalyticsV1AlphaApi#listTenants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| The maximum number of tenants to return. The maximum value is 1000. Default is 400. | [optional] |
| **start** | **Integer**| The starting index of the first tenant to return. Default is 0. | [optional] |

### Return type

[**ConsolidatedAnalyticsAPITenantListResponseDTO**](ConsolidatedAnalyticsAPITenantListResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="removeExcludedSources"></a>
# **removeExcludedSources**
> ConsolidatedAnalyticsAPIExcludedSourcesListDTO removeExcludedSources(excludedSourcesBody).tenantId(tenantId).execute();

Remove excluded sources from a consolidated analytics tenants

This API removes excluded sources from the list of excluded sources for a consolidated analytics tenant.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **alpha**. While in alpha, APIs may change in a breaking way without notice; functionality may be removed, and no deprecation notices will be issued.  If you are interested in using this API, please contact your Customer Success Manager (CSM).&lt;/em&gt;

### Example
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
              .removeExcludedSources()
              .excludedSources(excludedSources)
              .tenantId(tenantId)
              .execute();
      System.out.println(result);
      System.out.println(result.getExcludedSources());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsolidatedAnalyticsV1AlphaApi#removeExcludedSources");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConsolidatedAnalyticsAPIExcludedSourcesListDTO> response = client
              .consolidatedAnalyticsV1Alpha
              .removeExcludedSources()
              .excludedSources(excludedSources)
              .tenantId(tenantId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsolidatedAnalyticsV1AlphaApi#removeExcludedSources");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **excludedSourcesBody** | [**ExcludedSourcesBody**](ExcludedSourcesBody.md)|  | |
| **tenantId** | **String**| The ID of the tenant. For example, WFF_{XXX}~CA{YYY} where {XXX} is the administrating tenant code and {YYY}  is the consolidated analytic tenant code. | [optional] |

### Return type

[**ConsolidatedAnalyticsAPIExcludedSourcesListDTO**](ConsolidatedAnalyticsAPIExcludedSourcesListDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="removeSourceTenants"></a>
# **removeSourceTenants**
> ConsolidatedAnalyticsAPISourceTenantListDTO removeSourceTenants(tenantCodeBody).tenantId(tenantId).limit(limit).execute();

Remove source tenants from a consolidated analytics tenants

This API removes source tenants from the list of source tenants for a consolidated analytics tenant.   If successful, the response returns an updated list of source tenants.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **alpha**. While in alpha, APIs may change in a breaking way without notice; functionality may be removed, and no deprecation notices will be issued.  If you are interested in using this API, please contact your Customer Success Manager (CSM).&lt;/em&gt;

### Example
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
    List<String> tenantCodes = Arrays.asList(); // A list of a CA tenant's source tenants codes. The maximum length is 1000.
    String tenantId = "tenantId_example"; // The ID of the tenant. For example, WFF_{XXX}~CA{YYY} where {XXX} is the administrating tenant code and {YYY}  is the consolidated analytic tenant code.
    Integer limit = 56; // The maximum number of source tenants to return. The maximum value is 1000. Default is 400.
    try {
      ConsolidatedAnalyticsAPISourceTenantListDTO result = client
              .consolidatedAnalyticsV1Alpha
              .removeSourceTenants()
              .tenantCodes(tenantCodes)
              .tenantId(tenantId)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenantCodes());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsolidatedAnalyticsV1AlphaApi#removeSourceTenants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConsolidatedAnalyticsAPISourceTenantListDTO> response = client
              .consolidatedAnalyticsV1Alpha
              .removeSourceTenants()
              .tenantCodes(tenantCodes)
              .tenantId(tenantId)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsolidatedAnalyticsV1AlphaApi#removeSourceTenants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantCodeBody** | [**TenantCodeBody**](TenantCodeBody.md)|  | |
| **tenantId** | **String**| The ID of the tenant. For example, WFF_{XXX}~CA{YYY} where {XXX} is the administrating tenant code and {YYY}  is the consolidated analytic tenant code. | [optional] |
| **limit** | **Integer**| The maximum number of source tenants to return. The maximum value is 1000. Default is 400. | [optional] |

### Return type

[**ConsolidatedAnalyticsAPISourceTenantListDTO**](ConsolidatedAnalyticsAPISourceTenantListDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="setExcludedSources"></a>
# **setExcludedSources**
> ConsolidatedAnalyticsAPIExcludedSourcesListDTO setExcludedSources(excludedSourcesBody).tenantId(tenantId).execute();

Set a consolidated analytics tenant&#39;s excluded sources

This API defines the excluded sources for a consolidated analytics tenant.   After you create a CA tenant, you may optionally define a list of excluded sources. The excluded sources are the sources whose data is excluded from the CA tenant.  You can also use this API to replace the list of excluded sources for an existing CA tenant.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **alpha**. While in alpha, APIs may change in a breaking way without notice; functionality may be removed, and no deprecation notices will be issued.  If you are interested in using this API, please contact your Customer Success Manager (CSM).&lt;/em&gt;

### Example
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
              .setExcludedSources()
              .excludedSources(excludedSources)
              .tenantId(tenantId)
              .execute();
      System.out.println(result);
      System.out.println(result.getExcludedSources());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsolidatedAnalyticsV1AlphaApi#setExcludedSources");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConsolidatedAnalyticsAPIExcludedSourcesListDTO> response = client
              .consolidatedAnalyticsV1Alpha
              .setExcludedSources()
              .excludedSources(excludedSources)
              .tenantId(tenantId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsolidatedAnalyticsV1AlphaApi#setExcludedSources");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **excludedSourcesBody** | [**ExcludedSourcesBody**](ExcludedSourcesBody.md)|  | |
| **tenantId** | **String**| The ID of the tenant. For example, WFF_{XXX}~CA{YYY} where {XXX} is the administrating tenant code and {YYY}  is the consolidated analytic tenant code. | [optional] |

### Return type

[**ConsolidatedAnalyticsAPIExcludedSourcesListDTO**](ConsolidatedAnalyticsAPIExcludedSourcesListDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="setSourceTenants"></a>
# **setSourceTenants**
> ConsolidatedAnalyticsAPISourceTenantListDTO setSourceTenants(tenantCodeBody).tenantId(tenantId).limit(limit).execute();

Set a consolidated analytics tenant&#39;s source tenants

This API defines the source tenants for a consolidated analytics tenant.   After you create a CA tenant, you must define a list of its source tenants. The source tenants are the tenants whose data is aggregated in the CA tenant.  You can also use this API to replace the list of source tenants for an existing CA tenant.   If successful, the response returns an updated list of source tenants.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **alpha**. While in alpha, APIs may change in a breaking way without notice; functionality may be removed, and no deprecation notices will be issued.  If you are interested in using this API, please contact your Customer Success Manager (CSM).&lt;/em&gt;

### Example
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
    List<String> tenantCodes = Arrays.asList(); // A list of a CA tenant's source tenants codes. The maximum length is 1000.
    String tenantId = "tenantId_example"; // The ID of the tenant. For example, WFF_{XXX}~CA{YYY} where {XXX} is the administrating tenant code and {YYY}  is the consolidated analytic tenant code.
    Integer limit = 56; // The maximum number of source tenants to return. The maximum value is 1000. Default is 400.
    try {
      ConsolidatedAnalyticsAPISourceTenantListDTO result = client
              .consolidatedAnalyticsV1Alpha
              .setSourceTenants()
              .tenantCodes(tenantCodes)
              .tenantId(tenantId)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenantCodes());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsolidatedAnalyticsV1AlphaApi#setSourceTenants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ConsolidatedAnalyticsAPISourceTenantListDTO> response = client
              .consolidatedAnalyticsV1Alpha
              .setSourceTenants()
              .tenantCodes(tenantCodes)
              .tenantId(tenantId)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsolidatedAnalyticsV1AlphaApi#setSourceTenants");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantCodeBody** | [**TenantCodeBody**](TenantCodeBody.md)|  | |
| **tenantId** | **String**| The ID of the tenant. For example, WFF_{XXX}~CA{YYY} where {XXX} is the administrating tenant code and {YYY}  is the consolidated analytic tenant code. | [optional] |
| **limit** | **Integer**| The maximum number of source tenants to return. The maximum value is 1000. Default is 400. | [optional] |

### Return type

[**ConsolidatedAnalyticsAPISourceTenantListDTO**](ConsolidatedAnalyticsAPISourceTenantListDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

