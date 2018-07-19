package com.bobo.bridge.other;

/**
 * Created by evildoerDb on 2018/7/19 14:03
 */
public class Circle extends Shape{

    public Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        color.bePaint("圆");
    }
}
