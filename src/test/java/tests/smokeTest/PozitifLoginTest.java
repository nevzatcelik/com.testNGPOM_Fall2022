package tests.smokeTest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MyCoursedemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class PozitifLoginTest {



    @Test
    public void pozitifLoginTesti(){
        //Mycoursedemy anasasyfasina gidin

        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        // login linkine basin
        MyCoursedemyPage myCoursedemyPage=new MyCoursedemyPage();
        myCoursedemyPage.loginLinki.click();
        // Kullanici Email i olarak valid email girin
        myCoursedemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("myGecerliEmail"));
        ReusableMethods.bekle(2);
        // Kullanici sifresi olarak valid sifre girin
        myCoursedemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("myGecerliPassword"));
        ReusableMethods.bekle(2);
        // Login Butonuna Basarak Login olun
        myCoursedemyPage.loginButton.click();
        // Basarli olarak giris yapilabildigini test edin
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(myCoursedemyPage.coursesLinki.isDisplayed());
        softAssert.assertAll();

        Driver.closeDriver();
    }

}
