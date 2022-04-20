package Homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Facebook {
    /*
    TC 1: Facebook dropdown verification
Open chrome browser
Go to "https://www.facebook.com"
click on create new account
Verify:
month dd has 12 month options
day dd has 31 day options
year dd has 115 year options
Select your date of birth
Quit browser
     */
    public static String url = "https://www.facebook.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.partialLinkText("new account")).click();
        Thread.sleep(1000);

        WebElement month = driver.findElement(By.cssSelector("select[id='month']"));
        Select monthDD = new Select(month);

        if (!monthDD.isMultiple()) {
            List<WebElement> options1 = monthDD.getOptions();
            if (options1.size() == 12) {
                System.out.println("Month DD has 12 options.");
            } else {
                System.out.println("Month DD does NOT have 12 options.");

            }
        }
        Thread.sleep(1000);
        monthDD.selectByVisibleText("Jul");

        WebElement day = driver.findElement(By.cssSelector("select[id='day']"));
        Select dayDD = new Select(day);

        if (!dayDD.isMultiple()) {
            List<WebElement> options2 = dayDD.getOptions();
            if (options2.size() == 31) {
                System.out.println("Day DD has 31 options.");
            } else {
                System.out.println("Day DD does NOT have 31 options.");

            }
        }
        Thread.sleep(1000);
        dayDD.selectByIndex(10);

        WebElement year = driver.findElement(By.cssSelector("select[id='year']"));
        Select yearDD = new Select(year);

        if (!dayDD.isMultiple()) {
            List<WebElement> options3 = yearDD.getOptions();
            if (options3.size() == 115) {
                System.out.println("Year DD has 115 options.");
            } else {
                System.out.println("Year DD does NOT have 115 options.");

            }
        }
        Thread.sleep(1000);
        yearDD.selectByValue("1990");

        Thread.sleep(1000);
        driver.quit();

    }
}