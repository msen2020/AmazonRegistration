package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class AmazonRegisterPage {

    public AmazonRegisterPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//span[text()='Hello, Sign in']")
    public WebElement helloSignIn;

    @FindBy(xpath = "//*[@id=\"nav-flyout-ya-newCust\"]/a")
    public WebElement startHere;

    @FindBy(xpath = "//*[@id=\"ap_customer_name\"]")
    public WebElement customerName;

    @FindBy(xpath = "//*[@id=\"ap_email\"]")
    public WebElement eMail;

    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"ap_password_check\"]")
    public WebElement password_check;

    @FindBy(xpath = "//*[@id=\"continue\"]")
    public WebElement clickCreateButton;

    @FindBy(xpath = "//i[@class='a-icon a-icon-logo']")
    public WebElement message;

    //HoverOver the Hello Sign In
    public void HoverOverHelloSignIn(){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(helloSignIn).perform();
    }

    // Clicking the Start Here link
    public void clickHere(){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(startHere).click();

    }

    //entering the costumer Name
    public void customerName(){

    Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }


    //Clicking the Create Button
    public void clickCreateButton() {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickCreateButton.click();

    }
    /*Verifying the user sees the message on the Result page.
     * To verify your email, we've sent a One Time Password (OTP) to msen@hotmail.com (Change)*/

    public static void verification(String message){
    }
}
