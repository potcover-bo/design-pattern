package com.bobo.abstractfactory;

/**
 * Created by evildoerDb on 2018/7/17 15:49
 *
 *
 */
public class ShapeFactory extends AbstractFactory {


    /**
     * 获取图形的工厂
     * @param shape
     * @return
     */
    @Override
    Shape getShape(String shape) {

        if (shape == null ){
            return null;
        }else if (shape.equalsIgnoreCase("circle")){
            return new Circle();
        }else if (shape.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
