package com.bobo.chainofresponsibility;

/**
 * Created by evildoerDb on 2018/7/19 15:19
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    void writeMessage(String message) {
        System.out.println("console log "+message);
    }
}
