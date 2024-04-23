package n11Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;
    }
    public void navigateTo(String URL){
        driver.get(URL);
    }
    public String getPageURL(){
        return driver.getCurrentUrl();
    }
    public String getPageTitle(){
        return driver.getTitle().toUpperCase();
    }
    public WebElement find(By locator){
        return driver.findElement(locator);
    }
    public void clickToWebElement(By locator){
        find(locator).click();
    }
}
