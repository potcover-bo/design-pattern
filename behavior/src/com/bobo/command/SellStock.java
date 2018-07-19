package com.bobo.command;

/**
 * Created by evildoerDb on 2018/7/19 14:26
 */
public class SellStock implements Order {

    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
