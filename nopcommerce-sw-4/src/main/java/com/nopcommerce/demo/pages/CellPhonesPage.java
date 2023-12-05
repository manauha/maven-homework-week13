package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonesPage extends Utility {

   By cellphones = By.linkText("Cell phones");
   By OnListViewTab = By.xpath("//a[contains(text(),'List')]");

   By nokiaLumia1020 = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");

   public String getCellPhonesText(){
       return getTextFromElement(cellphones);
   }

   public void clickOnListViewTab(){
       clickOnElement(OnListViewTab);
   }

   public void clickOnNokiaLumia1020(){
       clickOnElement(nokiaLumia1020);
   }


}
