package ui_automation.step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import ui_automation.pages.MoveToElementPage;
import ui_automation.utilities.Driver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MoveToElementPageSteps {

        WebDriver driver = Driver.getInstance().getDriver();
        MoveToElementPage moveToElementPage = new MoveToElementPage();
        Actions actions = new Actions(driver);



    @Given("user navigates to hover over page")
    public void user_navigates_to_hover_over_page() {
        Driver.getInstance().getDriver().get("http://localhost:7080/hovers");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }

    @When("user hovers over on each image")
    public void user_hovers_over_on_each_image() throws InterruptedException {
        actions.moveToElement(moveToElementPage.user1).perform();
        String userText1=moveToElementPage.user1Text.getText();
        String expectedText1="name: user1";
        Assert.assertEquals(" Additional information is NOT displayed", expectedText1, userText1 );

        actions.moveToElement(moveToElementPage.user2).perform();
        String userText2=moveToElementPage.user2Text.getText();
        String expectedText2="name: user2";
        Assert.assertEquals(" Additional information is NOT displayed", expectedText2, userText2 );

    }

    @Then("user verifies that additional information is displayed for each image")
    public void user_verifies_that_additional_information_is_displayed_for_each_image() {
        actions.moveToElement(moveToElementPage.user3).perform();
        String userText3=moveToElementPage.user3Text.getText();
        String expectedText="name: user3";
        Assert.assertEquals(" Additional information is NOT displayed", expectedText, userText3 );



    }



}
