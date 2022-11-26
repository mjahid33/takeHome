package ui_automation.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


import ui_automation.pages.LoginPage;
import ui_automation.utilities.Driver;


import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class LoginSteps {

    WebDriver driver = Driver.getInstance().getDriver();
    String expectedText = "Logout";
    LoginPage loginPage = new LoginPage();
   
    @Given("user navigates to loginpage")
    public void user_navigates_to_loginpage() {
        driver.get("http://localhost:7080/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("user enters {string} username")
    public void user_enters_username(String username) {
        loginPage.usernameBox.sendKeys(username);
    }

    @Then("user enters {string} password")
    public void user_enters_password(String password) {
        loginPage.passwordBox.sendKeys(password);
    }

    @Then("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.loginButton.click();
    }

    @Then("user validates successful login")
    public void user_validates_successful_login() throws InterruptedException {
        String actualText = loginPage.logOutButton.getText();
        System.out.println(actualText);
        assertEquals("Validation failed.", expectedText, actualText);

    }

     }


