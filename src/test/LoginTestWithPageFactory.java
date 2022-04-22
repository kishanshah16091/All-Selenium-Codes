package test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.DashBoardPage;
import pages.LoginPagesWithpageFactory;
import testBase.BaseClass;

import java.io.File;
import java.io.IOException;

public class LoginTestWithPageFactory {
    public static void main(String[] args) {
        BaseClass.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        LoginPagesWithpageFactory loginPagesWithpageFactory = new LoginPagesWithpageFactory();
        DashBoardPage dashBoardPage=new DashBoardPage();
        loginPagesWithpageFactory.username.sendKeys("Admin");
        loginPagesWithpageFactory.password.sendKeys("Hum@nhrm123");
        loginPagesWithpageFactory.loginButton.click();

        TakesScreenshot ts = (TakesScreenshot) BaseClass.driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile,new File("screenshots/HRMS/dashboard.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
     //String welcomeText = dashBoardPage.welcomeAdmin.getText();
        //System.out.println(welcomeText);
        BaseClass.tearDown();


    }
}
