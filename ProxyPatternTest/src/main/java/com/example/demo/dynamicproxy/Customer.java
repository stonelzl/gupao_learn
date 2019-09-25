package com.example.demo.dynamicproxy;

import com.example.demo.stastic.Person;

/**
 * Created By stone on 2019/9/23 13:43
 */
public class Customer implements Person {

    @Override
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高 180cm");
        System.out.println("胸大，6 块腹肌");
    }
}
