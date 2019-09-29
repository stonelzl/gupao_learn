package com.example.demo.pay;

/**
 * Created By stone on 2019/9/29 13:41
 */
public class JDPay extends Payment {
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
