package com.cybertek.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankTC1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        String appUrl = "https://zero.webappsecurity.com/login.html";
        driver.get(appUrl);

        //Verify header text
        System.out.println("Header text = " + driver.findElement(By.tagName("h3")).getText());

        String header = driver.findElement(By.tagName("h3")).getText();
        System.out.println("header = " + header);

        String expHeader = "Log in to ZeroBank";
        if(header.equals(expHeader)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed ");
        }



        Thread.sleep(2000);
        driver.quit();



    }
}
