package com.cybertek.tests.day19_page_object_model;

import com.cybertek.pages.PomTest;
import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import org.testng.annotations.Test;

public class logingPOMTest extends TestBase {

    @Test
    public void invalidTest(){
        driver.get(ConfigurationReader.getProperty("library.url"));

        PomTest login = new PomTest();

        login.email.sendKeys("nadir78@gmail.com");
        login.passWord.sendKeys("afghabn");
        login.SingInBtn.click();
    }
    @Test
    public void validTest(){
        driver.get(ConfigurationReader.getProperty("library.url"));

        PomTest log = new PomTest();

        log.email.sendKeys("library3.student.email");
        log.passWord.sendKeys("library3.student.password");
        log.SingInBtn.click();


        }
    }



