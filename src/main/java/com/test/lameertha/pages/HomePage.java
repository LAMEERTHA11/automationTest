package com.test.lameertha.pages;

import com.cucumber.listener.Reporter;
import com.test.lameertha.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/* Created
 * by Lamee */public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
    WebElement _ClickTshirtTab;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
    WebElement _ClickTShirtImage;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement _image;

    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement _ClickOnAddToCart;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/h2[1]")
    WebElement _ProductSuccessAddedMessage;

    public void set_ClickTshirtTab() {
        clickOnElement(_ClickTshirtTab);
        log.info("Clicking on TshirtTab : " + _ClickTshirtTab.toString());
    }

    public void set_ClickTShirtImage() {
        clickOnElement(_ClickTShirtImage);
        log.info("Clicking on TshirtImage: " + _ClickTShirtImage.toString());
    }

    public void mouseHoverOnToImage() {
        mouseHoverToElement(_image);
        log.info("Mouse Hover on to Image: " + _image.toString());
    }

    public void set_ClickOnAddToCart() {
        clickOnElement(_ClickOnAddToCart);
        log.info("Clicking on Add To Cart: " + _ClickOnAddToCart.toString());
    }

    public String set_ProductSuccessAddedMessage() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Reporter.addStepLog("Getting Successfully added Message from : " + _ProductSuccessAddedMessage.toString());
        log.info("Getting text from : " + _ProductSuccessAddedMessage.toString());
        return getTextFromElement(_ProductSuccessAddedMessage);
    }
}
