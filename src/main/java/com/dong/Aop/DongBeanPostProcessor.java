package com.dong.Aop;

import com.dong.service.Index;
import com.dong.service.IndexService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

// 自定义后置处理器
// spring中的Aop就是通过类似的处理器进行实现的
// 类似于源码
//@Component
public class DongBeanPostProcessor  implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {

        if(s.equals("indexService")){
            Class[] dd = new Class[]{Index.class};
            return Proxy.newProxyInstance(DongBeanPostProcessor.class.getClassLoader(),dd,new DongycHandler(o));
        }
        return o;
    }
}
