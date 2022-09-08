package com.cybertek.WeeklyAssignments;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class WebDriverFactoryTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");

        driver.close();

        WebDriver driver2  = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver2.get("https://www.google.com");

        driver.close();

        WebDriver driver3 = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver3.get("https://www.facebook.com");

        Thread.sleep(2000);
        driver.quit();





    }
}
