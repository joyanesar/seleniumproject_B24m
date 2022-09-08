package com.cybertek.tests.day18_actions_pom_intro;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class classActionsDoubleClickTest extends TestBase {
    @Test
    public void doubleClickForColorChange() {

         driver.get(ConfigurationReader.getProperty("doubleclick.url"));
        driver.switchTo().frame("iframeResult");
        WebElement doubleClick = driver.findElement(By.id("demo"));
        actions.doubleClick(doubleClick).perform();
        //double click and print color
        actions.sendKeys(doubleClick.getText());
       //print color
        System.out.println(doubleClick.getAttribute("style"));
        System.out.println(doubleClick.getAttribute("background"));

    }
}
