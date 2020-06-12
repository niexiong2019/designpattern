package com.springboot.designpattern.proxy.dynamic;

import javax.sound.midi.Soundbank;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {
    private Object target;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("开启事务......");
        result = method.invoke(target, args);
        System.out.println("关闭事务......");
        return result;
    }
    public void setTarget(Object target) {
        this.target = target;
    }
}
