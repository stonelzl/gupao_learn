package com.example.demo.lazy;

/**
 * Created By stone on 2019/9/18 9:56
 * //此种方式兼顾饿汉模式的内存浪费  也兼顾了synchronized的性能问题
 */
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton(){}
    public static LazyInnerClassSingleton getInstance(){
        return LazyHolder.lazy;
    }
    private static class LazyHolder{
        private static final LazyInnerClassSingleton lazy = new LazyInnerClassSingleton();
    }
}
