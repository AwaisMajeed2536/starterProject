package com.example.grapgame.starterproject.services.core;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitClient {
    private static final String BASE_URL = "UPDATE_BASE_URL_HERE";
    private static final int TIME_OUT = 30;
    private static Retrofit retrofit = null;

    public static Retrofit getRetrofit(){
        if(retrofit==null){
            OkHttpClient.Builder okClient = new OkHttpClient.Builder();
            okClient.connectTimeout(TIME_OUT, TimeUnit.SECONDS);
            okClient.readTimeout(TIME_OUT,TimeUnit.SECONDS);
            okClient.writeTimeout(TIME_OUT,TimeUnit.SECONDS);

            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            okClient.addInterceptor(interceptor);

            Gson gson = new GsonBuilder().setLenient().create();

            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create(gson)).client(okClient.build()).build();
        }
        return retrofit;
    }
}
