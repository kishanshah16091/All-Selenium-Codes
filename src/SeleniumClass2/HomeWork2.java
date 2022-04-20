package SeleniumClass2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2 {
    public static void main(String[] args) throws InterruptedException {
        /*navigate to fb.com
        click on create new account
        fill up all the textboxes
        click on sign up button
        close the pop up
        close the browser*/
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fb.com");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        WebElement name = driver.findElement(By.name("firstname"));
        name.sendKeys("Kishan");
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("Shah");
        driver.findElement(By.name("reg_email__")).sendKeys("7039734597");
        driver.findElement(By.name("reg_passwd__")).sendKeys("kishan");
        driver.findElement(By.id("month")).sendKeys("Jun");
        driver.findElement(By.name("birthday_day")).sendKeys("13");
        driver.findElement(By.name("birthday_year")).sendKeys("1986");
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
        driver.close();
        driver.quit();

    }
}
