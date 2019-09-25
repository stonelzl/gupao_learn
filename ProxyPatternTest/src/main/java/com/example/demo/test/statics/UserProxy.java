package com.example.demo.test.statics;

/**
 * Created By stone on 2019/9/23 10:42
 */
public class UserProxy implements UserInterface {
    private UserInterface userImpl;
    public UserProxy(UserInterface userImpl){
        this.userImpl = userImpl;
    }
    @Override
    public void service(String s) {
        System.out.println("检查身份");
        userImpl.service(s);
        System.out.println("请进");
    }
}
