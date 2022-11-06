package tests.ders15_PageObjectModel;

import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C04_PagesKullanimi {

    // amazon anasayfasina gidin
    // 3 test methodu olusturun
    // nutella java bycle arama yapip,sonuclarin arama yaptiginiz kelimeleri icerdigini test edin

    AmazonPage amazonPage=new AmazonPage();

   @Test
   public void test01(){
       Driver.getDriver().get("https://amazon.com");
       amazonPage.amazonAramaKutusu.sendKeys("nutella");

   }

    @Test(groups = "smoke")
    public void test02(){
        Driver.getDriver().get("https://amazon.com");
        amazonPage.amazonAramaKutusu.sendKeys("java");
    }

    @Test(groups = "smoke")
    public void test03(){
        Driver.getDriver().get("https://amazon.com");
        amazonPage.amazonAramaKutusu.sendKeys("Bicycle");
    }
}
