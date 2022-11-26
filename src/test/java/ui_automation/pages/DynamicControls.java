package ui_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;

public class DynamicControls {

    WebDriver driver;

    public DynamicControls(){
        driver= Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//button[text()='Remove']")
    public WebElement removeButton;

    @FindBy(xpath = "//*[text()='Add']")
    public WebElement addButton;



    @FindBy(xpath = "//*[text()='Enable']")
    public WebElement enableButton;

    @FindBy(xpath = "//*[text()='Disable']")
    public WebElement disableButton;

}
