package com.example.demo.deep;

import java.io.Serializable;

/**
 * Created By stone on 2019/9/20 13:49
 */
public class Jingubang implements Serializable {
    public float h = 100;
    public float d = 10;
    public void big(){
        this.h *= 2;
        this.d *= 2;
    }
    public void small(){
        this.h /= 2;
        this.d /= 2;
    }
}
