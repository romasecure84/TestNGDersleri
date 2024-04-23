package n11Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.awt.image.Kernel;

public class TabBarPage extends BasePage {

    private final By searchBox = By.xpath("//*[@id='searchData']");
    private final By basketTotalNumber = By.xpath("//*[@class='basketTotalNum']");

    public TabBarPage(WebDriver driver) {
        super(driver);
    }

    public void search(String searchWord) {
        clickToWebElement(searchBox);
        find(searchBox).sendKeys(searchWord + Keys.ENTER);
    }

    public String getBasketTotalNumber() {
        return find(basketTotalNumber).getText();
    }
}
