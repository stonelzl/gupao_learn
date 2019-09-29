package com.example.demo.pay;

/**
 * Created By stone on 2019/9/29 13:37
 * 支付宝
 */
public class AliPay extends Payment {

    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid) {
        return 900;
    }
}
