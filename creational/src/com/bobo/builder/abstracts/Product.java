package com.bobo.builder.abstracts;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bobo.dou@weimob.com on 2018/7/17 10:58
 */
public class Product {

    List<String> itemList = new ArrayList<>();

    public void add(String str){
        itemList.add(str);
    }

    public void show(){
        for (String string : itemList){
            System.out.println(string + ",");
        }
    }
}
