package com.bobo.chainofresponsibility;

/**
 * Created by evildoerDb on 2018/7/19 15:15
 *
 * 责任链模式
 */
public class Main {

    public static void main(String[] args) {
        AbstractLogger logChain = getChainOfLoggers();

        logChain.logMessage(AbstractLogger.ERROR,"this is an information");


    }

    /**
     * 获取执行的链表
     *
     * @return AbstractLogger
     */
    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger error = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger file = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger console = new ConsoleLogger(AbstractLogger.INFO);

        error.setNextLogegr(file);
        file.setNextLogegr(console);

        return error;
    }
}
