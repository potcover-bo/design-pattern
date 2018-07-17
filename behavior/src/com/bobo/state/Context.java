package com.bobo.state;

/**
 * Created by evildoerdb_ on 2018/7/17
 */
public class Context {

    private State state;

    public Context() {
        this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
