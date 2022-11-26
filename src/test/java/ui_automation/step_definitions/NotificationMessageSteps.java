package ui_automation.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import ui_automation.pages.NotificationMessagePage;
import ui_automation.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class NotificationMessageSteps {

    WebDriver driver = Driver.getInstance().getDriver();
    NotificationMessagePage notificationMessagePage= new NotificationMessagePage();


    @Given("user navigates to Notification Message Page")
    public void user_navigates_to_Notification_Message_Page() {
        driver.get("http://localhost:7080/notification_message_rendered");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }

    @When("user clicks on the Click Here link a multiple times")
    public void userClicksOnTheClickHereLinkAMultipleTimes() throws InterruptedException {
        notificationMessagePage.clickHere.click();
        Thread.sleep(3000);


    }

    @And("user asserts that one of the message")
    public void userAssertsThatOneOfTheMessage() throws InterruptedException {
        String message = "";
        boolean notification=true;
        String actualMessage=notificationMessagePage.message.getText();
        if(message.contains("Action")){
            notification=true;
        }
        Assert.assertTrue("Verification failed",notification );

        notificationMessagePage.clickHere.click();
        Thread.sleep(2000);

        Assert.assertTrue("Verification failed",notification );

    }
}



