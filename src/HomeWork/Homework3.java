package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework3 {
    public static void main(String[] args) {
        /*HW 2
HRMS Application Negative Login:
Open chrome browser
Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Enter valid username
Leave password field empty
Click on login button
Verify error message with text "Password cannot be empty" is displayed.*/
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement name = driver.findElement(By.cssSelector("input#txtUsername"));
        name.sendKeys("Admin");
        WebElement Password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        Password.sendKeys("");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
        WebElement errorMessage = driver.findElement(By.id("spanMessage"));
        if (errorMessage.isDisplayed()) {
            System.out.println("Password cannot be empty");
        }
    }
}