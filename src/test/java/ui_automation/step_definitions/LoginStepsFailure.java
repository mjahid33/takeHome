package ui_automation.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import ui_automation.pages.LoginPage;
import ui_automation.pages.LoginPageFailure;
import ui_automation.utilities.Driver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginStepsFailure {

    WebDriver driver = Driver.getInstance().getDriver();

    LoginPageFailure loginPageFailure = new LoginPageFailure();
   
    @Given("user navigates to Loginpage")
    public void user_navigates_to_Loginpage() {
        driver.get("http://localhost:7080/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @When("user enters {string} Username")
    public void user_enters_Username(String username) {
        loginPageFailure.usernameBox.sendKeys(username);
    }

    @Then("user enters {string} Password")
    public void user_enters_Password(String password) {
        loginPageFailure.passwordBox.sendKeys(password);
    }

    @Then("user clicks on Login button")
    public void user_clicks_on_Login_button()  {
        loginPageFailure.loginButton.click();

    }

    @Then("user validates {string} Error Message")
    public void user_validates_Error_Message(String expectedErrorMessage)  {
        String actualErrorMessage = loginPageFailure.errorMessage.getText();
        Boolean errorMessage=false;
        if (actualErrorMessage.contains("Your username is invalid!")) {
            errorMessage=true;
        }
        assertTrue("Error message validation is failed.",errorMessage );

    }

}
