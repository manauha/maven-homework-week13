package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utility {


    By sortByPosition = By.xpath("//select[@id='products-orderby']");

    By sortBox = By.xpath("//h2[@class='product-title']");

    By addToCart = By.xpath("//a[text() = 'Build your own computer']");

    By buildYourOwnComputerText = By.xpath("//h1[normalize-space()='Build your own computer']");

    public String getBuildYourOwnComputerText() {
        return getTextFromElement(buildYourOwnComputerText);
    }


    public void clickOnAddToCartBuildYourOwnComputer() {
        clickOnElement(addToCart);
    }

    public void selectSortByPosition(String value) {
        selectByVisibleTextFromDropDown(sortByPosition, ("Name: Z to A"));
    }

    public void verifyProductsArrangedInAlphabeticallyDescendingOrder() throws InterruptedException {
        List<WebElement> originalList = driver.findElements(sortBox);
        List<String> originalProductNameList = new ArrayList<>();
        for (WebElement product : originalList) {
            originalProductNameList.add(product.getText());
        }
        System.out.println("originalProductNameList : " + originalProductNameList);
        Collections.sort(originalProductNameList, Collections.reverseOrder());
        Thread.sleep(3000);

        List<WebElement> afterSortingList = driver.findElements(By.xpath("//h2[@class='product-title']"));
        List<String> afterSortingProductName = new ArrayList<>();
        for (WebElement product1 : afterSortingList) {
            afterSortingProductName.add(product1.getText());
        }
        System.out.println("afterSortingProductName : " + afterSortingProductName);
    }


}





