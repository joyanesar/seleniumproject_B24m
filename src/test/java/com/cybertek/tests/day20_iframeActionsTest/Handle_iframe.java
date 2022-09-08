package com.cybertek.tests.day20_iframeActionsTest;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.BrowserUtils;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.ConcurrentModificationException;
/*
Test Case for Practice:
//1. Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
//2. Switch to iframe.
//3. Double click on the text “Double-click me to change my text color.”
//4. Assert: Text’s “style” attribute value contains “red”.
 */

public class Handle_iframe extends TestBase {
    @Test
    public void handlingIframe(){

        driver.get(ConfigurationReader.getProperty("doubleclick.url"));

        //let's switch to iframe
        driver.switchTo().frame("iframeResult");

        WebElement textForDoubleClick = driver.findElement(By.id("demo"));
        BrowserUtils.sleep(1);
        actions.doubleClick(textForDoubleClick).perform();
        BrowserUtils.sleep(1);
        String expectedStyle = "red";
        String actualStyle = textForDoubleClick.getAttribute("style");
        assertTrue(actualStyle.contains(expectedStyle));




    }

}
