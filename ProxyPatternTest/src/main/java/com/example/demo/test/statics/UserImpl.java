package com.example.demo.test.statics;

/**
 * Created By stone on 2019/9/23 10:39
 */
public class UserImpl implements  UserInterface{
    @Override
    public void service(String s) {
        System.out.println("我是"+s);
    }
}
