package com.example.mvploginxample.login.presenter;

import com.example.mvploginxample.login.model.User;

public interface ILoginPresenter {
    void onLoginSuccess( User user);
    void onLoginFail(String messageFail);
}
