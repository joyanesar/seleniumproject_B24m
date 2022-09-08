package com.cybertek.tests.day14_webtables_properties;

import com.cybertek.utils.SmartBearUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class SmartBearTest extends SmartBearTestBase{
    @Test
    public void verifyLinksAfterLogin(){
        // preform login
     SmartBearUtils.loginToSmartBear(driver);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Links counts = " + links.size());

        for(WebElement link : links){
            System.out.println("Link text = " + link.getText());
        }


    }
}
