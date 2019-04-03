package com.shinelon.demo2.mvp2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;


import com.shinelon.demo2.mvp2.impl.MvpActivity;
import com.shinelon.demo2.mvp2.impl.login.LoginPresenter;
import com.shinelon.demo2.mvp2.impl.login.LoginView;
import com.shinelon.mvp.R;

/**
 M层->抽象同事A：MvpModel
 M层->具体同事A：LoginModel
 V层->抽象同事B：LoginView（UI交互接口）
 V层->具体同事B：MainActivity（或者：Fragment）
 P层->抽象中介：MvpPresenter
 P层->具体中介：LoginPresenter
 */

public class Mvp2_Activity extends MvpActivity<LoginView,LoginPresenter> implements LoginView {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickLogin(){
        getPresenter().login("Dream","123456");
    }

    @Override
    public LoginPresenter createPresenter() {
        return new LoginPresenter(this);
    }

    @Override
    public void onLogin(String result) {
        Toast.makeText(this,"返回内容"+result,Toast.LENGTH_SHORT).show();
    }
}
