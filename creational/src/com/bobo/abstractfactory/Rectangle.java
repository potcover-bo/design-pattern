package com.bobo.abstractfactory;

/**
 * Created by bobo.dou on 2018/7/17 15:45
 *
 * 实现图形的接口
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("draw Rectangle ");
    }
}
