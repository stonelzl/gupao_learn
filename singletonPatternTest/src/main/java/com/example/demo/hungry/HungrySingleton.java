package com.example.demo.hungry;

/**
 * Created By stone on 2019/9/18 9:09
 * 饿汉单例
 * spring的IOC中的ApplicationContext
 */
public class HungrySingleton {
    //先静态后动态
    //先属性后方法
    //先上后下
    private static final HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton(){}

    public HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
