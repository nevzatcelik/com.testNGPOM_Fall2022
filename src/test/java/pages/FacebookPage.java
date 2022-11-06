package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "(//button[@value='1'])[3]")
    public WebElement cerezler;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement facebookEmail;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement facebookPassword;

    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement facebooksifreDogrulama;

    @FindBy(xpath="//button[@name='login']")
    public WebElement loginclick;
}
