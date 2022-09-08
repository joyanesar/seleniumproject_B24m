package com.cybertek.tests.day12_Window_Practice;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DemoQAMultipleWindowsTest {

    String url = "https://demoqa.com/browser-windows";
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get(url);
    }
    //click on new window button switch to new window locate and print the message close the new window
    @Test
    public void newWindowTest(){
        WebElement newWindow = driver.findElement(By.cssSelector("#windowButton"));
        newWindow.click();
        // switching to new window
        Set<String> windowHandlesSet = driver.getWindowHandles();
        String parentWindowHandle = driver.getWindowHandle(); //store current window handle

        for(String windowHandle : windowHandlesSet) {
            if (!windowHandle.equals(parentWindowHandle)) {
                driver.switchTo().window(windowHandle);
            }

        }
        WebElement header = driver.findElement(By.cssSelector("#sampleHeading"));
        System.out.println("header text = " + header.getText()); // print window header

        driver.close();
        //go back to parent window
        driver.switchTo().window(parentWindowHandle);
        System.out.println("title = " + driver.getTitle());

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
