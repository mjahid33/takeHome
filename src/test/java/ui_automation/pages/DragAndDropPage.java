package ui_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;

public class DragAndDropPage {

    WebDriver driver;

    public DragAndDropPage() {
        driver = Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "column-a")
    public WebElement box1;

    @FindBy(id = "column-b")
    public WebElement box2;

    @FindBy(xpath = "//header[text()='A']")
    public WebElement boxName;



}
