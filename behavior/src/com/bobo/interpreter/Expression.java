package com.bobo.interpreter;

/**
 * Created by evildoerDb on 2018/7/19 17:15
 */
public interface Expression {

    boolean interpret(String context);
}
