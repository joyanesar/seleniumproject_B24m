package com.cybertek.tests.day15_properties_driverUtil_testbase;

import org.testng.annotations.Test;

public class SystemPropertiesTest {
    @Test
    public void readingSystemProperties(){
        //Windows 10
        System.out.println("Os name = " + System.getProperty("os.name")); // os stand for operating system

        System.out.println("User name = " + System.getProperty("user.name"));
        System.out.println("User dir = " + System.getProperty("user.dir"));
        System.out.println("Pom.Xml = " + System.getProperty("user.dir")+"/pom.xml");
        System.out.println("User.home = " + System.getProperty("user.home"));
        System.out.println("Java.home = " + System.getProperty("java.home"));
        System.out.println("Java.version = " + System.getProperty("java.version"));
    }
}
