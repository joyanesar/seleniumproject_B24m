package com.cybertek.tests.day11_alerts_iframe_windows;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWindows_Example_Test {
    String url = "http://practice.cybertekschool.com/windows";
    String demoQaUrl = "https://demoqa.com/browser-windows";
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);


    }
    @Test
    public void windowsTest(){
        String windowsHandleID = driver.getWindowHandle();
        System.out.println("windows = " + windowsHandleID);
        //click on new window link
        WebElement newWindow = driver.findElement(By.xpath("//*[.='Click Here']"));
        newWindow.click();

        Set<String>windowsHandles = driver.getWindowHandles();
        System.out.println("Count of windows = " + windowsHandles.size());
        //print all windows
        System.out.println("WindowsHandles = " + windowsHandles);

        //Loop and switch to a different window
        for(String windowHandle : windowsHandles){
            driver.switchTo().window(windowHandle);
            System.out.println("Current window title = " + driver.getTitle());
        }
        WebElement h3Elem = driver.findElement(By.xpath("//h3[.='New Window']"));  //first approach
        WebElement h3Elem1 = driver.findElement(By.xpath("//h3"));  // second approach
        System.out.println("h3 header text on new page = " + h3Elem.getText());

        //go back to main window/ parent window
        driver.switchTo().window(windowsHandleID);
        System.out.println("Title after switching back to main window = " + driver.getTitle());

    }
    @Test
    public void demoQAMultipleWindows(){
       driver.get(demoQaUrl);
       WebElement newTap = driver.findElement(By.id("tabButton"));
       WebElement newWindow = driver.findElement(By.id("windowButton"));
       WebElement newWindowText = driver.findElement(By.id("messageWindowButton"));

       newTap.click();
       newWindow.click();
       newWindowText.click();
        System.out.println("Title of main/parent page = " + driver.getTitle());

        //Store parent window handle id in a variable
        String parentWindowHandle = driver.getWindowHandle();
       // System.out.println("parent windowHandle = " + parentWindowHandle);

        // store all window handle ids in a to a set
        Set<String>allWindowHandles = driver.getWindowHandles();
        System.out.println("Total window count = " + allWindowHandles.size());

        //loop


;
        allWindowHandles.forEach(window -> {
            System.out.println("Switching to " + window);
            driver.switchTo().window(window);

        });

            driver.quit();

        }

    }













