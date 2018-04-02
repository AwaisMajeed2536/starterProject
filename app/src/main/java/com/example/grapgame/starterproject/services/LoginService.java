package com.example.grapgame.starterproject.services;


import android.content.Context;
import com.example.grapgame.starterproject.services.core.BaseService;
import com.example.grapgame.starterproject.services.core.Result;
import com.example.grapgame.starterproject.services.core.RetrofitClient;
import com.example.grapgame.starterproject.services.core.UserClient;


public class LoginService extends BaseService {

    private LoginService(Context context, int requestId, Result<String> result) {
        super(context, requestId, result);
    }

    public static LoginService newInstance(Context context, int requestId, Result<String> result) {
        return new LoginService(context, requestId, result);
    }
    public void callService(String userId, String password, int userType) {
        RetrofitClient.getRetrofit().create(UserClient.class).login(userId, password, userType).enqueue(this);
    }
}