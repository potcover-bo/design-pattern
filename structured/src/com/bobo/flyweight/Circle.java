package com.bobo.flyweight;

/**
 * Created by evildoerDb on 2018/7/19 16:03
 */
public class Circle implements Shape {
    private String color;

    private int radius;

    private int x;

    private int y;

    public Circle(String color) {
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius);
    }
}
