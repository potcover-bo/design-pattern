package com.bobo.strategy;

/**
 * Created by bobo.dou on 2018/7/13 15:07
 *
 * 实现了算法B的类 继承自Strategy
 */
public class ConcreateStrategyB extends Stategy {
    @Override
    public void AlgorithmInterface() {
        System.out.println("实现了算法B");
    }
}
