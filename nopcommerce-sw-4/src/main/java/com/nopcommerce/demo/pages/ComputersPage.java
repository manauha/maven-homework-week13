package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ComputersPage extends Utility {

    By computersMenu = By.partialLinkText("Computers");

    By desktops = By.linkText("Desktops");

    public String getComputersTabText(){
        return getTextFromElement(computersMenu);
    }

    public void ClickOnDesktops(){
        clickOnElement(desktops);
    }
}
