package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterCompletionPage extends Utility {

    By completedRegistration = By.className("result");
    By continueTab = By.xpath("//a[contains(text(),'Continue')]");

    public String successfulRegistrationMessage(){
        return getTextFromElement(completedRegistration);
    }

    public void clickOnContinueTab(){
        clickOnElement(continueTab);
    }
}
