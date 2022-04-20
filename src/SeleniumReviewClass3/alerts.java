package SeleniumReviewClass3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

    public static String url = ("https://syntaxprojects.com/javascript-alert-box-demo.php");

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        //find the alert and click on it
        WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        simpleAlert.click();

        //handling the Alert
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        alert.accept();

        WebElement jsAlert = driver.findElement(By.xpath("//button[@onclick=\"myPromptFunction()\"]"));
        jsAlert.click();
         driver.switchTo().alert();
        Thread.sleep(1000);
        alert.accept();

        Thread.sleep(1000);


    }
}