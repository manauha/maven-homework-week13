package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShippingPage extends Utility {

    By radioButton = By.id("shippingoption_1");
    By clickOnContinueButton = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");

    public void shippingMethodOption() {
        clickOnElement(radioButton);
    }

    public void continueButton() {
        clickOnElement(clickOnContinueButton);
    }
}

