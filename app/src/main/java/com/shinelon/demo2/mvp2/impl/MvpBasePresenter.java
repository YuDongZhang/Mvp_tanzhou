package com.shinelon.demo2.mvp2.impl;


import com.shinelon.demo2.mvp2.MvpPresenter;
import com.shinelon.demo2.mvp2.MvpView;

/**
 * 作者: Dream on 2018/3/9 21:39
 * QQ:510278658
 * E-mail:510278658@qq.com
 */

public class MvpBasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private V view;

    public V getView() {
        return view;
    }

    @Override
    public void attachView(V view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
    }

}
