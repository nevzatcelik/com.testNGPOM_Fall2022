package tests.ders19_CrossBrowserTests;

import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.CrossDriver;
import utilities.TestBaseCross;

public class C01_AmazonSearchTesti extends TestBaseCross {

    @Test
    public void amazonAramaTesti(){
        // amazon anasayfaya gidin
        driver.get(ConfigReader.getProperty("amazonUrl"));
        // arama kismina nutella yazarak aratalim
         driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella"+ Keys.ENTER);
        // sonuclarin nutella icerdigini test edelim
       String actualSonucyazisi=
               driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
       String expectedKelime="Nutella";
        Assert.assertTrue(actualSonucyazisi.contains(expectedKelime));
    }

}
