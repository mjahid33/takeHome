package ui_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;


public class LoginPage {

    WebDriver driver = Driver.getInstance().getDriver();

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="username")
    public WebElement usernameBox;
    
    @FindBy(id="password")
    public WebElement passwordBox;

    @FindBy(xpath="//*[text()=' Login']")
    public WebElement loginButton;
    
    @FindBy(xpath="//*[text()=' Logout']")
    public WebElement logOutButton;
    
    @FindBy(xpath = "//div[contains(text(), 'username')]")
    public WebElement errorMessage;
    
    
}
