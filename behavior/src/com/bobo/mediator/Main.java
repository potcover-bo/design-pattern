package com.bobo.mediator;

/**
 * Created by evildoerDb on 2018/7/19 15:45
 *
 * 中介者模式
 */
public class Main {
    public static void main(String[] args) {
        User male = new User("male");
        User female = new User("female");

        male.sendMessage("I am male");
        female.sendMessage("I am female");
    }
}
