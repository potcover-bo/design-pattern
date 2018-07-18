package com.bobo.simplefactory;

/**
 * Created by bobo.dou on 2018/7/13 13:47
 *
 * 测试
 */
public class Main {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {

        try {
            SimpleFactory simpleFactory = new SimpleFactory();
            Operation operation = simpleFactory.getInstance("/");
            int result = operation.getResult(1,0);
            System.out.println(result);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}
