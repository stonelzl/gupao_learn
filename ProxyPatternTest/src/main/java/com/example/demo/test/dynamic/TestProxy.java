package com.example.demo.test.dynamic;

import java.lang.reflect.Proxy;

/**
 * Created By stone on 2019/9/23 11:00
 */
public class TestProxy {
    public static void main(String[] args) {

        UserImpl user = new UserImpl();
        UserImpProxy userImpProxy = new UserImpProxy(user);
        User u = (User) Proxy.newProxyInstance(user.getClass().getClassLoader(),user.getClass().getInterfaces(),userImpProxy);
        u.code();
        u.sleep();
    }
}
