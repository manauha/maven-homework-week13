package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By loginLinkPage = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By loginButton = By.linkText("Log in");
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By enterEmail = By.id("Email");
    By enterPassword = By.name("Password");
    By clickLogin = By.xpath("//button[contains(text(),'Log in')]");

    public String getLoginLinkPage() {
        return getTextFromElement(loginLinkPage);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String welcomeMessage(){
        return getTextFromElement(welcomeText);
    }

    public void enterEmailAddress (String email){
        sendTextToElement(enterEmail, email);
    }

    public void enterPassword(String password1){
        sendTextToElement(enterPassword, password1);
    }

    public void clickOnLogin(){
        clickOnElement(clickLogin);
    }
}
