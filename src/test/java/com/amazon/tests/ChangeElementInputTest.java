package com.amazon.tests;

import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ChangeElementInputTest {

  // How to change or delete an element input(yazi) in Selenium?
    @Test
    public void changeElementInput() {
        Driver.getDriver().get(ConfigurationReader.getPropery("url"));

       /* WebElement searchBox = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));

        searchBox.sendKeys("iphone"); // we write down smth into the searc box

        Thread.sleep(3000);

        searchBox.clear(); // by .clear method we delete what we wrote
     */
        WebElement warning = Driver.getDriver().findElement(By.cssSelector(".a-section.a-spacing-none.a-padding-base.a-text-center.text-link-stripe.card-lite.text-link-stripe"));
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].innerText = 'Merhabalar' ", warning);
        //with innerText we changed the the elements input and wrote "Merhabalar"

        }




}
