package com.cybertek.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankTC2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String appUrl ="https://zero.webappsecurity.com/login.html";
        driver.get(appUrl);

        //Verify link text from top lef;
        String textOfLink = driver.findElement(By.className("brand")).getText();
        System.out.println("textOfLink " + textOfLink);


        if(textOfLink.equals("Zero Bank")){
            System.out.println("pass");
        }else {
            System.out.println("Fail");
        }
        String href= driver.findElement(By.className("brand")).getAttribute("href");// this line print the link
        System.out.println("href " + href); // print here

        driver.quit();

    }
}
