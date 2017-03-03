package com.example.administrator.mvp02demo.view;

/**
 * Created by Administrator on 2017/3/3.
 */

public interface LoginView {
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();
}
