package com.bobo.abstractfactory;

/**
 * Created by bobo.dou on 2018/7/17 16:02
 *
 * 抽象工厂测试
 */
public class Main {

    public static void main(String[] args) {
        //获取工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

        //根据图形工厂获取具体的图形
        Shape shape  = shapeFactory.getShape("rectangle");
        shape.draw();


        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        //根据颜色工厂来获取具体的颜色
        Color red = shapeFactory.getColor("red");
        red.fill();
    }
}
