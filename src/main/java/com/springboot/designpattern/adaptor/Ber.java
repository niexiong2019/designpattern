package com.springboot.designpattern.adaptor;

public class Ber implements B {
    @Override
    public void b() {
        System.out.println("B的方法执行");
    }
}
