package com.cybertek.tests.Task2;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword_CSS_Test {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        String url =  "http://practice.cybertekschool.com/forgot_password";

        driver.get(url);

        Thread.sleep(3000);

        WebElement emailField = driver.findElement(By.cssSelector("input[name='email']"));
        emailField.sendKeys("student1@gmail.com");
        Thread.sleep(1000);

        emailField.clear();

        emailField.sendKeys("student2@gmail.com");

        // loop
        for(int i = 3; i < 10 ; i++){
            Thread.sleep(1000);

            emailField.clear();
            emailField.sendKeys("student " + i + " @gmail.com");
        }


        driver.quit();

    }
}
