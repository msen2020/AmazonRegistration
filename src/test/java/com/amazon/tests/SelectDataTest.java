package com.amazon.tests;

import com.amazon.utilities.Driver;
import com.amazon.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectDataTest {

// How to select date from a date picker?

    @Test
    public void dateTest() {

        Driver.getDriver().get("https://demoqa.com/date-picker");
        WebElement dateInput = Driver.getDriver().findElement(By.id("datePickerMonthYearInput"));
        dateInput.click();

        ReusableMethods.sleep(3000);

        // Select 30 July 2021

        WebElement july30 = Driver.getDriver().findElement(By.xpath("//div[@aria-label='Choose Friday, July 30th, 2021']"));
        july30.click();

    }

    @Test
    public void dateTest2() {

        Driver.getDriver().get("https://demoqa.com/date-picker");
        WebElement dateInput = Driver.getDriver().findElement(By.id("datePickerMonthYearInput"));
        dateInput.click();

        ReusableMethods.sleep(3000);

        // Select MONTH by using DropDown

        // Select 30 January 2021

        WebElement monthDropDown = Driver.getDriver().findElement(By.className("react-datepicker__month-select"));

        //DropDown for month
        Select select = new Select(monthDropDown);
        select.selectByVisibleText("January");

        ReusableMethods.sleep(2000);

        WebElement jan30 = Driver.getDriver().findElement(By.xpath("//div[@aria-label='Choose Saturday, January 30th, 2021']"));
        jan30.click();

    }

    @Test
    public void dateTest3() {

        Driver.getDriver().get("https://demoqa.com/date-picker");
        WebElement dateInput = Driver.getDriver().findElement(By.id("datePickerMonthYearInput"));
        dateInput.click();

        ReusableMethods.sleep(2000);

        //DropDown for month
        WebElement monthDropDown = Driver.getDriver().findElement(By.className("react-datepicker__month-select"));
        Select selectMonth = new Select(monthDropDown);
        selectMonth.selectByVisibleText("January");

        ReusableMethods.sleep(1000);

        WebElement yearDropDown = Driver.getDriver().findElement(By.className("react-datepicker__year-select"));

              //DropDown for year
        Select selectYear = new Select(yearDropDown);
        selectYear.selectByValue("2055");

        ReusableMethods.sleep(1000);

        WebElement year2055 = Driver.getDriver().findElement(By.xpath("//div[@aria-label='Choose Saturday, January 30th, 2055']"));
        year2055.click();

    }

}
