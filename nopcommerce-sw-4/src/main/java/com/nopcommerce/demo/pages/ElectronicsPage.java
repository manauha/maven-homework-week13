package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {

    By electronicsTab = By.partialLinkText("Electronics");
    By cellPhonesMenu = By.linkText("Cell phones");

    public String getElectronicsMenuText(){
        return getTextFromElement(electronicsTab);
    }

    public void mouseHoverAndClickOnCellPhones(){
        mouseHoverToElementAndClick(cellPhonesMenu);

    }
}
