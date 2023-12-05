package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ApparelPage extends Utility {

    By ApparelMenu = By.partialLinkText("Apparel");
    public String getApparelTabText(){
        return getTextFromElement(ApparelMenu);
    }
}
