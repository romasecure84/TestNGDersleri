package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Test02 {
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
    public void amazonSearchTest() {
        driver.get("https://www.amazon.com.tr");
        driver.findElement(By.id("sp-cc-rejectall-link")).click();
        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iphone", Keys.ENTER);
        WebElement result= driver.findElement(By.xpath("//*[@id='search']/span[2]/div/h1/div/div[1]/div/div"));
        Assert.assertTrue(result.isDisplayed());
        driver.findElement(By.xpath("//div[@data-index='5']")).click();
        driver.findElement(By.id("add-to-cart-button")).click();
        WebElement count=driver.findElement(By.id("nav-cart-count"));
        Assert.assertNotEquals(count.getText(),"0");
    }

    @AfterClass
    public  void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
