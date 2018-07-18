package com.bobo.strategy;

/**
 * Created by bobo.dou on 2018/7/13 14:51
 *
 * 测试
 */
public class Main {
    public static void main(String[] args) {

        //实现上下文的策略不同 所以结果就不同
        Context context = new Context(new ConcreateStrategyA());
        context.contextInterface();

        Context context1 = new Context(new ConcreateStrategyB());
        context1.contextInterface();
    }
}
