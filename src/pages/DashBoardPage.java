package pages;

import javafx.scene.input.InputMethodTextRun;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class DashBoardPage {


    public class DashboardPage extends CommonMethods {

       @FindBy(id="welcome")
        public WebElement welcomeAdmin;

       public DashboardPage(){
           PageFactory.initElements(driver,this);
       }
    }
}
