package ui_automation.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ui_automation.pages.DropdownPage;
import ui_automation.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class DropdownSteps {
    WebDriver driver= Driver.getInstance().getDriver();
    DropdownPage dropdownPage = new DropdownPage();


    @Given("user navigates to the dropdown page")
    public void user_navigates_to_the_dropdown_page() {
        driver.get("http://localhost:7080/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @When("user Right clicks on dropdown")
    public void user_Right_clicks_on_dropdown() {
        dropdownPage.dropdown.click();


    }

    @When("user selects an option from the dropdown")
    public void user_selects_an_option_from_the_dropdown() throws InterruptedException {
        Select dp = new Select(dropdownPage.dropdown);
        dp.selectByVisibleText("Option 1");
        Thread.sleep(2000);
       String actualText= driver.findElement(By.xpath("//*[text()='Option 1']")).getText();
        System.out.println(actualText);
        Assert.assertEquals("Verification failed", "Option 1", actualText );

        dp.selectByVisibleText("Option 2");
        Thread.sleep(2000);
        String actualText2= driver.findElement(By.xpath("//*[text()='Option 2']")).getText();
        System.out.println(actualText2);
        Assert.assertEquals("Verification failed", "Option 2", actualText2 );


    }

}
