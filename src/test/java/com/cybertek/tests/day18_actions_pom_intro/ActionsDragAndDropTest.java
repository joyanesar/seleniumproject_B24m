package com.cybertek.tests.day18_actions_pom_intro;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.BrowserUtils;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ActionsDragAndDropTest extends TestBase {
    @Test
    public void dragAndDropTest() {

        driver.get(ConfigurationReader.getProperty("dragadndrop.url"));

        WebElement five = driver.findElement(By.linkText("5000"));
        WebElement drop = driver.findElement(By.id("amt7"));
        BrowserUtils.sleep(3);
        actions.dragAndDrop(five,drop).perform();

        //act.dragAndDrop(From, To).build().perform();


    }



    }
