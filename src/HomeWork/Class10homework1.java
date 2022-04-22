package HomeWork;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import sun.plugin.javascript.navig4.Window;

import java.util.Set;

public class Class10homework1 {
        /*
          HW
          open new browser
          open a new tab
          navigate to a different URL on a new tab
         */
    public static String url = "http://google.com";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;String title = driver.getTitle();
        System.out.println(title);
        js.executeScript("window.open('http://amazon.com');");
        js.executeScript("window.open('http://ebay.com');");
        js.executeScript("window.open('http://facebook.com');");
        js.executeScript("window.open('https://www.apple.com/');");
        driver.get(url);

    }
}
