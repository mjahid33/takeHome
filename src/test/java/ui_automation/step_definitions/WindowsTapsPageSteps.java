package ui_automation.step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import ui_automation.pages.WindowsTapsPage;
import ui_automation.utilities.Driver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowsTapsPageSteps {

    WebDriver driver = Driver.getInstance().getDriver();
    WindowsTapsPage windowsTapsPage = new WindowsTapsPage();


    @Given("user navigates to Tabs and Windows Page")
    public void user_navigates_to_Tabs_and_Windows_Page() throws InterruptedException {
        driver.get("http://localhost:7080/windows");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
    }

    @When("user clicks on the Click Here link")
    public void userClicksOnTheClickHereLink() throws InterruptedException {
         windowsTapsPage.clickHereLink.click();
        Thread.sleep(2000);
        Set <String> GUIDs= driver.getWindowHandles();
        for (String GUID: GUIDs ){
            driver.switchTo().window(GUID);
                    }
    }

    @Then("user asserts that a new tab is opened with text New Window")
    public void userAssertsThatANewTabIsOpenedWithTextNewWindow() throws InterruptedException {
        String expectedNewWindowTitle = "New Window";
        String actualNewWindowTitle = windowsTapsPage.newWindow.getText();
        System.out.println(actualNewWindowTitle);

          Assert.assertEquals("New Window Title verification failed!",
                    expectedNewWindowTitle, actualNewWindowTitle);


    }


}
