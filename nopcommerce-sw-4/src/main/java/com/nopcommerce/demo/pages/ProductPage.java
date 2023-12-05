package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ProductPage extends Utility {

    By getTextNokiaLumia1020 = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    By getPriceOfNokiaLumia1020 = By.id("price-value-20");
    By Quantity = (By.id("product_enteredQuantity_20"));
    By changeQuantity = (By.id("product_enteredQuantity_20"));
    By clickOnAddToCart = (By.id("add-to-cart-button-20"));
    By greenBarMessage = (By.xpath("//p[@class='content']"));
    By closeButton = (By.xpath("//span[@class='close']"));
    By verifyShoppingCart = By.xpath("//a[@class='ico-cart']");
    By shoppingCartHover =  (By.xpath("//a[@class='ico-cart']"));
    By goToCart =(By.xpath("//span[@class='cart-label']"));

    public String getNokiaLumia1020Text(){
        return getTextFromElement(getTextNokiaLumia1020);
    }

    public String getNokiaLumia1020Price(){
        return getTextFromElement(getPriceOfNokiaLumia1020);
    }

    public void clearQuantity(){
        clearMethod(Quantity);
    }

    public void changeQuantityToTwo(){
        sendTextToElement(changeQuantity, "2");
    }

    public void clickOnAddToCartTab(){
        clickOnElement(clickOnAddToCart);
    }

    public String getTextTheProductHasBeenAddedToYourShoppingCartOnTopGreenBar(){
        return getTextFromElement(greenBarMessage);
    }
    public void closeTheSuccessBar(){
        clickOnElement(closeButton);
    }

    public void checkShoppingCart() {
        mouseHoverToElementAndClick(verifyShoppingCart);
    }

    public void mouseHoverOnShoppingCart(){
        mouseHoverToElement(shoppingCartHover);
    }

    public void clickOnGoToCart(){
        clickOnElement(goToCart);
    }
}
