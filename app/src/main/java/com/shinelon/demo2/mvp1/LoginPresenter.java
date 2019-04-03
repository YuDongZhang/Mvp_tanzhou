package com.shinelon.demo2.mvp1;

import com.shinelon.utils.HttpUtils;

/**
 * Created by Shinelon on 2019/4/3.
 * 具体中介
 */

public class LoginPresenter extends MvpPresenter {
    //持有同事引用
    //两个同事：M层、V层
    private LoginModel model;
    //private LoginView view;

    public LoginPresenter(){
        this.model = new LoginModel();
    }


    /*
    ①写在这里 ，由于很多继承的类都会重写 ， 直接写到父类就可以了
    public void attachView(LoginView view){
        this.view = view;
    }

    public void detchView(){
        this.view = null;
    }*/

    public void login(String username, String password){
        /*看下原理 具体中介调用同事动作
        ConreteMediatro
        @Override
        public void method() {
            getColleagueA().action();
            getColleagueB().action();
        }*/

        this.model.login(username, password, new HttpUtils.OnHttpResultListener() {
            @Override
            public void onResult(String result) {
                /*
                ①  这里也要改 在父类加上 getview
                if (view!= null){
                    view.onLoginResult(result);
                }*/

                if (getView()!= null){
                    getView().onLoginResult(result);
                }
            }
        });
    }

}
