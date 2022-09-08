package com.cybertek.tests.LibraryTask;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import com.cybertek.utils.LibraryUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LibraryVerification extends TestBase {

    @Test
    public void verificationLogin() {
        driver.get(ConfigurationReader.getProperty("library.url"));
        Assert.assertEquals(driver.getTitle(), "Login - Library");

        LibraryUtilities.loginToLibrary(driver);
        //printOuAllLinks
        WebElement l = driver.findElement(By.tagName("a"));
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Link list = " + links.size());

        for (WebElement eachLink : links) {
            System.out.println("Link  = " + eachLink.getText());
        }


    }



}




