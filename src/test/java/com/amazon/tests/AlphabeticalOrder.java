package com.amazon.tests;

import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class AlphabeticalOrder {


    // Seceneklerin harf sirasina gore sirali olup olmadigini nasil kontrol edebiliriz?

    @Test
    public void alhabeticalOrder(){
    Driver.getDriver().get(ConfigurationReader.getPropery("url"));

    WebElement dropdown = Driver.getDriver().findElement(By.id("searchDropdownBox"));

    }

    public boolean isItInOrder(List<WebElement> options){

    boolean isItInOrder = false;

    for(int i = 1 ; i < options.size(); i++){

    WebElement before = options.get(i-1);
    WebElement current = options.get(i);

    if (before.getText().compareTo(current.getText()) < 0) {

        isItInOrder = true;
    }else {
      isItInOrder =false;
      break;
      }
      }
      return isItInOrder;
      }
      }

