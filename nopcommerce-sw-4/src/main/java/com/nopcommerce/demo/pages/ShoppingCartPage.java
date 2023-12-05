package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {


    By shoppingCartTitlePage = By.xpath("//h1[normalize-space()='Shopping cart']");
    By clearField = By.xpath("//input[@class='qty-input']");
    By quantityField = By.xpath("//input[@class='qty-input']");
    By updateCart = By.xpath("//button[@id='updatecart']");
    By totalUpdatedPrice = By.xpath("//span[@class='product-subtotal']");
    By termsAndConditionBox = By.xpath("//input[@id='termsofservice']");
    By checkOutButton = By.id("checkout");
    By checkTheQuantity = By.xpath("//input[@id='itemquantity11272']");
    By checkTotalPrice = By.xpath("//span[text() = '$698.00']");

    public String getShoppingCartMessage() {
        return getTextFromElement(shoppingCartTitlePage);
    }

    public void quantityField() {
        clearMethod(clearField);
        sendTextToElement(quantityField, "2");
    }

    public void updateCart(){
        clickOnElement(updateCart);
    }

    public String getUpdatedPrice() {
        return getTextFromElement(totalUpdatedPrice);
    }

    public void termsAndConditionCheckBox(){
        clickOnElement(termsAndConditionBox);
    }

    public void clickCheckOut(){
        clickOnElement(checkOutButton);
    }

    public String verifyTheQuantityIsTwo(){
        return getTextFromElement(checkTheQuantity);
    }

    public String getTotalPrice(){
        return getTextFromElement(checkTotalPrice);
    }
}

