package ui_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;

public class AlertPage {

    WebDriver driver;

    public AlertPage () {
       driver = Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[text()='Click for JS Alert']")
    public WebElement jsAlertButton;

    @FindBy(xpath = "//*[text()='Click for JS Confirm']")
    public WebElement jsConfirmButton;

    @FindBy(xpath = "//*[text()='Click for JS Prompt']")
    public WebElement jsPromptButton;

    @FindBy(xpath = "//*[text()='You successfuly clicked an alert']")
    public WebElement jsAlertText;

    @FindBy(xpath = "//*[text()='You clicked: Ok']")
    public WebElement jsConfirmText;

    @FindBy(xpath = "//*[text()='You entered: Hello']")
    public WebElement jsPromptText;


}
