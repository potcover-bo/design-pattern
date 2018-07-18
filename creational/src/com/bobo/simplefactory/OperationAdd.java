package com.bobo.simplefactory;

/**
 * Created by bobo.dou on 2018/7/13 13:58
 * 加法
 */
public class OperationAdd extends Operation {

    @Override
    int getResult(int num1, int num2) {
        return num1 + num2;
    }
}
