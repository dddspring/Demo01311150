package com.dong;

import com.dong.App.AppConfig;
import com.dong.service.Index;
import com.dong.service.IndexService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.dong.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(AppConfig.class);
        c.getBean(Index.class).get();
        /**
         * 主要是spring初始化过程中，容器中allowCircularReferences属性默认为TRUE，所以支持循环依赖
         * 代码功能：取消spring默认支持循环依赖
         * 1修改源码
         * 2在bean初始化之前设置属性为false如下
         * 3扩展件implements BeanFactoryPostProcessor
         */
        /*AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext();
        AbstractAutowireCapableBeanFactory bf  = (AbstractAutowireCapableBeanFactory) c.getBeanFactory();
        bf.setAllowCircularReferences(false);
        c.register(AppConfig.class);
        c.refresh();*/
        //System.out.println();


        /**
         *@Autowired 注解是由AutowiredAnnotationBeanPostProcessor后置处理器解析
         * @Resource 注解是由CommonAnnotationBeanPostProcessor后置处理器解析
         */

    }
}
