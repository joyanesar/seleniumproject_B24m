package com.cybertek.tests.day02_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAnd_Url_Source {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com");
        driver.get(driver.getCurrentUrl());
        System.out.println("Title:" + driver.getTitle());
        //Store the title into  a string variable
        String etsyTitle = driver.getTitle();
        System.out.println("etsyTitle = " + etsyTitle); // soutv
            // read the url of the current page
        System.out.println("Current url : " + driver.getCurrentUrl());
        // store the url int o a string variable current ulr
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
        //read page source and print it
        System.out.println("HTML page source: " + driver.getPageSource());

        //store the source code into a variable then print the char count
        String html = driver.getPageSource();
        //System.out.println("Count of html = " + html.length());

        driver.close();
        driver.quit();





    }
}
