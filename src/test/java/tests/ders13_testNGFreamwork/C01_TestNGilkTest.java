package tests.ders13_testNGFreamwork;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_TestNGilkTest extends TestBase {

    @Test(priority =10)
    public void ilkTest(){

        driver.get("https://www.amazon.com");
    }
    @Test
    public void ikinciTest(){

        driver.get("https://www.youtube.com");
    }
    @Test
    public void ucuncuTest(){

        driver.get("https://www.wisequarter.com");
    }
}
