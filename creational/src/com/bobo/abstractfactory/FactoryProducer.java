package com.bobo.abstractfactory;

/**
 * Created by evildoerDb on 2018/7/17 16:01
 *
 * 工厂创造器
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String type){

        if (type.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        }else {
            return new ColorFactory();
        }
    }
}
