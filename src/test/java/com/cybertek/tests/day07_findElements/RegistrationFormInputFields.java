package com.cybertek.tests.day07_findElements;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegistrationFormInputFields {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://form.jotform.com/213106431512137";
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        Thread.sleep(200);
        driver.get(url);

        List<WebElement> inputFields = driver.findElements(By.cssSelector("input[type='text']"));

        System.out.println(inputFields.size());
        for(WebElement input : inputFields){
            if(input.isDisplayed())
            input.sendKeys("Wooden Spoon");
        }

        driver.quit();


    }
}
