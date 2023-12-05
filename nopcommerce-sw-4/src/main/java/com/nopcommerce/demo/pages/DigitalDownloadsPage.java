package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DigitalDownloadsPage extends Utility {

    By digitalDownloadMenu = By.partialLinkText("Digital downloads");
    public String getDigitalDownloadMenuText(){
        return getTextFromElement(digitalDownloadMenu);
    }
}
