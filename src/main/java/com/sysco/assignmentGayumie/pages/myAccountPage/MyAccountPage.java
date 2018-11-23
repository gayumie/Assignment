package com.sysco.assignmentGayumie.pages.myAccountPage;

import com.sysco.assignmentGayumie.pages.loginPage.LoginPage;
import org.openqa.selenium.By;

public class MyAccountPage extends LoginPage {

    private static By txtValidUserName = By.xpath("//*[@id=\"maincontent\"]/div/div[1]/div[4]/div[2]/div[1]/div[1]/p/text()[1]");
    private static By icnCart = By.xpath("//div[@class='minicart-wrapper']");
    private static By icnCartValue = By.xpath("//div[1]/header/div[2]/div/div[4]/span/span");
    private static By lnkRemove = By.xpath("//*[@id=\"minicartOffcanvas\"]/div/div[2]/div[1]/div[1]/div/a[2]");
    private static By lnkCartZeroValue = By.xpath("//*[@id=\"minicartOffcanvas\"]/div/div[2]/div[1]/div[1]/div[1]");
    private static By btnOKRemoveItem = By.xpath("//html/body/div[4]/aside[3]/div[2]/footer/button[2]");
    private static By getBtnOKRemoveItemAlert = By.xpath("//div[4]/aside[3]/div[2]/footer/button[2]");
    private static By btnOKRemoveItemAlert = By.xpath("//div[4]/aside[3]/div[2]/footer/button[2]");
    private static By lnkCategoryWomen = By.xpath("//*[@id=\"mi-1-1\"]");
    private static By lnkBrandAdidas = By.xpath("//*[@id=\"mi-3-1-2-1\"]");
    private static By lnkShoe = By.xpath("//*[@id=\"ewave-layerednavigation-product-list\"]/div[2]/ul/li[1]/div/div[3]/strong/a");
    private static By btnShoeSize = By.xpath("//*[@id=\"swatch-row-228\"]/div[9]");
    private static By btnAddToCart = By.xpath("//*[@id=\"product-addtocart-button\"]");


    public String isDisplayedCorrectUserName() {
        return (syscoLabUI.getText(txtValidUserName));
    }

    public void clickCartIcon() {
        syscoLabUI.sleep(5);
        syscoLabUI.click(icnCart);
        syscoLabUI.sleep(3);

    }

    public boolean isDisplayedZeroInCart() {
        return (syscoLabUI.isDisplayed(lnkCartZeroValue));
    }

    public void clickbtnOKRemoveItem() {
        syscoLabUI.sleep(1);
        syscoLabUI.click(btnOKRemoveItem);
        syscoLabUI.sleep(3);
    }


    public void addToCart() {
        syscoLabUI.sleep(3);
        syscoLabUI.click(lnkCategoryWomen);
        syscoLabUI.sleep(1);
        syscoLabUI.click(lnkBrandAdidas);
        syscoLabUI.sleep(3);
        syscoLabUI.click(lnkShoe);
        syscoLabUI.sleep(3);
        syscoLabUI.click(btnShoeSize);
        syscoLabUI.sleep(3);
        syscoLabUI.click(btnAddToCart);
        syscoLabUI.sleep(5);
    }


    public void clickRemoveLink() {
        //  int x = 0;
        while (syscoLabUI.isDisplayed(lnkRemove) == true) {
            syscoLabUI.sleep(3);
            syscoLabUI.click(lnkRemove);
            syscoLabUI.sleep(5);
            syscoLabUI.click(btnOKRemoveItemAlert);
            syscoLabUI.sleep(3);
        }

            syscoLabUI.click(icnCart);


        }
    }

