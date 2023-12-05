package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ProductCheckOutPage  extends Utility {

    // * 2.27	Fill the Mandatory fields
    By firstNameField = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastNameField = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By emailField = By.xpath("//input[@id='BillingNewAddress_Email']");
    By countryList = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By cityBox = By.xpath("//input[@id='BillingNewAddress_City']");
    By address1Line= By.xpath("//input[@id='BillingNewAddress_Address1']");
    By postalCodeBox = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumberBox = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueButton = By.xpath("//button[@onclick='Billing.save()']");
    By nextDayAirRadioButton = By.xpath("//input[@id='shippingoption_2']");
    By shippingMethodContinueButton = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By cardNumberField = By.id("CardNumber");
    By creditCardRadioButton = By.xpath("//input[@id='paymentmethod_1']");
    By clickContinueButton = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By selectVisaCardFromDropDown= By.xpath("//select[@id='CreditCardType']");
    By cardHolderNameField = By.id("CardholderName");
    By ExpireMonthField = By.id("ExpireMonth");
    By expireMonthField = By.id("ExpireMonth");
    By expireYearField = By.id("ExpireYear");
    By threeDigitCodeField = By.id("CardCode");
    By clickOnPaymentContinue = By.cssSelector(".button-1.payment-info-next-step-button");

    public void enterFirstName(String firstName){
        clearMethod(firstNameField);
        sendTextToElement(firstNameField, firstName);
    }
    public void enterLastName(String lastName){
        clearMethod(lastNameField);
        sendTextToElement(lastNameField, lastName);
    }
    public void enterEmail(String email){
        clearMethod(emailField);
        sendTextToElement(emailField, email);
    }
    public void selectCountryFromDropDown(String country) {
        selectByVisibleTextFromDropDown(countryList, country);
    }

    public void enterCity(String cityName){
        sendTextToElement(cityBox, cityName);
    }

    public void enterAddress(String address){
        sendTextToElement(address1Line,address );
    }

    public void enterPostCode(String postcode){
        sendTextToElement(postalCodeBox, postcode);
    }

    public void enterPhoneNumber(String phoneNumber){
        sendTextToElement(phoneNumberBox, phoneNumber);
    }

    public void clickOnContinue(){
        clickOnElement(continueButton);
    }

    public void clickOnRadioButtonSecondDayAir(){
        clickOnElement(nextDayAirRadioButton);
    }

    public void clickOnButtonContinueInShippingMethod(){
        clickOnElement(shippingMethodContinueButton);
    }

    public void clickOnRadioButtonOfCreditCard(){
        clickOnElement(creditCardRadioButton);
    }

    public void clickOnButtonContinueFromPaymentMethod(){
        clickOnElement(clickContinueButton);
    }

    public void selectVisaCard(String creditCard) {
        selectByVisibleTextFromDropDown(selectVisaCardFromDropDown, creditCard);
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
