package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class OrderCompletionPage extends Utility {


    By verifyTheTextThankYou = By.xpath("//h1[text() = 'Thank you']");
    By verifySuccessfulMessage = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By clickOnContinueButtonOnOrderPage = By.xpath("//button[@class = 'button-1 order-completed-continue-button']");
    public String verifyingThankYouText(){
        return getTextFromElement(verifyTheTextThankYou);
    }

    public String verifyingSuccessfulOrderMessage(){
        return getTextFromElement(verifySuccessfulMessage);
    }

    public void clickOnContinueOrderCompletion(){
        clickOnElement(clickOnContinueButtonOnOrderPage);
    }
}
