package com.bobo.decoration;

/**
 * Created by bobo.dou on 2018/7/16 16:16
 */
public class ConcreteComponentB extends Decorator {
    private String string;

    public ConcreteComponentB(Component component) {
        super(component);
    }

    @Override
    public void opreation() {
        super.opreation();
        string = "我是B";
        System.out.println(string);
    }

    public void opreationB(){
        System.out.println("我是B特有的");
    }
}
