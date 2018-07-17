package com.bobo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bobo.dou@weimob.com on 2018/7/17 11:35
 *
 * 抽象主题对象
 */
public  class Subject {

    private List<Observer> observerList = new ArrayList<>();
    private int state;


    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        myNotify();
    }

    //增加观察者
    public void add(Observer observer){
        observerList.add(observer);
    }

    //移除观察者
    public void delete(Observer observer){
        observerList.remove(observer);
    }

    //当主题对象有变化的时候  通知所有的观察者对象
    public void myNotify(){
       for (Observer observer : observerList){
           observer.update();
       }
    }
}
