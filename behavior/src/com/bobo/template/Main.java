package com.bobo.template;

/**
 * Created by evildoerdb_ on 2018/7/16
 *
 * 模板方法模式
 */
public class Main {

    public static void main(String[] args) {
        Game basketb = new BasketBoll();
        basketb.play();

        Game foot = new FootBoll();
        foot.play();
    }
}
