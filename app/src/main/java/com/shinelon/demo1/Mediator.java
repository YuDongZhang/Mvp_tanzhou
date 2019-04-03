package com.shinelon.demo1;

/**
 * Created by Shinelon on 2019/4/1.
 * 角色一：抽象中介者（Mediator）
 角色二：具体中介者（ConreteMediator）
 角色三：抽象同事（Colleague）
 角色四：具体同事（ConrateColleague）
 *
 */
//抽象的中介者
public abstract class Mediator {
    //特点 持有同事引用
    private Colleague colleagueA;
    private Colleague colleagueB;

    public Colleague getColleagueA() {
        return colleagueA;
    }

    public Colleague getColleagueB() {
        return colleagueB;
    }

    public Mediator(Colleague colleagueA, Colleague colleagueB) {
        this.colleagueA = colleagueA;
        this.colleagueB = colleagueB;
    }

    //业务逻辑方法
    public void method(){

    }
}
