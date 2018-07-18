package com.bobo.simplefactory;

/**
 * Created by evildoerDb on 2018/7/13 14:02
 *
 * 除法
 */
public class OperationDiv extends Operation{
    @Override
    int getResult(int num1, int num2) {
        try{
            return num1 / num2;
        }catch (RuntimeException e){
            throw  new RuntimeException("被除数不能为0");
        }
    }
}
