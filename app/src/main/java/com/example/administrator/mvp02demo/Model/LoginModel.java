package com.example.administrator.mvp02demo.Model;

import com.example.administrator.mvp02demo.presenter.OnLoginFinishedListener;

/**
 * Created by Administrator on 2017/3/3.
 */

public interface LoginModel {
    void login(String username,String password,OnLoginFinishedListener lister);
}
