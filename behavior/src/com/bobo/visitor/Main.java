package com.bobo.visitor;

/**
 * Created by evildoerDb on 2018/7/19 17:36
 */
public class Main {

    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
