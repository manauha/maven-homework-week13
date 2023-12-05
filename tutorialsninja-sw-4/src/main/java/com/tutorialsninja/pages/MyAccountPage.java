package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class MyAccountPage extends Utility {


    By accountCreation = By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");
    By continueAccountButton = By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");
    By accountLogOutText = By.xpath("//a[normalize-space()='Logout']");
    By continueLogOutButton = By.xpath("//a[normalize-space()='Continue']");
    By loginButton = By.xpath("//input[@value='Login']");
    By checkTextForMyAccount = By.xpath("//h2[normalize-space()='My Account']");

    // * 3.12	Verify the message “Your Account Has Been Created!”
    public String verifyTheMessageYourAccountHasBeenCreated() {
        return getTextFromElement(accountCreation);
    }

    // * 3.13	Click on Continue button
    public void clickOnContinueAccountButton() {
        clickOnElement(continueAccountButton);
    }

    // * 3.16	Verify the text “Account Logout”
    public String verifyTextForAccountLogOut() {
        return getTextFromElement(accountLogOutText);
    }

    // * 3.17	Click on Continue button
    public void clickOnContinueLogOutButton() {
        clickOnElement(continueLogOutButton);
    }

    // * 4.6	Click on Login button
    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    // * 4.7	Verify text “My Account”
    public String verifyTheTextMyAccount() {
        return getTextFromElement(checkTextForMyAccount);
    }
}
