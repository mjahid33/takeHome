package ui_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;

public class DropdownPage {

    WebDriver driver;

    public DropdownPage(){
        driver= Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy (id = "dropdown")
    public WebElement dropdown;

}
