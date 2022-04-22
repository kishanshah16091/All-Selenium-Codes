package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {


    public WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
    public WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
    public WebElement loginButton = driver.findElement(By.className("button"));

}
