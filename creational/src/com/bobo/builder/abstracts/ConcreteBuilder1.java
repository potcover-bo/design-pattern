package com.bobo.builder.abstracts;

/**
 * Created by evildoerDb on 2018/7/17 11:02
 */
public class ConcreteBuilder1 extends Builder {

    private Product product = new Product();
    @Override
    Product getResult() {
        return product;
    }

    @Override
    void buildA() {
        product.add("部件A");
    }

    @Override
    void buildB() {
        product.add("部件B");
    }
}
