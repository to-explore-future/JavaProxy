package com.zq.dynamicProxy;

import com.zq.Skills;
import com.zq.Me;

import java.lang.reflect.Proxy;

public class DynamicProxyDemo {

    public void DynamicProxyTest() {

        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(new Me());
        Skills skills = (Skills) Proxy.newProxyInstance(Me.class.getClassLoader(), Me.class.getInterfaces(), myInvocationHandler);
        skills.code();
    }
}
