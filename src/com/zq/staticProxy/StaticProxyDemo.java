package com.zq.staticProxy;

import com.zq.Me;

public class StaticProxyDemo {

    public static void test(){
        Company adminServiceProxy = new Company(new Me());
        adminServiceProxy.code();

    }

}
