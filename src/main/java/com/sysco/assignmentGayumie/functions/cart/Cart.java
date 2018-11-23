package com.sysco.assignmentGayumie.functions.cart;
import com.sysco.assignmentGayumie.pages.cartPage.CartPage;
import com.syscolab.qe.core.ui.SyscoLabUI;


public class Cart {

    private static CartPage cartPage = new CartPage();

    private Cart() {

    }



    public static String getProductName() {
        return   cartPage.getProductName();
    }

    public static String getProductPrice() {
        return   cartPage.getProductprice();
    }

    public static String getFirstName() {
        return   cartPage.getFirstName();
    }

    public static String getLastName() {
        return   cartPage.getLastName();
    }

    public static void verifyProductDetails() {
       cartPage.verifyProductDetails();
    }
}
