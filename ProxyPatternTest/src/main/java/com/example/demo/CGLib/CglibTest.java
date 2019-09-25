package com.example.demo.CGLib;

/**
 * Created By stone on 2019/9/25 10:48
 */
public class CglibTest {
    public static void main(String[] args) {
        try {
            Customer c = (Customer) new CglibMeipo().getInstance(Customer.class);
            c.findLove();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
