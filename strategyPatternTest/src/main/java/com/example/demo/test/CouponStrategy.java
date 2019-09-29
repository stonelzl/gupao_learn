package com.example.demo.test;

/**
 * Created By stone on 2019/9/29 10:03
 * 优惠券
 */
public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券,课程的价格直接减优惠券面值抵扣");
    }
}
