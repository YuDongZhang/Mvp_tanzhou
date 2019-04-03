package com.shinelon.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 抽象的中介者  mvp
 * 具体的中介者
 * 抽象同事
 * 具体同事
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
