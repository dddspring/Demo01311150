package com.dong.mapper;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;
import com.dong.service.UserService;

import javax.annotation.PostConstruct;

/**
 * 通过额外的借口BeanFactoryPostProcessor做中扩展件
 * 生成一个bean
 * A类 -->BeanDefintion借口 -->生成bean
 */
@Component
public class DongBeanFactoryPostprocessor implements BeanFactoryPostProcessor {
    @Override
    @PostConstruct
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

        /*GenericBeanDefinition bd = (GenericBeanDefinition) configurableListableBeanFactory.getBeanDefinition("indexService");
        bd.setBeanClass(UserService.class);*/

        /**
         * 3修改循环依赖为false
         */
        /*AbstractAutowireCapableBeanFactory ac = (AbstractAutowireCapableBeanFactory) configurableListableBeanFactory;
        ac.setAllowCircularReferences(false);*/
    }
}
