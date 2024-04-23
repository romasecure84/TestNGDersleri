package n11Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.image.Kernel;

public class TabBarPage extends BasePage {

    //private final By searchBox = By.xpath("//*[@id='searchData']");
    @FindBy(xpath = "//*[@id='searchData']")
    private WebElement searchBox;
    //private final By basketTotalNumber = By.xpath("//*[@class='basketTotalNum']");
    @FindBy(xpath = "//*[@class='basketTotalNum']")
    private WebElement basketTotalNumber;

    public TabBarPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void search(String searchWord) {
        //clickToWebElement(searchBox);
        searchBox.sendKeys(searchWord + Keys.ENTER);
    }

    public String getBasketTotalNumber() {
        //return find(basketTotalNumber).getText();
        return basketTotalNumber.getText();
    }
}
