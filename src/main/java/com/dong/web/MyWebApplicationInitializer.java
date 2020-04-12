package com.dong.web;

import com.dong.App.AppConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
//springmvc 注册一个servlet，如何手动编写其相同的功能

public class MyWebApplicationInitializer implements WebApplicationInitializer {



    // 3注册servlet
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println("---------------");
        // 1初始化spring环境
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        // 2读取一个xml
        ac.register(AppConfig.class);
        ac.refresh();


        DispatcherServlet dispatcherServlet = new DispatcherServlet(ac);
        ServletRegistration.Dynamic mvc = servletContext.addServlet("mvc", dispatcherServlet);
        mvc.setLoadOnStartup(1);
        mvc.addMapping("*.do");

    }
}
