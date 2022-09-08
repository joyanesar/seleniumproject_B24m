package com.cybertek.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BrowserUtils {
    /*
    this method is used to pause the code for given seconds
    it is static method so we can call
    browserUtils.sleep(5)
     */
    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("Exception happened in sleep method");
        }

    }
    public static void scrollDown(int pixels ){  // we creat method to call every time while we need for scrolling page in our web page
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,"+ pixels+")");
    }
}
