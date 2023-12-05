package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class PaymentPage extends Utility {

    // * 2.26	Select Radio Button “Credit Card”
    By creditCardRadioButton = By.id("paymentmethod_1");
    By clickOnContinue = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By selectMasterCardFromDropDown = By.id("CreditCardType");
    By cardHolderNameField = By.id("CardholderName");
    By cardNumberField = By.id("CardNumber");
    By ExpireMonthField = By.id("ExpireMonth");
    By expireMonthField = By.id("ExpireMonth");
    By expireYearField = By.id("ExpireYear");
    By threeDigitCodeField = By.id("CardCode");
    By clickOnPaymentContinue = By.cssSelector(".button-1.payment-info-next-step-button");

    public void creditCardButton() {
        clickOnElement(creditCardRadioButton);
    }

    public void clickContinue() {
        clickOnElement(clickOnContinue);
    }

    public void selectMasterCard(String creditCard) {
        selectByVisibleTextFromDropDown(selectMasterCardFromDropDown, creditCard);
    }

    public void enterCardHolderName(String cardHolderName) {
        sendTextToElement(cardHolderNameField, cardHolderName);
    }

    public void enterCardNumber(String cardNumber) {
        sendTextToElement(cardNumberField, cardNumber);
    }

    public void clickOnExpiryOfMasterCard() {
        clickOnElement(expireMonthField);
    }

    public void enterExpiryOfTheMonth(String expiryMonth) {
        selectByValueFromDropDown(expireMonthField, expiryMonth);
    }

    public void enterExpiryOfTheYear(String expiryYear) {
        selectByValueFromDropDown(expireYearField, expiryYear);
    }

    public void enterSecurityCardCode(String cardCode) {
        sendTextToElement(threeDigitCodeField, cardCode);
    }

    public void clickOnPaymentContinueButton() {
        clickOnElement(clickOnPaymentContinue);
    }
}
