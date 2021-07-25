package com.amazon.tests;

import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class DropdownTest {

    /* Dropdown icerisindeki tum secenekler nasil alinabilir? -->ALL Dropdown
    * Herhangibir secenek nasil alinabilir?
    * Seceneklerin harf sirasina gore sirali olup olmadigini nasil kontrol edebiliriz?
    */

@Test
    public void dropDownTest() {
    Driver.getDriver().get(ConfigurationReader.getPropery("url"));

    WebElement dropdown = Driver.getDriver().findElement(By.id("searchDropdownBox"));

    //Select Class ini kullanarak DropDown uzerinde islem yapabiliyoruz.
    Select select = new Select(dropdown); // First create an object from select class and send parameter (dropdown)
    //-->select.getOptions(); //Tum secenekleri almak icin kullandigimiz method. Bize liste seklinde getiriyor
    //sonra
    List<WebElement> options = select.getOptions();

    // for each ile webelemenleri yazdiriyoruz
    for (WebElement w : options) {
        System.out.println(w.getText());
    }

    /* Herhangibir secenek nasil alinabilir?

    yine select classindan yardim alarak gelen secenekler
    --> selectByIndex(1)         Eger listenin belirli sirasindali elementi almak istersek
    --> selectByVisibleText()   Gorunur yazilara gore istediginiz kategoriyi secebiliriz
    --> selectByValue()         Value attibute e gore istediginiz
      */

}

}

