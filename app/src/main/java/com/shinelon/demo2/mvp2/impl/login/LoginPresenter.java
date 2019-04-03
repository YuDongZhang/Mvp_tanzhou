package com.shinelon.demo2.mvp2.impl.login;

import android.content.Context;


import com.shinelon.demo2.mvp2.impl.MvpBasePresenter;
import com.shinelon.utils.HttpUtils;


/**
 * 作者: Dream on 2018/3/9 21:46
 * QQ:510278658
 * E-mail:510278658@qq.com
 */

public class LoginPresenter extends MvpBasePresenter<LoginView> {

    private LoginModel model;

    public LoginPresenter(Context context){
        this.model = new LoginModel(context);
    }

    public void login(String username, String password){
        this.model.login(username, password, new HttpUtils.OnHttpResultListener() {
            @Override
            public void onResult(String result) {
                getView().onLogin(result);
            }
        });
    }

}
