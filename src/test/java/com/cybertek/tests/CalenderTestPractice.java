package com.cybertek.tests;

import com.cybertek.tests.day17_upload_js_executor.JavaScriptExecutor;
import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CalenderTestPractice extends  TestBase {

  @Test
          public void test(){



        driver.get("https://www.makemytrip.com/");
            driver.manage().window().maximize();

            driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();



        }
    }






