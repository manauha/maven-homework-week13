package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.pages.RegisterPage;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountsTest extends BaseTest {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    MyAccountPage myAccountPage = new MyAccountPage();

    @Test
    // 1.	Test name verifyUserShouldNavigateToRegisterPageSuccessfully()
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() throws InterruptedException {

        // * 1.1	Click on My Account Link.
        Thread.sleep(500);
        homePage.clickOnAccountLink();

        // * 1.2	Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        Thread.sleep(500);
        selectMyAccountOptions("Register");

        // * 1.3	Verify the text “Register Account”.
        Thread.sleep(500);
        registerPage.verifyRegisterAccountText();
    }

    @Test
    //2.	Test name verifyUserShouldNavigateToLoginPageSuccessfully()
    public void verifyUserShouldNavigateToLoginPageSuccessfully() throws InterruptedException{

        // * 2.1	Click on My Account Link.
        Thread.sleep(500);
        homePage.clickOnAccountLink();

        // * 2.2	Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        Thread.sleep(500);
        selectMyAccountOptions("Login");

        // * 2.3	Verify the text “Returning Customer”.
        Thread.sleep(500);
        registerPage.verifyTextReturningCustomerOnLoginPage();
    }

    @Test
    // * 3.	Test name verifyThatUserRegisterAccountSuccessfully()
    public void verifyThatUserRegisterAccountSuccessfully() throws InterruptedException {

        // * 3.1	Click on My Account Link.
        Thread.sleep(500);
        homePage.clickOnAccountLink();

        // * 3.2	Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        Thread.sleep(500);
        selectMyAccountOptions("Register");

        // * 3.3	Enter First Name
        Thread.sleep(500);
        registerPage.enterFirstName("Neil");

        // * 3.4	Enter Last Name
        Thread.sleep(500);
        registerPage.enterLastName("Copper");

        // * 3.5	Enter Email
        Thread.sleep(500);
        registerPage.enterEmail("neilcooper333@test.com");

        // * 3.6	Enter Telephone
        Thread.sleep(500);
        registerPage.enterTelephoneNumber("07896542365");

        // * 3.7	Enter Password
        Thread.sleep(500);
        registerPage.enterPassword("Pen2paper");

        // * 3.8	Enter Password Confirm
        Thread.sleep(500);
        registerPage.enterConfirmPassword("Pen2paper");

        // * 3.9	Select Subscribe Yes radio button
        Thread.sleep(500);
        registerPage.clickOnSubscribeRadioButton();

        // * 3.10	Click on Privacy Policy check box
        Thread.sleep(500);
        registerPage.clickOnPrivacyPolicyCheckBox();

        // * 3.11	Click on Continue button
        Thread.sleep(500);
        registerPage.clickOnContinueButton();

        // * 3.12	Verify the message “Your Account Has Been Created!”
        Thread.sleep(500);
        String actualMessage = myAccountPage.verifyTheMessageYourAccountHasBeenCreated();
        String expectedMessage = "Your Account Has Been Created!";
        Assert.assertEquals(actualMessage, expectedMessage, "Incorrect message displayed!");

        // * 3.13	Click on Continue button
        Thread.sleep(500);
        myAccountPage.clickOnContinueAccountButton();

        // 3.14 Click on My Account Link.
        Thread.sleep(500);
        homePage.clickOnAccountLink();

        // * 3.15	Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        Thread.sleep(500);
        selectMyAccountOptions("Logout");

        // * 3.16	Verify the text “Account Logout”
        Thread.sleep(500);
        String actualLogoutText = myAccountPage.verifyTextForAccountLogOut();
        String expectedLogOutText = "Logout";
        Assert.assertEquals(actualLogoutText, expectedLogOutText, "Incorrect logout message displayed!");

        // * 3.17	Click on Continue button
        Thread.sleep(500);
        myAccountPage.clickOnContinueLogOutButton();
    }

    @Test
    // * 4.	Test name verifyThatUserShouldLoginAndLogoutSuccessfully()
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() throws InterruptedException {

        // * 4.1	Click on My Account Link.
        Thread.sleep(500);
        homePage.clickOnAccountLink();

        // * 4.2	Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        Thread.sleep(500);
        selectMyAccountOptions("Login");

        // * 4.3	Enter Email address
        Thread.sleep(500);
        registerPage.enterEmail("neilcooper333@test.com");

        // * 4.4  Enter LastName

        // * 4.5	Enter Password
        Thread.sleep(500);
        registerPage.enterPassword("Pen2paper");

        // * 4.6	Click on Login button
        Thread.sleep(500);
        myAccountPage.clickOnLoginButton();

        // * 4.7	Verify text “My Account”
        Thread.sleep(1500);
        String actualText = myAccountPage.verifyTheTextMyAccount();
        String expectedText = "My Account";
        Assert.assertEquals(actualText, expectedText, "Incorrect my account text displayed!");

        // 4.8  Click on My Account Link.
        Thread.sleep(500);
        homePage.clickOnAccountLink();

        // * 4.9	Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        Thread.sleep(500);
        selectMyAccountOptions("Logout");

        // * 4.10	Verify the text “Account Logout”
        Thread.sleep(500);
        String actualLogoutText = myAccountPage.verifyTextForAccountLogOut();
        String expectedLogOutText = "Logout";
        Assert.assertEquals(actualLogoutText, expectedLogOutText, "Incorrect logout message displayed!");

        // * 4.11	Click on Continue button
        Thread.sleep(500);
        myAccountPage.clickOnContinueLogOutButton();
    }

    //1.1 create method with name "selectMyAccountOptions" it has one parameter name "option" of type string
    By accountOption = By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li");
    public void selectMyAccountOptions(String option) {
        listOfProductsElement(accountOption, option);
    }
}
