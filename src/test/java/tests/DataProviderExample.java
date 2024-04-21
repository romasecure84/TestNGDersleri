package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
    @DataProvider(name = "dataTest")
    public Object[][] testData(){
        return  new Object[][]{
                {"Selenium", 40},
                {"Java", 45},
                {"Python",38}
        };
    }
    @Test(dataProvider ="dataTest")
    public void testMethod(String name, int price) {
        System.out.println("Name: "+name+" Price: "+price);
    }
}
