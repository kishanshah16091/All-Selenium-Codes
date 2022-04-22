package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import static testBase.BaseClass.driver;

public class LoginPagesWithpageFactory extends CommonMethods {


    @FindBy(id = "txtUsername")
    public WebElement username;

    @FindBy(xpath = "//input[@id='txtPassword']")
    public WebElement password;

    @FindBy(css = "input#btnLogin")
    public WebElement loginButton;

    public LoginPagesWithpageFactory() {
        PageFactory.initElements(driver, this);


    }

}
