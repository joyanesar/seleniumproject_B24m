package com.cybertek.tests.Task2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookVerify {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        String url = ("https://www.facebook.com");
        driver.get(url);

        driver.manage().window().maximize();

//        driver.findElement(By.id("email")).sendKeys("joyanisar@gmail.com");
//        Thread.sleep(1000);
//        driver.findElement(By.id("pass")).sendKeys("afghan30");
//        Thread.sleep(1000);
//        driver.findElement(By.name("login")).click();
//        Thread.sleep(2000);

        String title = driver.getTitle();
        System.out.println("Title of facebook " + title);

        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTile = driver.getTitle();

        if(actualTile.equals(expectedTitle)){
            System.out.println("Test passed!");
        }else {
            System.out.println("Test failed!");
        }

//       if(driver.getTitle().equals(expectedTitle)){
//           System.out.println("pass");
//       }else {
//           System.out.println("not passed");
//       }
        System.out.println("Actual Title  " + driver.getTitle());
        driver.quit();

    }
}
