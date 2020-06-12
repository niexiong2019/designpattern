package com.springboot.designpattern.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyInteceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("--------------begin-----------");
        Object result = methodProxy.invokeSuper(o, args);
        System.out.println("--------------end-----------");
        return result;
    }
}
