package com.sysco.assignmentGayumie.tests.cartTest;


import com.sysco.assignmentGayumie.functions.login.Login;
import com.sysco.assignmentGayumie.functions.cart.Cart;
import com.sysco.assignmentGayumie.functions.myAccount.MyAccount;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.UnsupportedEncodingException;

public class CartTest {

    @BeforeClass
    public void init(ITestContext iTestContext)throws UnsupportedEncodingException {
        Login.loadPage();
        Login.clickLoginButton();
        Login.enterEmailAndPassword();


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
}
