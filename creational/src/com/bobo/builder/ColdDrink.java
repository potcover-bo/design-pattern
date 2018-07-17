package com.bobo.builder;

/**
 * Created by bobo.dou@weimob.com on 2018/7/17 10:34
 *
 * 冷饮
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
