package ui_automation.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import ui_automation.pages.FloatingMenuPage;
import ui_automation.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class FloatingMenuSteps {
    WebDriver driver= Driver.getInstance().getDriver();
    FloatingMenuPage floatingMenuPage = new FloatingMenuPage();



    @Given("user navigates to the floating menu page")
    public void user_navigates_to_the_floating_menu_page() {
        driver.get("http://localhost:7080/floating_menu");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @When("user scrolls the page")
    public void user_scrolls_the_page() throws InterruptedException {
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    }

    @Then("asserts that the floating menu is still displayed")
    public void asserts_that_the_floating_menu_is_still_displayed() throws InterruptedException {
        String actualText=floatingMenuPage.homeButton.getText();
        Assert.assertEquals("Menu verification failed", "Home",actualText);



    }


}
