package SeleniumClass11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class UploadDocuments {
    public static String url = "https://the-internet.herokuapp.com/";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement fileUploadLink = driver.findElement(By.linkText("File Upload"));
        fileUploadLink.click();

        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        Thread.sleep(1000);
        chooseFile.sendKeys("C:\\Users\\kshah\\Desktop\\Syntax Class file\\Batch 12\\Kishan.xlsx");

        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.click();

        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);


        try {
            FileUtils.copyFile(srcFile,new File("screenshots/SmartBear/adminLogin113.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}