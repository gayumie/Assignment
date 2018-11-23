package com.sysco.assignmentGayumie.pages.cartPage;

import com.sysco.assignmentGayumie.pages.loginPage.LoginPage;
import com.syscolab.qe.core.ui.SyscoLabUI;
import org.openqa.selenium.By;

public class CartPage extends LoginPage {

    private static By icnCart =By.xpath("//div[@class='minicart-wrapper']");
    private static By btnViewCart = By.xpath("//*[@id=\"minicartOffcanvas\"]/div/div[2]/div[2]/div[1]/div/a");
    private static By lnkShoeDetail = By.xpath("//table[@id='shopping-cart-table']/tbody[@class='cart item']//strong/a[@href='https://www.theathletesfoot.com.au/adidas-ultraboost-womens-ice-blue.html']");
    private static By txtProductName = By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[1]/div/strong/a");
    private static By txtProductPrice = By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[2]/span/span/span");
    private static By btnSecureCheckout = By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[2]/ul/li[1]/button");
    private static By txtFirstName = By.xpath("//ul[@class='top-links']/li[@class='greet welcome']/span[@class='name']/span[.='william  jacob']");
    private static By txtLastName = By.xpath("//*[@id=\"OAKTEM9\"]");





    public String getProductName(){
        syscoLabUI.sleep(3);
        return syscoLabUI.getText(txtProductName);


    }

    public String getProductprice(){
        syscoLabUI.sleep(3);
        return syscoLabUI.getText(txtProductPrice);
    }

    public String getFirstName(){
        return syscoLabUI.getText(txtFirstName);
    }


    public String getLastName(){
        return syscoLabUI.getText(txtLastName);
    }

    public void verifyProductDetails(){

        syscoLabUI.click(icnCart);
        syscoLabUI.sleep(3);
        syscoLabUI.click(btnViewCart);
        syscoLabUI.sleep(3);
        syscoLabUI.getText(txtProductName);
        syscoLabUI.sleep(3);
        syscoLabUI.getText(txtProductPrice);
        syscoLabUI.sleep(5);
        syscoLabUI.click(btnSecureCheckout);

    }


}

