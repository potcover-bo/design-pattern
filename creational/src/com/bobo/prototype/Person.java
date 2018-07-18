package com.bobo.prototype;

/**
 * Created by evildoerDb on 2018/7/16 17:44
 *
 * 顶层抽象接口
 */
public  class Person implements Cloneable{

    private String sex;

    private Integer age;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void say(){
        System.out.println("I am "+sex +",我今年"+age);
    }
}
