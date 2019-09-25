package com.example.demo.application;

/**
 * Created By stone on 2019/9/23 13:14
 */
public class OrderService implements IOrderService {
    private OrderDao orderDao;
    public OrderService(){
        orderDao = new OrderDao();
    }
    @Override
    public int createOrder(Order order) {
        System.out.println("OrderService 调用 orderDao 创建订单");
        return orderDao.insert(order);
    }
}
