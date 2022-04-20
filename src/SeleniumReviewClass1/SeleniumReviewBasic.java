package SeleniumReviewClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumReviewBasic {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        // driver.navigate().to("https://demoqa.com/text-box");
        // WebElement username = driver.findElement(By.id("userName"));
        // username.sendKeys("Kishan");
        // username.clear();
        // username.sendKeys("Shawn");
        WebElement username = driver.findElement(By.xpath("//input[@id='userName']"));

        username.sendKeys("Kishan");
    }
}