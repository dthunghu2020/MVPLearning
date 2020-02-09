package com.example.mvploginxample.login.api;

public class ApiUtils {
    public static final String BASE_URL = "https://api.gymmaster.vn";

    public static ApiService postLoginService(){
        return RetrofitClient.getRetrofit(BASE_URL).create(ApiService.class);
    }
}
