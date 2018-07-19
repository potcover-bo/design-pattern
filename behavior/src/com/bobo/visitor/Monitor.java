package com.bobo.visitor;

/**
 * Created by evildoerDb on 2018/7/19 17:31
 */
public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
