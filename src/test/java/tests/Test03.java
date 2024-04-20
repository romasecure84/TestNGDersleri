package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Test03 {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1382, 744));
        driver.manage().window().setPosition(new Point(-8, -8));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test01() {
        driver.get("https://www.trendyol.com");
        driver.findElement(By.xpath("//*[@title='Kapat']")).click();
        driver.findElement(By.xpath("//*[@class='az-action tr-button']")).click();
        driver.findElement(By.xpath("//*[@id='onetrust-close-btn-container']/button")).click();
        WebElement srcBx=driver.findElement(By.xpath("//*[@id=\"sfx-discovery-search-suggestions\"]/div/div[1]/input"));
        srcBx.sendKeys("iphone",Keys.ENTER);
        driver.findElement(By.xpath("//*[@class='overlay']")).click();
        driver.findElement(By.xpath("//*[@data-id='762254878']")).click();
        List<String> windowList=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowList.get(1));
        driver.findElement(By.xpath("//*[@class='add-to-basket-button-text']")).click();
        WebElement basket= driver.findElement(By.xpath("//*[@class='basket-item-count-container visible']"));
        Assert.assertNotEquals(basket.getText(),0);

    }

    @AfterClass
    public  void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        //driver.quit();
    }
}
