package com.bobo.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bobo.dou@weimob.com on 2018/7/17 10:39
 */
public class Meal {

    private List<Item> itemList = new ArrayList<>();

    public float getPrice(){
        float cost = 0;
        for (Item item : itemList){
            cost += item.price();
        }
        return cost;
    }

    public void addItem(Item item){
        itemList.add(item);
    }

    public void showItems(){
        for (Item item : itemList) {
            System.out.print("类型 : "+item.name());
            System.out.print(", 包装类型 : "+item.packing().pack());
            System.out.println(", 价格 : "+item.price());
        }
    }
}
