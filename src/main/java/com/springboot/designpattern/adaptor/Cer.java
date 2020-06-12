package com.springboot.designpattern.adaptor;

public class Cer extends AdaptorInterface {
    @Override
    public void c1() {
        super.c1();
        System.out.println("调用C1");
    }
    @Override
    public void c2() {
        super.c2();
        System.out.println("调用C2");
    }
}
