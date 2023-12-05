package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By checkTextShoppingCart = By.xpath("//h1[contains(text(),'Shopping Cart')]");

    // * 2.13	Verify the text "Shopping Cart"
    public String verifyTextForShoppingCart() {
        return getTextFromElement(checkTextShoppingCart);
    }

    //*********************************   Desktops   ********************************************************


    By checkProductName = By.xpath("(//a[contains(text(),'HP LP3065')])[2]");
    By checkDeliveryDate = By.xpath("//small[normalize-space()='Delivery Date:2025-11-27']");
    By checkModelNumber = By.xpath("//td[normalize-space()='Product 21']");
    By checkTotalPrice = By.xpath("(//td[contains(text(),'£74.73')])[4]");


    // * 2.14	Verify the Product name "HP LP3065"
    public String verifyProductNameIsHPLP3065() {
        return getTextFromElement(checkProductName);
    }

    // * 2.15	Verify the Delivery Date "2025-11-27"
    public String verifyDeliveryDateOfProduct() {
        return getTextFromElement(checkDeliveryDate);
    }

    // * 2.16	Verify the Model "Product21"
    public String verifyModelNumberOfProduct() {
        return getTextFromElement(checkModelNumber);
    }

    // * 2.17	Verify the Total "£74.73"
    public String verifyTotalPriceOfProduct() {
        return getTextFromElement(checkTotalPrice);
    }

    //*************************************   MacBook  ***********************************************************


    By checkNameOfProductMacBook = By.xpath("(//a[contains(text(),'MacBook')])[2]");
    By clearTheQtyBox = By.xpath("//input[@class='form-control']");
    By changeQuantity = By.xpath("//input[@class='form-control']");
    By updateTheBox = By.xpath("(//button[@type='submit'])[1]");
    By modifiedSuccessMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By totalPrice = By.xpath("(//td[contains(text(),'£737.45')])[3]");
    By checkOutButton = By.xpath("//a[@class='btn btn-primary']");

    // * 2.10	Verify the Product name "MacBook"
    public String verifyProductNameIsMacBook() {
        return getTextFromElement(checkNameOfProductMacBook);
    }

    // * 2.11	Change Quantity "2"
    public void clearTheQtyBox() {
        clearTextField(clearTheQtyBox);
    }

    public void enterQuantityIntoTheBox(String qty) {
        sendTextToElement(changeQuantity, qty);
    }

    // * 2.12	Click on “Update” Tab
    public void clickOnUpdateTheQuantityBox() {
        clickOnElement(updateTheBox);
    }

    // * 2.13	Verify the message “Success: You have modified your shopping cart!”
    public String verifyUpdatedSuccessMessage() {
        return getTextFromElement(modifiedSuccessMessage);
    }

    // * 2.14	Verify the Total £737.45
    public String verifyTotalPrice() {
        return getTextFromElement(totalPrice);
    }

    // * 2.15	Click on “Checkout” button
    public void clickOnCheckOutButton() {
        clickOnElement(checkOutButton);
    }
}
