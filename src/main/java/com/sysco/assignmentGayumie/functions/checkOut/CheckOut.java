package com.sysco.assignmentGayumie.functions.checkOut;
import com.sysco.assignmentGayumie.pages.cartPage.CartPage;
import com.sysco.assignmentGayumie.pages.checkOutPage.CheckOutPage;


public class CheckOut {

    private static CheckOutPage checkOutPage = new CheckOutPage();

    private CheckOut() {

    }

    public static void clickContnue() {
        checkOutPage.clickContnue();
    }

    public static String isDisplayedEmptyErrorCity() {
        return checkOutPage.isDisplayedEmptyErrorCity();
    }

    public static String isDisplayedEmptyErrorState() {
        return checkOutPage.isDisplayedEmptyErrorState();
    }

    public static String isDisplayedEmptyErrorPhone() {
        return checkOutPage.isDisplayedEmptyErrorPhone();
    }

    public static String isDisplayedEmptyErrorPost() {
        return checkOutPage.isDisplayedEmptyErrorPost();
    }

    public static void enterCompany() {
        checkOutPage.enterCompany("ABC");
    }

    public static void enterAdress1() {
        checkOutPage.enterAddress1("Vauxhaul Street");
    }

    //public static void enterCity()  {checkOutPage.enterCity("Colombo");}
    //public static void selectState() { checkOutPage.selectState();}

    public static void enterPostCode() {
        checkOutPage.enterPostCode("2000");
    }

    public static void enterContactNumber() {
        checkOutPage.enterContactNumber("0982345678");
    }

    public static void clickProceed() {
        checkOutPage.clickProceed();
    }

    public static void clickCreditCard() {
        checkOutPage.clickCreditCard();
    }

    public static void clickPlaceOrder() {
        checkOutPage.clickPlaceOrder();
    }

    public static String isDisplayedCreditCardValidation(){
        return checkOutPage.isDisplayedCreditCardValidation();
    }
}

    