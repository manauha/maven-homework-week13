package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DesktopPage extends Utility {

    By allProductOnPage = By.tagName("h4");
    By sortByFilter = By.xpath("//select[@id='input-sort']");

    // * 1.3	Select Sort By position "Name: Z to A"
    public List<WebElement> getAllProductTitleOnPage() {
        List<WebElement> products = findElementsList(allProductOnPage);
        return products;
    }

    public void sortByFilterOption(String options) {
        selectVisibleTextFromDropDown(sortByFilter, options);
    }


    //****************************************   DesktopsTest   ********************************************************

    By HPLP3065ProductName = By.xpath("//a[normalize-space()='HP LP3065']");
    By welcomeText = By.tagName("h2");


    // * 2.6	Select product “HP LP3065”
    public void clickOnHPLP3065Product() {
        clickOnElement(HPLP3065ProductName);
    }

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

}
