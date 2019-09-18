package com.example.demo.threadLocal;

/**
 * Created By stone on 2019/9/18 11:14
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalSingleton = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };
    private ThreadLocalSingleton(){}
    public ThreadLocalSingleton getInstance(){
        return threadLocalSingleton.get();
    }
}
