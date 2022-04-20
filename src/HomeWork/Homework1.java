package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    public static void main(String[] args) throws InterruptedException {
        /*Open chrome browser
        Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
        Enter valid username and password (username - Admin, password - Hum@nhrm123)
        Click on login button
        Then verify Syntax Logo is displayed.*/
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement name = driver.findElement(By.cssSelector("input#txtUsername"));
        name.sendKeys("Admin");
        WebElement Password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        Password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
        WebElement syntaxLogo = driver.findElement(By.xpath("//img[@src='/humanresources/symfony/web/webres_5acde3dbd3adc6.90334155/themes/default/images/syntax.png']"));
        System.out.println(syntaxLogo.isDisplayed());
        driver.quit();
    }
}
