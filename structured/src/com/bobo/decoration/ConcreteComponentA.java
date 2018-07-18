package com.bobo.decoration;

/**
 * Created by evildoerDb on 2018/7/16 16:14
 * A 类
 *
 */
public class ConcreteComponentA extends Decorator{
    private  String string;

    public ConcreteComponentA(Component component) {
        super(component);
    }

    @Override
    public void opreation() {
        super.opreation();
        string = "我是A";
        System.out.println(string);

    }
}
