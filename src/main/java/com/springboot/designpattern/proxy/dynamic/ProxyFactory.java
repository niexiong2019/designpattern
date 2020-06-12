package com.springboot.designpattern.proxy.dynamic;

import java.lang.reflect.Proxy;

public abstract class ProxyFactory {
    public static Object getProxy(Object object){
        ProxyHandler proxyHandler = new ProxyHandler();
        proxyHandler.setTarget(object);
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),proxyHandler);
    }
}
