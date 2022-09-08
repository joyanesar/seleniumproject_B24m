package com.cybertek.WeeklyAssignments;

import com.cybertek.pages.Library;
import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Librarian_Test_Case extends TestBase {

    @Test
    public void librarianAddingNewUserTest(){

    driver.get(ConfigurationReader.getProperty("librarian.url"));
        Library libraryLoginPage = new Library();
        libraryLoginPage.email.sendKeys("librarian20@library");
        libraryLoginPage.password.sendKeys("Sdet2022*");
        libraryLoginPage.signIn.click();
        libraryLoginPage.users.click();
        libraryLoginPage.addUser.click();
        libraryLoginPage.fullName.sendKeys(faker.name().fullName());
        libraryLoginPage.getEmail.sendKeys(faker.internet().emailAddress());
        libraryLoginPage.getPassword.sendKeys(faker.internet().password());
        //libraryLoginPage.selectUserGroup("Librarain");
        libraryLoginPage.getStatus("ACTIVE");

        libraryLoginPage.saveChanges.click();






    }


}
