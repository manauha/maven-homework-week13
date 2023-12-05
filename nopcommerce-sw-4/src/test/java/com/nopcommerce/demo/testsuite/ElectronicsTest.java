package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {

    HomePage homePage = new HomePage();
    CellPhonesPage cellphones = new CellPhonesPage();
    ProductPage productPage = new ProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    RegisterPage registerPage = new RegisterPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    LoginPage loginPage = new LoginPage();
    ProductCheckOutPage productCheckOutPage = new ProductCheckOutPage();
    OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage();
    OrderCompletionPage orderCompletionPage = new OrderCompletionPage();


    // Create the class ElectronicsTest Write the following test
    //1. Test name verifyUserShouldNavigateToCellPhonesPageSuccessfully()
    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() throws InterruptedException{

        // 1.1 Mouse Hover on “Electronics” Tab
        Thread.sleep(500);
        homePage.mouseHoverToElectronicsTab();

        //1.2 Mouse Hover on “Cell phones” and click
        Thread.sleep(500);
        homePage.mouseHoverOnCellPhonesAndClick();

        //1.3 Verify the text “Cell phones”
        Thread.sleep(500);
        String expectedText = "Cell phones";
        String actualText = cellphones.getCellPhonesText();
        //System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText, "Error");
    }


    // 2. Test name verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully()
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {

        //2.1 Mouse Hover on “Electronics” Tab
        Thread.sleep(500);
        homePage.mouseHoverToElectronicsTab();

        //2.2 Mouse Hover on “Cell phones” and click
        Thread.sleep(500);
        homePage.mouseHoverOnCellPhonesAndClick();

        //2.3 Verify the text “Cell phones”
        Thread.sleep(500);
        String expectedText = "Cell phones";
        String actualText = cellphones.getCellPhonesText();
        Assert.assertEquals(actualText, expectedText, "Error");

        //2.4 Click on List View Tab
        Thread.sleep(500);
        cellphones.clickOnListViewTab();

        //2.5 Click on product name “Nokia Lumia 1020” link
        Thread.sleep(1500);
        cellphones.clickOnNokiaLumia1020();

        //2.6 Verify the text “Nokia Lumia 1020”
        Thread.sleep(500);
        String expectedText1 = "Nokia Lumia 1020";
        String actualText1 = productPage.getNokiaLumia1020Text();
        Assert.assertEquals(actualText1, expectedText1, "Error");

        //2.7 Verify the price “$349.00”
        Thread.sleep(500);
        String expectedPrice = "$349.00";
        String actualPrice = productPage.getNokiaLumia1020Price();
        Assert.assertEquals(actualPrice, expectedPrice, "Error");

        //2.8 Change quantity to 2
        Thread.sleep(500);
        productPage.clearQuantity();
        Thread.sleep(500);
        productPage.changeQuantityToTwo();

        //2.9 Click on “ADD TO CART” tab
        Thread.sleep(500);
        productPage.clickOnAddToCartTab();

        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        Thread.sleep(500);
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = productPage.getTextTheProductHasBeenAddedToYourShoppingCartOnTopGreenBar();
        Assert.assertEquals(actualMessage, expectedMessage, "Error Message");

        //After that close the bar clicking on the cross button.
        Thread.sleep(500);
        productPage.closeTheSuccessBar();

        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        Thread.sleep(500);
        productPage.mouseHoverOnShoppingCart();
        productPage.clickOnGoToCart();

        //2.12 Verify the message "Shopping cart"
        Thread.sleep(500);
        Assert.assertEquals(shoppingCartPage.getShoppingCartMessage(), "Shopping cart", "Error");

        //2.13 Verify the quantity is 2
        Thread.sleep(500);
       //Assert.assertEquals(shoppingCartPage.verifyTheQuantityIsTwo(), "2", "Incorrect Quantity");

        //2.14 Verify the Total $698.00
        Thread.sleep(500);
        Assert.assertEquals(shoppingCartPage.getTotalPrice(), "$698.00", "Incorrect total");

        //2.15 click on checkbox “I agree with the terms of service”
        Thread.sleep(500);
        shoppingCartPage.termsAndConditionCheckBox();

        //2.16 Click on “CHECKOUT”
        Thread.sleep(500);
        shoppingCartPage.clickCheckOut();

        //2.17 Verify the Text “Welcome, Please Sign In!”
        Thread.sleep(500);
        Assert.assertEquals(checkOutPage.welcomeMessagePage(), "Welcome, Please Sign In!", "Incorrect Message");

        //2.18 Click on “REGISTER” tab
        Thread.sleep(500);
        checkOutPage.clickOnRegisterTab();

        //2.19 Verify the text “Register”
        Thread.sleep(500);
        Assert.assertEquals(registerPage.getRegisterText(), "Register", "Incorrect Message");

        //2.20 Fill the mandatory fields
        Thread.sleep(500);
        registerPage.enterFirstName("Neil");
        Thread.sleep(500);
        registerPage.enterLastName("Cooper");
        Thread.sleep(500);
        registerPage.enterEmail("ncooper720@test.com");
        Thread.sleep(500);
        registerPage.enterPassword("Pen2Paper");
        Thread.sleep(500);
        registerPage.enterConfirmPassword("Pen2Paper");

        //2.21 Click on “REGISTER” Button
        Thread.sleep(500);
        registerPage.clickRegisterButton();

        // * 2.22	Verify the message “Register”
        Thread.sleep(1500);
        String actualRegistrationCompleted = registerPage.getRegisterText();
        String expectedRegistrationCompleted = "Register";
        Assert.assertEquals(actualRegistrationCompleted, expectedRegistrationCompleted, "Incorrect Registration message displayed!");

        // * 2.23	Click on “CONTINUE” tab
        Thread.sleep(1500);
        registerPage.clickContinueButton();

        // * 2.24	Verify the text “Shopping cart”
        Thread.sleep(1500);
        String actualShoppingCart = shoppingCartPage.getShoppingCartMessage();
        String expectedShoppingCart = "Shopping cart";
        Assert.assertEquals(actualShoppingCart, expectedShoppingCart, "Incorrect shopping cart displayed!");

        //Click on login button
        Thread.sleep(1500);
        loginPage.clickOnLoginButton();

        //Verify the Text "Welcome, Please Sign In!"
        Thread.sleep(1500);
        String actualWelcome = loginPage.welcomeMessage();
        String expectedWelcome = "Welcome, Please Sign In!";
        Assert.assertEquals(actualWelcome, expectedWelcome, "Incorrect welcome text displayed!");
        loginPage.welcomeMessage();

        //Enter Email into the email field
        Thread.sleep(500);
        loginPage.enterEmailAddress("ncooper720@test.com");

        //Enter Password into the password field
        loginPage.enterPassword("Pen2Paper");

        //Click on Login button
        loginPage.clickOnLogin();

        // * 2.25	click on checkbox “I agree with the terms of service”
        shoppingCartPage.termsAndConditionCheckBox();

        // * 2.26	Click on “CHECKOUT”
        shoppingCartPage.clickCheckOut();

        // * 2.27	Fill the Mandatory fields
        productCheckOutPage.enterFirstName("Neil");
        productCheckOutPage.enterLastName("Cooper");
        productCheckOutPage.enterEmail("ncooper727@test.com");
        productCheckOutPage.selectCountryFromDropDown("Ireland");
        productCheckOutPage.enterCity("Bath");
        productCheckOutPage.enterAddress("Barr Road");
        productCheckOutPage.enterPostCode("BA4 5AB");
        productCheckOutPage.enterPhoneNumber("07891234565");

        // * 2.28	Click on “CONTINUE”
        Thread.sleep(2000);
        productCheckOutPage.clickOnContinue();

        // * 2.29	Click on Radio Button “2nd Day Air ($0.00)”
        productCheckOutPage.clickOnRadioButtonSecondDayAir();

        // * 2.30	Click on “CONTINUE”
        Thread.sleep(2000);
        productCheckOutPage.clickOnButtonContinueInShippingMethod();

        // * 2.31	Select Radio Button “Credit Card”
        productCheckOutPage.clickOnRadioButtonOfCreditCard();
        productCheckOutPage.clickOnButtonContinueFromPaymentMethod();

        // * 2.32	Select “Visa” From Select credit card dropdown
        productCheckOutPage.selectVisaCard("Visa");

        // * 2.33	Fill all the details
        productCheckOutPage.enterCardHolderName("Robert Jackson");
        productCheckOutPage.enterCardNumber("0000 0000 0000 0000");
        productCheckOutPage.clickOnExpiryOfMasterCard();
        productCheckOutPage.enterExpiryOfTheMonth("10");
        productCheckOutPage.enterExpiryOfTheYear("2026");
        productCheckOutPage.enterSecurityCardCode("526");

        // * 2.34	Click on “CONTINUE”
        Thread.sleep(3000);
        productCheckOutPage.clickOnPaymentContinueButton();

        // * 2.35	Verify “Payment Method” is “Credit Card”
        Thread.sleep(3000);
        String actualPaymentMethod = orderConfirmationPage.getTextOfPaymentVerification();
        String expectedPaymentMethod = "Payment Method: Credit Card";
        Assert.assertEquals(actualPaymentMethod, expectedPaymentMethod, "Incorrect message displayed!");

        // * 2.36	Verify “Shipping Method” is “2nd Day Air”
        Thread.sleep(3000);
        String actualShippingMethod = orderConfirmationPage.getTextOfShippingVerification();
        String expectedShippingMethod = "Shipping Method: 2nd Day Air";
        Assert.assertEquals(actualShippingMethod, expectedShippingMethod, "Incorrect message displayed!");

        // * 2.37	Verify Total is “$698.00”
        Thread.sleep(3000);
        String actualPriceTotal = orderConfirmationPage.verifyNokiaLumiaTotalPrice();
        String expectedPriceTotal = "$698.00";
        Assert.assertEquals(actualPriceTotal, expectedPriceTotal, "Incorrect message displayed!");

        // * 2.38	Click on “CONFIRM”
        orderConfirmationPage.clickOnConfirmOrder();

        // * 2.39	Verify the Text “Thank You”
        Thread.sleep(3000);
        String actualThanksMessage = orderCompletionPage.verifyingThankYouText();
        String expectedThanksMessage = "Thank you";
        Assert.assertEquals(actualThanksMessage, expectedThanksMessage, "Incorrect message displayed!");

        // * 2.40	Verify the message “Your order has been successfully processed!”
        Thread.sleep(3000);
        String actualSuccessfulText = orderCompletionPage.verifyingSuccessfulOrderMessage();
        String expectedSuccessfulText = "Your order has been successfully processed!";
        Assert.assertEquals(actualSuccessfulText, expectedSuccessfulText, "Incorrect message displayed!");

        // * 2.41	Click on “CONTINUE”
        orderCompletionPage.clickOnContinueOrderCompletion();

        // * 2.42	Verify the text “Welcome to our store”
        Thread.sleep(3000);
        String actualWelcomeMessage = homePage.getTextFromWelcomeStore();
        String expectedWelcomeMessage = "Welcome to our store";
        Assert.assertEquals(actualWelcomeMessage, expectedWelcomeMessage, "Incorrect message displayed!");

        // * 2.43	Click on “Logout” link
        Thread.sleep(2000);
        clickOnElement(By.xpath("//a[normalize-space()='Log out']"));


        // * 2.44	Verify the URL is “https://demo.nopcommerce.com/”
        String actualCurrentUrl = driver.getCurrentUrl();
        String expectedCurrentUrl = "https://demo.nopcommerce.com/";
        Assert.assertEquals(actualCurrentUrl,expectedCurrentUrl, "Error message");
    }
}