package com.example.demo.lazy;

/**
 * Created By stone on 2019/9/18 9:40
 */
public class ExectorThread implements Runnable {

    @Override
    public void run() {
        LazySimpleSingleton lazy = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+lazy);
    }
}
