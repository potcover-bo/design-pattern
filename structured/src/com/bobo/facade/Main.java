package com.bobo.facade;

/**
 * Created by evildoerdb_ on 2018/7/16
 *
 * 外观模式
 */
public class Main {

    public static void main(String[] args) {
        ShapeMarker shapeMarker = new ShapeMarker();

        shapeMarker.drawCircle();

        shapeMarker.drawRectangle();
    }

}
