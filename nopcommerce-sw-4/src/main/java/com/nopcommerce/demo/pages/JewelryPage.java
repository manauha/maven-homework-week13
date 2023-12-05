package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class JewelryPage extends Utility {

    By JewelryMenu = By.partialLinkText("Jewelry");
    public String getJewelryMenuText(){
        return getTextFromElement(JewelryMenu);
    }
}
