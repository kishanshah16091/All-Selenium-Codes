package SeleniumClass10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;

public class DragAndDropDemo {

    public static String url = "https://jqueryui.com/droppable/";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame(0);
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        Actions action = new Actions(driver);
        // action.dragAndDrop(draggable,droppable).perform();
        action.clickAndHold(draggable).moveToElement(droppable).release().build().perform();

        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);// the screenshot is taken on this step

        driver.navigate().refresh();
        try {
            FileUtils.copyFile(srcFile, new File("screenshots/SmartBear/adminLogin112.png"));
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}