package com.bobo.builder;

/**
 * Created by bobo.dou@weimob.com on 2018/7/17 10:29
 *
 * 食物的类型
 */
public interface Item {

    //名字
    String name();
    //包装类型
    Packing packing();
    //价格
    float price();
}
