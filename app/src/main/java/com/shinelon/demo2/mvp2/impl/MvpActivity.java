package com.shinelon.demo2.mvp2.impl;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.shinelon.demo2.mvp2.MvpPresenter;
import com.shinelon.demo2.mvp2.MvpView;


public abstract class MvpActivity<V extends MvpView, P extends MvpPresenter<V>> extends AppCompatActivity implements MvpView {

    private P presenter;

    public P getPresenter() {
        return presenter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (presenter == null){
            this.presenter = createPresenter();
        }
        if (presenter != null){
            this.presenter.attachView((V)this);
        }
    }

    public abstract P createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.detachView();
    }
}
