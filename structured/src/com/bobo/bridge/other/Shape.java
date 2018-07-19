package com.bobo.bridge.other;

/**
 * Created by evildoerDb on 2018/7/19 14:02
 */
public abstract class Shape {

    Color color;

    public Shape(Color color) {
        this.color = color;
    }
    abstract void draw();
}
