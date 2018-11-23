package com.sysco.assignmentGayumie.functions.myAccount;

import com.sysco.assignmentGayumie.pages.myAccountPage.MyAccountPage;
import com.sysco.assignmentGayumie.common.Constants;


public class MyAccount {


    private static MyAccountPage myAccountPage = new MyAccountPage();

    private MyAccount() {

    }

    public String isDisplayedCorrectUserName(){
        return myAccountPage.isDisplayedCorrectUserName();
    }

        public static void clickCartIcon() {
            myAccountPage.clickCartIcon();
        }

    public static Boolean isDisplayedZeroInCart() {
        return  myAccountPage.isDisplayedZeroInCart();
    }
    public static void clickRemoveLink() {
        myAccountPage.clickRemoveLink();
    }

    public static void addToCart(){
        myAccountPage.addToCart();
    }

    }


