package com.bobo.singleton;

/**
 * Created by evildoerDb on 2018/7/19 11:01
 *
 * 静态内部类
 */
public class SingletonStatic {

    private static class SingleInner{
        private static final SingletonStatic SINGLE = new SingletonStatic();
    }
    private SingletonStatic(){}

    public static SingletonStatic getInstance(){
        return SingleInner.SINGLE;
    }

}
