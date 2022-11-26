package ui_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;

public class NotificationMessagePage {

    WebDriver driver;

    public NotificationMessagePage () {
        driver = Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Click here']")
    public WebElement clickHere;

    @FindBy(id = "flash")
    public WebElement message;



}
