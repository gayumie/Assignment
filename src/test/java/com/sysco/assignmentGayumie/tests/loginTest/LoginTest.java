package com.sysco.assignmentGayumie.tests.loginTest;


import com.sysco.assignmentGayumie.functions.login.Login;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginTest {
    @BeforeClass
    @Test(priority = 1, description = "", alwaysRun = true)
    public static void loadPageAssignment() {
        Login.loadPage();
        Login.clickLoginButton();
        Login.enterEmailAndPassword();
        Login.clickAccount();



    }
}