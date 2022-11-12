package tests.ders18_testNGReports_paralelTesting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MyCoursedemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C04_SmokeTestRaporlu extends TestBaseRapor {

    MyCoursedemyPage myCoursedemyPage=new MyCoursedemyPage();


    // uc farkli test method'u ile yanlis bilgilerle giris yapilamadigini test edin
    @Test
    public void yanlisKullaniciTesti(){
        // Mycoursedemy anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        // 1- yanlis kullanici adi, gecerli password

        ReusableMethods.bekle(1);
        myCoursedemyPage.loginLinki.click();
        extentTest=extentReports.createTest("Yanlis kullanici adi","Yanlis Kullanici adi ile giris yapilamaz");
        myCoursedemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("myYanlisEmail"));
        extentTest.info("kullanici adi olarak yanlis email yazildi");
        myCoursedemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("myGecerliPassword"));
        extentTest.info("Password olarak gecerli passeord yazildi");
        ReusableMethods.bekle(3);
        ReusableMethods.bekle(1);
        // Login butonuna basarak login olmaya calisin
        myCoursedemyPage.loginButton.click();
        extentTest.info("Login butonuna basildi");
        // Basarili olarak giris yapilamadigini test edin
        //Bunun icin hala login linkinin gorunur oldugunu test edelim
        Assert.assertTrue(myCoursedemyPage.loginLinki.isEnabled());
        myCoursedemyPage.emailKutusu.clear();
        myCoursedemyPage.passwordKutusu.clear();
        extentTest.pass("Giris yapilamadigi test edildi");
    }
    @Test
    public void yanlisPasswordTesti(){
        // Mycoursedemy anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        extentTest=extentReports.createTest("Yanlis password adi","Yanlis Password adi ile giris yapilamaz");
        ReusableMethods.bekle(2);
        myCoursedemyPage.loginLinki.click();
        // 2- gecerli kullanici adi, yanlis password
        myCoursedemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("myGecerliEmail"));
        extentTest.info("Kullanici adi olarak gecerli email girildi");
        myCoursedemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("myYanlisPassword"));
        extentTest.info("Yanlis password yazildi");
        // Login butonuna basarak login olmaya calisin
        ReusableMethods.bekle(3);
        // Login butonuna basarak login olmaya calisin
        myCoursedemyPage.loginButton.click();
        extentTest.info("Login butonuna basildi");
        Assert.assertTrue(myCoursedemyPage.loginLinki.isEnabled());
        myCoursedemyPage.emailKutusu.clear();
        myCoursedemyPage.passwordKutusu.clear();
        extentTest.pass("Giris yapilamadigi test edildi");
    }
    @Test
    public void yanlisEmailTesti(){
        // Mycoursedemy anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        ReusableMethods.bekle(2);
        myCoursedemyPage.loginLinki.click();
        extentTest=extentReports.createTest("Yanlis kullanici adi ve password","Yanlis Kullanici adi ve Password ile giris yapilamaz");
        // 3- yanlis kullanici adi, yanlis password
        myCoursedemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("myYanlisEmail"));
        extentTest.info("kullanici adi olarak yanlis email yazildi");
        myCoursedemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("myYanlisPassword"));
        extentTest.info("Yanlis password yazildi");
        ReusableMethods.bekle(3);
        myCoursedemyPage.acceptCookies.click();
        ReusableMethods.bekle(3);

        myCoursedemyPage.loginButton.click();
        extentTest.info("Login butonuna basildi");
        Assert.assertTrue(myCoursedemyPage.loginLinki.isEnabled());
        myCoursedemyPage.emailKutusu.clear();
        myCoursedemyPage.passwordKutusu.clear();
        extentTest.pass("Giris yapilamadigi test edildi");
    }
}
