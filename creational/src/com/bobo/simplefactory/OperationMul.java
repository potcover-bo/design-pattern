package com.bobo.simplefactory;

/**
 * Created by bobo.dou on 2018/7/13 14:01
 *
 * 乘法
 */
public class OperationMul extends Operation {
    @Override
    int getResult(int num1, int num2) {
        return num1 * num2;
    }
}
