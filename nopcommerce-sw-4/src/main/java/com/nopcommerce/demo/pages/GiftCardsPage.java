package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class GiftCardsPage extends Utility {

    By computersMenu = By.partialLinkText("Gift Cards");
    public String getGiftCardsMenuText(){
        return getTextFromElement(computersMenu);
    }
}
