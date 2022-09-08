package com.cybertek.tests.day05_xpath_css_isdisplayed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_ForgotPassword {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager .chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url =("http://practice.cybertekschool.com/forgot_password");
        driver.get(url);
        WebElement emailField = driver. findElement (By.name("email"));
        emailField.sendKeys("joh20@yahoo.com");
        WebElement retrievePasswordBtn = driver.findElement(By.id("form_submit"));
        retrievePasswordBtn.click();

        String currentUrl = driver.getCurrentUrl(); // its shows url

       if(currentUrl.contains("email_sent")){
           System.out.println("Pass : email_sent url verified");
       }else {
           System.out.println("Fail : email_sent url");
       }

        //Verify Your e-mail's been sent!

        WebElement massage = driver.findElement(By.name("confirmation_message"));
        System.out.println("Massage displayed = " + massage.getText());
        Thread.sleep(2000);
        String expMassage = "Your e-mail's been sent!";
        String actMassage = massage.getText();

        if(actMassage.equals(expMassage)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
        //To read the attribute value  we use this method
        System.out.println("Name attribute value of massage element = " + massage.getAttribute("name"));
        driver.quit();

    }
}
