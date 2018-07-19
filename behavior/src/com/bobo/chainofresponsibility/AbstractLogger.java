package com.bobo.chainofresponsibility;

/**
 * Created by evildoerDb on 2018/7/19 15:15
 */
public abstract class AbstractLogger {

    public static int INFO =0;
    public static int DEBUG = 2;
    public static int ERROR =3;

    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogegr(AbstractLogger nextLogegr){
        this.nextLogger = nextLogegr;
    }

    public void logMessage(int level ,String message){
        if (this.level <= level){
            writeMessage(message);
            return;
        }
        if (nextLogger != null){
            //级别不够的话 调用下一个
            nextLogger.logMessage(level,message);
        }

    }

  abstract void writeMessage(String message);
}
