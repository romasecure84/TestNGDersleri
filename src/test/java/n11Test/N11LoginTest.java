package n11Test;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class N11LoginTest extends BaseTest{
    LoginPage loginPage;
    Faker faker=new Faker();
    @Test
    public void loginTest() throws InterruptedException {
        driver.get("https://www.n11.com/giris-yap");
        loginPage=new LoginPage(driver);
        loginPage.typeEmail(faker.internet().emailAddress());
        loginPage.typePassword(faker.internet().password());
        loginPage.clickButton();
        Thread.sleep(2000);
        Assert.assertTrue(loginPage.getErrorMessage().isDisplayed());
    }
}
