package com.example.demo.test;

/**
 * Created By stone on 2019/9/29 10:04
 * 返现活动
 */
public class CashbackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销,返回的金额转到支付宝账号");
    }
}
