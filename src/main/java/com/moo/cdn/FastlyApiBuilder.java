package com.moo.cdn;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

public class FastlyApiBuilder {

    final static String FASTLY_URL = "https://api.fastly.com";
    final static String FASTLY_AUTH_HEADER = "Fastly-Key";
    public final static String GMT_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss+00:00"; // TODO: can't seem to get simple date format to understand +00:00 as an alternative to 'Z', even though a valid ISO_8601. - FIXME.

    private final String apiKey;

    public FastlyApiBuilder(String apiKey) {
        this.apiKey = apiKey;
    }

    public FastlyApi build() {
        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder();
        clientBuilder.networkInterceptors().add(chain -> {
            Request request = chain.request().newBuilder().addHeader(FASTLY_AUTH_HEADER, apiKey).build();
            return chain.proceed(request);
        });

        Gson gson = new GsonBuilder().setDateFormat(GMT_DATE_FORMAT).create();

        Retrofit fastlyClient = new Retrofit.Builder()
                .baseUrl(FASTLY_URL)
                .client(clientBuilder.build())
                .addConverterFactory(GsonConverterFactory.create(gson)) //http://stackoverflow.com/questions/32343183/retrofit-could-not-locate-converter-for-class-crashing-app - why do we need this?
                .build();
        return fastlyClient.create(FastlyApi.class);
    }
}
