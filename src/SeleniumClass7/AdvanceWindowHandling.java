package SeleniumClass7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvanceWindowHandling {
    //Click on buttons and open new window (tabs)
    // switch to window and perform different actions

    public static String url = ("https://syntaxprojects.com/window-popup-modal-demo.php");

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        String mainPageHandle = driver.getWindowHandle();
        WebElement igButton = driver.findElement(By.linkText("Follow On Instagram"));
        WebElement fbButton = driver.findElement(By.linkText("Like us On Facebook"));
        WebElement ifAndFbButton = driver.findElement(By.linkText("Follow Instagram & Facebook"));
        igButton.click();
        fbButton.click();
        ifAndFbButton.click();
        Set<String> allWindowHandle = driver.getWindowHandles();
        System.out.println(allWindowHandle.size());

        Iterator<String> it = allWindowHandle.iterator();
        while (it.hasNext()) { //start iterating through handle
            String handle = it.next();// get the next handle
            if (!mainPageHandle.equals(handle)) { // set condition
                driver.switchTo().window(handle);// switch to a window which is not equal to main handle
                //driver.manage().window().maximize();
                String title = driver.getTitle();
                System.out.println(title);
                driver.close();
            }
        }
        driver.switchTo().window(mainPageHandle);
        igButton.click();
    }

}