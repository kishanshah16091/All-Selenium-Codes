package SeleniumClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
    public static void main(String[] args) throws InterruptedException {
       /* navigate to
        https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser
                */

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.name("customer.firstName")).sendKeys("Kishan");
        driver.findElement(By.id("customer.lastName")).sendKeys("Shah");
        driver.findElement(By.id("customer.address.street")).sendKeys("16091 Haygrath place");
        driver.findElement(By.id("customer.address.state")).sendKeys("VA");
        driver.findElement(By.id("customer.address.city")).sendKeys("Gainesville");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("20155");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("7039734597");
        driver.findElement(By.id("customer.ssn")).sendKeys("111-22-3333");
        driver.findElement(By.id("customer.username")).sendKeys("kishan2043");
        driver.findElement(By.name("customer.password")).sendKeys("kishan");
        driver.findElement(By.name("repeatedPassword")).sendKeys("kishan");
        driver.findElement(By.className("button")).click();

        driver.close();

    }
}

