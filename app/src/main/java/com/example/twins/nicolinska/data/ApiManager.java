package com.example.twins.nicolinska.data;

import android.support.annotation.NonNull;

import com.example.twins.nicolinska.Model.AnswerServer;

import java.util.Map;

import rx.Observable;

/**
 * Created by Twins on 26.07.2016.
 */

public class ApiManager {
    private static final int RETRY_COUNT_FOR_REQUEST = 0;

    private ApiManager() {}
    @NonNull
    public static Observable<AnswerServer> getVideoInfo(Map<String, String> map) {
        return ApiFactory.getApiService()
                .setOrder(map)
                .retry(RETRY_COUNT_FOR_REQUEST)
                .map(response -> response);
    }
}
