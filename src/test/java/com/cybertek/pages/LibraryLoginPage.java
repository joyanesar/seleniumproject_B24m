package com.cybertek.pages;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.Driver;
import jdk.jfr.Frequency;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {
    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="inputEmail")
    public WebElement email;
    @FindBy(id ="inputPassword")
    public WebElement password;
    @FindBy(xpath="//button")  //button[.='Sign in']")
    public WebElement signInBtn;
    @FindBy(xpath ="//dive[@class='alert alert-danger']")
    public WebElement errorMsg;

    @FindBy(id ="user_count" )
    public WebElement user;



}
