package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class Homepage extends Utility {


    //****************************************  Women Menu  ************************************************************


    By mouseHoverToWomenMenu = By.xpath("//a[@id='ui-id-4']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']");

    //By mouseHoverOnTop = By.id("ui-id-9");
    By mouseHoverOnTop = By.xpath("//a[@id='ui-id-9']");

    By jackets = By.xpath("//a[@id='ui-id-11'])"); //span[contains(text(),'Jackets')]");


    // * * Mouse Hover on Women Menu
    public void mouseHoverToWomenMenuList() {
        mouseHoverToElement(mouseHoverToWomenMenu);
    }

    // * *	Mouse Hover on Tops
    public void mouseHoverOnWomenTops() {
        mouseHoverToElement(mouseHoverOnTop);
    }

    // * *	Click on Jackets
    public void clickOnJackets() {
        mouseHoverToElementAndClick(jackets);
    }


    //************************************************  Men Menu  *****************************************************


    By mouseHoverToMenMenu = By.xpath("//a[@id='ui-id-5']");
    By mouseHoverOnBottoms = By.xpath("//a[@id='ui-id-18']");
    By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");

    // * *	Mouse Hover on Men Menu
    public void mouseHoverToMenMenuList() {
        mouseHoverToElement(mouseHoverToMenMenu);
    }

    // * *	Mouse Hover on Bottoms
    public void mouseHoverOnMenBottoms() {
        mouseHoverToElement(mouseHoverOnBottoms);
    }

    // * *	Click on Pants
    public void clickOnPants() {
        mouseHoverToElementAndClick(pants);
    }

    //*****************************************  Gear Menu  *****************************************************************

    By mouseHoverToGearMenu = By.xpath("//a[@id='ui-id-6']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']");
    By bags = By.xpath("//span[normalize-space()='Bags']");


    // * *	Mouse Hover on Gear Menu
    public void mouseHoverToGearMenuList() {
        mouseHoverToElement(mouseHoverToGearMenu);
    }

    // * *	Click on Bags
    public void clickOnBags() {
        clickOnElement(bags);
    }

}
