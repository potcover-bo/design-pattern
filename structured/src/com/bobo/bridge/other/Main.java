package com.bobo.bridge.other;

/**
 * Created by evildoerDb on 2018/7/19 14:01
 */
public class Main {

    public static void main(String[] args) {
        Color color = new Red();
        Shape shape = new Circle(color);
        shape.draw();

    }
}
