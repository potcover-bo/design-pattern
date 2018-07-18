package com.bobo.builder.abstracts;

/**
 * Created by evildoerDb on 2018/7/17 10:56
 *
 * 建造者模式
 */
public class Main {

    public static void main(String[] args) {

        //TODO
        //待加深理解建造者模式
        Director director = new Director();
        Builder a = new ConcreteBuilder1();
        Builder b = new ConcreteBuilder2();

        director.construct(a);
        Product product = a.getResult();

        product.show();
    }
}
