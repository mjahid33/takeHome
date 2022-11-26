package ui_automation.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui_automation.pages.DynamicLoadingPage;
import ui_automation.utilities.Driver;

public class DynamicLoadingSteps {
    WebDriver driver= Driver.getInstance().getDriver();
    DynamicLoadingPage dynamicLoadingPage =new DynamicLoadingPage();


    @Given("user navigates to the dynamic loading page")
    public void user_navigates_to_the_dynamic_loading_page() {
        driver.get("http://localhost:7080/dynamic_loading/2");
        driver.manage().window().maximize();
    }

    @When("user clicks on Start button")
    public void user_clicks_on_Start_button() {
        dynamicLoadingPage.startButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Hello World!']")));

    }


    @Then("user verifies displayed message")
    public void user_verifies_displayed_message() {
        String expectedMessage="Hello World!";
        String actualMessage= dynamicLoadingPage.message.getText();
        System.out.println(actualMessage);
        Assert.assertEquals("Message verification failed", expectedMessage, actualMessage);




    }

}
