package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LaptopAndNoteBookPage extends Utility {


    By sortByPriceHighToLow = By.xpath("(//select[@id='input-sort'])[1]");
    By arrayListOfProducts = By.xpath("//p[@class ='price']");
    By macBookSelection = By.xpath("//a[normalize-space()='MacBook']");

    // * 1.3	Select Sort By "Price (High > Low)"
    public void selectSortByPriceHighToLow(String options) {
        selectVisibleTextFromDropDown(sortByPriceHighToLow, options);
        getArrayListOfProductsInChoice(arrayListOfProducts);
    }

    // * 1.4	Verify the Product price will arrange in High to Low order.
    public String verifyProductPriceArrangeInHighToLow() {
        return verifyTheProductArrangementInArrayList(arrayListOfProducts);
        // System.out.println("Product List after sortBy: " + getTextFromElement(arrayListOfProducts));
        //return getTextFromElement(arrayListOfProducts);
    }

    // * 2.4	Select Product “MacBook”
    public void selectMacBookProduct() {
        clickOnElement(macBookSelection);
    }





}
