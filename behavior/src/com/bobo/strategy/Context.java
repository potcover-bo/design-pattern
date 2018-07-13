package com.bobo.strategy;

/**
 * Created by bobo.dou@weimob.com on 2018/7/13 15:10
 * 上下文
 */
public class Context {

    private Stategy stategy;

    public Context(Stategy stategy) {
        this.stategy = stategy;
    }

    public void contextInterface(){
        stategy.AlgorithmInterface();
    }
}
