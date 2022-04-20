package SeleniumClass11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsExecutorDemo3 {
    public static String url = "http://google.com";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get(url);

        // driver.get("http://amazon.com"); using this method we can get the different website on same tab
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open('http://amazon.com','http://ebay.com');");// open a new tab and navigate to amazon
        js.executeScript("window.open('http://ebay.com');");
        //window.open(); --- open a blank tab
        driver.get(url);

        WebElement searchBar = driver.findElement(By.xpath("//input[@name='q']"));
        searchBar.sendKeys("Kishan");

    }
}