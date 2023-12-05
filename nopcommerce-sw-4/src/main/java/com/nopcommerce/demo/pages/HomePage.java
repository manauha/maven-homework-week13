package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

    By headerMenu = By.xpath("//div[@class = 'header-menu']/ul/li");
    By computerTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By Desktops = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']");
    By electronicsTab = By.partialLinkText("Electronics");
    By cellPhoneTab = By.linkText("Cell phones");
    By welcomeText = By.xpath("//h2[text() = 'Welcome to our store']");
    By logout = By.xpath("//a[contains(text(),'Log out')]");
    By loginLink = By.xpath("//a[normalize-space()='Log in']");
    By registerLink = By.xpath("//a[normalize-space()='Register']");

    By welcomeToOurStore = By.xpath("//h2[normalize-space()='Welcome to our store']");

    public void selectMenu(String menu) {
        List<WebElement> menuList = driver.findElements(headerMenu);
        try {
            //loop through list with for loops
            for (WebElement menuOption : menuList) {
                //System.out.println(menuOption.getText());
                //if option matches with the parameter then click
                if (menuOption.getText().equals(menu)) {
                    menuOption.click();
                }
            }
            //catch exceptions
        } catch (StaleElementReferenceException e) {
            menuList = driver.findElements(headerMenu);
        }
    }

    public void clickOnComputer() {
        clickOnElement(computerTab);
    }
    public String getTextFromWelcomeStore() {
        return getTextFromElement(welcomeToOurStore);
    }

    public void mouseHoverToElectronicsTab() {
        mouseHoverToElement(electronicsTab);
    }

    public void mouseHoverOnCellPhonesAndClick(){
        mouseHoverToElementAndClick(cellPhoneTab);
    }

    public String getWelcomeToOurStore(){
        return getTextFromElement(welcomeText);
    }

    public void clickOnLogout(){
        clickOnElement(logout);
    }

    public String getCurrentWebpage(){
       return driver.getCurrentUrl();
    }

    public void mouseHoverAndClickOnLoginLink() {
        mouseHoverToElementAndClick(loginLink);
    }

    public void mouseHoverAndClickOnRegisterLink() {
        mouseHoverToElementAndClick(registerLink);
    }

    public void clickOnDesktops() {
        mouseHoverToElementAndClick(Desktops);
    }


}
