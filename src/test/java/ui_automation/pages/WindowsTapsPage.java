package ui_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;

public class WindowsTapsPage {

    WebDriver driver;

    public WindowsTapsPage() {
        driver = Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//*[text()='Click Here']")
    public WebElement clickHereLink;

    @FindBy(xpath = "//h3[text()='New Window']")
    public WebElement newWindow;


}
