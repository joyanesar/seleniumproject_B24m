package com.cybertek.pages;

import com.cybertek.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertEquals;

public  class Library {

    public Library() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "inputEmail")
    public WebElement email;

    @FindBy(id = "inputPassword")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signIn;

    @FindBy(linkText = "Users")
    public WebElement users;

    @FindBy(partialLinkText = "Add User")
    public WebElement addUser;

    @FindBy(name = "full_name")
    public WebElement fullName;

    @FindBy(name = "email")
    public WebElement getEmail;

    @FindBy(name = "password")
    public WebElement getPassword;

    @FindBy(id = "user_group_id")
    public WebElement userGroup;

    @FindBy(id = "status")
    public WebElement status;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveChanges;

    public void selectUserGroup(String userG){

        Select user = new Select(userGroup);
        user.selectByVisibleText(userG);
    }

    public void getStatus(String st){
        Select stat = new Select(status);
        stat.selectByVisibleText(st);
    }



}
