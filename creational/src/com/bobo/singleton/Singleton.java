package com.bobo.singleton;

/**
 * Created by evildoerDb on 2018/7/19 10:44
 *
 * 懒汉式  只有在第一次访问的时候才创建对象  线程不安全
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }

        return singleton;
    }
}
