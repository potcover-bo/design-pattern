package com.bobo.proxy;

/**
 * Created by bobo.dou on 2018/7/16 16:37
 */
public class ProxyClass implements Subject {

    private Subject subject;

    public ProxyClass(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        subject.request();
    }
}
