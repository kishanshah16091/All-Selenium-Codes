package SeleniumClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriver amazon=new ChromeDriver();
        amazon.get("https://www.amazon.com/");
        String url=amazon.getCurrentUrl();
        String title = amazon.getTitle();
        System.out.print(title+" "+url);
        amazon.quit();

    }
}
