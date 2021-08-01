package com.amazon.tests;

import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsWithTabKey {

    @Test
    public void keyTab1() throws InterruptedException {
    Driver.getDriver().get(ConfigurationReader.getPropery("url"));

    WebElement signIn = Driver.getDriver().findElement(By.id("nav-link-accountList-nav-line-1"));

    Actions actions = new Actions(Driver.getDriver());
    actions.moveToElement(signIn).perform();
    WebElement startHere = Driver.getDriver().findElement(By.xpath("//*[text()='Start here.']"));
    startHere.click();
    WebElement account = Driver.getDriver().findElement(By.id("ap_customer_name"));
    account.click();
    actions.click(account).sendKeys("ugur", Keys.TAB)
    .sendKeys("hello@gmail.com", Keys.TAB)
    .sendKeys("123456", Keys.TAB)
    .sendKeys("123456", Keys.TAB)
    .sendKeys(Keys.ENTER).build().perform();
    Thread.sleep(2000);
        }
    }
