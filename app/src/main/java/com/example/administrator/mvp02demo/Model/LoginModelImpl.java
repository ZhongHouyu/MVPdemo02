package com.example.administrator.mvp02demo.Model;

import android.os.Handler;
import android.text.TextUtils;

import com.example.administrator.mvp02demo.presenter.OnLoginFinishedListener;

/**
 * Created by Administrator on 2017/3/3.
 */

public class LoginModelImpl implements LoginModel {
    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener){
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(username)){
                    listener.onUsernameError();//model层里面回调listener
                    error = true;
                }
                if (TextUtils.isEmpty(password)){
                    listener.onPasswordError();
                    error = true;
                }
                if (!error){
                    listener.onSuccess();
                }
            }
        }, 2000);
    }
}
