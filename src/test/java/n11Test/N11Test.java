package n11Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class N11Test extends BaseTest {
    TabBarPage tabBarPage;
    ResultPage resultPage;
    ProductDetailPage productDetailPage;

    @Test(priority = 1)
    public void searchTest() throws InterruptedException {
        tabBarPage = new TabBarPage(driver);
        tabBarPage.navigateTo("https://www.n11.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        tabBarPage.search("laptop");
    }

    @Test(priority = 2)
    public void resultPageTest() throws InterruptedException {
        resultPage = new ResultPage(driver);
        WebElement resultWE = resultPage.getResultWebElement();
        softAssert.assertTrue(resultWE.isDisplayed());
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        resultPage.clickToProductList(5);
    }

    @Test(priority = 3)
    public void addToCardTest() throws InterruptedException {
        productDetailPage = new ProductDetailPage(driver);
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        productDetailPage.addToCard();
        softAssert.assertTrue(tabBarPage.getBasketTotalNumber().equals("1"));
    }
}
