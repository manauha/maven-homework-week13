package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends BaseTest {
    HomePage homepage = new HomePage();
    ComputersPage computersPage = new ComputersPage();
    DesktopsPage desktopsPage = new DesktopsPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    ShippingPage shippingPage = new ShippingPage();
    PaymentPage paymentPage = new PaymentPage();
    OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage();
    OrderCompletionPage orderCompletionPage = new OrderCompletionPage();


    // 1.Test name verifyProductArrangeInAlphabeticalOrder()
    @Test
    public void verifyProductArrangeInAlphabeticalOrder() throws InterruptedException {

        //1.1 Click on Computer Menu.
        homepage.clickOnComputer();

        //1.2 Click on Desktop
        computersPage.ClickOnDesktops();

        //1.3 Select Sort By position "Name: Z to A"
        desktopsPage.selectSortByPosition("Name: Z to A");

        //1.4 Verify the Product will arrange in Descending order.
        desktopsPage.verifyProductsArrangedInAlphabeticallyDescendingOrder();

    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException{

        //2.1 Click on Computer Menu.
        Thread.sleep(500);
        homepage.clickOnComputer();

        //2.2 Click on Desktop
        Thread.sleep(500);
        computersPage.ClickOnDesktops();

        //2.3 Select Sort By position "Name: A to Z"
        Thread.sleep(500);
        desktopsPage.selectSortByPosition("Name: A to Z");

        //2.4 Click on "Add To Cart"
        Thread.sleep(500);
        desktopsPage.clickOnAddToCartBuildYourOwnComputer();

        //2.5 Verify the Text "Build your own computer"
        Thread.sleep(500);
        String actualText = buildYourOwnComputerPage.getTextFromBuildYourOwnComputerPage();
        String expectedText = "Build your own computer";
        Assert.assertEquals(actualText, expectedText, "Incorrect message displayed!");

        // * 2.6	Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        Thread.sleep(500);
        buildYourOwnComputerPage.selectProcessor("2.2 GHz Intel Pentium Dual-Core E2200");

        // * 2.7.Select "8GB [+$60.00]" using Select class.
        Thread.sleep(500);
        buildYourOwnComputerPage.selectRam("8GB [+$60.00]");

        // * 2.8	Select HDD radio "400 GB [+$100.00]"
        Thread.sleep(500);
        buildYourOwnComputerPage.selectHdd();

        // * 2.9	Select OS radio "Vista Premium [+$60.00]"
        Thread.sleep(500);
        buildYourOwnComputerPage.selectOs();

        // * 2.10	Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        Thread.sleep(500);
        buildYourOwnComputerPage.selectSoftware();

        // * 2.11	Verify the price "$1,475.00"
        Thread.sleep(500);
        String actualPrice = buildYourOwnComputerPage.checkTotalPrice();
        String expectedPrice = "$1,475.00";
        Assert.assertEquals(actualPrice, expectedPrice, "Incorrect message displayed!");

        // * 2.12	Click on "ADD TO CARD" Button.
        Thread.sleep(500);
        buildYourOwnComputerPage.addToCartLink();

        // * 2.13	Verify the Message "The product has been added to your shopping cart" on Top green Bar
        Thread.sleep(500);
        String actualMessage = buildYourOwnComputerPage.shoppingCartMessage();
        String expectedMessage = "The product has been added to your shopping cart";
        Assert.assertEquals(actualMessage, expectedMessage, "Incorrect message displayed!");

        // * After that close the bar clicking on the cross button.
        Thread.sleep(500);
        buildYourOwnComputerPage.closeTheGreenBar();

        // * 2.14	Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        Thread.sleep(500);
        buildYourOwnComputerPage.checkShoppingCart();

        // * 2.15	Verify the message "Shopping cart"
        Thread.sleep(500);
        String actualCartMessage = shoppingCartPage.getShoppingCartMessage();
        String expectedCartMessage = "Shopping cart";
        Assert.assertEquals(actualCartMessage, expectedCartMessage, "Incorrect message displayed!");

        // * 2.16	Change the Qty to "2" and Click on "Update shopping cart"
        Thread.sleep(500);
        shoppingCartPage.quantityField();
        Thread.sleep(500);
        shoppingCartPage.updateCart();

        // * 2.17	Verify the Total"$2,950.00"
        Thread.sleep(500);
        String actualTotalPrice = shoppingCartPage.getUpdatedPrice();
        String expectedTotalPrice = "$2,950.00";
        Assert.assertEquals(actualTotalPrice, expectedTotalPrice, "Incorrect price displayed!");

        // * 2.18	click on checkbox “I agree with the terms of service”
        Thread.sleep(500);
        shoppingCartPage.termsAndConditionCheckBox();

        // * 2.19	Click on “CHECKOUT”
        Thread.sleep(500);
        shoppingCartPage.clickCheckOut();

        // * 2.20	Verify the Text “Welcome, Please Sign In!”
        Thread.sleep(500);
        String actualWelcomeMessage = checkOutPage.welcomeMessagePage();
        String expectedWelcomeMessage = "Welcome, Please Sign In!";
        Assert.assertEquals(actualWelcomeMessage, expectedWelcomeMessage, "Incorrect message displayed!");

        // * 2.21   Click on “CHECKOUT AS GUEST” Tab
        Thread.sleep(500);
        checkOutPage.clickAsGuestTab();

        // * 2.22	Fill the all mandatory field
        Thread.sleep(500);
        checkOutPage.enterFirstName("Neil");
        Thread.sleep(500);
        checkOutPage.enterLastName("Cooper");
        Thread.sleep(500);
        checkOutPage.enterEmail("ncooper51@test.com");
        Thread.sleep(500);
        checkOutPage.enterCountry("233");
        Thread.sleep(500);
        checkOutPage.enterCity("Bath");
        Thread.sleep(500);
        checkOutPage.enterAddress("Bath Road");
        Thread.sleep(500);
        checkOutPage.enterPostCode("BA4 5AB");
        Thread.sleep(500);
        checkOutPage.enterTelephone("07891234560");

        // * 2.23	Click on “CONTINUE”
        Thread.sleep(500);
        checkOutPage.clickOnContinueButton();

        // * 2.24	Click on Radio Button “Next Day Air($0.00)”
        Thread.sleep(500);
        shippingPage.shippingMethodOption();

        // * 2.25	Click on “CONTINUE”
        Thread.sleep(500);
        shippingPage.continueButton();

        // * 2.26	Select Radio Button “Credit Card”
        Thread.sleep(500);
        paymentPage.creditCardButton();
        Thread.sleep(500);
        paymentPage.clickContinue();

        // * 2.27	Select “Master card” From Select credit card dropdown
        Thread.sleep(500);
        paymentPage.selectMasterCard("Master card");

        // * 2.28	Fill all the details
        Thread.sleep(500);
        paymentPage.enterCardHolderName("Neil Copper");
        Thread.sleep(500);
        paymentPage.enterCardNumber("0000 0000 0000 0000");
        Thread.sleep(500);
        paymentPage.clickOnExpiryOfMasterCard();
        Thread.sleep(500);
        paymentPage.enterExpiryOfTheMonth("07");
        Thread.sleep(500);
        paymentPage.enterExpiryOfTheYear("2027");
        Thread.sleep(500);
        paymentPage.enterSecurityCardCode("126");

        // * 2.29	Click on “CONTINUE”
        Thread.sleep(700);
        paymentPage.clickOnPaymentContinueButton();

        // * 2.30	Verify “Payment Method” is “Credit Card”
        Thread.sleep(700);
        String actualPaymentMethod = orderConfirmationPage.getTextOfPaymentVerification();
        String expectedPaymentMethod = "Payment Method: Credit Card";
        Assert.assertEquals(actualPaymentMethod, expectedPaymentMethod, "Incorrect message displayed!");

        // * 2.32	Verify “Shipping Method” is “Next Day Air”
        Thread.sleep(700);
        String actualShippingMethod = orderConfirmationPage.getTextOfShippingVerification();
        String expectedShippingMethod = "Shipping Method: Next Day Air";
        Assert.assertEquals(actualShippingMethod, expectedShippingMethod, "Incorrect message displayed!");

        // * 2.33	Verify Total is “$2,950.00”
        Thread.sleep(700);
        String actualPriceTotal = orderConfirmationPage.verifyTotalPrice();
        String expectedPriceTotal = "$2,950.00";
        Assert.assertEquals(actualPriceTotal, expectedPriceTotal, "Incorrect message displayed!");

        // * 2.34	Click on “CONFIRM”
        Thread.sleep(500);
        orderConfirmationPage.clickOnConfirmOrder();

        // * 2.35	Verify the Text “Thank You”
        Thread.sleep(700);
        String actualThanksMessage = orderCompletionPage.verifyingThankYouText();
        String expectedThanksMessage = "Thank you";
        Assert.assertEquals(actualThanksMessage, expectedThanksMessage, "Incorrect message displayed!");

        // * 2.36	Verify the message “Your order has been successfully processed!”
        Thread.sleep(700);
        String actualSuccessfulText = orderCompletionPage.verifyingSuccessfulOrderMessage();
        String expectedSuccessfulText = "Your order has been successfully processed!";
        Assert.assertEquals(actualSuccessfulText, expectedSuccessfulText, "Incorrect message displayed!");

        // * 2.37	Click on “CONTINUE”
        Thread.sleep(500);
        orderCompletionPage.clickOnContinueOrderCompletion();

        // * 2.37 Verify the text “Welcome to our store”
        Thread.sleep(700);
        String actualWelcomeText = homepage.getTextFromWelcomeStore();
        String expectedWelcomeText = "Welcome to our store";
        Assert.assertEquals(actualWelcomeText, expectedWelcomeText, "Incorrect message displayed!");

    }
}