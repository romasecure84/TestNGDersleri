package n11Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ResultPage extends BasePage {
    //private final By resultTextLocator = By.xpath("//*[@class='resultText ']");
    @FindBy(xpath = "//*[@class='resultText ']")
    private WebElement resultText;

    //private final By productNameLocator = By.xpath("(//*[@class='productName'])[2]");
    @FindBy(xpath = "(//*[@class='productName'])[2]")
    private WebElement productName;

    @FindAll(@FindBy(xpath = "//*[@class='productName']"))
    public List<WebElement> productList;

    public ResultPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getResultWebElement() {
        //return find(resultTextLocator);
        return resultText;
    }

    public void clickToProduct() {
        //clickToWebElement(productNameLocator);
        productName.click();
    }

    public void clickToProductList(int index) {
        productList.get(index).click();
    }
}
