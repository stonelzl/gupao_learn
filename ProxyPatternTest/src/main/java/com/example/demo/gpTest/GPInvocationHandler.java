package com.example.demo.gpTest;

import java.lang.reflect.Method;

/**
 * Created By stone on 2019/9/24 13:52
 */
public interface GPInvocationHandler {
    public Object invoke(Object proxy, Method method,Object[] args) throws Throwable;
}
