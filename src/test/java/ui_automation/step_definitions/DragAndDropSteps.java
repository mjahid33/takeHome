package ui_automation.step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui_automation.pages.DragAndDropPage;
import ui_automation.utilities.Driver;
import java.util.concurrent.TimeUnit;

public class DragAndDropSteps {
    WebDriver driver = Driver.getInstance().getDriver();
    DragAndDropPage dragAndDropPage = new DragAndDropPage();
    Actions actions = new Actions(driver);
    String expectedCh="A";



    @Given("user navigates to page")
    public void user_navigates_to_page() throws InterruptedException {
        driver.get("http://localhost:7080/drag_and_drop");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

    }

    @Then("user Drags and drops corresponding boxes")
    public void user_Drags_and_drops_corresponding_boxes() throws InterruptedException {
       WebElement sourceElement = dragAndDropPage.box1;
        WebElement targetElement = dragAndDropPage.box2;
        actions.dragAndDrop(sourceElement,targetElement).perform();
        Thread.sleep(3000);
        String ch=dragAndDropPage.boxName.getText();
        Assert.assertEquals("", expectedCh, ch);

    }


}
