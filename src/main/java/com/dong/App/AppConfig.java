package com.dong.App;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.dong.Aop.DongBeanFactoryProcessor;
import com.dong.Aop.EnableAop;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
@ComponentScan("com.dong")
@EnableAop
//@EnableAspectJAutoProxy
public abstract class AppConfig implements WebMvcConfigurer {
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> list) {
        list.add(new FastJsonHttpMessageConverter());

    }
}
