package SeleniumClass10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestCode {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //login actions
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        WebElement leaveButton = driver.findElement(By.id("menu_leave_viewLeaveModule"));
        leaveButton.click();
        WebElement fromCalendar = driver.findElement(By.id("calFromDate"));
        fromCalendar.click();

        WebElement monthDD = driver.findElement(By.className("ui-datepicker-month"));
        Select select = new Select(monthDD);
        select.selectByVisibleText("Jul");

        List<WebElement> fromDates = driver.findElements(By.xpath("//table[@class= 'ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement fromDate : fromDates) {
            String dateText = fromDate.getText();
            if (dateText.equals("20")) {
                fromDate.click();
                break;
            }
        }
        WebElement cancelledCheckbox = driver.findElement(By.id("leaveList_chkSearchFilter_0"));
        cancelledCheckbox.click();
        WebElement rejectedCheckbox = driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_-1']"));
        rejectedCheckbox.click();

        boolean pendingApprovalCheckbox = driver.findElement(By.id("leaveList_chkSearchFilter_1")).isSelected();
        if (pendingApprovalCheckbox == true) {
            driver.findElement(By.id("leaveList_chkSearchFilter_1")).click();
        }
        WebElement dropdown = driver.findElement(By.id("leaveList_cmbSubunit"));
        Select select1 = new Select(dropdown);
        select1.selectByVisibleText("IT Support");

        WebElement searchButton = driver.findElement(By.id("btnSearch"));
        searchButton.click();

        driver.quit();
    }
}