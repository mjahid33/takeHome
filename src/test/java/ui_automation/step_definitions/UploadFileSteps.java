package ui_automation.step_definitions;

import io.cucumber.java.en.*;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import ui_automation.pages.UploadFilePage;
import ui_automation.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class UploadFileSteps {

    WebDriver driver = Driver.getInstance().getDriver();
    UploadFilePage uploadFilePage = new UploadFilePage();
    private static final Logger logger = LogManager.getLogger(UploadFileSteps.class);


    @Given("user navigates to File Upload Page")
    public void userNavigatesToFileUploadPage() throws InterruptedException {
        driver.get("http://localhost:7080/upload");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
    }

    @Then("user uploads a document on File Upload Page")
    public void user_uploads_a_document_on_File_Upload_Page() throws InterruptedException {
        String filePath = System.getProperty("user.dir") + "/src/test/resources/testData/person.png";

        uploadFilePage.chooseFileButton.sendKeys(filePath);
        Thread.sleep(1000);
        uploadFilePage.uploadButton.click();
        Thread.sleep(1000);
        String expectedFileText = "person.png";
        String actualFileText = uploadFilePage.uploadedFileTextElement.getText();
        Assert.assertEquals("Uploaded file verification failed!", expectedFileText, actualFileText);


    }


}
