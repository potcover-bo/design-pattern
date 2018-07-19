package com.bobo.command;

/**
 * Created by evildoerDb on 2018/7/19 14:23
 */
public class Stock {

    private String name = "abcd";
    private Integer quantity = 100;

    public void buy(){
        System.out.println(name +"buy"+quantity);
    }

    public void sell(){
        System.out.println(name +"sell"+quantity);
    }
}
