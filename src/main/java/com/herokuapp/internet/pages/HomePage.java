package com.herokuapp.internet.pages;

import com.herokuapp.internet.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By loginPageText = By.xpath("//h2[contains(text(),'Login Page')]");
    By usernameField = By.xpath("//input[@id='username']");
    By passwordField = By.xpath("//input[@id='password']");
    By loginButton = By.xpath("//i[@class='fa fa-2x fa-sign-in']");
    By successfulMsg = By.xpath("//h2[contains(text(),'Secure Area')]");
    By logoutButton = By.xpath("//i[@class='icon-2x icon-signout']");
    By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");
    By usernameErrorMsg = By.xpath("//div[@id='flash']");
    By passwordErrorMsg = By.xpath("//div[@id='flash']");

    public String getLoginPageText(By successfulMsg) {
        return getTextFromElement(loginPageText);
    }

    public void enterUsername(String username) {
        sendTextToElement(usernameField, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String loginSuccessfulMessage() {
        return getTextFromElement(successfulMsg);
    }

    public void logoutBtn() {
        clickOnElement(logoutButton);
    }

    public String errorMsg() {
        return getTextFromElement(errorMessage);
    }

    public String verifyTheUsernameErrorMsg() {
        return getTextFromElement(usernameErrorMsg);
    }

    public String verifyingThePasswordErrorMsg() {
        return getTextFromElement(passwordErrorMsg);
    }

}
