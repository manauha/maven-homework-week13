package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class OrderConfirmationPage extends Utility {

    By paymentVerification = By.xpath("//li[@class='payment-method']");
    By shippingVerification = By.xpath("//li[@class = 'shipping-method']");
    By totalPriceVerification = By.xpath("//span[text() ='$2,950.00']");
    By confirmTheOrder = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
    By totalPriceNokiaLumia = By.xpath("//span[text() ='$698.00']");

    public String getTextOfPaymentVerification() {
        return getTextFromElement(paymentVerification);
    }

    public String getTextOfShippingVerification() {
        return getTextFromElement(shippingVerification);
    }

    public String verifyTotalPrice() {
        return getTextFromElement(totalPriceVerification);
    }

    public void clickOnConfirmOrder(){
        clickOnElement(confirmTheOrder);
    }

    public String verifyNokiaLumiaTotalPrice() {
        return getTextFromElement(totalPriceNokiaLumia);
    }
}



