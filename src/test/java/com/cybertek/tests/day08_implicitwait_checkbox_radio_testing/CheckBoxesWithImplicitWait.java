package com.cybertek.tests.day08_implicitwait_checkbox_radio_testing;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CheckBoxesWithImplicitWait {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        String url = "http://practice.cybertekschool.com/checkboxes";
        //implicit wait command it comes from selenium library
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);

        // locate first checkBox using name  or id , xpath
        WebElement checkBox1 = driver.findElement(By.name("checkbox1"));
        checkBox1.click(); // first one check
        //checkBox1.click(); // second time uncheck

        WebElement checkBox2 = driver.findElement(By.xpath("//input[@id='box2']"));
        checkBox2.click();
        System.out.println("checkbox 1 is selected ? - " + checkBox1.isSelected());
        System.out.println("checkbox 1 is selected ? - " +  checkBox2.isSelected());

        if(!checkBox1 .isSelected() && !checkBox2 .isSelected ()){

            checkBox1.click();
            checkBox2.click();

        }else {
            System.out.println("Check box 1 is already selected");
        }

//       driver.quit();





    }

}
