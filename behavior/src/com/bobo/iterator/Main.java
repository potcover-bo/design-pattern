package com.bobo.iterator;

/**
 * Created by evildoerDb on 2018/7/19 10:22
 *
 * 迭代器模式
 *
 * 类似于jdk中的Iterator
 */
public class Main {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        MyIterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()){
            System.out.println("name = "+ iterator.next());
        }
    }
}
