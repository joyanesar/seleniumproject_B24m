package com.cybertek.tests.day23_fluentwait_tesing_overview;

import com.cybertek.pages.BasePage;
import com.cybertek.pages.EdmundsCarDetailsPage;
import com.cybertek.pages.EdmundsHomePage;
import com.cybertek.pages.EdmundsNewCarPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utils.BrowserUtils;
import com.cybertek.utils.ConfigurationReader;
import org.testng.annotations.Test;

public class EdmundsNewCarSearchTest extends TestBase {
    @Test
    public void searchForNewCarTest() {
        driver.get(ConfigurationReader.getProperty("edmunds.url"));

        EdmundsHomePage homePage = new EdmundsHomePage();
        homePage.isCurrentPage();
        homePage.goToNewCarPricingPage();

        EdmundsNewCarPage newCarPage = new EdmundsNewCarPage();

        newCarPage.selectMake("Audi");
        newCarPage.selectModel("Q5");
        newCarPage.zip.clear();
        BrowserUtils.sleep(1);
        newCarPage.zip.sendKeys("12189");
        newCarPage.go.click();


        EdmundsCarDetailsPage detailsPage = new EdmundsCarDetailsPage();
        detailsPage.isCurrentPage();
        System.out.println("Msrp Range  = " + detailsPage.msrpRange.getText());




    }
}
