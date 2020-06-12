package com.springboot.designpattern.proxy.dynamic;

public class TargetServiceImp implements TargetService {
    @Override
    public void tagetMethod() {
        System.out.println("执行业务方法");
    }
}
