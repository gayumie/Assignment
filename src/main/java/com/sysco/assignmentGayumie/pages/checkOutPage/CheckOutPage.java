package com.sysco.assignmentGayumie.pages.checkOutPage;

import com.sysco.assignmentGayumie.pages.loginPage.LoginPage;
import org.openqa.selenium.By;

import java.awt.*;
import java.awt.event.KeyEvent;

public class CheckOutPage extends LoginPage {

    private static By btnContinue = By.xpath("//*[@id=\"checkout\"]/div[2]/div[1]/div[3]/button");
    private static By txtCityVerification = By.xpath("//div[@id='shipping-new-address-form']/div[@name='shippingAddress.city']/div[@class='control']/div[@class='field-error mage-error']/span[.='This is a required field.']");
    private static By txtStateVerification = By.xpath("//*[@id=\"error-NC6EYJR\"]");
    private static By txtPostVerification = By.xpath("//div[@id='shipping-new-address-form']/div[@name='shippingAddress.postcode']/div[@class='control']/div[@class='field-error mage-error']/span[.='This is a required field.']");
    private static By txtPhoneVerification = By.xpath("//div[@id='shipping-new-address-form']/div[@name='shippingAddress.telephone']//div[@class='field-error']/span[.='This is a required field.']");
    private static By txtCompany = By.xpath("//div[@id='shipping-new-address-form']/div[@name='shippingAddress.company']//input[@name='company']");
    private static By txtAddress = By.xpath("//div[@id='shipping-new-address-form']/fieldset//div[@name='shippingAddress.street.0']//input[@name='street[0]']");
    private static By txtCity = By.xpath("//*[@id=\"E1YVM0G\"]");
    private static By dpdSelect=By.xpath("//*[@id=\"ORKA43C\"]");
    private static By getDpdSelectOption = By.xpath("//*[@id=\"X18WOWP\"]/option[8]");
    private static By txtPostCode = By.xpath("//div[@id='shipping-new-address-form']/div[@name='shippingAddress.postcode']//input[@name='postcode']");
    private static By drpdwnPostCode = By.xpath("//div[@id='shipping-new-address-form']//ul/li[1]/a[@class='link ui-corner-all']");
    private static By txtContactNumber = By.xpath("//div[@id='shipping-new-address-form']/div[@name='shippingAddress.telephone']/div//input[@name='telephone']");
    private static By btnProceed = By.xpath("//div[@id='checkout']/div[2]//button[@title='Continue']");
    private static By btnCreditCard = By.xpath("//div[@id='checkout-payment-method-load']//div[@class='payment-group']/div[3]/div[1]/label[@class='label']");
    private static By btnPlaceOrder = By.xpath("//div[@id='checkout']/div[2]//button[@title='Place Order']");
    private static By txtCreditCardVerification = By.xpath("//fieldset[@id='payment_form_braintree']//span[.='Please, enter valid Credit Card Number']");


    public void clickContnue(){
        syscoLabUI.sleep(3);
        syscoLabUI.click(btnContinue);
    }

    public String isDisplayedEmptyErrorCity() {
        return (syscoLabUI.getText(txtCityVerification));
    }

    public String isDisplayedEmptyErrorState() {
        return (syscoLabUI.getText(txtStateVerification));
    }

    public String isDisplayedEmptyErrorPost()
    {
        return (syscoLabUI.getText(txtPostVerification));
    }

    public String isDisplayedEmptyErrorPhone() {
        return (syscoLabUI.getText(txtPhoneVerification));
    }


    public void enterCompany(String company) {
        syscoLabUI.sleep(10);
        syscoLabUI.click(txtCompany);
        syscoLabUI.sendKeys(txtCompany, company);
        syscoLabUI.sleep(3);
    }


    public void enterAddress1(String address_1) {
        syscoLabUI.click(txtAddress);
        syscoLabUI.sendKeys(txtAddress, address_1);
        syscoLabUI.sleep(3);
    }

   /* public void enterCity(String city) {
        syscoLabUI.sendKeys(txtCity, city);
        syscoLabUI.sleep(3);
    }

    public void selectState(){
        syscoLabUI.click(dpdSelect);
        //syscoLabUI.click(getDpdSelectOption);
        syscoLabUI.sleep(3);

    }*/




    public void enterPostCode(String post_code) {
        syscoLabUI.click(txtPostCode);
        syscoLabUI.sendKeys(txtPostCode, post_code);
        syscoLabUI.sleep(1);
        syscoLabUI.click(drpdwnPostCode);

        try {
            Robot robot = new Robot();
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
            robot.keyPress(KeyEvent.VK_ENTER);
            syscoLabUI.sleep(1);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(1000);
        } catch (AWTException e) {
            e.printStackTrace();
        }


    }

    public void enterContactNumber(String contact_number) {
        syscoLabUI.sleep(5);
        syscoLabUI.sendKeys(txtContactNumber, contact_number);
        syscoLabUI.sleep(1);
    }

    public void clickProceed(){
        syscoLabUI.sleep(1);
        syscoLabUI.click(btnProceed);
    }

    public void clickCreditCard(){
        syscoLabUI.sleep(3);
        syscoLabUI.click(btnCreditCard);
    }
    public void clickPlaceOrder(){
        syscoLabUI.sleep(3);
        syscoLabUI.click(btnPlaceOrder);
        syscoLabUI.sleep(3);
    }

    public String isDisplayedCreditCardValidation() {
        return (syscoLabUI.getText(txtCreditCardVerification));
    }
}
