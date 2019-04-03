package com.shinelon.demo1;

/**
 * Created by Shinelon on 2019/4/1.
 */
//抽象同事
public abstract class Colleague {
    //持有中介者引用
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    //动作
    public void action(){

    }
}
