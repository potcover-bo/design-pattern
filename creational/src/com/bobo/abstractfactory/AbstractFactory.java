package com.bobo.abstractfactory;

/**
 * Created by bobo.dou on 2018/7/17 15:47
 *
 * 抽象的工厂
 */
public abstract class AbstractFactory {

    abstract Shape getShape(String shape);

    abstract Color getColor(String color);
}
