package n11Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.awt.image.Kernel;

public class TabBarPage {
    private final WebDriver driver;
    private final By searchBox = By.xpath("//*[@id='searchData']");
    private final By basketTotalNumber = By.xpath("//*[@class='basketTotalNum']");

    public  TabBarPage(WebDriver driver){
        this.driver=driver;
    }
    public void search(String searchWord){
        driver.findElement(searchBox).click();
        driver.findElement(searchBox).sendKeys(searchWord+ Keys.ENTER);
    }
    public String getBasketTotalNumber(){
        return driver.findElement(basketTotalNumber).getText();
    }
}
