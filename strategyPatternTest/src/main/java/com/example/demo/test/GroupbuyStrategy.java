package com.example.demo.test;

/**
 * Created By stone on 2019/9/29 10:07
 * 拼团
 */
public class GroupbuyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("拼团，满 20 人成团，全团享受团购价");
    }
}
