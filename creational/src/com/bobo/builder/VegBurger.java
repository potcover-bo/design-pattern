package com.bobo.builder;

/**
 * Created by evildoerDb on 2018/7/17 10:35
 * 蔬菜汉堡
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "蔬菜汉堡";
    }

    @Override
    public float price() {
        return 2.5F;
    }
}
