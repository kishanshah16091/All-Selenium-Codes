package SeleniumReviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ReviewCheckbox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

// check the checkbox
        WebElement checkbox1 = driver.findElement(By.cssSelector("input#isAgeSelected"));

        System.out.println("the checkbox is selected " + checkbox1.isSelected());
        checkbox1.click();
        Thread.sleep(3000);
// deselect the checkbox
        //  checkbox1.click();
        //  if (checkbox1.isSelected()) {
        //System.out.println("the checkbox is selected");
        //  } else
        // System.out.println("the checkbox is not selected");

        WebElement confirm = driver.findElement(By.cssSelector("#txtAge"));
        System.out.println(confirm.getText());
        Thread.sleep(2000);
        checkbox1.click();

        //get all the available option
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for (WebElement checkbox : checkboxes) {
            checkbox.click();
        }
        Thread.sleep(2000);

        for (WebElement checkbox :checkboxes){
            checkbox.click();
        }
    }
}