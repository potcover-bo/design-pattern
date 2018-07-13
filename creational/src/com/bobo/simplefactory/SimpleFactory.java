package com.bobo.simplefactory;

/**
 * Created by bobo.dou@weimob.com on 2018/7/13 14:03
 *
 * 简单工场的类
 */
public class SimpleFactory {

    private Operation operation;

    public Operation getInstance(String operate){

        switch (operate){
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
        }

        return operation;
    }
}
