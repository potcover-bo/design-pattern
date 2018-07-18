package com.bobo.prototype;

/**
 * Created by evildoerDb on 2018/7/16 17:50
 */
public class Female extends Person implements Cloneable{

    public Female(String sex, Integer age) {

        setSex(sex);
        setAge(age);
    }
}
