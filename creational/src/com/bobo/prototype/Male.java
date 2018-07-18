package com.bobo.prototype;

/**
 * Created by bobo.dou on 2018/7/16 17:46
 */
public class Male extends Person implements Cloneable{

    public Male(String sex ,Integer age) {
        setAge(age);
        setSex(sex);
    }
}
