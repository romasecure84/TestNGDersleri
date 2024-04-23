package n11Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage extends BasePage {
    //private final By addToBasketLocator = By.className("addBasketUnify");
    @FindBy(className = "addBasketUnify")
    private WebElement addToBasket;

    public ProductDetailPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void addToCard() {
        addToBasket.click();
    }
}
