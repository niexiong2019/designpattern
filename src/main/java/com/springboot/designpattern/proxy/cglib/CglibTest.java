package com.springboot.designpattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

public class CglibTest {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TargetService.class);
        enhancer.setCallback(new ProxyInteceptor());
        TargetService proxyService = (TargetService) enhancer.create();
        proxyService.targetMethod();
    }
}