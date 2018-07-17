package com.bobo.builder.abstracts;

/**
 * Created by bobo.dou@weimob.com on 2018/7/17 11:03
 */
public class ConcreteBuilder2 extends Builder{

    private Product product = new Product();
    @Override
    Product getResult() {
        return product;
    }

    @Override
    void buildA() {
        product.add("部件X");
    }

    @Override
    void buildB() {
        product.add("部件X");
    }
}
