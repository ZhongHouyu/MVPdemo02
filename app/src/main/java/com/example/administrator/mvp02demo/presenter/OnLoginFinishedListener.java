package com.example.administrator.mvp02demo.presenter;

/**
 * Created by Administrator on 2017/3/3.
 */

public interface OnLoginFinishedListener {
    void onUsernameError();

    void onPasswordError();

    void onSuccess();
}
