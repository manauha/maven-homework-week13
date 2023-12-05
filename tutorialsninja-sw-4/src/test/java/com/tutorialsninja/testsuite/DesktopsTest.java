package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HPProductPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ShoppingCartPage;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsTest extends BaseTest {

    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    HPProductPage hpProductPage = new HPProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    //1.Test name verifyProductArrangeInAlphabeticalOrder()
    public void verifyProductArrangeInAlphabeticalOrder() throws InterruptedException {

        // * 1.1	Mouse hover on Desktops Tab.and click
        Thread.sleep(1000);
        homePage.mouseHoverOnDesktopMenu();

        // * 1.2	Click on “Show All Desktops”
        Thread.sleep(1000);
        homePage.selectMenu("Show AllDesktops");

        // * 1.3	Select Sort By position "Name: Z to A"
        Thread.sleep(500);
        List<WebElement> allList = desktopPage.getAllProductTitleOnPage();
        ArrayList<String> actualList = new ArrayList<>();
        for (WebElement list : allList) {
            actualList.add(list.getText());
        }
        System.out.println(actualList);

        Collections.reverse(actualList);
        System.out.println(actualList);

        desktopPage.sortByFilterOption("Name (Z - A)");
        Thread.sleep(2000);
        ArrayList<String> sortedList = new ArrayList<>();
        allList = desktopPage.getAllProductTitleOnPage();
        for (WebElement list : allList) {
            sortedList.add(list.getText());
        }
        //System.out.println(sortedList);

        // * 1.4	Verify the Product will arrange in Descending order.
        Thread.sleep(1000);
        Assert.assertEquals(actualList, sortedList);
    }

    @Test
    // * 2.	Test name verifyProductAddedToShoppingCartSuccessFully()
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {

        // * 2.1	Mouse hover on Currency Dropdown and click
        Thread.sleep(1000);
        homePage.mouseHoverAndClickOnCurrencyDroDownMenu();

        // * 2.2	Mouse hover on £Pound Sterling and click
        Thread.sleep(1800);
        homePage.selectOnSterlingPoundCurrency();

        // * 2.3	Mouse hover on Desktops Tab.
        Thread.sleep(1800);
        homePage.mouseHoverOnDesktopMenu();

        // * 2.4	Click on “Show All Desktops”
        Thread.sleep(1000);
        homePage.selectMenu("Show AllDesktops");

        // * 2.5	Select Sort By position "Name: A to Z"
        Thread.sleep(1000);
        desktopPage.sortByFilterOption("Name (A - Z)");

        // * 2.6	Select product “HP LP3065”
        Thread.sleep(1800);
        desktopPage.clickOnHPLP3065Product();

        // * 2.7	Verify the Text "HP LP3065"
        Thread.sleep(1000);
        String actualText = hpProductPage.verifyTextOFHPLP3065();
        String expectedText = "HP LP3065";
        Assert.assertEquals(actualText, expectedText, "Incorrect Product Name displayed!");

        // 2.8 Select Delivery Date "2025-11-27"
        //datePicker();
        Thread.sleep(1800);
        hpProductPage.clearTheDate();
        Thread.sleep(1800);
        hpProductPage.datePickerForDelivery("2025-11-27");

        // * 2.9.Enter Qty "1” using Select class.
        Thread.sleep(1000);
        hpProductPage.clearTheQtyBox();
        Thread.sleep(1000);
        hpProductPage.enterQuantityIntoTheBox("1");

        // * 2.10	Click on “Add to Cart” button
        Thread.sleep(1000);
        hpProductPage.clickOnAddToCart();

        // * 2.11	Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        Thread.sleep(1000);
        String actualSuccessMessage = hpProductPage.verifySuccessMessageForAddedProduct();
        String expectedSuccessMessage = "Success: You have added HP LP3065 to your shopping cart!\n×";
        Assert.assertEquals(actualSuccessMessage, expectedSuccessMessage, "Incorrect Product Name displayed!");

        // * 2.12	Click on link “shopping cart” display into success message
        Thread.sleep(1000);
        hpProductPage.clickOnShoppingCartLinkIntoSuccessMessage();

        // * 2.13	Verify the text "Shopping Cart"
        Thread.sleep(1000);
        String actualCartText = shoppingCartPage.verifyTextForShoppingCart();
        String expectedCartText = "Shopping Cart  (1.00kg)";
        Assert.assertEquals(actualCartText, expectedCartText, "Incorrect Shopping Cart Message displayed!");

        // * 2.14	Verify the Product name "HP LP3065"
        Thread.sleep(1000);
        String actualProductName = shoppingCartPage.verifyProductNameIsHPLP3065();
        String expectedProductName = "HP LP3065";
        Assert.assertEquals(actualProductName, expectedProductName, "Incorrect Product Name displayed!");

        // * 2.15	Verify the Delivery Date "2023-11-27"
        Thread.sleep(1000);
        String actualDeliveryDate = shoppingCartPage.verifyDeliveryDateOfProduct();
        String expectedDeliveryDate = "Delivery Date:2025-11-27";
        Assert.assertEquals(actualDeliveryDate, expectedDeliveryDate, "Incorrect Delivery Date displayed!");

        // * 2.16	Verify the Model "Product21"
        Thread.sleep(1000);
        String actualProductModel = shoppingCartPage.verifyModelNumberOfProduct();
        String expectedProductModel = "Product 21";
        Assert.assertEquals(actualProductModel, expectedProductModel, "Incorrect Product Model displayed!");

        // * 2.17	Verify the Total "£74.73"
        Thread.sleep(1000);
        String actualTotalPrice = shoppingCartPage.verifyTotalPriceOfProduct();
        String expectedTotalPrice = "£74.73";
        Assert.assertEquals(actualTotalPrice, expectedTotalPrice, "Incorrect Product Price displayed!");
    }
}