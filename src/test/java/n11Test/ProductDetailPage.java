package n11Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {
    private final By addToBasketLocator = By.className("addBasketUnify");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public void addToCard() {
        driver.findElement(addToBasketLocator).click();
    }
}
