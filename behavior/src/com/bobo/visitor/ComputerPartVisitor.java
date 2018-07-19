package com.bobo.visitor;

/**
 * Created by evildoerDb on 2018/7/19 17:30
 */
public interface ComputerPartVisitor {
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
    void visit(Mouse mouse);
    void visit(Computer computer);
}
