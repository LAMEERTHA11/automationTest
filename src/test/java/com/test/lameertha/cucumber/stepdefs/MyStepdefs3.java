package com.test.lameertha.cucumber.stepdefs;

import com.test.lameertha.basepage.BasePage;
import com.test.lameertha.pages.PersonalInfoPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/* Created
 * by Lamee */public class MyStepdefs3 extends BasePage {
    @Given("^I am on home Page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on Sign In Button$")
    public void iClickOnSignInButton() {
        new PersonalInfoPage().set_signInButton();
    }

    @And("^I enter the EmailAddress \"([^\"]*)\"$")
    public void iEnterTheEmailAddress(String Email)  {
        new PersonalInfoPage().set_emailField(Email);
    }

    @And("^I enter the Password \"([^\"]*)\"$")
    public void iEnterThePassword(String Password)  {
        new PersonalInfoPage().set_password(Password);

    }

    @And("^I SingIn Button(\\d+)$")
    public void iSingInButton(int arg0) {
        new PersonalInfoPage().set_signInButton2();
    }

    @And("^Click on the Personal Information Button$")
    public void clickOnThePersonalInformationButton() {
        new PersonalInfoPage().set_personalInforamation();
    }

    @And("^Updating My First Name \"([^\"]*)\"$")
    public void updatingMyFirstName(String FirstName)  {
        new PersonalInfoPage().set_firstName(FirstName);

    }

    @And("^Enter the old password \"([^\"]*)\"$")
    public void enterTheOldPassword(String OldPassword)  {
        new PersonalInfoPage().set_oldPassword(OldPassword);

    }

    @And("^Click the Save Button$")
    public void clickTheSaveButton() {
        new PersonalInfoPage().set_saveButton();
    }

    @Then("^I should able to see the Update Personal Information \\(First Name\\) page successfully \"([^\"]*)\"$")
    public void iShouldAbleToSeeTheUpdatePersonalInformationFirstNamePageSuccessfully(String getPersonalInformationUpdateMessage)  {
    Assert.assertTrue(new PersonalInfoPage().set_getPersonalInformationUpdateMessage(getPersonalInformationUpdateMessage).contains("Your personal information has been successfully updated"));

    }
}
