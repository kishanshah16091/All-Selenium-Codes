package SeleniumClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask2 {
    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
            WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
            username.sendKeys("Tester");
            WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
            password.sendKeys("test");
            WebElement loginButton = driver.findElement(By.className("button"));
            loginButton.click();
        }
    }