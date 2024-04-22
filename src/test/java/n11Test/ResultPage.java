package n11Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage {
    private final WebDriver driver;
    private final By resultTextLocator= By.xpath("//*[@class='resultText '] ");
    private final By productNameLocator=By.xpath("(//*[@class='productName'])[2]");

    public ResultPage(WebDriver driver){
        this.driver=driver;
    }
    public WebElement getResultWebElement(){
        return driver.findElement(resultTextLocator);
    }
    public void clickToProduct(){
        driver.findElement(productNameLocator).click();
    }
}
