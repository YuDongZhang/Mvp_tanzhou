package com.shinelon.demo2.mvp1;

import com.shinelon.utils.HttpTask;
import com.shinelon.utils.HttpUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Shinelon on 2019/4/3.
 * M  层 具体同事A
 */

public class LoginModel extends MvpModel {

    public void login(String username , String password , final HttpUtils.OnHttpResultListener onHttpResultListener){
        Map<String,Object> params = new HashMap<>();
        params.put("username",username);
        params.put("password",password);
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
