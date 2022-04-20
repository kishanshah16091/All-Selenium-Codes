package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkIframe {
   /*
   Task
Navigate to https://syntaxprojects.com/bootstrap-iframe.php
verify the header text AUTOMATION TESTING PLATFORM BY SYNTAX is displayed
verify enroll today button is enabled
    */


    public static String url = ("https://syntaxprojects.com/bootstrap-iframe.php");

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement headerText = driver.findElement(By.cssSelector("span.gum"));

        if (headerText.getText().equals("AUTOMATION TESTING PLATFORM BY SYNTAX")) {

            System.out.println("Webpage header text is verified");
        } else {
            System.out.println("Webpage header text is not verified");
        }
        driver.switchTo().frame("FrameTwo");
        if (driver.findElement(By.linkText("Enroll today")).isDisplayed()) {
            System.out.println("The 'Enroll Today' button appears inside the iframe");
        } else {
            System.out.println("Enroll Today button is not Displayed");
        }

        driver.quit();

    }
}