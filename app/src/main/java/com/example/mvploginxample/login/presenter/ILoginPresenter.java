package com.example.mvploginxample.login.presenter;

import com.example.mvploginxample.login.model.User;

public interface ILoginPresenter {
    void onLoginSuccess(String messageSuccess, User user);
    void onLoginFail(String messageFail);
}
