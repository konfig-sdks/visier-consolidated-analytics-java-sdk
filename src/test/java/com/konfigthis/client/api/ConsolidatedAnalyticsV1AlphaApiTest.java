/*
 * Visier Consolidated Analytics APIs
 * Visier APIs for managing consolidated analytics (CA) tenants.
 *
 * The version of the OpenAPI document: 22222222.99201.1200
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.ConsolidatedAnalyticsAPIExcludedSourcesListDTO;
import com.konfigthis.client.model.ConsolidatedAnalyticsAPISourceTenantListDTO;
import com.konfigthis.client.model.ConsolidatedAnalyticsAPITenantCreateRequestDTO;
import com.konfigthis.client.model.ConsolidatedAnalyticsAPITenantListResponseDTO;
import com.konfigthis.client.model.ExcludedSourcesBody;
import com.konfigthis.client.model.Status;
import com.konfigthis.client.model.TenantCodeBody;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConsolidatedAnalyticsV1AlphaApi
 */
@Disabled
public class ConsolidatedAnalyticsV1AlphaApiTest {

    private static ConsolidatedAnalyticsV1AlphaApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ConsolidatedAnalyticsV1AlphaApi(apiClient);
    }

    /**
     * Add excluded sources to a consolidated analytics tenant
     *
     * This API adds excluded sources to the list of excluded sources for a consolidated analytics tenant.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **alpha**. While in alpha, APIs may change in a breaking way without notice; functionality may be removed, and no deprecation notices will be issued.  If you are interested in using this API, please contact your Customer Success Manager (CSM).&lt;/em&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addExcludedSourcesTest() throws ApiException {
        List<String> excludedSources = null;
        String tenantId = null;
        ConsolidatedAnalyticsAPIExcludedSourcesListDTO response = api.addExcludedSources()
                .excludedSources(excludedSources)
                .tenantId(tenantId)
                .execute();
        // TODO: test validations
    }

    /**
     * Add source tenants to a consolidated analytics tenant
     *
     * This API adds source tenants to the list of source tenants for a consolidated analytics tenant.   If successful, the response returns an updated list of source tenants.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **alpha**. While in alpha, APIs may change in a breaking way without notice; functionality may be removed, and no deprecation notices will be issued.  If you are interested in using this API, please contact your Customer Success Manager (CSM).&lt;/em&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addSourceTenantsTest() throws ApiException {
        List<String> tenantCodes = null;
        String tenantId = null;
        Integer limit = null;
        ConsolidatedAnalyticsAPISourceTenantListDTO response = api.addSourceTenants()
                .tenantCodes(tenantCodes)
                .tenantId(tenantId)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Create a consolidated analytics tenant
     *
     * This API allows you to create a consolidated analytics tenant.   A new CA tenant has no source tenants and no excluded sources.   **Note:** CA tenant codes must have a prefix of CA. For example, WFF_{XXX}~CA{YYY} where {XXX} is the administrating tenant code and {YYY}  is the consolidated analytic tenant code.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **alpha**. While in alpha, APIs may change in a breaking way without notice; functionality may be removed, and no deprecation notices will be issued.  If you are interested in using this API, please contact your Customer Success Manager (CSM).&lt;/em&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTenantTest() throws ApiException {
        String tenantCode = null;
        ConsolidatedAnalyticsAPITenantCreateRequestDTO response = api.createTenant()
                .tenantCode(tenantCode)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a consolidated analytics tenant&#39;s excluded sources
     *
     * This API allows you to retrieve a CA tenant&#39;s excluded sources.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **alpha**. While in alpha, APIs may change in a breaking way without notice; functionality may be removed, and no deprecation notices will be issued.  If you are interested in using this API, please contact your Customer Success Manager (CSM).&lt;/em&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listExcludedSourcesTest() throws ApiException {
        String tenantId = null;
        ConsolidatedAnalyticsAPIExcludedSourcesListDTO response = api.listExcludedSources()
                .tenantId(tenantId)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a consolidated analytics tenant&#39;s source tenants
     *
     * This API allows you to retrieve a CA tenant&#39;s source tenants.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **alpha**. While in alpha, APIs may change in a breaking way without notice; functionality may be removed, and no deprecation notices will be issued.  If you are interested in using this API, please contact your Customer Success Manager (CSM).&lt;/em&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listSourceTenantsTest() throws ApiException {
        String tenantId = null;
        Integer limit = null;
        Integer start = null;
        ConsolidatedAnalyticsAPISourceTenantListDTO response = api.listSourceTenants()
                .tenantId(tenantId)
                .limit(limit)
                .start(start)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a list of all consolidated analytics tenants
     *
     * This API allows you to retrieve the full list of consolidated analytics tenants in your administrating tenant.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **alpha**. While in alpha, APIs may change in a breaking way without notice; functionality may be removed, and no deprecation notices will be issued.  If you are interested in using this API, please contact your Customer Success Manager (CSM).&lt;/em&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTenantsTest() throws ApiException {
        Integer limit = null;
        Integer start = null;
        ConsolidatedAnalyticsAPITenantListResponseDTO response = api.listTenants()
                .limit(limit)
                .start(start)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove excluded sources from a consolidated analytics tenants
     *
     * This API removes excluded sources from the list of excluded sources for a consolidated analytics tenant.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **alpha**. While in alpha, APIs may change in a breaking way without notice; functionality may be removed, and no deprecation notices will be issued.  If you are interested in using this API, please contact your Customer Success Manager (CSM).&lt;/em&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeExcludedSourcesTest() throws ApiException {
        List<String> excludedSources = null;
        String tenantId = null;
        ConsolidatedAnalyticsAPIExcludedSourcesListDTO response = api.removeExcludedSources()
                .excludedSources(excludedSources)
                .tenantId(tenantId)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove source tenants from a consolidated analytics tenants
     *
     * This API removes source tenants from the list of source tenants for a consolidated analytics tenant.   If successful, the response returns an updated list of source tenants.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **alpha**. While in alpha, APIs may change in a breaking way without notice; functionality may be removed, and no deprecation notices will be issued.  If you are interested in using this API, please contact your Customer Success Manager (CSM).&lt;/em&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeSourceTenantsTest() throws ApiException {
        List<String> tenantCodes = null;
        String tenantId = null;
        Integer limit = null;
        ConsolidatedAnalyticsAPISourceTenantListDTO response = api.removeSourceTenants()
                .tenantCodes(tenantCodes)
                .tenantId(tenantId)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Set a consolidated analytics tenant&#39;s excluded sources
     *
     * This API defines the excluded sources for a consolidated analytics tenant.   After you create a CA tenant, you may optionally define a list of excluded sources. The excluded sources are the sources whose data is excluded from the CA tenant.  You can also use this API to replace the list of excluded sources for an existing CA tenant.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **alpha**. While in alpha, APIs may change in a breaking way without notice; functionality may be removed, and no deprecation notices will be issued.  If you are interested in using this API, please contact your Customer Success Manager (CSM).&lt;/em&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setExcludedSourcesTest() throws ApiException {
        List<String> excludedSources = null;
        String tenantId = null;
        ConsolidatedAnalyticsAPIExcludedSourcesListDTO response = api.setExcludedSources()
                .excludedSources(excludedSources)
                .tenantId(tenantId)
                .execute();
        // TODO: test validations
    }

    /**
     * Set a consolidated analytics tenant&#39;s source tenants
     *
     * This API defines the source tenants for a consolidated analytics tenant.   After you create a CA tenant, you must define a list of its source tenants. The source tenants are the tenants whose data is aggregated in the CA tenant.  You can also use this API to replace the list of source tenants for an existing CA tenant.   If successful, the response returns an updated list of source tenants.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **alpha**. While in alpha, APIs may change in a breaking way without notice; functionality may be removed, and no deprecation notices will be issued.  If you are interested in using this API, please contact your Customer Success Manager (CSM).&lt;/em&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setSourceTenantsTest() throws ApiException {
        List<String> tenantCodes = null;
        String tenantId = null;
        Integer limit = null;
        ConsolidatedAnalyticsAPISourceTenantListDTO response = api.setSourceTenants()
                .tenantCodes(tenantCodes)
                .tenantId(tenantId)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

}
