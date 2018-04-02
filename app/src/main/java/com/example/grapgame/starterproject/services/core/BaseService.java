package com.example.grapgame.starterproject.services.core;


import android.content.Context;
import android.text.TextUtils;

import java.util.concurrent.TimeoutException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class BaseService implements Callback<String> {

    private Result<String> result;
    private Context context;
    private int requestId;

    public BaseService(Context context, int requestId, Result<String> result) {
        this.result = result;
        this.requestId = requestId;
        this.context = context;
    }

    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        if (response.isSuccessful()) {
            String message = response.body();
            if (!TextUtils.isEmpty(message)) {
                result.onSuccess(message, requestId);
            } else {
                result.onFailure("Failed!", requestId);
            }
        }
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        if (t instanceof NoInternetException) {
        } else if (t instanceof TimeoutException) {
        } else {
        }
        result.onError(t, requestId);
    }
}
