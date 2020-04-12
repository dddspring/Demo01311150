package com.dong.Aop;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
// DongBeanFactoryProcessor 生效，即DongBeanPostProcessor也会注册到BeanDefinition中
public class DongBeanFactoryProcessor implements ImportBeanDefinitionRegistrar {



    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        BeanDefinitionBuilder build = BeanDefinitionBuilder.genericBeanDefinition(DongBeanPostProcessor.class);
        beanDefinitionRegistry.registerBeanDefinition("xxx",build.getBeanDefinition());


    }
}
