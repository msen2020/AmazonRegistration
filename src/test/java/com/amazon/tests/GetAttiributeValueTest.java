package com.amazon.tests;

import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GetAttiributeValueTest {

    /* Herhangi bir web elementin herhangi bir attiribute degerini nasil aliriz?
    Bir web elementin css ozelligi nasil alinabilir? Ornegin yazi rengi
     */

    @Test
    public void AmazonRegisterTest(){
    Driver.getDriver().get(ConfigurationReader.getPropery("url"));

    WebElement link = Driver.getDriver().findElement(By.partialLinkText("Gift Cards"));

    String href = link.getAttribute("href");
    String slotId = link.getAttribute("data-csa-c-slot-id");

    System.out.println(href);//https://www.amazon.com/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc_4fb606b1a14b44e4823e00c03fc71f47
    System.out.println(slotId);//nav_cs_2


    String color = link.getCssValue("color");
    String fontSize = link.getCssValue("font-size");

        System.out.println(color); //rgba(255, 255, 255, 1)
        System.out.println(fontSize); // 14px





    }

    }


