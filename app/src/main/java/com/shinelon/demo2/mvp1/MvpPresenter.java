package com.shinelon.demo2.mvp1;

/**
 * Created by Shinelon on 2019/4/3.
 * 抽象的中介
 */

public abstract class MvpPresenter {
    private LoginView view;

    public LoginView getView() {
        return view;
    }

    public void attachView(LoginView view){
        this.view = view;
    }

    public void detchView(){
        this.view = null;
    }
}
