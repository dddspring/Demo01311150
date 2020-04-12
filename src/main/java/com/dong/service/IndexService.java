package com.dong.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component(value="indexService")
public class IndexService  implements Index{

    public IndexService(){
        System.out.println("我是IndexService");
    }

    @Override
    public void get() {
        System.out.println("jirjponjvdkznvdla");
    }
}
