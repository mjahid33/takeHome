package ui_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;


public class LoginPageFailure {

    WebDriver driver = Driver.getInstance().getDriver();

    public LoginPageFailure() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="username")
    public WebElement usernameBox;
    
    @FindBy(id="password")
    public WebElement passwordBox;

    @FindBy(xpath="//*[text()=' Login']")
    public WebElement loginButton;
    

    @FindBy(xpath = "//div[@class='flash error']")
    public WebElement errorMessage;
    
    
}
