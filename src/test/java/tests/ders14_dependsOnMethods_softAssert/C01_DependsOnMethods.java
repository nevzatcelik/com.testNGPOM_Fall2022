package tests.ders14_dependsOnMethods_softAssert;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_DependsOnMethods extends TestBase {

    // Uc test method'u olusturun
    // 1. testin ismi amazon testi olsun,
    //    amazon anasayfasina gidip, amazona gittigimizi test edin
    // 2. testin ismi nutella testi olsun
    //    nutella icin arama yapip, sonuclarin nutella icerdigini test edin
   // 3. testin ismi arama sonuc testi olsun
    //    sonuc sayisinin 100'den fazla oldugunu test edin

    @Test
    public void amazonTesti(){
        driver.get("https://www.amazon.com");

    }

    @Test
    public void nutellaTesti(){

    }

    @Test
    public void aramaSonucTesti(){


    }
}
