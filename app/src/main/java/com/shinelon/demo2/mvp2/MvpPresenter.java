package com.shinelon.demo2.mvp2;

/**
 * 作者: Dream on 2018/3/9 21:34
 * QQ:510278658
 * E-mail:510278658@qq.com
 */

//抽象中介者->高层次抽象接口
public interface MvpPresenter<V extends MvpView> {

    void attachView(V view);

    void detachView();

}
