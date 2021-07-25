package com.amazon.tests;

import com.amazon.utilities.Driver;
import com.amazon.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DifferentWindowTest {

    /*Seleinum da bir linke tikladigimizda farkli bir pencere acildi,
    ne yaparsiniz?

    Her bir pencerenin kendine ait bir windowHandle kodu var
    windowHandle codunu kullanarak diger pencereye switch() methodu kullanarak gecis yapariz
  Driver.getDriver().switchTo().window(pageHandle)
     */


    @Test
    public void differentWindowTest() {

    Driver.getDriver().get("https://www.w3schools.com/java/java_encapsulation.asp");

        ReusableMethods.sleep(1000);

    WebElement clickAcceptAllAlert = Driver.getDriver().findElement(By.xpath("//div[@class='sn-b-def sn-blue']"));
    clickAcceptAllAlert.click();


    WebElement facebookLink = Driver.getDriver().findElement(By.xpath("//span[@class='fa fa-facebook-square fa-2x']"));
    facebookLink.click();



    System.out.println(Driver.getDriver().getWindowHandles());

    WebElement clickFacebookAlert = Driver.getDriver().findElement(By.id("'//*[@id=\"u_0_20_Ue\"]'"));
    clickFacebookAlert.click();

    }


}
