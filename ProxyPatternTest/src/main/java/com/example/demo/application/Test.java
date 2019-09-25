package com.example.demo.application;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created By stone on 2019/9/23 13:25
 */
public class Test {
    public static void main(String[] args) {
        try {
            Order order = new Order();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2017/02/01");
            order.setCreateTime(date.getTime());
            IOrderService proxy = new OrderServiceSaticProxy(new OrderService());
            proxy.createOrder(order);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
