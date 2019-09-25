package com.example.demo.test.dynamic;

/**
 * Created By stone on 2019/9/23 10:52
 */
public class UserImpl implements User {
    @Override
    public void code() {
        System.out.println("开始敲代码");
    }

    @Override
    public void sleep() {
        System.out.println("开始睡觉");
    }
}
