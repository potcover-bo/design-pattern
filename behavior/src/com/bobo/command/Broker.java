package com.bobo.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by evildoerDb on 2018/7/19 14:27
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order){
        orderList.add(order);
    }

    public void placeOrder(){
        for (Order order : orderList){
            order.execute();
        }
        orderList.clear();
    }
}
