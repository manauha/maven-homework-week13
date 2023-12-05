package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.Homepage;
import com.softwaretestingboard.magento.pages.MensPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {

    Homepage homepage = new Homepage();
    MensPage mensPage = new MensPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();


    //1. userShouldAddProductSuccessFullyTo ShoppingCart()

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {

        // * *	Mouse Hover on Men Menu
        Thread.sleep(2000);
        homepage.mouseHoverToMenMenuList();

        // * *	Mouse Hover on Bottoms
        Thread.sleep(2000);
        homepage.mouseHoverOnMenBottoms();

        // * *	Click on Pants
        Thread.sleep(2000);
        homepage.clickOnPants();

        // * *	Mouse Hover on product name ‘Cronus Yoga Pant’
        mensPage.mouseHoverCronusYogaPant();
        //and click on size 32.
        mensPage.clickOnSize(32);

        // * *	Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
        mensPage.mouseHoverAndClickOnColour("Black");

        // * *	Mouse Hover on product name ‘Cronus Yoga Pant’
        mensPage.mouseHoverToCronusYogaPant();

        // and click on ‘Add To Cart’ Button.
        mensPage.clickOnAddToCartButton();

        // * *	Verify the text You added Cronus Yoga Pant to your shopping cart.
        mensPage.getTextCronusYogaPantAdded();

        // * *	Click on ‘shopping cart’ Link into message
        mensPage.clickOnShoppingCartLinkInsideMessage();

        // * *	Verify the text ‘Shopping Cart.’
        shoppingCartPage.verifyShoppingCartText();

        // * *	Verify the product name ‘Cronus Yoga Pant’
        shoppingCartPage.verifyProductsNameIsCronusYogaPant();

        // * *	Verify the product size ‘32’
        shoppingCartPage.verifyProductSizeIs32();

        // * *	Verify the product colour ‘Black’
        shoppingCartPage.verifyProductColourIsBlack();
    }
}
