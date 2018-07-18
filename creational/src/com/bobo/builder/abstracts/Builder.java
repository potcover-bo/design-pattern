package com.bobo.builder.abstracts;

/**
 * Created by evildoerDb on 2018/7/17 10:57
 *
 * 抽象的创建对
 */
public abstract class Builder {

    abstract Product getResult();

    abstract void buildA();

    abstract void buildB();
}