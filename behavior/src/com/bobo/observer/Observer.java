package com.bobo.observer;

/**
 * Created by bobo.dou on 2018/7/17 11:34
 *
 * 抽象观察者
 */
public abstract class Observer {

    protected Subject subject;

    //更新方法
    abstract void update();
}
