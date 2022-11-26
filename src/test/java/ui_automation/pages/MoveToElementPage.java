package ui_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;

public class MoveToElementPage {

    WebDriver driver;

    public MoveToElementPage() {
        driver = Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//div[@class='figure'])[1]")
    public WebElement user1;

    @FindBy(xpath = "(//div[@class='figure'])[2]")
    public WebElement user2;

    @FindBy(xpath = "(//div[@class='figure'])[3]")
    public WebElement user3;


    @FindBy(xpath = "//*[text()='name: user1']")
    public WebElement user1Text;

    @FindBy(xpath = "//*[text()='name: user2']")
    public WebElement user2Text;

    @FindBy(xpath = "//*[text()='name: user3']")
    public WebElement user3Text;



}
