package com.bobo.visitor;

/**
 * Created by evildoerDb on 2018/7/19 17:29
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);
}
