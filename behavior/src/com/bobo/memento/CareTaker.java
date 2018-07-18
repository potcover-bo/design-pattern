package com.bobo.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by evildoerDb on 2018/7/18 14:34
 */
public class CareTaker {

    private List<Memento> list = new ArrayList<>();

    public void add(Memento state){
        list.add(state);
    }

    public Memento get(int index){
        return list.get(index);
    }
}
