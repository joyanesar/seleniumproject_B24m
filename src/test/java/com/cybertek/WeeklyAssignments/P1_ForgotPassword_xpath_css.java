package com.cybertek.WeeklyAssignments;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_ForgotPassword_xpath_css {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        String url = "https://practice.cybertekschool.com/forgot_password";
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(2000);
        //<a class="nav-link" href="/">Home</a>
        WebElement homeLinks = driver.findElement(By.xpath("//a[@class='nav-link']"));

        WebElement forgotPassword = driver.findElement(By.xpath("//h2[.='Forgot password']"));

        WebElement emailLabel;
        WebElement emailField;
        WebElement retrievePasswordBtn;
        WebElement poweredByLabel;
        System.out.println("homeLinks " + homeLinks.isDisplayed());
        System.out.println("Forgot password " + forgotPassword.isDisplayed());

        driver.quit();
    }
}
