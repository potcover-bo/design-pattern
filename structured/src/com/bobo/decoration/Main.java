package com.bobo.decoration;

/**
 * Created by bobo.dou@weimob.com on 2018/7/16 16:06
 * 装饰者模式测试
 */
public class Main {

    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteComponentA cA = new ConcreteComponentA(c);
        ConcreteComponentB cB = new ConcreteComponentB(cA);

        cB.opreation();

    }
}
