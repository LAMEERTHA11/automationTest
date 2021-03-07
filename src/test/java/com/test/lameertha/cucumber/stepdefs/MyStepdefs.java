package com.test.lameertha.cucumber.stepdefs;

import com.test.lameertha.basepage.BasePage;
import com.test.lameertha.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/* Created
 * by Lamee */public class MyStepdefs extends BasePage {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I click on T-Shirt Tab$")
    public void iClickOnTShirtTab() {
        new HomePage().set_ClickTshirtTab();


    }

    @And("^I Select T-Shirt$")
    public void iSelectTShirt() {
        new HomePage().set_ClickTShirtImage();
    }

    @And("^I Click on Add to cart button$")
    public void iClickOnAddToCartButton() {
        new HomePage().set_ClickOnAddToCart();
    }

    @Then("^I should be able to see T-Shirt added to cart sucessfully$")
    public void iShouldBeAbleToSeeTShirtAddedToCartSucessfully() {
        Assert.assertEquals( "Product successfully added to your shopping cart",new HomePage().set_ProductSuccessAddedMessage());
    }

    @And("^I mouse hover on to t-shirt image$")
    public void iMouseHoverOnToTShirtImage() {
        new HomePage().mouseHoverOnToImage();
    }
}
