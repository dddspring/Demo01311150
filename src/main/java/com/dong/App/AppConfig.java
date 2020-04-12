package com.dong.App;

import com.dong.Aop.DongBeanFactoryProcessor;
import com.dong.Aop.EnableAop;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.dong")
@EnableAop
//@EnableAspectJAutoProxy
public class AppConfig {
}
