package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class10Homework2 {
    /*
     TC 2: HRMS blank username and password validation
Navigate to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Leave username and password field empty
Click on login button
Verify error message with text "Username cannot be empty" is displayed
     */

    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        WebElement text = driver.findElement(By.id("spanMessage"));
        if (text.equals(text)) {
            System.out.println("Username cannot be empty");

        } else {
            System.out.println("text is not displayed ");
        }

    }
}