package tests.ders19_CrossBrowserTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.ReusableMethods;
import utilities.TestBaseCross;

public class C02_NegativeLoginTesti extends TestBaseCross {


    @Test
    public void negativeLoginTest(){
        driver.get(ConfigReader.getProperty("myUrl"));

        driver.findElement(By.xpath("//a[text()='Log in']")).click();

        driver.findElement(By.xpath("//input[@id='login-email']")).
                sendKeys(ConfigReader.getProperty("myYanlisEmail"));

        driver.findElement(By.xpath("//input[@id='login-password']")).
                sendKeys(ConfigReader.getProperty("myYanlisPassword"));
        ReusableMethods.bekle(2);
        driver.findElement(By.xpath("//*[text()='Accept']")).click();
        ReusableMethods.bekle(2);
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Log in']")).isDisplayed());
    }
}
