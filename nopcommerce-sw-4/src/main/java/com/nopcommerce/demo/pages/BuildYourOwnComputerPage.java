package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {


    By buildYourOwnComputerText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By processorDropDownList = By.id("product_attribute_1");
    By ramDropDownList = By.id("product_attribute_2");
    By hddRadioButton = By.id("product_attribute_3_7");
    By osRadioButton = By.id("product_attribute_4_9");
    By totalCommanderCheckBox = By.id("product_attribute_5_12");
    By totalPrice = By.id("price-value-1");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-1']");
    By messageConfirmationGreenColor = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By crossToCloseBrowser = By.xpath("//span[@class = 'close']");
    By verifyShoppingCart = By.xpath("//a[@class='ico-cart']");
    By goToCartButton = By.xpath("//span[@class='cart-label']");


    public String getTextFromBuildYourOwnComputerPage() {
        return getTextFromElement(buildYourOwnComputerText);
    }

    public void selectProcessor(String processor) {
        selectByVisibleTextFromDropDown(processorDropDownList, processor);
    }

    public void selectRam(String ram) {
        selectByVisibleTextFromDropDown(ramDropDownList, ram);
    }

    public void selectHdd() {
        clickOnElement(hddRadioButton);
    }

    public void selectOs() {
        clickOnElement(osRadioButton);
    }

    public void selectSoftware() {
        clickOnElement(totalCommanderCheckBox);
    }

    public String checkTotalPrice() {
        return getTextFromElement(totalPrice);
    }

    public void addToCartLink() {
        mouseHoverToElementAndClick(addToCart);
    }

    public String shoppingCartMessage() {
        return getTextFromElement(messageConfirmationGreenColor);
    }

    public void closeTheGreenBar() {
        clickOnElement(crossToCloseBrowser);
    }

    public void checkShoppingCart() {
        mouseHoverToElementAndClick(verifyShoppingCart);
    }

//    public void mouseHoverOnGoToCartButton() {
//        mouseHoverToElementAndClick(goToCartButton);
//    }
}

