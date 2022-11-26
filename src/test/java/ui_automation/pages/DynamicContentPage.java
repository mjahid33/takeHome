package ui_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;

public class DynamicContentPage {
    WebDriver driver;

    public DynamicContentPage(){
        driver= Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[text()='click here']")
    public WebElement clickButton;

    @FindBy(xpath = "(//div[@class='row'])[6]")
    public WebElement textRow;

}
