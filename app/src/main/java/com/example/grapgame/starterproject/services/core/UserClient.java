package com.example.grapgame.starterproject.services.core;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;



public interface UserClient {

    @FormUrlEncoded
    @POST("AndroidService/index.php")
    Call<String> login(@Field("facultyID") String userId, @Field("password") String data,
                       @Field("userType") int userType);
}