package com.bobo.visitor;

/**
 * Created by evildoerDb on 2018/7/19 17:30
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
