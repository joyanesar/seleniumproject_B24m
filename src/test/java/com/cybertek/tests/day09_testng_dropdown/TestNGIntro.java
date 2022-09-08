package com.cybertek.tests.day09_testng_dropdown;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGIntro {
    //How to write TestNG tests:
    // add dependency to pom.xml
    // Create a java class, like any other class.'
    // can be used by each test
    String url = "https://www.etsy.com";

    @BeforeClass // method with annotation runs before each test method
    public void setUp(){
        System.out.println("@BeforeClass setUp Method ..");
        System.out.println("Opened browser and navigating to " + url);
        System.out.println("===========================");
    }
    @BeforeMethod
    public void setUpApp(){
        System.out.println("@BeforeMethod setUpApp method is running ..");
        System.out.println("Navigating back to " + url);
        System.out.println("=======================");
    }
    @Test(priority = 1) //if we want to run this code first
    public void test1(){
        System.out.println("Running test1 ...");
        int num = 10;
        Assert.assertEquals(10,num);

    }

    @Test(priority = 2) // converts regular method to Test method

    public void myTest2(){
        System.out.println("Running my Test 2 ..");
        String name = "Bob";
        Assert.assertTrue(name.contains("b"));
        //Assert.assertTrue(name.contains("o"));

    }
    @AfterMethod // this will run after every each test

    public void tearDown(){
        System.out.println("@AfterMethod tearDown is running ...");
        System.out.println("====================================");

    }
    @AfterClass
    public void cleanUp(){
        System.out.println("@AfterClass cleanUp method is running ...");
        System.out.println("=========================================");
    }
}
