package com.bobo.builder;

/**
 * Created by bobo.dou@weimob.com on 2018/7/17 10:38
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public float price() {
        return 9.5F;
    }
}
