package com.bobo.template;

/**
 * Created by evildoerdb_ on 2018/7/16
 *
 * 定义具体的执行步骤
 */
public class BasketBoll extends Game{

    @Override
    void startPlay() {
        System.out.println("开始打篮球");
    }

    @Override
    void endPlay() {
        System.out.println("篮球打完了");
    }
}
