package SeleniumClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class LaunchBrowser {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");//for windows add extension.exe

        WebDriver driver = new ChromeDriver(); // launch the browser
        driver.get("https://www.//fb.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        String expectedTitle = "Facebook - Log In or Sing Up";
        if (title.equals(expectedTitle)) {
            System.out.println("Title is Correct");
        } else {
            System.out.println("Title is Incorrect");
        }
        driver.quit();
    }
}