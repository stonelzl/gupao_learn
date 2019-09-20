package com.example.demo.simple;

import java.util.ArrayList;

/**
 * Created By stone on 2019/9/20 13:42
 */
public class PrototypeTest {
    public static void main(String[] args) {
        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        concretePrototype.setAge(18);
        concretePrototype.setName("张三");
        concretePrototype.setHobbies(new ArrayList());
        Client client = new Client();
        ConcretePrototypeA concretePrototypeClone = (ConcretePrototypeA) client.startClone(concretePrototype);
        System.out.println(concretePrototypeClone);
        System.out.println("克隆对象中的引用类型地址值：" + concretePrototypeClone.getHobbies());
        System.out.println("原对象中的引用类型地址值：" + concretePrototype.getHobbies());
        System.out.println("对象地址比较："+(concretePrototypeClone.getHobbies() ==
                concretePrototype.getHobbies()));
    }
}
