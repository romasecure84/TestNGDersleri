package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion extends BaseTestClass{
    @Test
    public void loginTest() throws InterruptedException {
        SoftAssert softAssert=new SoftAssert();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        WebElement userName=driver.findElement(By.id("username"));
        WebElement password=driver.findElement(By.id("password"));
        WebElement submitButton=driver.findElement(By.id("submit"));

        userName.sendKeys("admin");
        password.sendKeys("Password123");
        submitButton.click();
        WebElement errorMes1=driver.findElement(By.xpath("//*[@id='error']"));
        softAssert.assertTrue(errorMes1.isDisplayed());
        Thread.sleep(2000);

        userName.sendKeys("student");
        password.sendKeys("admin123");
        submitButton.click();
        WebElement errorMes2=driver.findElement(By.xpath("//*[@id='error']"));
        softAssert.assertTrue(errorMes2.isDisplayed());
        Thread.sleep(2000);


        userName.sendKeys("student");
        password.sendKeys("Password123");
        submitButton.click();
        WebElement successMes=driver.findElement(By.xpath("//*[text()='Logged In Successfully']"));
        softAssert.assertTrue(successMes.isDisplayed());
    }
    @Test
    public void test() throws InterruptedException {
        SoftAssert softAssert=new SoftAssert();
        //amazon sehifesine gedin
        driver.get("https://www.amazon.com.tr");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='sp-cc-rejectall-link']")).click();
        //title'de Amazon yazildigini test edin
        softAssert.assertTrue(driver.getTitle().contains("amazon"),"Girdiyiniz kelime movcud deyil");
        //axtaris qutusunun movcudlugunun test edin
        WebElement axtarisQutusu=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        softAssert.assertTrue(axtarisQutusu.isEnabled(),"Axtaris qutusu movcud deyil");
        //axtaris qutusuna "Iphone" yazib axtaris edin
        axtarisQutusu.sendKeys("Iphone", Keys.ENTER);
        //axtarisin edildiyini test edin
        WebElement neticeler= driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(neticeler.isDisplayed(),"Neticeler movcud deyil");
        //axtaris neticesinin iphone icerdiyini test edin
        softAssert.assertTrue(neticeler.getText().contains("iphone"),"axtardiginiz kelime yoxdur");
        softAssert.assertAll();
        System.out.println("eger sistemde xeta varsa bu yazi oxunmayacaq");
    }
}
