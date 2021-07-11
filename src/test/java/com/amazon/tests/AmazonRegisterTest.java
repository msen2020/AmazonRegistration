package com.amazon.tests;

import com.amazon.pages.AmazonRegisterPage;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonRegisterTest {

    AmazonRegisterPage amazonRegisterPage = new AmazonRegisterPage();



    @Test
    public void amazonRegisterTest(){

    Driver.getDriver().get(ConfigurationReader.getPropery("url"));



    amazonRegisterPage.HoverOverHelloSignIn();

    amazonRegisterPage.startHere.click();

    amazonRegisterPage.customerName.sendKeys(ConfigurationReader.getPropery("customerName"));

    amazonRegisterPage.eMail.sendKeys(ConfigurationReader.getPropery("email"));

    amazonRegisterPage.password.sendKeys(ConfigurationReader.getPropery("password"));

    amazonRegisterPage.password_check.sendKeys(ConfigurationReader.getPropery("password"));

    amazonRegisterPage.clickCreateButton();

    String Actual_message = amazonRegisterPage.message.getAttribute("aria-label");
    Assert.assertEquals(Actual_message, "Amazon" );



    }
}
