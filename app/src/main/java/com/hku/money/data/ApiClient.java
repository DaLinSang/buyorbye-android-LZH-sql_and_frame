package com.hku.money.data;

import com.hku.money.BuildConfig;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public final class ApiClient {
    private static final Gson GSON = new GsonBuilder().create();
    private static final Retrofit RETROFIT = new Retrofit.Builder()
            .baseUrl(BuildConfig.API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(GSON))
            .build();

    private ApiClient() {}

    public static Retrofit get() {
        return RETROFIT;
    }
}
