package com.cybertek.tests;

import com.cybertek.pages.BasePage;
import com.cybertek.utils.ConfigurationReader;
import com.cybertek.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Web extends TestBase{
    WebDriver driver;
    @Test
    public void getAllLinks(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

}
