package com.bobo.bridge.other;

/**
 * Created by evildoerDb on 2018/7/19 14:04
 */
public class Black implements Color{

    @Override
    public void bePaint(String shape) {
        System.out.println("黑色的"+shape);
    }
}
