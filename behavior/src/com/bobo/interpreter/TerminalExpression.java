package com.bobo.interpreter;

/**
 * Created by evildoerDb on 2018/7/19 17:15
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)){
            return true;
        }

        return false;
    }
}
