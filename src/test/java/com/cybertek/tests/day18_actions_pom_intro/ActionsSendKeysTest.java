package com.cybertek.tests.day18_actions_pom_intro;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.BrowserUtils;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ActionsSendKeysTest extends TestBase {
    @Test
    public void scrollWithKeysTest(){
        driver.get(ConfigurationReader.getProperty("practice.base.url"));
        //driver.get(ConfigurationReader.getProperty("practice.base.url") + "/hover");
        WebElement cbSchoolLink = driver.findElement(By.linkText("Cybertek School"));
        actions.moveToElement(cbSchoolLink).perform();

        BrowserUtils.sleep(1);
        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP,Keys.PAGE_UP).perform();
        BrowserUtils.sleep(3);
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();

    }
    @Test
    public void rightClickTest(){
        driver.get(ConfigurationReader.getProperty("practice.base.url"));
        BrowserUtils.sleep(2);
        WebElement ab = driver.findElement(By.linkText("A/B Testing"));

        actions.contextClick(ab).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

    }



}
