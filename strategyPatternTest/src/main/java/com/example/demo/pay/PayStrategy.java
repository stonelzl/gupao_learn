package com.example.demo.pay;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By stone on 2019/9/29 13:47
 */
class PayStrategy {
    static final String ALI_PAY = "AliPay";
    private static final String JD_PAY = "JDPay";
    private static final String UNION_PAY = "UnionPay";
    private static final String WECHAT_PAY = "WechatPay";
    static final String DEFAULT_PAY = ALI_PAY;
    private static Map<String,Payment> payStrategy = new HashMap<>();
    static {
        payStrategy.put(ALI_PAY,new AliPay());
        payStrategy.put(JD_PAY,new JDPay());
        payStrategy.put(UNION_PAY,new UnionPay());
        payStrategy.put(WECHAT_PAY,new WechatPay());
    }
    static Payment get(String payKey){
        if(!payStrategy.containsKey(payKey)){
            return payStrategy.get(DEFAULT_PAY);
        }
        return payStrategy.get(payKey);
    }
}
