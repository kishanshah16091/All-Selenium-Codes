
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class LaunchBrowser {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");//for windows add extension.exe

        WebDriver driver = new ChromeDriver(); // launch the browser
        driver.get("https://www.google.com/");
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        System.out.println("title");
        driver.quit();
    }
}