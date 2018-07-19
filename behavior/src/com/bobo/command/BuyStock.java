package com.bobo.command;

/**
 * Created by evildoerDb on 2018/7/19 14:25
 */
public class BuyStock implements Order{
    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
