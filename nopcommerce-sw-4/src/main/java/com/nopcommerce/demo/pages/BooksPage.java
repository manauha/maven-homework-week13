package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BooksPage extends Utility {

    By booksMenu = By.partialLinkText("Books");
    public String getBooksMenuText(){
        return getTextFromElement(booksMenu);
    }
}
