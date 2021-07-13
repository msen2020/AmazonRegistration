package com.amazon.tests;

import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenShotTest {

    //Seleniumda screenShot nasil alinir_

    @Test
    public void screenShotTest(){
    Driver.getDriver().get(ConfigurationReader.getPropery("url"));
    takeScreenShot("amazon_TC101");

    }
public void takeScreenShot(String name){
        //we created an objec in Selenium called takesScreenShot
    TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();

    //Then we called a method called getScreenshotAs and we save it in a File
    File source = takesScreenshot.getScreenshotAs(OutputType.FILE);

    //The we created an empty file by the help of java
    //then we created a file called image
    File image = new File(System.getProperty("user.dir") + "/"+name+".png");

    //last step we will copy the source file into our image file
    try {
        FileUtils.copyFile(source, image);
    } catch (IOException e) {
        e.printStackTrace();
    }

}
}
