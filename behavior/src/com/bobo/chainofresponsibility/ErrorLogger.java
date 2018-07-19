package com.bobo.chainofresponsibility;

/**
 * Created by evildoerDb on 2018/7/19 15:20
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    void writeMessage(String message) {
        System.out.println("error log " + message);
    }
}
