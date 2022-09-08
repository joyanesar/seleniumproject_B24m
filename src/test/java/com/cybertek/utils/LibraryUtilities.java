package com.cybertek.utils;

import com.cybertek.tests.LibraryTask.LibraryVerification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LibraryUtilities  {

    public static void loginToLibrary (WebDriver driver){

             //userN
            driver.findElement(By.id("inputEmail")).sendKeys("student3366@library");
            //pass
            driver.findElement(By.id("inputPassword")).sendKeys("MU0rEdlK");
            //login
            driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']")).click();
        }

    }


