package com.example.demo.test;

/**
 * Created By stone on 2019/9/29 10:10
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;
    public PromotionActivity(PromotionStrategy promotionStrategy){
        this.promotionStrategy = promotionStrategy;
    }
    public void execute(){
        promotionStrategy.doPromotion();
    }
}
