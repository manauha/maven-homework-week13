package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.Homepage;
import com.softwaretestingboard.magento.pages.OverNightDufflePage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {

    Homepage homepage = new Homepage();
    BagsPage bagsPage = new BagsPage();
    OverNightDufflePage overnightDufflePage = new OverNightDufflePage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();


    //1. userShouldAddProductSuccessFullyToShoppingCart()
    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {

        // * *	Mouse Hover on Gear Menu
        Thread.sleep(500);
        homepage.mouseHoverToGearMenuList();

        // * *	Click on Bags
        Thread.sleep(500);
        homepage.clickOnBags();

        // * *	Click on Product Name ‘Overnight Duffle’
        Thread.sleep(500);
        bagsPage.mouseHoverOnOverNightDuffleProductName();

        // * *	Verify the text ‘Overnight Duffle’
        Thread.sleep(500);
        String actualProductName = overnightDufflePage.verifyOvernightDuffleTextOnPage();
        String expectedProductName = "Overnight Duffle";
        Assert.assertEquals(actualProductName, expectedProductName, "Incorrect Product Name displayed!");

        // * *	Change Qty 3
        Thread.sleep(500);
        overnightDufflePage.clearQuantityField();


        overnightDufflePage.changeQuantityNumber("3");
        Thread.sleep(500);
        // * *	Click on ‘Add to Cart’ Button.

        overnightDufflePage.clickOnAddToCart();

        // * *	Verify the text ‘You added Overnight Duffle to your shopping cart.’
        String actualText = overnightDufflePage.verifyItemsAddedToShoppingCart();
        String expectedText = "You added Overnight Duffle to your shopping cart.";
        Assert.assertEquals(actualText, expectedText, "Incorrect Message Displayed!");

        // * *	Click on ‘shopping cart’ Link into message
        Thread.sleep(500);
        overnightDufflePage.clickOnShoppingCartLinkInsideTheMessage();

        // * *	Verify the product name ‘Overnight Duffle’
        Thread.sleep(500);
        String actualProductItemName = shoppingCartPage.verifyProductNameCronusYogaPant();
        String expectedProductItemName = "Overnight Duffle";
        Assert.assertEquals(actualProductItemName, expectedProductItemName, "Incorrect Product Name Displayed!");

        // * *	Verify the Qty is ‘3’
        Thread.sleep(500);
        String actualProductQuantity = shoppingCartPage.verifyTheQuantityIsThree();
        String expectedProductQuantity = "3";
        Assert.assertEquals(actualProductQuantity, expectedProductQuantity, "Incorrect Quantity Displayed!");

        // * *	Verify the product price ‘$135.00’
        Thread.sleep(500);
        String actualProductPrice = shoppingCartPage.verifyProductPrice();
        String expectedProductPrice = "$135.00";
        Assert.assertEquals(actualProductPrice, expectedProductPrice, "Incorrect Price Displayed!");

        // * *	Change Qty to ‘5’
        Thread.sleep(500);
        shoppingCartPage.clearQuantityField();
        Thread.sleep(500);
        shoppingCartPage.changeQuantityNumber("5");


        // * *	Click on ‘Update Shopping Cart’ button
        Thread.sleep(500);
        shoppingCartPage.clickOnUpdateShoppingCart();

        // * *	Verify the product price ‘$225.00’
        Thread.sleep(500);
        String actualProductTotalPrice = shoppingCartPage.verifyTheProductTotalPrice();
        String expectedProductTotalPrice = "$225.00";
        Assert.assertEquals(actualProductTotalPrice, expectedProductTotalPrice, "Incorrect total price displayed!");
    }
}







