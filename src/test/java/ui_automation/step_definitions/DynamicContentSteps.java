package ui_automation.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import ui_automation.pages.DynamicContentPage;
import ui_automation.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class DynamicContentSteps {
    WebDriver driver = Driver.getInstance().getDriver();
    DynamicContentPage dynamicContentPage=new DynamicContentPage();



    @Given("user navigates to the dynamic content")
    public void user_navigates_to_the_dynamic_content() {
        driver.get("http://localhost:7080/dynamic_content");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @When("user asserts that the content changes on each refresh")
    public void user_asserts_that_the_content_changes_on_each_refresh() throws InterruptedException {
        dynamicContentPage.clickButton.click();
        Thread.sleep(2000);
        String text1=dynamicContentPage.textRow.getText();
        System.out.println(text1);
        dynamicContentPage.clickButton.click();
        Thread.sleep(2000);
        String text2=dynamicContentPage.textRow.getText();
        System.out.println(text2);
       Assert.assertNotEquals(text2, text1);

    }


}
