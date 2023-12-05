package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MensPage extends Utility {

    By cronusYogaPant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By clickOnCronusYogaPant = By.xpath("(//div[@class='swatch-option text'])[1]");
    By colourOfPant = By.xpath("(//div[@class='swatch-option color'])[1]");
    By mouseHoverToProductName = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By addToCart = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
    By verifyTextAdded = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By clickOnMessage = By.xpath("//a[normalize-space()='shopping cart']");


    // * *	Mouse Hover on product name ‘Cronus Yoga Pant’
    public void mouseHoverCronusYogaPant() {
        mouseHoverToElement(cronusYogaPant);
    }

    //and click on size 32.
    public void clickOnSize(int size) {
        mouseHoverToElementAndClick(clickOnCronusYogaPant);
    }

    // * *	Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
    public void mouseHoverAndClickOnColour(String colour) {
        mouseHoverToElementAndClick(colourOfPant);
    }

    // * *	Mouse Hover on product name ‘Cronus Yoga Pant’
    public void mouseHoverToCronusYogaPant() {
        mouseHoverToElement(mouseHoverToProductName);
    }

    // and click on ‘Add To Cart’ Button.
    public void clickOnAddToCartButton() {
        clickOnElement(addToCart);
    }

    // * *	Verify the text You added Cronus Yoga Pant to your shopping cart.
    public String getTextCronusYogaPantAdded() {
        return getTextFromElement(verifyTextAdded);
    }

    // * *	Click on ‘shopping cart’ Link into message
    public void clickOnShoppingCartLinkInsideMessage() {
        clickOnElement(clickOnMessage);
    }

}
