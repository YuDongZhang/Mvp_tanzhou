package com.shinelon.demo2.mvp2.impl;

import android.content.Context;

import com.shinelon.demo2.mvp2.MvpModel;


/**
 * 作者: Dream on 2018/3/9 21:40
 * QQ:510278658
 * E-mail:510278658@qq.com
 */

public abstract class MvpBaseModel implements MvpModel {

    private Context context;

    public MvpBaseModel(Context context){
        this.context = context;
    }

    public Context getContext() {
        return context;
    }
}
