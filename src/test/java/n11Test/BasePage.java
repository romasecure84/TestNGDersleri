package n11Test;

import org.openqa.selenium.WebDriver;

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
}
