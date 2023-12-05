package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By verifyTextForCart = By.xpath("//span[@class='base']");

    // * *	Verify the text ‘Shopping Cart.’
    public String verifyShoppingCartText() {
        return getTextFromElement(verifyTextForCart);
    }

    //*************************************************  Men Menu  ***************************************************


    // * * Verify the product name ‘Cronus Yoga Pant’
    // * *	Verify the product size ‘32’
    By checkProductName = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By productSize = By.xpath("//dd[contains(text(),'32')]");
    By productColour = By.xpath("//dd[contains(text(),'Black')]");

    public String verifyProductsNameIsCronusYogaPant() {
        return getTextFromElement(checkProductName);
    }

    public String verifyProductSizeIs32() {
        return getTextFromElement(productSize);
    }

    // * *	Verify the product colour ‘Black’
    public String verifyProductColourIsBlack() {
        return getTextFromElement(productColour);
    }

    //****************************************     Gear Menu      **************************************************


    By cronusYogaPant = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By checkQuantity = By.xpath("//span[@class='counter-number']");
    By productPrice = By.xpath("(//span[@class='cart-price']//span)[2]");
    By clearQuantity = By.xpath("//td[@class ='col qty']/child::div[1]/descendant::input");
    By changeQuantity = By.xpath("//td[@class ='col qty']/child::div[1]/descendant::input");
    By totalProductPrice = By.xpath("//span[contains(text(), '$225.00')]");
    By updateShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");


    // * *	Verify the product name ‘Overnight Duffle’
    public String verifyProductNameCronusYogaPant() {
        return getTextFromElement(cronusYogaPant);
    }

    // * *	Verify the Qty is ‘3’
    public String verifyTheQuantityIsThree() {
        return getTextFromElement(checkQuantity);
    }

    // * *	Verify the product price ‘$135.00’
    public String verifyProductPrice() {
        return getTextFromElement(productPrice);
    }

    //Clear the amount first
    public void clearQuantityField() {
        clearTextField(clearQuantity);
    }

    // * *	Change Qty to ‘5’
    public void changeQuantityNumber(String quantity) {
        sendTextToElement(changeQuantity, quantity);
    }

    // * *	Click on ‘Update Shopping Cart’ button
    public void clickOnUpdateShoppingCart() {
        clickOnElement(updateShoppingCart);
    }


    // * *	Verify the product price ‘$225.00’
    public String verifyTheProductTotalPrice() {
        return getTextFromElement(totalProductPrice);
    }


}
