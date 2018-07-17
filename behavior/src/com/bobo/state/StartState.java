package com.bobo.state;

/**
 * Created by evildoerdb_ on 2018/7/17
 */
public class StartState implements State {


    @Override
    public void doAction(Context context) {
        System.out.println("开始状态");
        context.setState(this);
    }

    public String toString(){
        return "start state";
    }
}
