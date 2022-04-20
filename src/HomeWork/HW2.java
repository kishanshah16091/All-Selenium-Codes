package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW2 {
    public static String url = ("http://www.uitestpractice.com/Students/Contact");

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement textLink = driver.findElement(By.linkText("This is a Ajax link"));
        textLink.click();
        WebElement text = driver.findElement(By.xpath("//div[@class='ContactUs']"));
        text.getText();
        System.out.println(text);
    }
}