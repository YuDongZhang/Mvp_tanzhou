package com.shinelon.demo1;

/**
 * Created by Shinelon on 2019/4/1.
 */

public class ConreteMediatro extends Mediator {
    public ConreteMediatro(Colleague colleagueA, Colleague colleagueB) {
        super(colleagueA, colleagueB);//中介者把2个分开了
    }

    @Override
    public void method() {
        getColleagueA().action();
        getColleagueB().action();
    }
}
