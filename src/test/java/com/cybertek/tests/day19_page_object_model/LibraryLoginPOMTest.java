package com.cybertek.tests.day19_page_object_model;

import com.cybertek.pages.BookManagementPage;
import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import org.testng.Assert.*;
import org.testng.annotations.Test;

public class LibraryLoginPOMTest extends TestBase {
    @Test
    public void invalidCredentialsTest() {
        driver.get(ConfigurationReader.getProperty("lib.url"));
        LibraryLoginPage libraryLoginPage = new LibraryLoginPage();
        libraryLoginPage.email.sendKeys("librarian12@library");
        libraryLoginPage.password.sendKeys("AOYKYTMJ");
        libraryLoginPage.signInBtn.click();
        int count = Integer.parseInt(libraryLoginPage.user.getText());
        System.out.println(count);
        System.out.println(libraryLoginPage.user.getText());


        //Assert.assertTrue(libraryLoginPage.errorMsg.isDisplayed());

    }
    @Test
    public void positiveLoginTest() {
        driver.get(ConfigurationReader.getProperty("library.Url "));
        LibraryLoginPage loginPage = new LibraryLoginPage();

        loginPage.email.sendKeys(ConfigurationReader.getProperty("library3.student.email"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("library3.student.password"));
        loginPage.signInBtn.click();
        //BookManage management steps: verify is correct page , verify label is displayed
        BookManagementPage bookMg = new BookManagementPage();
        bookMg.bookManageHeader.isDisplayed();
        bookMg.isCurrentPage();
        System.out.println(bookMg.bookManageHeader.getText());




    }
}