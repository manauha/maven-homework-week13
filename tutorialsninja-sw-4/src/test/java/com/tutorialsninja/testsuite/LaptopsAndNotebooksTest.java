package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopsAndNotebooksTest extends BaseTest {

    HomePage homePage = new HomePage();
    LaptopAndNoteBookPage laptopAndNoteBookPage = new LaptopAndNoteBookPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    MacbookPage macbookPage = new MacbookPage();

    //* 1. Test name verifyProductsPriceDisplayHighToLowSuccessfully()
    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() throws InterruptedException {

        // * 1.1	Mouse hover on Laptops & Notebooks Tab.and click
        homePage.mouseHoverOnLaptopsAndNotebooksMenu();

        // * 1.2	Click on “Show All Laptops & Notebooks”
        Thread.sleep(500);
        homePage.selectMenu("Show AllLaptops & Notebooks");

        // * 1.3	Select Sort By "Price (High > Low)"
        Thread.sleep(500);
        laptopAndNoteBookPage.selectSortByPriceHighToLow("Price (High > Low)");

        // * 1.4	Verify the Product price will arrange in High to Low order.
        Thread.sleep(1500);
        String actualPrice = laptopAndNoteBookPage.verifyProductPriceArrangeInHighToLow();
        String expectedPrice = "$2,000.00";
        String expectedMessage = expectedPrice + "\n" + "Ex Tax:" + expectedPrice;
        Assert.assertEquals(actualPrice, expectedMessage, "Incorrect price  order!");
    }

    @Test
    // * 2. Test name verifyThatUserPlaceOrderSuccessfully()
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {

        // 	Mouse hover on Currency Dropdown and click
        Thread.sleep(5000);
        homePage.mouseHoverAndClickOnCurrencyDroDownMenu();

        // 	Mouse hover on £Pound Sterling and click
        Thread.sleep(2000);
        homePage.selectOnSterlingPoundCurrency();

        // * 2.1	Mouse hover on Laptops & Notebooks Tab and click
        Thread.sleep(500);
        homePage.mouseHoverOnLaptopsAndNotebooksMenu();

        // * 2.2	Click on “Show All Laptops & Notebooks”
        Thread.sleep(500);
        homePage.selectMenu("Show AllLaptops & Notebooks");

        // * 2.3	Select Sort By "Price (High > Low)"
        Thread.sleep(500);
        laptopAndNoteBookPage.selectSortByPriceHighToLow("Price (High > Low)");

        // * 2.4	Select Product “MacBook”
        Thread.sleep(500);
        laptopAndNoteBookPage.selectMacBookProduct();

        // * 2.5	Verify the text “MacBook”
        Thread.sleep(500);
        String actualText = macbookPage.verifyTheTextMacBook();
        String expectedText = "MacBook";
        Assert.assertEquals(actualText, expectedText, "Incorrect Product Text displayed!");

        // * 2.6	Click on ‘Add To Cart’ button
        Thread.sleep(500);
        macbookPage.clickOnAddToCart();

        // * 2.7	Verify the message “Success: You have added MacBook to your shopping cart!”
        Thread.sleep(500);
        String actualSuccessMessage = macbookPage.verifySuccessMessageForAddingProductToShoppingCart();
        String expectedSuccessMessage = "Success: You have added MacBook to your shopping cart!\n×";
        Assert.assertEquals(actualSuccessMessage, expectedSuccessMessage, "Invalid Success Message!");

        // * 2.8	Click on link “shopping cart” display into success message
        Thread.sleep(500);
        macbookPage.clickOnLinkToShoppingCartMessage();

        // * 2.9	Verify the text "Shopping Cart"
        Thread.sleep(1000);
        String actualCartText = shoppingCartPage.verifyTextForShoppingCart();
        String expectedCartText = "Shopping Cart  (0.00kg)";
        Assert.assertEquals(actualCartText, expectedCartText, "Incorrect Shopping Cart Message displayed!");

        // * 2.10	Verify the Product name "MacBook"
        Thread.sleep(1000);
        String actualProductName = shoppingCartPage.verifyProductNameIsMacBook();
        String expectedProductName = "MacBook";
        Assert.assertEquals(actualProductName, expectedProductName, "Incorrect product Name displayed!");

        // * 2.11	Change Quantity "2"
        Thread.sleep(1000);
        shoppingCartPage.clearTheQtyBox();
        Thread.sleep(1000);
        shoppingCartPage.enterQuantityIntoTheBox("2");

        // * 2.12	Click on “Update” Tab
        Thread.sleep(1000);
        shoppingCartPage.clickOnUpdateTheQuantityBox();

        // * 2.13	Verify the message “Success: You have modified your shopping cart!”
        Thread.sleep(100);
        String actualUpdatedMessage = shoppingCartPage.verifyUpdatedSuccessMessage();
        String expectedUpdatedMessage = "Success: You have modified your shopping cart!\n×";
        Assert.assertEquals(actualUpdatedMessage, expectedUpdatedMessage, "Incorrect updated message displayed!");

        // * 2.14	Verify the Total £737.45
        Thread.sleep(1000);
        String actualTotalPrice = shoppingCartPage.verifyTotalPrice();
        String expectedTotalPrice = "£737.45";
        Assert.assertEquals(actualTotalPrice, expectedTotalPrice, "Incorrect total price displayed!");

        // * 2.15	Click on “Checkout” button
        Thread.sleep(1000);
        shoppingCartPage.clickOnCheckOutButton();

        // * 2.16	Verify the text “Checkout”
        Thread.sleep(1000);
        String actualCheckOutText = checkOutPage.verifyCheckOutText();
        String expectedCheckOutText = "Checkout";
        Assert.assertEquals(actualCheckOutText, expectedCheckOutText, "Incorrect checkout text displayed!");


        // * 2.17	Verify the Text “New Customer”
        Thread.sleep(1000);
        String actualNewCustomerText = checkOutPage.verifyTextNewCustomer();
        String expectedNewCustomerText = "New Customer";
        Assert.assertEquals(actualNewCustomerText, expectedNewCustomerText, "Incorrect new customer text displayed!");

        // * 2.18	Click on “Guest Checkout” radio button
        Thread.sleep(500);
        checkOutPage.clickOnGuestCheckOutButton();

        // * 2.19	Click on “Continue” tab
        Thread.sleep(500);
        checkOutPage.clickOnContinueButtonTab();

        // * 2.20	Fill the mandatory fields
        Thread.sleep(500);
        checkOutPage.enterFirstNameIntoTheFirstNameField("Neil");
        Thread.sleep(500);
        checkOutPage.enterLastNameIntoTheLastNameField("Cooper");
        Thread.sleep(500);
        checkOutPage.enterEmailIntoTheEmailField("neilcooper23@test.com");
        Thread.sleep(500);
        checkOutPage.enterTelephoneIntoTheTelephoneField("07980456123");
        Thread.sleep(500);
        checkOutPage.enterAddressIntoTheAddress1Field("Barr Road");
        Thread.sleep(500);
        checkOutPage.enterCityIntoTheCityField("Bath");
        Thread.sleep(500);
        checkOutPage.enterPostcodeIntoThePostCodeField("BA4 5AB");
        Thread.sleep(500);
        checkOutPage.enterCountryIntoTheCountryField("United Kingdom");
        Thread.sleep(500);
        checkOutPage.enterZoneIntoTheZoneField("Bath");

        // * 2.21	Click on “Continue” Button
        Thread.sleep(500);
        checkOutPage.clickOnContinueButtonForGuest();

        // * 2.22	Add Comments About your order into text area
        Thread.sleep(500);
        checkOutPage.addCommentsAboutYourOrderIntoTheTextArea("Drop in porch");

        // * 2.23	Check the Terms & Conditions check box
        Thread.sleep(500);
        checkOutPage.clickOnCheckBoxForTermsAndConditions();

        // * 2.24	Click on “Continue” button
        Thread.sleep(500);
        checkOutPage.clickOnContinueButtonForPaymentMethod();

        // * 2.25	Verify the message “Warning: Payment method required!”
        Thread.sleep(1500);
        String actualWarningText = checkOutPage.verifyWarningMessageForPaymentMethod();
        String expectedWarningText = "Warning: Payment method required!\n×";
        Assert.assertEquals(actualWarningText, expectedWarningText, "Incorrect warning message displayed!");

    }
}
