package ui_automation.step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import ui_automation.pages.iFramePage;
import ui_automation.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class iFramePageSteps {

    WebDriver driver = Driver.getInstance().getDriver();

    iFramePage iFramePage = new iFramePage();

    @Given("user navigates to iFrames page")
    public void user_navigates_to_iFrames_page() throws InterruptedException {
        driver.get("http://localhost:7080/iframe");
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @When("user switch to the frame")
    public void user_switch_to_the_frame() throws InterruptedException {
        driver.switchTo().frame(iFramePage.iFrame);
          }

    @Then("user types some text from into the frame")
    public void user_types_some_text_from_into_the_frame() throws InterruptedException {
        iFramePage.iFrameText.clear();
        iFramePage.iFrameText.sendKeys("Hello World!!!");

    }

    @Then("User verifies the written text")
    public void user_verifies_the_written_text() throws InterruptedException {
        String iFrameText = iFramePage.iFrameText.getText();
        String expectedText= "Hello World!!!";
        Assert.assertEquals("Text failure",expectedText, iFrameText);
    }

    }


