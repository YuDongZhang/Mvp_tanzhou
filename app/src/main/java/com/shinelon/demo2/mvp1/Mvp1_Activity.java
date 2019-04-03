package com.shinelon.demo2.mvp1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.shinelon.mvp.R;

/**
 M层->抽象同事A：MvpModel
 M层->具体同事A：LoginModel
 V层->抽象同事B：LoginView（UI交互接口）
 V层->具体同事B：MainActivity（或者：Fragment）
 P层->抽象中介：MvpPresenter
 P层->具体中介：LoginPresenter
 */

public class Mvp1_Activity extends AppCompatActivity implements LoginView {

    private LoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //同事里面要持有中介
        this.loginPresenter = new LoginPresenter();
        this.loginPresenter.attachView(this);
    }

    //按钮点击的方法
    public void clickLogin(View view){
        this.loginPresenter.login("Dream", "123456");
    }

    //登录后的返回的方法
    @Override
    public void onLoginResult(String result) {
        Toast.makeText(this, "返回内容：" + result, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.loginPresenter.detchView();
    }
}
