package com.cybertek.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5_SmartBearLoginTest {
    public static void main(String[] args) throws InterruptedException {

        String appUrl = "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx";
        String userName = "Tester";
        String password = "test";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(appUrl);
        Thread.sleep(2000);
        //Enter userName
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(userName);
        //Enter password
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
        // Click login button
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        //verify title is "web Orders"
        String expTitle = "Web Orders";
        String  actTitle = driver.getTitle();

        if(actTitle.equals(expTitle)){ // compare if both match or not
            System.out.println("Test Pass");
        }else {
            System.out.println("Test Failed");
        }

        //click logout link
        driver.findElement(By.linkText("Logout")).click();

        Thread.sleep(2000);
        //driver.quit();


    }
}
