package ui_automation.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import ui_automation.pages.JavaScriptErrorPage;
import ui_automation.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class JavaScriptErrorSteps {

    WebDriver driver= Driver.getInstance().getDriver();
    JavaScriptErrorPage javaScriptError= new JavaScriptErrorPage();

    String expectedError="This page has a JavaScript error in the onload event. This is often a problem to using normal Javascript injection techniques.";


    @Given("user navigates to the JavaScript error on the page")
    public void user_navigates_to_the_JavaScript_error_on_the_page() {
        driver.get("http://localhost:7080/javascript_error");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



    }

    @Then("user asserts that the page contains error")
    public void user_asserts_that_the_page_contains_error() {
       String actualMessage= javaScriptError.errorMessage.getText();
        System.out.println(actualMessage);
        Assert.assertEquals("Message failure", expectedError, actualMessage );


    }


}
