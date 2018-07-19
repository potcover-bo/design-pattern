package com.bobo.bridge;

/**
 * Created by evildoerDb on 2018/7/19 11:38
 */
public class Circle extends Shape{

    private int radius;

    private int x;

    private  int y;

    public Circle(int radius,int x, int y ,DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
