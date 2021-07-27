package com.amazon.tests;

import com.amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class iFrameTest {

// ifarame elementi uzerinde nasil islem yapariz?
    // ic ice iframe elementleri uzerinde nasil islem yapariz


    @Test
    public void iFrameTest1(){

    Driver.getDriver().get("https://demoqa.com/frames");

    WebElement iframeElement = Driver.getDriver().findElement(By.id("frame1"));
    Driver.getDriver().switchTo().frame(iframeElement);

    WebElement heading = Driver.getDriver().findElement(By.id("sampleHeading"));
    System.out.println(heading.getText());

    Driver.getDriver().switchTo().defaultContent();// tekrar ana sayfaya donuyoruz

    WebElement content = Driver.getDriver().findElement(By.id("framesWrapper"));
    System.out.println(content.getText());


    }
}
