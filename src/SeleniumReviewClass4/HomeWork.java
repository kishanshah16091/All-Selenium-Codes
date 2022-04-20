package SeleniumReviewClass4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomeWork {

    /*
    go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove
verify the text
click on enable verify the textbox is enabled
enter text and click disable
verify the textbox is disabled
     */
    public static String url = "https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        finding the checkbox
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();
//        find remove button
        WebElement removeBtn = driver.findElement(By.xpath("//button[text()='Remove']"));
        removeBtn.click();
//        get the text
        WebElement text = driver.findElement(By.xpath("//p[@id='message']"));
        String textmsg = text.getText();
//
        System.out.println(textmsg);

//        locating the enable button
        WebElement enableBtn = driver.findElement(By.xpath("//button[text()='Enable']"));
        enableBtn.click();

//        verify that text box is enabled
        WebDriverWait wait=new WebDriverWait(driver,20);
//        as we want to wait for the element to become enabled so that we can
//        enter some text thats why we use explicit wait
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
//        once element becomes enable find it and send keys
        WebElement txtBox = driver.findElement(By.xpath("//input[@type='text']"));
        txtBox.sendKeys("batch12????");

//        find the disable button
        WebElement disableBtn = driver.findElement(By.xpath("//button[text()='Disable']"));
//        click diable
        disableBtn.click();

//        locate the text "it;s disabled to make sure the text box is disabled
        WebElement disabledtxt = driver.findElement(By.xpath("//p[text()=\"It's disabled!\"]"));
        String textDisabled = disabledtxt.getText();
        System.out.println(textDisabled);

//        check if the text box is actually disabled now
        if (!txtBox.isEnabled()){

            System.out.println("The text Box has been disabled");
        }

    }
}