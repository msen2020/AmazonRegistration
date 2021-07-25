package com.amazon.tests;

import com.amazon.utilities.Driver;
import com.amazon.utilities.ReusableMethods;
import com.amazon.utilities.Driver;
import com.amazon.utilities.ReusableMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertTest {

    @Test
    public void alertTest()  {

        /*
 WebElement kabulLinki = Driver.getDriver().findElement(By.xpath("//a[@onclick='removeCookiePolicy()']"));
        kabulLinki.click();
        */

    Driver.getDriver().get("https://www.tutorialsteacher.com/codeeditor?cid=js-1");

    ReusableMethods.sleep(1000);

        // Alert'e geçiş yaptık.

    Alert alert1 = Driver.getDriver().switchTo().alert();
    //Thread.sleep(1000);
        String content1 = alert1.getText();
        alert1.accept();

    Alert alert2 = Driver.getDriver().switchTo().alert();
        //Thread.sleep(1000);
        String content2 = alert2.getText();
        alert2.accept();

    Alert alert3 = Driver.getDriver().switchTo().alert();
       // Thread.sleep(1000);
        String content3 = alert3.getText();
        alert3.accept();

    Alert alert4 = Driver.getDriver().switchTo().alert();
       // Thread.sleep(1000);
        String content4 = alert3.getText();
        alert3.accept();

        System.out.println(content1);
        System.out.println(content2);
        System.out.println(content3);
        System.out.println(content4);


    WebElement homeLinki = Driver.getDriver().findElement(By.xpath("//button[@class='fc-button fc-cta-consent fc-primary-button']"));
      //  Thread.sleep(2000);
        //a[@title='TutorialsTeacher.com Home']
        homeLinki.click();

    }

}
