package com.konfigthis.client;

import com.konfigthis.client.api.ConsolidatedAnalyticsV1AlphaApi;

public class VisierConsolidatedAnalytics {
    private ApiClient apiClient;
    public final ConsolidatedAnalyticsV1AlphaApi consolidatedAnalyticsV1Alpha;

    public VisierConsolidatedAnalytics() {
        this(null);
    }

    public VisierConsolidatedAnalytics(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.consolidatedAnalyticsV1Alpha = new ConsolidatedAnalyticsV1AlphaApi(this.apiClient);
    }

}
