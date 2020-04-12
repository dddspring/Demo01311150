package com.dong.web;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class SpringApplication {
    public static void main(String[] args) {

        try {
            Tomcat t = new Tomcat();
            t.setPort(56666);
            t.addWebapp("/","d:\\zx\\");
            t.start();
            t.getServer().await();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }


}
