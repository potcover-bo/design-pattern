package com.bobo.builder;

/**
 * Created by bobo.dou on 2018/7/17 10:32
 *
 * 汉堡
 */
public abstract class Burger implements Item{


    /**
     * 汉堡类型
     * @return
     */
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
