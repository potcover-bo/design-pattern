package com.bobo.strategy.example;

/**
 * Created by evildoerDb on 2018/7/13 15:22
 *
 * 正常收费
 */
public class CashNormal extends CashSuper {
    @Override
    void algorithmInterface() {
        System.out.println("正常收费");
    }
}
