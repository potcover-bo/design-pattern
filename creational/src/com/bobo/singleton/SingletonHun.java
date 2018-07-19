package com.bobo.singleton;

/**
 * Created by evildoerDb on 2018/7/19 10:46
 *
 * 饿汉式  线程安全
 */
public class SingletonHun {

    private static final SingletonHun singleton = new SingletonHun();

    private SingletonHun(){

    }

    public static SingletonHun getInstance(){
        return singleton;
    }


}
