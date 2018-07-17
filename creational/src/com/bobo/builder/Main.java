package com.bobo.builder;

/**
 * Created by bobo.dou@weimob.com on 2018/7/17 10:28
 *
 * 建造者模式
 */
public class Main {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("蔬菜汉堡");
        vegMeal.showItems();
        System.out.println("总共花费: " +vegMeal.getPrice());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\n蔬菜汉堡套餐");
        nonVegMeal.showItems();
        System.out.println("总共花费: " +nonVegMeal.getPrice());
    }
}
