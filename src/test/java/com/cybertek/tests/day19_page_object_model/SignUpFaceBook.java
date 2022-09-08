package com.cybertek.tests.day19_page_object_model;
import com.cybertek.pages.FaceBookSignUp;
import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SignUpFaceBook extends TestBase {

    @Test
    public void facebookSignUpNegativeTest(){
        driver.get(ConfigurationReader.getProperty("facebookSignUp.url"));
        FaceBookSignUp signUp = new FaceBookSignUp();
        Select month = new Select(signUp.month);
        Select day = new Select(signUp.day);
        Select year = new Select(signUp.year);

        signUp.fName.sendKeys(faker.name().firstName());
        signUp.lastN.sendKeys(faker.name().lastName());
        signUp.phoneNum.sendKeys(faker.phoneNumber().cellPhone()
                .replace(")","")
                .replace("(","")
                .replace(".","")
                .replace(" ","")
                .replace("0","")
                .replace("-",""));;
        signUp.password.sendKeys(faker.internet().password());








    }
}
