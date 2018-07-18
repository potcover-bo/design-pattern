package com.bobo.observer;

/**
 * Created by bobo.dou on 2018/7/17 13:45
 */
public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
