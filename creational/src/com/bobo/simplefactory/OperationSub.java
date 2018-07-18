package com.bobo.simplefactory;

/**
 * Created by evildoerDb on 2018/7/13 14:00
 *
 * 减法
 */
public class OperationSub extends Operation {
    @Override
    int getResult(int num1, int num2) {
        return num1 - num2;
    }
}
