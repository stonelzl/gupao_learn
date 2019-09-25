package com.example.demo.stastic;

/**
 * Created By stone on 2019/9/23 13:01
 */
public class Father implements Person {
    private Son son;
    public Father(Son son){
        this.son = son;
    }
    @Override
    public void findLove() {
        System.out.println("父母物色对象");
        son.findLove();
        System.out.println("双方同意交往，确立关系");
    }
}
