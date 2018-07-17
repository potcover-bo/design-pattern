package com.bobo.builder;

/**
 * Created by bobo.dou@weimob.com on 2018/7/17 10:36
 *
 * 鸡肉汉堡
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public float price() {
        return 25.0F;
    }
}
