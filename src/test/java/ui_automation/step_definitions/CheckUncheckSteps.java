package ui_automation.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ui_automation.pages.CheckUncheckPage;
import ui_automation.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class CheckUncheckSteps {

    WebDriver driver= Driver.getInstance().getDriver();
    CheckUncheckPage checkUncheckPage = new CheckUncheckPage();


    @Given("user navigates to the check and uncheck page")
    public void user_navigates_to_the_check_and_uncheck_page() {
        driver.get("http://localhost:7080/checkboxes");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @When("user checks options")
    public void user_checks_options() throws InterruptedException {
        checkUncheckPage.checkbox.click();
        Thread.sleep(2000);
        String attribute= driver.findElement(By.xpath("//input[@type='checkbox']")).getAttribute("checked");
        Assert.assertEquals("true", attribute);
    }

    @When("user unchecks options")
    public void user_unchecks_options() throws InterruptedException {
        checkUncheckPage.checkbox.click();
        Thread.sleep(2000);
        String attribute= driver.findElement(By.xpath("//input[@type='checkbox']")).getAttribute("checked");
        Assert.assertEquals(null, attribute);


    }



}
