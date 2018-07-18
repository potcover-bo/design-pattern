package com.bobo.prototype;

/**
 * Created by evildoerDb on 2018/7/16 17:51
 */
public class Main {

    public static void main(String[] args) throws Exception{
        Male male = new Male("male",28);
        male.say();

        Male male1 = (Male) male.clone();
        male.say();
        male1.setSex("nv");
        male1.say();
        male.say();
        System.out.println(male1);
        System.out.println(male);

    }
}
