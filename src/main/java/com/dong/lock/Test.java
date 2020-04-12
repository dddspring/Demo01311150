package com.dong.lock;

import org.openjdk.jol.info.ClassLayout;

public class Test {
    static L l = new L();
    public static void main(String[] args) {
        //lockTest();
        System.out.println(ClassLayout.parseInstance(l).toPrintable());


    }

    public static void lockTest(){
        synchronized (l){
            System.out.println("pppppppp");
            System.out.println("mmmmmmmmmmmmmm");

        }
    }

}
