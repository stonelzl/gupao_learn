package com.example.demo.pay;

/**
 * Created By stone on 2019/9/29 13:45
 */
public class UnionPay extends Payment {
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 128;
    }
}
