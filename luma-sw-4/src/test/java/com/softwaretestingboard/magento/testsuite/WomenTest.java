package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.Homepage;
import com.softwaretestingboard.magento.pages.WomenTopsJacketsPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {

    Homepage homepage = new Homepage();
    WomenTopsJacketsPage womenPage = new WomenTopsJacketsPage();


    // Write down the following tests into WomenTest class

    //1. verifyTheSortByProductNameFilter
    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {

        //1.1  Mouse Hover on Women Menu
        homepage.mouseHoverToWomenMenuList();

        //1.1 Mouse Hover on Tops
        homepage.mouseHoverOnWomenTops();

        //1.3 Click on Jackets
        Thread.sleep(500);
        homepage.clickOnJackets();

        //1.4  Select Sort By filter “Product Name”
        womenPage.selectProductNameFilter("Product Name ");

        //1.5 Verify the products name display in alphabetical order
        //System.out.println(womenPage.getProductList1());
        //System.out.println(womenPage.getProductList2());
        Assert.assertEquals(womenPage.getProductList1(),womenPage.getProductList2());
    }

    // * 2.	verifyTheSortByPriceFilter

    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        // * * Mouse Hover on Women Menu
        Thread.sleep(2000);
        homepage.mouseHoverToWomenMenuList();

        // * *	Mouse Hover on Tops
        Thread.sleep(2000);
        homepage.mouseHoverOnWomenTops();

        // * *	Click on Jackets
        Thread.sleep(2000);
        homepage.clickOnJackets();

        // * *	Select Sort By filter “Price”
        womenPage.selectProductNameFilter("Price");

        // * *	Verify the products price display in Low to High
        Assert.assertEquals(womenPage.getPriceList1(), womenPage.getPriceList2());
    }
}
