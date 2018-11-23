package com.sysco.assignmentGayumie.pages.loginPage;

import com.sysco.assignmentGayumie.common.Constants;
import com.syscolab.qe.core.ui.SyscoLabUI;
import com.syscolab.qe.core.ui.web.SyscoLabWUI;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by Rifad on 5/21/18.
 */
public class LoginPage {


    protected static SyscoLabUI syscoLabUI;
    private By txtGoogleSearch = By.id("lst-ib");

    private By lnkLogin = By.xpath("//header/div[1]/div[1]/ul/li[1]/a");
    private By txtEmail = By.id("email");
    private By txtPassword = By.id("pass");
    private By btnLogin = By.id("send2");
    private static By lnkAccount=By.xpath("//div[1]/div[1]/ul/li[1]/a");






    public void loadLoginPage(Capabilities capabilities) {
        ChromeOptions chromeOptions = new ChromeOptions();

        if (Constants.RUN_HEADLESS.equals("true"))
            chromeOptions.addArguments("--headless");

        if (Constants.BROWSER_TYPE.equals(Constants.BROWSER_FIREFOX))
            syscoLabUI = new SyscoLabWUI(capabilities, "FIREFOX");
        else if (Constants.BROWSER_TYPE.equals(Constants.BROWSER_IE))
            syscoLabUI = new SyscoLabWUI(capabilities, "IE");
        else
            syscoLabUI = new SyscoLabWUI(capabilities, chromeOptions);


        syscoLabUI.navigateTo(Constants.URL);
        syscoLabUI.driver.manage().window().maximize();
        syscoLabUI.sleep(8);
    }

    public void clickLoginButton() {
        syscoLabUI.sleep(1);
        syscoLabUI.click(lnkLogin);
        syscoLabUI.sleep(1);
    }

    public void enterEmail(String user_name) {
        syscoLabUI.sleep(2);
        syscoLabUI.sendKeys(txtEmail, user_name);
        syscoLabUI.sleep(1);
    }

    public void enterPassword(String pass_word) {
        syscoLabUI.sleep(2);
        syscoLabUI.click(txtPassword);
        syscoLabUI.sendKeys(txtPassword, pass_word);
        syscoLabUI.sleep(1);
    }

    public void clickLogin() {
        syscoLabUI.sleep(2);
        syscoLabUI.click(btnLogin);
        syscoLabUI.sleep(1);
    }

    public void clickAccount() {
        syscoLabUI.sleep(2);
        syscoLabUI.click(lnkAccount);
        syscoLabUI.sleep(1);
    }




}
