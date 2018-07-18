package com.bobo.builder;

/**
 * Created by bobo.dou on 2018/7/17 10:37
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public float price() {
        return 9.0F;
    }
}
