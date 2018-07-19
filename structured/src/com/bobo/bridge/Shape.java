package com.bobo.bridge;

/**
 * Created by evildoerDb on 2018/7/19 11:32
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    abstract void draw();
}
