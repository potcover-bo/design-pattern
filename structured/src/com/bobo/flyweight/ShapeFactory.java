package com.bobo.flyweight;

import java.util.HashMap;

/**
 * Created by evildoerDb on 2018/7/19 16:04
 */
public class ShapeFactory {

    private static HashMap<String,Shape> map = new HashMap<>();


    public static Shape findCircle(String color){
        if (map.containsKey(color)){
            map.get(color).draw();
            return map.get(color);
        }else{
            Shape circle = new Circle(color);
            map.put(color,circle);
            circle.draw();
            return circle;
        }
    }
}
