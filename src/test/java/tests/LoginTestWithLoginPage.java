package tests;

import org.testng.annotations.Test;

public class LoginTestWithLoginPage extends BaseTestClass{
    @Test
    public void login() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        loginPage.enterUsername("student");
        loginPage.enterPassword("Password123");
        loginPage.clickSubmitButton();
    }
}
