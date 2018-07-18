package com.bobo.memento;

/**
 * Created by evildoerDb on 2018/7/18 14:31
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
