package com.example.luara.retrofitestudoapp.service;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService {

    private static final String BASE_URL = "https://www.randomuser.me/";
    private static Retrofit retrofit;

    public static Retrofit getRetrofit() {
        if(retrofit == null){
            // Retorna depois de um tempo erro 404 se a api nao der retorno
            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
            httpClient.readTimeout(30, TimeUnit.SECONDS);
            httpClient.connectTimeout(30, TimeUnit.SECONDS);
            httpClient.writeTimeout(30, TimeUnit.SECONDS);

            // Coneccao com a api por build()
            // Retrofit.Builder
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build())
                    .build();


        }
        return retrofit;
    }

    public static PossoaApi getApiService() {
        return getRetrofit().create(PossoaApi.class);
    }
}
