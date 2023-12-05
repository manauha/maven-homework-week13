package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

import java.util.UUID;

public class RegisterPage extends Utility {

    By registerAccount = By.xpath("//h1[normalize-space()='Register Account']");
    By returningCustomerText = By.xpath("//h2[normalize-space()='Returning Customer']");
    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By telephoneNumber = By.id("input-telephone");
    By passwordField = By.id("input-password");
    By confirmPasswordField = By.xpath("//input[@id='input-confirm']");
    By subscribeRadioButton = By.xpath("//label[normalize-space()='Yes']");
    By privacyCheckBox = By.cssSelector("input[value='1'][name='agree']");
    By continueButton = By.xpath("//input[@value='Continue']");


    // * 1.3	Verify the text “Register Account”.
    public String verifyRegisterAccountText() {
        return getTextFromElement(registerAccount);
    }

    // * 2.3	Verify the text “Returning Customer”.
    public String verifyTextReturningCustomerOnLoginPage() {
        return getTextFromElement(returningCustomerText);
    }

    // * 3.3	Enter First Name
    public void enterFirstName(String name) {
        sendTextToElement(firstName, name);
    }
    // * 3.4	Enter Last Name

    public void enterLastName(String surname) {
        sendTextToElement(lastName, surname);
    }

    // * 3.5	Enter Email
    final String randomEmail = randomEmail();

    public void enterEmail(String emailAddress) {
        sendTextToElement(email, emailAddress);
    }

    public static String randomEmail() {
        return "random-" + UUID.randomUUID().toString() + "@test.com";
    }

    // * 3.6	Enter Telephone
    public void enterTelephoneNumber(String phone) {
        sendTextToElement(telephoneNumber, phone);
    }

    // * 3.7	Enter Password
    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    // * 3.8	Enter Password Confirm
    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(confirmPasswordField, confirmPassword);
    }

    // * 3.9	Select Subscribe Yes radio button
    public void clickOnSubscribeRadioButton() {
        clickOnElement(subscribeRadioButton);
    }

    // * 3.10	Click on Privacy Policy check box
    public void clickOnPrivacyPolicyCheckBox() {
        clickOnElement(privacyCheckBox);
    }

    // * 3.11	Click on Continue button
    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }
}
