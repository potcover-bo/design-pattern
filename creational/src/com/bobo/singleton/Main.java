package com.bobo.singleton;

/**
 * Created by evildoerDb on 2018/7/19 10:43
 *
 * 单例模式
 *
 * EFFECTIVE JAVA中说到
 *
 * 单元素的枚举类型已经成为实现单例模式的最好办法
 */
public class Main {

    public static void main(String[] args) {
       SingleEnum singleEnum = SingleEnum.INSTANCE;
       String string = singleEnum.getString();

        System.out.println(string);
    }
}
