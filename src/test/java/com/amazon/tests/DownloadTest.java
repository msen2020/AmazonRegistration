package com.amazon.tests;

import com.amazon.utilities.Driver;
import com.amazon.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class DownloadTest {

    //Dosya yukleme ve indirme nasil yapilir?

    @Test
    public void downloadTest() {
        Driver.getDriver().get("https://demoqa.com/upload-download");

        WebElement downloadButton = Driver.getDriver().findElement(By.id("downloadButton"));
        downloadButton.click();
        ReusableMethods.sleep(5000);

        File tempFile = new File("C:\\Users\\MEHMET SEN\\Downloads");
        boolean exists = tempFile.exists();
        System.out.println(exists);
        Assert.assertTrue(exists);

    }

    @Test
    public void uploadTest() {
    Driver.getDriver().get("https://demoqa.com/upload-download");

    WebElement fileUploadInput = Driver.getDriver().findElement(By.id("uploadFile"));
    fileUploadInput.sendKeys("C:\\Users\\MEHMET SEN\\Downloads\\sampleFile.jpeg");


        File tempFile = new File("C:\\Users\\MEHMET SEN\\Downloads");
        boolean fileUploaded = tempFile.exists();
        System.out.println(fileUploaded);
        Assert.assertTrue(fileUploaded);

    }
}







