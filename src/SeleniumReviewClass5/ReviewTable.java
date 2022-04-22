package SeleniumReviewClass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ReviewTable {

    public static String url = "https://www.techlistic.com/p/demo-selenium-practice.html";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //accessing the whole webTable
       /* WebElement whole_table = driver.findElement(By.xpath("//table[@id='customers']"));
        //print the table
        System.out.println(whole_table.getText());

        //accessing the rows of the table
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));

        for (WebElement row : rows) {
            String text = row.getText();
            if (text.contains("Germany")) {
                System.out.println(text);
            }
        }*/

        //Print all the company name that are located in UK

        List<WebElement> countries = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
        int i = 1;
        for (WebElement country : countries) {
            String countryName = country.getText();
            if (countryName.equals("UK")) {
                WebElement company = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + (i + 1) + "]/td[1]"));
                System.out.println("The Company name in UK is " + company.getText());
            }
            i = i + 1;
        }
    }
}

//
// if column location may change

//get the headers ---> then find the location of column that has country---> from there he will
// get the index
//that should be place in front of td
