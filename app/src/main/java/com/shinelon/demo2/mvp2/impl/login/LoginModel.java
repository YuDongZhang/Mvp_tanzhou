package com.shinelon.demo2.mvp2.impl.login;

import android.content.Context;

import com.shinelon.demo2.mvp2.impl.MvpBaseModel;
import com.shinelon.utils.HttpTask;
import com.shinelon.utils.HttpUtils;


import java.util.HashMap;
import java.util.Map;

/**
 * 作者: Dream on 2018/3/9 21:15
 * QQ:510278658
 * E-mail:510278658@qq.com
 */

//M层->具体同事A
public class LoginModel extends MvpBaseModel {

    public LoginModel(Context context){
        super(context);
    }

    public void login(String username, String password, final HttpUtils.OnHttpResultListener onHttpResultListener){
        Map<String, Object> params = new HashMap<>();
        params.put("username", username);
        params.put("password", password);
        new HttpTask.Builder()
                .method("POST")
                .url("")
                .paramMap(params)
                .onHttpResultListener(new HttpUtils.OnHttpResultListener() {
                    @Override
                    public void onResult(String result) {
                        onHttpResultListener.onResult(result);
                    }
                }).build().execute();
    }

}
