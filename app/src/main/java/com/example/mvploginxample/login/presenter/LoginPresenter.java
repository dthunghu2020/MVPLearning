package com.example.mvploginxample.login.presenter;

import android.util.Log;

import androidx.annotation.NonNull;

import com.example.mvploginxample.login.api.ApiService;
import com.example.mvploginxample.login.api.ApiUtils;
import com.example.mvploginxample.login.model.DataPostRequest;
import com.example.mvploginxample.login.model.User;
import com.example.mvploginxample.login.model.UserResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginPresenter {


    private ILoginPresenter loginPresenter;

    public LoginPresenter(ILoginPresenter loginView) {
        this.loginPresenter = loginView;
    }

    public void checkEdtData(String edtUserID, String edtUserName, String edtUserPass) {
        if (edtUserID.isEmpty()) {
            loginPresenter.onLoginFail("Chưa nhập mã khách hàng!");
        } else if (edtUserName.isEmpty()) {
            loginPresenter.onLoginFail("Chưa nhập tên khách hàng!");
        } else if (edtUserPass.isEmpty()) {
            loginPresenter.onLoginFail("Chưa nhập mật khẩu!");
        } else
            checkDataRequestAPI(edtUserName, edtUserPass, edtUserID);
    }


    private void checkDataRequestAPI(String useName, String usePass, String useID) {
        ApiService mApiService = ApiUtils.postLoginService();
        //"MB-0034", "1", "hosco"
        DataPostRequest dataPostRequest = new DataPostRequest(useName,usePass,useID, "", "");
        Call<UserResponse> call = mApiService.getData(dataPostRequest);
        call.enqueue(new Callback<UserResponse>() {
            @Override
            public void onResponse(@NonNull Call<UserResponse> call, @NonNull Response<UserResponse> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {
                        //Xử lí khi response trả về thành
                        User mUser = response.body().getData().getUser();
                        loginPresenter.onLoginSuccess("Đăng nhập thành công!", mUser);
                    } else
                        //Response.body() null
                        loginPresenter.onLoginFail("Đăng nhập không thành công!");
                } else
                    //Response.code() != 200
                    loginPresenter.onLoginFail("Đăng nhập không thành công!");
            }

            @Override
            public void onFailure(@NonNull Call<UserResponse> call, @NonNull Throwable t) {
                loginPresenter.onLoginFail("Response Failure!");
            }
        });
    }
}
