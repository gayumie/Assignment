package com.sysco.assignmentGayumie.functions.login;


import com.sysco.assignmentGayumie.common.Constants;
import com.sysco.assignmentGayumie.pages.loginPage.LoginPage;
import com.sysco.assignmentGayumie.utils.DriverEnviromentSetUpUtil;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Rifad on 5/21/18.
 */
public class Login  {

    private static LoginPage loginPage = new LoginPage();
    ChromeDriver driver = new ChromeDriver();

    private Login() {
    }


    public static void loadPage() {
        if (Constants.RUN_LOCALLY) {
            DriverEnviromentSetUpUtil.setToRunLocallyWithBrowser(Constants.BROWSER_TYPE);
            DesiredCapabilities capabilities = null;
            loginPage.loadLoginPage(capabilities);
        } else {
            loginPage.loadLoginPage(DriverEnviromentSetUpUtil.setToRunRemotely());
        }
    }

    public static void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    public static void enterEmailAndPassword() {
        loginPage.enterEmail(Constants.EMAIL);
        loginPage.enterPassword(Constants.PASSWORD);
        loginPage.clickLogin();
    }

public static void clickAccount(){
        loginPage.clickAccount();
}


}
