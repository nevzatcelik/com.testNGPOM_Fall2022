package tests.ders15_PageObjectModel;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C05_PagesKullanimi {

    @Test
    public void facebooktest(){
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        Faker faker=new Faker();
        FacebookPage facebook=new FacebookPage();
        facebook.cerezler.click();
        facebook.facebookEmail.sendKeys(faker.internet().emailAddress());
        facebook.facebookPassword.sendKeys(faker.internet().password());
        facebook.loginclick.click();
        Assert.assertTrue(facebook.facebooksifreDogrulama.isDisplayed());

    }
}
