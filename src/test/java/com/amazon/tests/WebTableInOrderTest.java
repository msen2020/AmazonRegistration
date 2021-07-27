package com.amazon.tests;

import com.amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableInOrderTest {

    // Web elementlerin sirali olup olmadigini nasil kontrol ederiz?
    // https://demoqa.com/webtables
    // //div[@role='row'][1]/div[1]

    @Test
    public void webTableIsItInOrderTest(){

       Driver.getDriver().get("https://demoqa.com/webtables");
       WebElement firstName  = Driver.getDriver().findElement(By.xpath("//div[@role='row'][1]/div[1]"));
       firstName.click();

    List<WebElement> data = Driver.getDriver().findElements(By.xpath("//div[@role='row'][1]/div[1]"));

        System.out.println(isItInOrder(data));
    }
    public boolean isItInOrder(List<WebElement> data){
        boolean inOrder = false;

        for(int i = 1 ; i< data.size() -1 ; i++){

        System.out.println(data.get(i).getText());

        WebElement presentData = data.get(i+1);
        WebElement nextData    = data.get(i+1);


        if (nextData.getText().equals(" ")){
            break;
        }
            if (presentData.getText().compareTo(nextData.getText()) <= 0){
                inOrder = true;
            }else {
                inOrder = false;
                break;
            }
        }
return inOrder;

    }
}
