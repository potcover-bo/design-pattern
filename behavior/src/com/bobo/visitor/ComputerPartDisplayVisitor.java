package com.bobo.visitor;

/**
 * Created by evildoerDb on 2018/7/19 17:35
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println(" display keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println(" display monitor");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println(" display monitor");
    }

    @Override
    public void visit(Computer computer) {
        System.out.println(" display monitor");
    }
}
