package com.example.demo.dynamicproxyApplication;

import com.example.demo.application.IOrderService;
import com.example.demo.application.Order;
import com.example.demo.application.OrderService;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created By stone on 2019/9/23 13:59
 */
public class Test {
    public static void main(String[] args) {
        try {
            Order order = new Order();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2018/02/01");
            order.setCreateTime(date.getTime());
            IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderService());
            orderService.createOrder(order);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
