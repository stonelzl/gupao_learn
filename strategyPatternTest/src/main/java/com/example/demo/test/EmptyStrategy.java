package com.example.demo.test;

/**
 * Created By stone on 2019/9/29 10:07
 */
public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
