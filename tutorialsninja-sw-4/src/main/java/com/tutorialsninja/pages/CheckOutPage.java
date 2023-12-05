package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {

    By checkOutText = By.xpath("//h1[normalize-space()='Checkout']");
    By checkNewCustomerText = By.xpath("//h2[normalize-space()='New Customer']");
    By guestCheckoutButton = By.xpath("//input[@value='guest']");
    By continueTabButton = By.cssSelector("#button-account");
    By firstName = By.id("input-payment-firstname");
    By lastName = By.id("input-payment-lastname");
    By emailAddress = By.id("input-payment-email");
    By telephone = By.id("input-payment-telephone");
    By addressField = By.id("input-payment-address-1");
    By cityName = By.id("input-payment-city");
    By zipCode = By.name("postcode");
    By countryName = By.id("input-payment-country");
    By zoneName = By.id("input-payment-zone");
    By continueButton = By.xpath("//input[@id='button-guest']");
    By addCommentIn = By.xpath("//textarea[@name='comment']");
    By termsAndConditions = By.cssSelector("input[value='1'][name='agree']");
    By continueButtonForPayment = By.xpath("//input[@id='button-payment-method']");
    By checkWarningForPayment = By.xpath("//div[@class ='alert alert-danger alert-dismissible']");


    // * 2.16	Verify the text “Checkout”
    public String verifyCheckOutText() {
        return getTextFromElement(checkOutText);
    }

    // * 2.17	Verify the Text “New Customer”
    public String verifyTextNewCustomer() {
        return getTextFromElement(checkNewCustomerText);
    }

    // * 2.18	Click on “Guest Checkout” radio button
    public void clickOnGuestCheckOutButton() {
        clickOnElement(guestCheckoutButton);
    }

    // * 2.19	Click on “Continue” tab
    public void clickOnContinueButtonTab() {
        clickOnElement(continueTabButton);
    }

    // * 2.20	Fill the mandatory fields
    public void enterFirstNameIntoTheFirstNameField(String name) {
        sendTextToElement(firstName, name);
    }

    public void enterLastNameIntoTheLastNameField(String surname) {
        sendTextToElement(lastName, surname);
    }

    public void enterEmailIntoTheEmailField(String email) {
        sendTextToElement(emailAddress, email);
    }

    public void enterTelephoneIntoTheTelephoneField(String phone) {
        sendTextToElement(telephone, phone);
    }

    public void enterAddressIntoTheAddress1Field(String address) {
        sendTextToElement(addressField, address);
    }

    public void enterCityIntoTheCityField(String city) {
        sendTextToElement(cityName, city);
    }

    public void enterPostcodeIntoThePostCodeField(String postcode) {
        sendTextToElement(zipCode, postcode);
    }

    public void enterCountryIntoTheCountryField(String country) {
        selectVisibleTextFromDropDown(countryName, country);
    }

    public void enterZoneIntoTheZoneField(String zone) {
        selectVisibleTextFromDropDown(zoneName, zone);
    }

    // * 2.21	Click on “Continue” Button

    public void clickOnContinueButtonForGuest() {
        clickOnElement(continueButton);
    }
    // * 2.22	Add Comments About your order into text area

    public void addCommentsAboutYourOrderIntoTheTextArea(String comment) {
        sendTextToElement(addCommentIn, comment);
    }
    // * 2.23	Check the Terms & Conditions check box


    public void clickOnCheckBoxForTermsAndConditions() {
        clickOnElement(termsAndConditions);
    }

    // * 2.24	Click on “Continue” button

    public void clickOnContinueButtonForPaymentMethod() {
        clickOnElement(continueButtonForPayment);
    }

    // * 2.25	Verify the message “Warning: Payment method required!”
    public String verifyWarningMessageForPaymentMethod() {
        return getTextFromElement(checkWarningForPayment);
    }
}
