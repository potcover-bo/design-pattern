package com.bobo.abstractfactory;

/**
 * Created by bobo.dou on 2018/7/17 15:54
 */
public class ColorFactory extends AbstractFactory {
    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
    Color getColor(String color) {
        if (color == null){
            return null;
        }else if (color.equalsIgnoreCase("red")){
            return new Red();
        }else if (color.equalsIgnoreCase("blue")){
            return new Blue();
        }

        return null;
    }
}
