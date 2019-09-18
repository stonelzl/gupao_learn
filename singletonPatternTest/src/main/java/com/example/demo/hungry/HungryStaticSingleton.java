package com.example.demo.hungry;

/**
 * Created By stone on 2019/9/18 9:15
 * 饿汉式静态单例
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton hungryStaticSingleton;
    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){}
    public HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }
}
