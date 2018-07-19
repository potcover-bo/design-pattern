package com.bobo.chainofresponsibility;

/**
 * Created by evildoerDb on 2018/7/19 15:21
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    void writeMessage(String message) {
        System.out.println("file log "+message);
    }
}
