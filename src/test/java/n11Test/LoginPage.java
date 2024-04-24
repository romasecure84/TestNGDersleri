package n11Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//*[@id='email']")
    private WebElement emailInput;
    @FindBy(xpath = "//*[@id='password']")
    private WebElement passwordInput;
    @FindBy(xpath = "//*[@id='loginButton']")
    private WebElement loginButton;
    @FindBy(xpath = "//*[@class='error-message']")
    private WebElement errorMessage;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void typeEmail(String email){
        emailInput.sendKeys(email);
    }
    public void typePassword(String password){
        passwordInput.sendKeys(password);
    }
    public  void clickButton(){
        loginButton.click();
    }
    public WebElement getErrorMessage(){
        return errorMessage;
    }
}
