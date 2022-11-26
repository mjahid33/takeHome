package ui_automation.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui_automation.pages.DynamicControls;
import ui_automation.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class DynamicControlSteps {

    WebDriver driver= Driver.getInstance().getDriver();
    DynamicControls dynamicControls= new DynamicControls();



    @Given("user navigates to the dynamic controls page")
    public void user_navigates_to_the_dynamic_controls_page() {
        driver.get("http://localhost:7080/dynamic_controls");
        driver.manage().window().maximize();


    }

    @When("user clicks on Remove button")
    public void user_clicks_on_Remove_button() throws InterruptedException {
        dynamicControls.removeButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Remove']")));
        String message=driver.findElement(By.id("message")).getText();
        System.out.println(message);
        Assert.assertEquals("Message verification failed","It's gone!",message );
        Thread.sleep(3000);

        dynamicControls.addButton.click();
        String message1=driver.findElement(By.id("message")).getText();
        System.out.println(message1);
        Assert.assertEquals("Message verification failed","It's back!",message1 );
        Thread.sleep(3000);


    }

    @Then("user clicks Enable button")
    public void user_clicks_Enable_button() throws InterruptedException {
       dynamicControls.enableButton.click();
       WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Enable']")));
        String message=driver.findElement(By.id("message")).getText();
        System.out.println(message);
        Assert.assertEquals("Message verification failed","It's enabled!",message );
        Thread.sleep(3000);

       dynamicControls.disableButton.click();
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Disable']")));
        String message1=driver.findElement(By.id("message")).getText();
        System.out.println(message1);
        Assert.assertEquals("Message verification failed","It's disabled!",message1 );
        Thread.sleep(3000);


    }

}
