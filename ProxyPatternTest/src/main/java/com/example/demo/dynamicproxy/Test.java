package com.example.demo.dynamicproxy;

import com.example.demo.stastic.Person;

/**
 * Created By stone on 2019/9/23 13:44
 */
public class Test {
    public static void main(String[] args) {
        try {
            Person person = (Person) new JDKMeipo().getInstance(new Customer());
            person.findLove();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
