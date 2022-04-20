package Homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook2 {
    public static String url = "https://www.facebook.com/";
//HW1
//Go to facebook sign up page
//Fill out the whole form
//Click signup

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.partialLinkText("new account")).click();
        Thread.sleep(1000);
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Admin");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("admin");
        WebElement mobileNumberOrEmail = driver.findElement(By.name("reg_email__"));
        mobileNumberOrEmail.sendKeys("123456789");
        WebElement newPassword = driver.findElement(By.xpath("//input[@id='password_step_input']"));
        newPassword.sendKeys("admin");
        WebElement month = driver.findElement(By.cssSelector("select[id='month']"));
        Select monthDD = new Select(month);
        monthDD.selectByVisibleText("Jun");
        WebElement day = driver.findElement(By.cssSelector("select[id='day']"));
        Select dayDD = new Select(day);
        dayDD.selectByVisibleText("13");
        WebElement year = driver.findElement(By.cssSelector("select[id='year']"));
        Select yearDD = new Select(year);
        yearDD.selectByVisibleText("1990");
        WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
        gender.click();
        WebElement singUp = driver.findElement(By.name("websubmit"));
        singUp.click();
        driver.quit();
    }
}