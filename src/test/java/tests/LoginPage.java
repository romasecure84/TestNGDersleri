package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPage {
    //WebDriver driver;
    private WebDriver driver;
    private By usernameLocator= By.id("username");
    private By passwordLocator=By.id("password");
    private By submitButton=By.id("submit");

    public  LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public  void enterUsername(String username){
        driver.findElement(usernameLocator).sendKeys(username);
    }
    public void enterPassword(String password){
        driver.findElement(passwordLocator).sendKeys(password);
    }
    public void clickSubmitButton(){
        driver.findElement(submitButton).click();
    }
}
