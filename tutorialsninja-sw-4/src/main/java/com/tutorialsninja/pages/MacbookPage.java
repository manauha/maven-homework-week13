package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class MacbookPage extends Utility {


    By checkTextMacBook = By.xpath("//h1[normalize-space()='MacBook']");
    By addToCart = By.xpath("//button[@id='button-cart']");
    By successMessageForAddingProduct = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By linkToShoppingCartInsideMessage = By.xpath("//a[normalize-space()='shopping cart']");


    // * 2.5	Verify the text “MacBook”
    public String verifyTheTextMacBook() {
        return getTextFromElement(checkTextMacBook);
    }

    // * 2.6	Click on ‘Add To Cart’ button
    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    // * 2.7	Verify the message “Success: You have added MacBook to your shopping cart!”
    public String verifySuccessMessageForAddingProductToShoppingCart() {
        return getTextFromElement(successMessageForAddingProduct);
    }

    // * 2.8	Click on link “shopping cart” display into success message
    public void clickOnLinkToShoppingCartMessage() {
        clickOnElement(linkToShoppingCartInsideMessage);
    }
}
