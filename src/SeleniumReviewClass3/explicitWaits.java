package SeleniumReviewClass3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWaits {

    public static String url = ("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.findElement(By.xpath("//button[@id='alert']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

//Code is not completed
    }
}