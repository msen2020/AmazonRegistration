package com.amazon.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    //TestNg @DataProvider nedir?

    @Test(dataProvider = "names")
    public void test(String name, int age){
        System.out.println(name + "-" + age);

        }

    @DataProvider
    public Object [][] names(){
        Object[][] list = {{"Hamza", 20 },{"Ayse", 40}, {"Ahmet", 30}, {"Fatma", 25}};
                return list;
 }
}
