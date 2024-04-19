package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class Test01 {
    static WebDriver driver;

    @BeforeSuite
    public void test01() {
        System.out.println("1");
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().setSize(new Dimension(1382, 744));
//        driver.manage().window().setPosition(new Point(-8, -8));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @BeforeTest
    public void test02(){
        System.out.println("2");
    }
    @BeforeClass
    public void test03(){
        System.out.println("3");
    }
    @BeforeGroups
    public void test04(){
        System.out.println("4");
    }
    @BeforeMethod
    public void test05(){
        System.out.println("5");
    }
    @Test
    public void test06(){
        System.out.println("6");
    }
    @AfterMethod
    public void test07(){
        System.out.println("7");
    }
    @AfterGroups
    public void test08(){
        System.out.println("8");
    }
    @AfterClass
    public void test09(){
        System.out.println("9");
    }
    @AfterTest
    public void test10(){
        System.out.println("10");
    }
    @AfterSuite
    public void test11(){
        System.out.println("11");
    }
}
