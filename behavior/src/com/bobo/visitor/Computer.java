package com.bobo.visitor;

/**
 * Created by evildoerDb on 2018/7/19 17:33
 */
public class Computer  implements ComputerPart{

    ComputerPart [] computerParts;

    public Computer() {
        computerParts = new ComputerPart[]{new Mouse(),new Keyboard(),new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0 ; i < computerParts.length; i++){
            computerParts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
