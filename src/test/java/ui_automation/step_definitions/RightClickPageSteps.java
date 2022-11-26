package ui_automation.step_definitions;

import io.cucumber.java.en.*;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import ui_automation.pages.RightClickPage;
import ui_automation.utilities.AlertHelper;
import ui_automation.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class RightClickPageSteps {

    WebDriver driver = Driver.getInstance().getDriver();

    RightClickPage actionsRightClickPage = new RightClickPage();

    Actions actions = new Actions(driver);

    private static final Logger oLog = LogManager.getLogger(RightClickPageSteps.class);

    @Given("user navigates to the page")
    public void user_navigates_to_the_page() throws InterruptedException {
        oLog.info("");
        driver.get("http://localhost:7080/context_menu");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);

    }

    @When("user Right clicks on the box")
    public void user_Right_clicks_on_the_box() throws InterruptedException {
        oLog.info("");
        actions.contextClick(actionsRightClickPage.rightClickBox).perform();
        Thread.sleep(2000);

    }

      @Then("user Say ok to alert")
    public void user_Say_ok_to_alert() {
     Alert myAlert= driver.switchTo().alert();
     myAlert.getText();

     AlertHelper.AcceptAlert();

    }

}
