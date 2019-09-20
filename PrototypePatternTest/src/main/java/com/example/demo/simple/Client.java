package com.example.demo.simple;

/**
 * Created By stone on 2019/9/20 13:39
 */
public class Client {
    private Prototype prototype;
    public Prototype startClone(Prototype concretePrototype){
        return (Prototype)concretePrototype.clone();
    }
}
