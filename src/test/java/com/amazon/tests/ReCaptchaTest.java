package com.amazon.tests;

import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import com.amazon.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class ReCaptchaTest {

//    ReCaptcha dogrulamasi nasil yapilir?
//    Testi durduruyoruz.
//    Dodrulamayi manuel yapip kalani selenium a birakiyoruz.

    @Test
    public void reCaptchaTest() {
        Driver.getDriver().get("https://www.google.com/recaptcha/api2/demo");

        WebElement submit = Driver.getDriver().findElement(By.id("recaptcha-demo-submit"));
        ReusableMethods.sleep(15000);

        submit.click();
        System.out.println();


        assertEquals("Verification Success... Hooray!",
        Driver.getDriver().findElement(By.xpath("//div[@class='recaptcha-success']")).getText());
        System.out.println("Verification Success... Hooray!");

//Verification Success... Hooray!
        //"//div[@class='recaptcha-success']"

    }
}

