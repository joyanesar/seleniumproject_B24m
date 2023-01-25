package com.cybertek.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class
BasicNavigation {
    public static void main(String[] args) throws InterruptedException {

        //1) set up the browser driver
        WebDriverManager.chromedriver().setup();   // this called method chaining

        //2) Open browser

        WebDriver driver = new  ChromeDriver();

        //Navigate to tesla homepage

        driver.get("https://www.tesla.com");

      //  driver.getTitle() returns the title value of the current page;
        //driver.get();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate(). refresh();

//        driver.navigate().back(); // go back to previous page
//        // pause the code
//        Thread.sleep(4000);
//        driver.navigate().forward();
//
//        Thread.sleep(2000);
//
//        //refresh the page
//        driver.navigate().refresh();
//
//        driver.navigate().to("https://www.etsy.com");
//
//        Thread.sleep(2000);
//        driver.navigate().back();
//
//        driver.navigate().to("https://www.tesla.com");



        driver.close(); //closes the browser



        /*
        go to left bottum corner and click on windows icon;
        type powershell then select first option then open
        type killall "Google Chrome
        click enter
         */




    }
}
