package n11Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage extends BasePage{
    private final By resultTextLocator = By.xpath("//*[@class='resultText '] ");
    private final By productNameLocator = By.xpath("(//*[@class='productName'])[2]");

    public ResultPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getResultWebElement() {
        return find(resultTextLocator);
    }

    public void clickToProduct() {
        clickToWebElement(productNameLocator);
    }
}
