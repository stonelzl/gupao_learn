package com.example.demo.pay;

/**
 * Created By stone on 2019/9/29 14:09
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order("1","20180311001000009",324.45);
        order.pay(PayStrategy.ALI_PAY);
    }
}
