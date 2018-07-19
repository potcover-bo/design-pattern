package com.bobo.singleton;

/**
 * Created by evildoerDb on 2018/7/19 10:54
 *
 * 使用双重检查  锁的粒度比较小
 */
public class SingletonDoubleCheck {

    private volatile  static SingletonDoubleCheck single;

    private SingletonDoubleCheck(){}

    public static SingletonDoubleCheck getInstance(){
        if (single == null){
            synchronized (SingletonDoubleCheck.class){
                if (single == null){
                    single = new SingletonDoubleCheck();
                }
            }
        }
        return single;
    }
}
