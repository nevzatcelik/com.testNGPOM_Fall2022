package tests.ders15_PageObjectModel;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

import java.security.Key;

public class C03_PagesKullanimi {



    // sonuclarin nutella icerdigini test edin

    @Test
    public void test1(){
        // amazon ana sayfaya gidin
        Driver.getDriver().get("https://amazon.com");

        //nutella icin arama yapin
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        // sonuclarin nutella icerdigini test edin
        String actualSonucYazisi=amazonPage.aramasonucuElementi.getText();
        String expectedKelime="Nutella";

        Assert.assertTrue(actualSonucYazisi.contains(expectedKelime));
        Driver.closeDriver();



    }
}
