package tests.ders16_PageObjectModel;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_ConfigReaderKullanimi {

    @Test
    public void method1(){

        //amazon anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        // test methodu olusturun
        //nutella icin arama yapin
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys(ConfigReader.getProperty("amazonAramaKelimesi")+ Keys.ENTER);

        // sonuclarin arama yaptiginiz kelimeleri icerdigini test edin
        String expectedKelime=ConfigReader.getProperty("amazonAramaKelimesi");
        String actualAramaSonucu=amazonPage.aramasonucuElementi.getText();

        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));

        ReusableMethods.bekle(5);
        Driver.closeDriver();

    }
}
