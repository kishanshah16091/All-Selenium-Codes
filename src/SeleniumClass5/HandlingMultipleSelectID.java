package SeleniumClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingMultipleSelectID {
    public static String url = "https://www.syntaxprojects.com/basic-select-dropdown-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement stateDD = driver.findElement(By.name("States"));
        Select select = new Select(stateDD);
        boolean isMultiple = select.isMultiple();
        System.out.println(isMultiple);

        if (isMultiple) {
            List<WebElement> options = select.getOptions();
            for (WebElement option : options) {
                String optionsText = option.getText();
                select.selectByVisibleText(optionsText);
                Thread.sleep(1000);
            }
        }
      // select.deselectByIndex(5);
        select.deselectAll();
    }

}
