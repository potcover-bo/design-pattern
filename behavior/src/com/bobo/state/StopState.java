package com.bobo.state;

/**
 * Created by evildoerdb_ on 2018/7/17
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("停止状态");
        context.setState(this);
    }

    public String toString(){
        return "Stop state";
    }
}
