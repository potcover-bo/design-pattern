package com.bobo.command;

/**
 * Created by evildoerDb on 2018/7/19 14:18
 *
 * 命令模式
 */
public class Main {

    public static void main(String[] args) {
        Stock stock = new Stock();

        Order buyOrder = new BuyStock(stock);
        Order sellOrder = new SellStock(stock);

        Broker broker = new Broker();
        broker.addOrder(buyOrder);
        broker.addOrder(sellOrder);

        broker.placeOrder();
    }
}
