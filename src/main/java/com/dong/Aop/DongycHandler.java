package com.dong.Aop;

import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// 模仿Aop

public class DongycHandler  implements InvocationHandler {
    Object o ;
    public  DongycHandler(Object o){
        this.o=o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("-----aop--------------");
        return method.invoke(o,args);
    }
}
