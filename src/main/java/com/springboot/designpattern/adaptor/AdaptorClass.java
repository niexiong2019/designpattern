package com.springboot.designpattern.adaptor;

public class AdaptorClass implements A {
    private B b;
    public void setB(B b) {
        this.b = b;
    }
    public AdaptorClass(B b) {
        this.b = b;
    }
    @Override
    public void a() {
        //1.类适配器，通过继承调用
        //b();
        //2.对象适配器，通过实例变量调用
        b.b();
    }
}
