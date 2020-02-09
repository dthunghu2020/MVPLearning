package com.example.mvploginxample.login.api;

import com.example.mvploginxample.login.model.DataPostRequest;
import com.example.mvploginxample.login.model.UserResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    @POST("/api/auth/member/login")
    Call<UserResponse> getData(@Body DataPostRequest dataPostRequest);
}