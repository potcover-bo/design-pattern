package com.bobo.singleton;

/**
 * Created by evildoerDb on 2018/7/19 11:15
 *
 * 枚举实现单例模式
 */
public enum SingleEnum {

    INSTANCE;

    public String getString(){
        return "something";
    }
}
