package com.zq.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private Object targetObject;

    public MyInvocationHandler(Object targetObject) {
        this.targetObject = targetObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("在目标方法执行前进行预处理");
        Object invokeResult = method.invoke(targetObject, args);
        System.out.println("在目标方法执行后进行预处理");
        return invokeResult;
    }
}
