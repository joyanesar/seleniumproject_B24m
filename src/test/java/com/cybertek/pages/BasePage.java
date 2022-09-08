package com.cybertek.pages;

import com.cybertek.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this class is parent class for all page object classes
 */
public abstract class BasePage {
    //Webdriver variable just in case any of children need
    protected WebDriver driver;

    @FindBy(xpath = "//img[@alt='Home']")
    public WebElement edmundsLogo;

    @FindBy(linkText = "New Car Pricing")
    public WebElement newCarPricingLink;
    public BasePage(){
        driver = Driver .getDriver();
        PageFactory.initElements(driver,this);
        // isCurrentPage(); // automatically checks if correct
    }

    public void goToNewCarPricingPage(){
        newCarPricingLink.click();
    }

    /**
     * abstract method to be implemented by child page object classess
     * This is to verify that we are at correct page.
     * Using title of the page ofr anything other
     */
    public abstract void isCurrentPage();


}
