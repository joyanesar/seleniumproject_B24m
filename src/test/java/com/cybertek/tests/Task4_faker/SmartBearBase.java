package com.cybertek.tests.Task4_faker;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class SmartBearBase {

        WebDriver driver;
        String url = "http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx";

        @BeforeMethod
        public void setUp() {
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get(url);
        }

        @AfterMethod
        public void tearDown() {
            driver.quit();

        }
    }