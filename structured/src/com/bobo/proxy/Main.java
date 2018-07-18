package com.bobo.proxy;

/**
 * Created by bobo.dou on 2018/7/16 16:39
 */
public class Main {

    public static void main(String[] args) {

        Subject subject = new ProxyClass(new RealSubject());

        subject.request();
    }
}
