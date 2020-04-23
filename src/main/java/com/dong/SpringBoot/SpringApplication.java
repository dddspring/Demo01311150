package com.dong.SpringBoot;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class SpringApplication {
    public static void run() {

        try {
            Tomcat t = new Tomcat();
            t.setPort(56666);
            System.out.println("手Tomcat");
            //t.addContext("/","d:\\\\zx\\\\");
            // 只要有这个设置，tomcat默认为web项目
            t.addWebapp("/","d:\\zx\\");
            t.start();
            t.getServer().await();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }


}
