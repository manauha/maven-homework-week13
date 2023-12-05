package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

//1. create class "TopMenuTest" into testsuite package
public class TopMenuTest extends BaseTest {

    HomePage homePage = new HomePage();
    ComputersPage computers = new ComputersPage();
    ElectronicsPage electronics = new ElectronicsPage();
    ApparelPage apparel = new ApparelPage();
    DigitalDownloadsPage digitalDownload = new DigitalDownloadsPage();
    BooksPage books = new BooksPage();
    JewelryPage jewelry = new JewelryPage();
    GiftCardsPage giftCards = new GiftCardsPage();

    @Test
    public void verifyComputersPageNavigation() {
        homePage.selectMenu("Computers");
        String expectedText = "Computers";
        String actualText = computers.getComputersTabText();
        Assert.assertEquals(actualText, expectedText, "Incorrect Text");
    }

    @Test
    public void verifyElectronicsPageNavigation() {
        homePage.selectMenu("Electronics");
        String expectedText1 = "Electronics";
        String actualText1 = electronics.getElectronicsMenuText();
        Assert.assertEquals(actualText1, expectedText1, "Incorrect Text");
    }

    @Test
    public void verifyApparelPageNavigation() {
        homePage.selectMenu("Apparel");
        String expectedText2 = "Apparel";
        String actualText2 = apparel.getApparelTabText();
        Assert.assertEquals(actualText2, expectedText2, "Incorrect Text");
    }

    @Test
    public void verifyDigitalDownloadsPageNavigation() {
        homePage.selectMenu("Digital downloads");
        String expectedText3 = "Digital downloads";
        String actualText3 = digitalDownload.getDigitalDownloadMenuText();
        Assert.assertEquals(actualText3, expectedText3, "Incorrect Text");
    }

    @Test
    public void verifyBooksPageNavigation() {
        homePage.selectMenu("Books");
        String expectedText4 = "Books";
        String actualText4 = books.getBooksMenuText();
        Assert.assertEquals(actualText4, expectedText4, "Incorrect Text");
    }

    @Test
    public void verifyJewelryPageNavigation() {
        homePage.selectMenu("Jewelry");
        String expectedText5 = "Jewelry";
        String actualText5 = jewelry.getJewelryMenuText();
        Assert.assertEquals(actualText5, expectedText5, "Incorrect Text");
    }

    @Test
    public void verifyGiftCardsPageNavigation() {
        homePage.selectMenu("Gift Cards");
        String expectedText6 = "Gift Cards";
        String actualText6 = giftCards.getGiftCardsMenuText();
        Assert.assertEquals(actualText6, expectedText6, "Incorrect Text");
    }
}