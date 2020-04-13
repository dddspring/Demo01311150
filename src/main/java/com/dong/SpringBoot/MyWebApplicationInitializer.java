package com.dong.SpringBoot;

import com.dong.App.AppConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;
// springboot项目启动从main函数开始，web项目是tomcat
// 项目作用：springmvc  到springboot转换
// springboot 如何注册一个servlet
public class MyWebApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletCxt) {
        // （tomcat，jetty注册一个servlet，会拦截所有请求）
        // servletCxt 类似于tomcat入口
        // Load Spring web application configuration
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        // 3 扫码dao层
        ac.register(AppConfig.class);
        ac.refresh();
        // 1上面是init  spring

        // 2下面是注册一个servlet
        // Create and register the DispatcherServlet
        DispatcherServlet servlet = new DispatcherServlet(ac);
        ServletRegistration.Dynamic registration = servletCxt.addServlet("app", servlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/app/*");
    }
}