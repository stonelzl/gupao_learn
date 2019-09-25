package com.example.demo.test.statics;

/**
 * Created By stone on 2019/9/23 10:48
 */
public class ProxyTest {
    public static void main(String[] args) {
        UserImpl user = new UserImpl();
        UserProxy userProxy = new UserProxy(user);
        userProxy.service("雷泽林");
    }
}
