package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class OverNightDufflePage extends Utility {

    By overnightDuffleText = By.xpath("//span[@class='base']");
    By clearQuantity = By.id("qty");
    By changeQuantity = By.id("qty");
    By addToCart = By.xpath("//button[@id='product-addtocart-button']");
    By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");
    By itemsAdded = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");


    // * *	Verify the text ‘Overnight Duffle’
    public String verifyOvernightDuffleTextOnPage() {
        return getTextFromElement(overnightDuffleText);
    }

    //Clear the amount first
    public void clearQuantityField() {
        clearTextField(clearQuantity);
    }

    // * *	Change Qty 3
    public void changeQuantityNumber(String quantity) {
        sendTextToElement(changeQuantity, quantity);
    }

    // * *	Click on ‘Add to Cart’ Button.
    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    // * *	Verify the text ‘You added Overnight Duffle to your shopping cart.’
    public String verifyItemsAddedToShoppingCart() {
        return getTextFromElement(itemsAdded);
    }


    // * *	Click on ‘shopping cart’ Link into message
    public void clickOnShoppingCartLinkInsideTheMessage() {
        clickOnElement(shoppingCartLink);
    }
}
