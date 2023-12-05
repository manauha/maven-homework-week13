package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.ComponentPage;
import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopAndNoteBookPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    LaptopAndNoteBookPage laptopAndNoteBookPage = new LaptopAndNoteBookPage();
    ComponentPage componentsPage = new ComponentPage();

    @Test
    // * 1. verifyUserShouldNavigateToDesktopsPageSuccessfully()
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() throws InterruptedException {

        // * 1.1	Mouse hover on “Desktops” Tab and click
        Thread.sleep(1800);
        homePage.mouseHoverOnDesktopMenu();

        // * 1.2	call selectMenu method and pass the menu = “Show All Desktops”
        Thread.sleep(1800);
        homePage.selectMenu("Show AllDesktops");

        // * 1.3	Verify the text ‘Desktops’
        Thread.sleep(1800);
        String actualDesktopsText = homePage.verifyTheTextDesktops();
        String expectedDesktopsText = "Desktops";
        Assert.assertEquals(actualDesktopsText, expectedDesktopsText, "Invalid Desktops text displayed!");
    }

    @Test
    // 2. verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully()
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() throws InterruptedException {

        // * 2.1	Mouse hover on “Laptops & Notebooks” Tab and click
        Thread.sleep(1800);
        homePage.mouseHoverOnLaptopsAndNotebooksMenu();

        // * 2.2	call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        Thread.sleep(1800);
        homePage.selectMenu("Show AllLaptops & Notebooks");

        // * 2.3	Verify the text ‘Laptops & Notebooks’
        Thread.sleep(1800);
        String actualLaptopsAndNotebooksText = homePage.verifyTextForLaptopsAndNotebooks();
        String expectedLaptopsAndNotebooksText = "Laptops & Notebooks";
        Assert.assertEquals(actualLaptopsAndNotebooksText, expectedLaptopsAndNotebooksText,"Error");
    }

    @Test
    //3.	verifyUserShouldNavigateToComponentsPageSuccessfully()
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() throws InterruptedException {

        // * 3.1	Mouse hover on “Components” Tab and click
        Thread.sleep(1800);
        homePage.mouseHoverOnComponentsMenu();

        // * 3.2	call selectMenu method and pass the menu = “Show All Components”
        Thread.sleep(1800);
        homePage.selectMenu("Show AllComponents");

        // * 3.3	Verify the text ‘Components’
        Thread.sleep(1800);
        String actualComponentsText = homePage.verifyTextForComponents();
        String expectedComponentsText = "Components";
        Assert.assertEquals(actualComponentsText, expectedComponentsText, "Invalid components text displayed!");

    }
}
