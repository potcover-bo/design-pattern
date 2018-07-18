package com.bobo.observer;

/**
 * Created by evildoerDb on 2018/7/17 13:42
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.add(this);
    }
    @Override
    void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
