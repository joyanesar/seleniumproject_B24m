package com.cybertek.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
WebDriverFactory class:
is used to create WebDriver(Selenium) object and return it.
  It will open the browser and maximize it
method:
    getDriver(String browserType)
    it will check browser type and returns object;
        if browserType is "chrome"
            it will set up chrome driver and return new ChromeDriver
          if browser is "firefox"
          it will set up firefox driver and return new firefox

          ex:
          WebDriver driver = webDriverFactory.getDriver("chrome")
 */
public class WebDriverFactory {
   public static WebDriver getDriver(String browserType){
       if(browserType.equals("chrome")){
           WebDriverManager.chromedriver().setup();
           return  new ChromeDriver();

       }else if(browserType.equals("firefox")){
           WebDriverManager.firefoxdriver().setup();
           return new FirefoxDriver();
       }else {
           System.out.println("Invalid browserType = " + browserType);
           return null;
       }




    }
}
