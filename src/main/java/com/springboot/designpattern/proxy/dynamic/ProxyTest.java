package com.springboot.designpattern.proxy.dynamic;

    public class ProxyTest {
        public static void main(String[] args) {
            TargetService service = new TargetServiceImp();
            //根据目标对象，生成代理对象
            TargetService proxy = (TargetService)ProxyFactory.getProxy(service);
            proxy.tagetMethod();
        }
    }
