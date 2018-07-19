package com.bobo.singleton;

/**
 * Created by evildoerDb on 2018/7/19 10:51
 *
 * 延迟加载  即懒汉式
 *
 * 线程安全 但是锁的粒度太大
 *
 */
public class SingletonSynchronized {
    private volatile static SingletonSynchronized singletonSynchronized;

    private SingletonSynchronized(){}

    public static synchronized SingletonSynchronized getInstance(){
        if (singletonSynchronized == null){
            singletonSynchronized = new SingletonSynchronized();
        }

        return singletonSynchronized;
    }
}
