package tests.smokeTest;

import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MyCoursedemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class NegatifLoginTesti {
    MyCoursedemyPage myCoursedemyPage=new MyCoursedemyPage();
    @BeforeClass
    public void setUp(){
        // Mycoursedemy anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        // login linkine basin
        myCoursedemyPage.loginLinki.click();
    }
    // uc farkli test method'u ile yanlis bilgilerle giris yapilamadigini test edin
    @Test
    public void yanlisKullaniciTesti(){
        // 1- yanlis kullanici adi, gecerli password
        myCoursedemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("myYanlisEmail"));
        myCoursedemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("myGecerliPassword"));
        // Login butonuna basarak login olmaya calisin
        //myCoursedemyPage.cookies.click();
        myCoursedemyPage.loginButton.click();
        // Basarili olarak giris yapilamadigini test edin
        //Bunun icin hala login linkinin gorunur oldugunu test edelim
        Assert.assertTrue(myCoursedemyPage.loginLinki.isEnabled());
        myCoursedemyPage.emailKutusu.clear();
        myCoursedemyPage.passwordKutusu.clear();
    }
    @Test
    public void yanlisPasswordTesti(){
        // 2- gecerli kullanici adi, yanlis password
        myCoursedemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("myGecerliEmail"));
        myCoursedemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("myYanlisPassword"));
        // Login butonuna basarak login olmaya calisin

        // Login butonuna basarak login olmaya calisin
        myCoursedemyPage.loginButton.click();
        Assert.assertTrue(myCoursedemyPage.loginLinki.isEnabled());
        myCoursedemyPage.emailKutusu.clear();
        myCoursedemyPage.passwordKutusu.clear();
    }
    @Test
    public void yanlisEmailTesti(){
        // 3- yanlis kullanici adi, yanlis password
        myCoursedemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("myYanlisEmail"));
        myCoursedemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("myYanlisPassword"));

        myCoursedemyPage.loginButton.click();
        Assert.assertTrue(myCoursedemyPage.loginLinki.isEnabled());
        myCoursedemyPage.emailKutusu.clear();
        myCoursedemyPage.passwordKutusu.clear();
    }

    @AfterClass
    public void tearDown(){
        ReusableMethods.bekle(5);
     Driver.closeDriver();
    }

}
