package ui_automation.step_definitions;


import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import ui_automation.pages.AlertPage;
import ui_automation.utilities.AlertHelper;
import ui_automation.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class AlertPageSteps {

    WebDriver driver = Driver.getInstance().getDriver();
    AlertPage alertPage = new AlertPage();



    @Given("user navigates to Alert Page")
    public void user_navigates_to_Alert_Page()  {
        driver.get("http://localhost:7080/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @When("user clicks on JS JS Alert Button")
    public void user_clicks_on_JS_JS_Alert_Button()  {
        alertPage.jsAlertButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.alertIsPresent());
        AlertHelper.getAlert().accept();

    }

    @Then("user asserts alert message")
    public void user_asserts_alert_message() {
        String jsText=alertPage.jsAlertText.getText();
        String expectedText = "You successfuly clicked an alert";
        Assert.assertEquals("Message Failure",expectedText, jsText );
    }

    @Then("user clicks on JS confirm Button and clicks ok on alert")
    public void user_clicks_on_JS_confirm_Button_and_clicks_ok_on_alert() {
        alertPage.jsConfirmButton.click();
        AlertHelper.getAlert().accept();

    }

    @Then("user asserts the alert message")
    public void user_asserts_the_alert_message() {
        String jsConfirmText=alertPage.jsConfirmText.getText();
        String expectedText = "You clicked: Ok";
        Assert.assertEquals("Message Failure",expectedText, jsConfirmText );

    }

    @Then("user clicks on JS Prompt Button and types a message on Prompt")
    public void user_clicks_on_JS_Prompt_Button_and_types_a_message_on_Prompt()  {
        alertPage.jsPromptButton.click();
        AlertHelper.AcceptPrompt("Hello");

    }

    @Then("user asserts that the alert message contains the typed message")
    public void user_asserts_that_the_alert_message_contains_the_typed_message() {
        String jsPromptText=alertPage.jsPromptText.getText();
        String expectedText = "You entered: Hello";
        Assert.assertEquals("Message Failure",expectedText, jsPromptText );

    }


}
