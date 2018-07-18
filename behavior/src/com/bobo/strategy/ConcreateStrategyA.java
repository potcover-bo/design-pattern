package com.bobo.strategy;

/**
 * Created by evildoerDb on 2018/7/13 15:05
 *
 * 实现A算法的类 继承自Strategy
 */
public class ConcreateStrategyA extends Stategy {
    @Override
    public void AlgorithmInterface() {
        System.out.println("实现了算法A");
    }
}
