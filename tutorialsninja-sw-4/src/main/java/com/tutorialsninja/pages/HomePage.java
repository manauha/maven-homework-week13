package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends Utility {



    //**************************************    DeskTops page 1.0    *************************************************

    By desktops = By.xpath("//a[normalize-space()='Desktops']");
    By desktopsText = By.xpath("//h2[normalize-space()='Desktops']");


    // * 1.1	Mouse hover on “Desktops” Tab and click
    //1.1 create method with name "selectMenu" it has one parameter name "menu" of type string
    public void selectMenu(String menu) {
        // * 1.2 This method should click on the menu whatever name is passed as parameter.
        WebElement menuList = driver.findElement(By.linkText(menu));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuList).click().build().perform();
    }

    public void mouseHoverOnDesktopMenu() {
        mouseHoverToElement(desktops);
    }

    // * 1.3	Verify the text ‘Desktops’
    public String verifyTheTextDesktops() {
        return getTextFromElement(desktopsText);
    }

    //*******************************  2.0 Laptops & Notebooks Page   *********************


    By laptopsAndNotebooks = By.xpath("//a[normalize-space()='Laptops & Notebooks']");
    By laptopsAndNotebooksText = By.xpath("//h2[normalize-space()='Laptops & Notebooks']");

    // * 2.1	Mouse hover on “Laptops & Notebooks” Tab and click
    public void mouseHoverOnLaptopsAndNotebooksMenu() {
        clickOnElement(laptopsAndNotebooks);
    }

    // * 2.3	Verify the text ‘Laptops & Notebooks’
    public String verifyTextForLaptopsAndNotebooks() {
        return getTextFromElement(laptopsAndNotebooksText);
    }


    //*************************************  3.0  Component Page     ******************************************


    By components = By.xpath("//a[normalize-space()='Components']");
    By componentsText = By.xpath("//h2[contains(text(),'Components')]");

    // * 3.1	Mouse hover on “Components” Tab and click
    public void mouseHoverOnComponentsMenu() {
        mouseHoverToElementAndClick(components);
    }

    // * 3.3	Verify the text ‘Components’
    public String verifyTextForComponents() {
        return getTextFromElement(componentsText);
    }


    //************************************* DeskTopsTest ***************************************************************


    By currencyDropDownMenu = By.xpath("//span[normalize-space()='Currency']");
    By sterlingPoundCurrency = By.xpath("//button[normalize-space()='£Pound Sterling']");


    // * 2.1	Mouse hover on Currency Dropdown and click
    public void mouseHoverAndClickOnCurrencyDroDownMenu() {
        mouseHoverToElementAndClick(currencyDropDownMenu);
    }

    // * 2.2	Mouse hover on £Pound Sterling and click
    public void selectOnSterlingPoundCurrency() {
        mouseHoverToElementAndClick(sterlingPoundCurrency);
    }

//*****************************************   Account Link  ************************************************************

    By accountLink = By.xpath("//span[normalize-space()='My Account']");

    // * 1.1	Click on My Account Link.
    public void clickOnAccountLink() {
        clickOnElement(accountLink);
    }
}

