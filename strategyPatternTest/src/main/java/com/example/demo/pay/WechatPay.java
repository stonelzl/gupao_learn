package com.example.demo.pay;

/**
 * Created By stone on 2019/9/29 13:44
 */
public class WechatPay extends Payment {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 256;
    }
}
