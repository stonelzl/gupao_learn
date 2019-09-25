package com.example.demo.gpTest;

import com.example.demo.dynamicproxy.Customer;
import com.example.demo.stastic.Person;

/**
 * Created By stone on 2019/9/24 14:44
 */
public class Test {
    public static void main(String[] args) {
        try {
            Person obj = (Person)new GPMeipo().getInstance(new Customer());
            System.out.println(obj.getClass());
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
