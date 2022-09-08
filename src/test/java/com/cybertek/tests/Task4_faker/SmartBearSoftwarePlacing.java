package com.cybertek.tests.Task4_faker;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SmartBearSoftwarePlacing extends SmartBearBase {
        Faker faker = new Faker();
    @Test
    public void linkVerification() {
        WebElement userName = driver.findElement(By.name("ctl00$MainContent$username"));
        userName.sendKeys("Tester");
        WebElement passWord = driver.findElement(By.name("ctl00$MainContent$password"));
        passWord.sendKeys("test");
        WebElement login = driver.findElement(By.name("ctl00$MainContent$login_button"));
        login.click();
        //orderBtn
        WebElement clickOrderButton = driver.findElement(By.xpath("//*[.='Order']")); clickOrderButton.click();
        //dropdown
        Select familyProduct = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        familyProduct.selectByValue("FamilyAlbum");
        WebElement quantity = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtQuantity']"));
        quantity.sendKeys("2");
        WebElement calculate = driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculate.click();
        //customerName
        WebElement customerName = driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName"));
        customerName.sendKeys(faker.name().firstName());
        WebElement street = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox2"));
        street.sendKeys(faker.address().streetName());
        WebElement city = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3"));
        city.sendKeys(faker.address().cityName());
        WebElement state = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox4"));
        state.sendKeys(faker.address().state());
        WebElement zip = driver.findElement(By.cssSelector("input[name='ctl00$MainContent$fmwOrder$TextBox5']"));
        zip.sendKeys(faker.number().digits(5));

        WebElement visaBtn = driver.findElement(By.xpath("//input[@value='Visa']"));
        visaBtn.click();
        WebElement cardNr = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox6']"));
        cardNr.sendKeys(faker.number().digits(16));
        WebElement expireDate = driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1"));
        expireDate.sendKeys("10/10/205");
        WebElement process = driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_InsertButton']"));
        process.click();
        //verifyMsg
        WebElement verify = driver.findElement(By.tagName("strong"));
        System.out.println("verify.getText() = " + verify.getText());




    }
}