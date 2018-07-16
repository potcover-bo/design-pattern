package com.bobo.proxy;

/**
 * Created by bobo.dou@weimob.com on 2018/7/16 16:37
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("真实的对象");
    }
}
