package com.huntly.server.domain.constant;

import lombok.experimental.UtilityClass;

@UtilityClass
public class AppConstants {
    public static final String LUCENE_INDEX_PATH = "lucene";
    
    public static final Integer DEFAULT_FETCH_INTERVAL_SECONDS = 600;
    
    public static final Integer DEFAULT_COLD_DATA_KEEP_DAYS = 60;
    
    public static final String AUTH_TOKEN_COOKIE_NAME = "auth_token";
}
