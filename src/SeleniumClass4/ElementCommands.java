package SeleniumClass4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.uitestpractice.com/Students/Form");
        WebElement marriedRadioButton = driver.findElement(By.xpath(" //input[@name = 'optradio']"));
        boolean isMarriedRadioButtonEnabled= marriedRadioButton.isEnabled();
        System.out.println(isMarriedRadioButtonEnabled);

        if (!isMarriedRadioButtonEnabled){
            System.out.println("Not Enabled");

        }
        boolean ismarriedRadioButtonDisplayed = marriedRadioButton.isDisplayed();
        System.out.println(ismarriedRadioButtonDisplayed);


        boolean isMarriedRadioButtonSelected = marriedRadioButton.isSelected();
        System.out.println("Before clicking " + isMarriedRadioButtonSelected);
        marriedRadioButton.click();
        System.out.println("After clicking " + isMarriedRadioButtonSelected);
    }
}


















































