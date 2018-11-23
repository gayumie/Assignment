package com.sysco.assignmentGayumie.tests.checkOutTest;

import com.sysco.assignmentGayumie.functions.login.Login;
import com.sysco.assignmentGayumie.functions.cart.Cart;
import com.sysco.assignmentGayumie.functions.myAccount.MyAccount;
import com.sysco.assignmentGayumie.functions.checkOut.CheckOut;
import fitlibraryGeneric.specify.workflow.Check;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.UnsupportedEncodingException;

public class CheckOutTest {

    @BeforeClass
    public void init(ITestContext iTestContext)throws UnsupportedEncodingException {
        Login.loadPage();
        Login.clickLoginButton();
        Login.enterEmailAndPassword();
        Login.clickAccount();

    }
    @Test(priority = 1, alwaysRun = true)
    public static void isDisplayedCorrectUserName(){


        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(MyAccount.isDisplayedZeroInCart(),"william  jacob","Expected validation message does not displayed");

    }


    @Test(priority = 2, alwaysRun = true)
    public static void testRemovingItemsFromCart() {
        MyAccount.clickCartIcon();
        MyAccount.clickRemoveLink();



    }

    @Test(priority = 3, alwaysRun = true)
    public static void addToCart(){
        MyAccount.addToCart();
    }

    @Test(priority = 4, alwaysRun = true)
    public static void verifyProductDetails(){
        Cart.verifyProductDetails();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(Cart.getProductName(),"ADIDAS ULTRABOOST WOMENS ICE BLUE","Expected validation message does not displayed");
        softAssert.assertAll();
        SoftAssert softAssert1=new SoftAssert();
        softAssert1.assertEquals(Cart.getProductPrice(),"$259.95","Expected validation message does not displayed");
        softAssert1.assertAll();

    }

    @Test(priority = 5, alwaysRun = true)
    public static void clickContinue(){
        CheckOut.clickContnue();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals( CheckOut.isDisplayedEmptyErrorCity(),"THIS IS A REQUIRED FIELD.","Expected validation message does not displayed");
        softAssert.assertAll();
        SoftAssert softAssert1=new SoftAssert();
        softAssert1.assertEquals(CheckOut.isDisplayedEmptyErrorState(),"THIS IS A REQUIRED FIELD.","Expected validation message does not displayed");
        softAssert1.assertAll();
        SoftAssert softAssert2=new SoftAssert();
        softAssert2.assertEquals(CheckOut.isDisplayedEmptyErrorPost(),"THIS IS A REQUIRED FIELD.","Expected validation message does not displayed");
        softAssert2.assertAll();
        SoftAssert softAssert3=new SoftAssert();
        softAssert3.assertEquals(CheckOut.isDisplayedEmptyErrorPhone(),"This is a required field.","Expected validation message does not displayed");
        softAssert3.assertAll();


    }

    @Test(priority = 6, alwaysRun = true)
    public static void testEnteringDetails() {
        CheckOut.enterCompany();
        CheckOut.enterAdress1();
        //CheckOut.enterCity();
        //CheckOut.selectState();
        CheckOut.enterPostCode();
        CheckOut.enterContactNumber();
        CheckOut.clickProceed();


    }

    @Test(priority = 7, alwaysRun = true)
    public static void testPayment() {
        CheckOut.clickCreditCard();
        CheckOut.clickPlaceOrder();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals( CheckOut.isDisplayedCreditCardValidation(),"PLEASE, ENTER VALID CREDIT CARD NUMBER","Expected validation message does not displayed");
        softAssert.assertAll();


    }


}
