package com.cybertek.tests.Task2;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTitleVerify {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        String url = "https://www.facebook.com";
        String userName = "afdjakf";
        String password = "kakfja";

        driver.get(url);
        driver.findElement(By.id("email")).sendKeys(userName);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.name("login")).click();

        String actTitle = driver.getTitle();
        String expTitle = "Log into Facebook";

        Thread.sleep(2000);
        if(actTitle.equals(expTitle)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test failed");
        }
        System.out.println("Title " + url);

        driver.quit();
    }
}
