package com.bobo.interpreter;

/**
 * Created by evildoerDb on 2018/7/19 17:17
 */
public class AndExpression implements Expression {

    private Expression expression1 =null;

    private Expression expression2;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) && expression2.interpret(context);
    }
}
