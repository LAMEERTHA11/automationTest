package com.test.lameertha.pages;

import com.cucumber.listener.Reporter;
import com.test.lameertha.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/* Created
 * by Lamee */public class PersonalInfoPage extends Utility {
     HomePage homePage;
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(partialLinkText = "Sign")
    WebElement _signInButton;

    @FindBy(css = "#email")
    WebElement _emailAddress;

    @FindBy(css = "#passwd")
    WebElement _password;

    @FindBy(css = "body.authentication.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 div.row div.col-xs-12.col-sm-6:nth-child(2) form.box div.form_content.clearfix p.submit:nth-child(4) button.button.btn.btn-default.button-medium span:nth-child(1) > i.icon-lock.left")
    WebElement _signInButton2;

    @FindBy(xpath = "//span[contains(text(),'My personal information')]")
    WebElement _personalInforamation;

    @FindBy(css = "#firstname")
    WebElement _firstName;

    @FindBy(css = "#old_passwd")
    WebElement _oldPassword;

    @FindBy(css = "body.identity.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 div.box form.std fieldset:nth-child(1) div.form-group:nth-child(11) button.btn.btn-default.button.button-medium > span:nth-child(1)")
    WebElement _saveButton;

    @FindBy(xpath = "//p[contains(text(),'Your personal information has been successfully up')]")
    WebElement _getPersonalInformationUpdateMessage;


    public void set_signInButton() {
        clickOnElement(_signInButton);
        log.info("Clicking on sign button : " + _signInButton.toString());
    }

    public void set_emailField(String emailAddress) {
        Reporter.addStepLog("Entering email Address : " + _emailAddress + " to email field : " + _emailAddress.toString());
        sendTextToElement(_emailAddress, emailAddress);
        log.info("Entering email Address : " + emailAddress + " to email field : " + _emailAddress.toString());
    }

    public void set_password(String password) {
        Reporter.addStepLog("Entering password: " + _password + " to password field : " + _password.toString());
        sendTextToElement(_password, password);
        log.info("Entering password : " + _password + " to password field : " + _password.toString());
    }

    public void set_signInButton2() {
        clickOnElement(_signInButton2);
        log.info("Clicking on sign button : " + _signInButton2.toString());

    }

    public void set_personalInforamation() {
        clickOnElement(_personalInforamation);
        log.info("Clicking on personalInformation button : " + _personalInforamation.toString());

    }

    public void set_firstName(String firstName) {
        Reporter.addStepLog("Entering firstName : " + _firstName + " to firstName field : " + _firstName.toString());
        sendTextToElement(_firstName, firstName);
        log.info("Entering firstName : " + firstName + " to firstName1 field : " + _firstName.toString());
    }

    public void set_oldPassword(String oldPassword) {
        Reporter.addStepLog("Entering oldpassword: " + _oldPassword + " to oldpassword field : " + _oldPassword.toString());
        sendTextToElement(_oldPassword, oldPassword);
        log.info("Entering password : " + _oldPassword + " to password field : " + _oldPassword.toString());
    }

    public void set_saveButton() {
        clickOnElement(_saveButton);
        log.info("Clicking on save button : " + _saveButton.toString());
    }


    public String set_getPersonalInformationUpdateMessage(String getPersonalInformationUpdateMessage) {
        Reporter.addStepLog("Getting text from : " + _getPersonalInformationUpdateMessage.toString());
        log.info("Getting text from : " + _getPersonalInformationUpdateMessage.toString());
        return getTextFromElement(_getPersonalInformationUpdateMessage);
    }
}

