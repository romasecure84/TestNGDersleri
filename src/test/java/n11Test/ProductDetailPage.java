package n11Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage {
    WebDriver driver;
    By addToBasketLocator= By.className("addBasketUnify");

    public  ProductDetailPage(WebDriver driver){
        this.driver=driver;
    }

    public void addToCard(){
        driver.findElement(addToBasketLocator).click();
    }
}