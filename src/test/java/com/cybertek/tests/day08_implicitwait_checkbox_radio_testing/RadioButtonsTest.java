package com.cybertek.tests.day08_implicitwait_checkbox_radio_testing;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioButtonsTest {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://practice.cybertekschool.com/radio_buttons";
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //This will wait upto 10 seconds while finding element
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);

        WebElement red = driver.findElement(By.id("red"));
        if(!red.isSelected())
            red.click();

        WebElement Hockey = driver.findElement(By.id("hockey"));
        if(!Hockey.isSelected()) {
            Hockey.click();
        }else {
            System.out.println("Go Home!");
        }

        // verify if hockey option is selected
        if(Hockey.isSelected()){
            System.out.println("Pass verification!");
        }else {
            System.out.println("Fail - Verification");
        }

        //find all radio buttons
        //print the count
        //click one by one , waiting 1 second in between
        // we can use isEnabled method to check if element is active/ disabled
        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println("count " + radioButtons.size());

        for(WebElement radio : radioButtons){
            radio.click();

            Thread.sleep(1234);
        }


        //driver.quit();


    }
}
