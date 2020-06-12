package com.springboot.designpattern.adaptor;

public class AdaptorClassTest {
    public static void main(String[] args) {
        //1.类适配器
        //A a = new AdaptorClass();
        //a.a();

        //2.对象适配器
        A a = new AdaptorClass(new Ber());
        a.a();
    }
}
