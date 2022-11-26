package ui_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;

public class DynamicLoadingPage {

    WebDriver driver;

    public DynamicLoadingPage(){
        driver= Driver.getInstance().getDriver();
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//*[text()='Start']")
   public WebElement startButton;

    @FindBy(xpath = "//*[text()='Hello World!']")
    public WebElement message;


}
