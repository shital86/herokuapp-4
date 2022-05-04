package com.herokuapp.internet.testsuite;

import com.herokuapp.internet.pages.HomePage;
import com.herokuapp.internet.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInPageTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void verifyingUserShouldLogInSuccessfully() {
        homePage.enterUsername("tomsmith");
        homePage.enterPassword("SuperSecretPassword!");
        homePage.clickOnLoginButton();
        String expectedMsg = "Secure Area";
        String actualMsg = homePage.loginSuccessfulMessage();
        Assert.assertEquals(expectedMsg, actualMsg);
        homePage.logoutBtn();

    }
    @Test
    public void loginWithInvalidUsername() {
        homePage.enterUsername("tomsmith1");
        homePage.enterPassword("SuperSecretPassword!");
        homePage.clickOnLoginButton();
        String expectedMsg = "Your username is invalid!\n" +
                "×";
        String actualMsg = homePage.verifyTheUsernameErrorMsg();
        Assert.assertEquals(expectedMsg, actualMsg);
    }
    @Test
    public void loginWithInvalidPassword() {
        homePage.enterUsername("tomsmith");
        homePage.enterPassword("SuperSecretPassword1");
        homePage.clickOnLoginButton();
        String expectedMsg = "Your password is invalid!\n" +
                "×";
        String actualMsg = homePage.verifyingThePasswordErrorMsg();
        Assert.assertEquals(expectedMsg, actualMsg);


    }
}