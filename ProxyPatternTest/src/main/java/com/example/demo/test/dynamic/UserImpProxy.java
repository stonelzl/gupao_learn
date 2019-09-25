package com.example.demo.test.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created By stone on 2019/9/23 10:52
 */
public class UserImpProxy implements InvocationHandler {

    private User user;
    public UserImpProxy (User user){
        this.user = user;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        Object result;
        if("code".equals(methodName)){
            System.out.println("讨论需求");
            result = method.invoke(user,args);
            System.out.println("提交测试");
        }else if("sleep".equals(methodName)){
            System.out.println("洗澡");
            result = method.invoke(user,args);
        }else {
            result = method.invoke(user, args);
        }
        return result;
    }
}
