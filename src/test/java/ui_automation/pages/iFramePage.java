package ui_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;

public class iFramePage {

    WebDriver driver;

    public iFramePage () {
        driver= Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "mce_0_ifr")
    public WebElement iFrame;

    @FindBy(id = "tinymce")
    public WebElement iFrameText;



    }