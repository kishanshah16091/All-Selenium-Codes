package SeleniumReviewClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class reviewRadioButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement femaleButton = driver.findElement(By.xpath("//input[@name='optradio'and@value='Female']"));

        //check if the radio button is enabled
        System.out.println("the female radio button is enabled " + femaleButton.isEnabled());
        //check if the radio button is displayed
        System.out.println("the female radio button is displayed " + femaleButton.isDisplayed());
        //checking id It's selected or not
        System.out.println("the female radio button is selected " + femaleButton.isSelected());

        if (!femaleButton.isSelected()) {
            femaleButton.click();
        }
        System.out.println("the female radio button is selected " + femaleButton.isSelected());


        // to get all the links in the current webpage
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement link : links) {
            String name = link.getText();
            if(!name.isEmpty()){
            System.out.println(name);

        }


    }
}
}