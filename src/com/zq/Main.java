package com.zq;

import com.zq.dynamicProxy.DynamicProxyDemo;
import com.zq.staticProxy.StaticProxyDemo;

public class Main {

    public static void main(String[] args) {
        //静态代理模式测试
        StaticProxyDemo.test();

        //动态代理
        DynamicProxyDemo dynamicProxyDemo = new DynamicProxyDemo();
        dynamicProxyDemo.DynamicProxyTest();

    }
}
