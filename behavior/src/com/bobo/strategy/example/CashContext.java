package com.bobo.strategy.example;

/**
 * Created by bobo.dou@weimob.com on 2018/7/13 15:25
 *
 * Cash的上下文
 */
public class CashContext {

    private static CashSuper cashSuper;

    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public static void getResult(String type){

        switch (type){
            case "满利返现" :
                cashSuper = new CashReturn();
                break;
            case "打折" :
                cashSuper = new CashRebate();
                break;
            case "正常收费" :
                cashSuper = new CashNormal();
                break;
            default:
                break;
        }
        cashSuper.algorithmInterface();
    }
}
