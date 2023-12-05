package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {

    By signIn = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By register = By.linkText("Register");

    public String getWelcomeText(){
        return getTextFromElement(signIn);
    }

    public void clickOnRegister(){
        clickOnElement(register);
    }


}
