package com.amazon.tests;

import com.amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Input_Jscript {


    // Use javascript to input box
    @Test
    public void inputTest() {

        Driver.getDriver().get("https://demoqa.com/text-box");

JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
executor.executeScript("document.getElementById('userName').value = 'Mehmet Sen'");
executor.executeScript("document.getElementById('userEmail').value = 'msen@hotmail.com'");
executor.executeScript("document.getElementById('currentAddress').value ='Sevilla'");
executor.executeScript("document.getElementById('permanentAddress').value = 'Spain'");
executor.executeScript("document.getElementById('submit').click()");

// to click submit button

      // WebElement button = Driver.getDriver().findElement(By.id("submit"));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();
      //  executor.executeScript("document.getElementById('submit')).click();", button);

    }


    }


