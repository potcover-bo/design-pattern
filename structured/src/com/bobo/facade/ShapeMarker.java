package com.bobo.facade;

/**
 * Created by evildoerdb_ on 2018/7/16
 *
 * 提供一个访问系统的通道
 */
public class ShapeMarker {

    private Shape rectangle;
    private Shape circleShape;

    public ShapeMarker() {
        this.rectangle = new RectangleShape();
        this.circleShape = new CircleShape();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawCircle(){
        circleShape.draw();
    }
}
