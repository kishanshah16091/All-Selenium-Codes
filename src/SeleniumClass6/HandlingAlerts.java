package SeleniumClass6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingAlerts {
    //Handel each and every popup alerts

    public static String url = ("http://www.uitestpractice.com/Students/Switchto");

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement simpleAlertButton = driver.findElement(By.id("alert"));
        simpleAlertButton.click();
        Alert simpleAlert = driver.switchTo().alert(); //switch the focus to alert
        Thread.sleep(1000);
        simpleAlert.accept();// handling simple alert
        System.out.println("************************************ Simple Alert ***********************************");
        WebElement confirmAlertButton = driver.findElement(By.id("confirm"));
        confirmAlertButton.click();
        Thread.sleep(2000);
        Alert confirmAlert = driver.switchTo().alert(); //switch the focus to alert
        String alertText = confirmAlert.getText();
        System.out.println(alertText);
        confirmAlert.dismiss();
        System.out.println("************************************* Confirm Alert *********************************");
        WebElement promptAlertButton = driver.findElement(By.cssSelector("button#prompt"));
        promptAlertButton.click();
        Thread.sleep(1000);
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("Batch 12 is the best!!!");
        promptAlert.accept();
        System.out.println("************************************* Prompt Alert **********************************");
    }
}