package com.cybertek.pages;

import com.cybertek.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FaceBookSignUp {
    public FaceBookSignUp(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(name = "firstname")
   public WebElement fName;
    @FindBy(name = "lastname")
    public WebElement lastN;
    @FindBy(xpath = "//input[@aria-label='Mobile number or email']")
    public WebElement phoneNum;
    @FindBy(id = "password_step_input")
    public WebElement password;
    @FindBy(id = "month")
    public WebElement month;
    @FindBy(id = "day")
    public WebElement day;
    @FindBy(id = "year")
    public WebElement year;


    public void selectMonth(String monthOfYear){
        Select chooseMonth = new Select(month);
      chooseMonth.selectByValue(monthOfYear);

    }
      public void selectDay(String date) {
        Select chooseDay = new Select(day);
        chooseDay.selectByValue(date);
    }

    public void selectYear(String yearBirth) {
        Select chooseYear = new Select(year);
        chooseYear.selectByValue(yearBirth);
    }
    @FindBy(xpath = "//label[@class='_58mt']")
    public WebElement gender;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement clickSignUp;



}
