package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {

    By welcomeMessage = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By guestTab = By.xpath("//button[normalize-space()='Checkout as Guest']");
    By firstNameField = By.id("BillingNewAddress_FirstName");
    By lastNameField = By.id("BillingNewAddress_LastName");
    By emailField = By.name("BillingNewAddress.Email");
    By countryField = By.id("BillingNewAddress_CountryId");
    By cityField = By.id("BillingNewAddress_City");
    By addressFiled = By.name("BillingNewAddress.Address1");
    By postCodeField = By.id("BillingNewAddress_ZipPostalCode");
    By telephoneField = By.id("BillingNewAddress_PhoneNumber");
    By clickOnContinue = By.xpath("//button[@onclick='Billing.save()']");

    //By clickOnContinue = By.id("shippingoption_1");
    By clickOnContinue1 = By.xpath("//button[@onclick='Billing.save()']");
    // * 2.18	Click on “REGISTER” tab
    By registerTab = By.xpath("//button[@class = 'button-1 register-button']");


    public String welcomeMessagePage() {
        return getTextFromElement(welcomeMessage);
    }

    public void clickAsGuestTab() {
        clickOnElement(guestTab);
    }

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterCountry(String country) {
        selectByValueFromDropDown(countryField, country);
    }

    public void enterCity(String city) {
        sendTextToElement(cityField, city);
    }

    public void enterAddress(String address) {
        sendTextToElement(addressFiled, address);
    }

    public void enterPostCode(String postcode) {
        sendTextToElement(postCodeField, postcode);
    }

    public void enterTelephone(String telephoneNumber) {
        sendTextToElement(telephoneField, telephoneNumber);
    }

    public void clickOnContinueButton() {
        clickOnElement(clickOnContinue1);
    }

    //******************************************************************************************************************
    public void clickOnRegisterTab(){
        clickOnElement(registerTab);
    }

}
