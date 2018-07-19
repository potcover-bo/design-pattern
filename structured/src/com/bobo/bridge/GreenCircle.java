package com.bobo.bridge;

/**
 * Created by evildoerDb on 2018/7/19 11:32
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: Green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
