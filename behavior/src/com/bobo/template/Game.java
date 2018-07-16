package com.bobo.template;

/**
 * Created by evildoerdb_ on 2018/7/16
 *
 * 定义算法的框架
 */
public abstract class Game {

    abstract void startPlay();
    abstract void endPlay();

    public void play(){

        startPlay();
        endPlay();
    }
}
