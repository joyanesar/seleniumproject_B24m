package com.cybertek.pages;

import com.cybertek.tests.day03_locators_intro.FaceBookLogin;
import com.cybertek.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomTest {

    public PomTest(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "inputEmail")
    public WebElement email;
    @FindBy(id = "inputPassword")
    public WebElement passWord;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement SingInBtn ;

}
