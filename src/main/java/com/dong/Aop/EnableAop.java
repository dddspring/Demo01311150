package com.dong.Aop;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
//自定义注解，类似于 @EnableAspectJAutoProxy
// 在启动时注册类AppConfig 加上 @EnableAop ，模拟真实的切面

@Retention(RetentionPolicy.RUNTIME)
@Import(DongBeanFactoryProcessor.class)
public @interface EnableAop {
}
