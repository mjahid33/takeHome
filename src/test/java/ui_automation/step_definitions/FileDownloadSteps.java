package ui_automation.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import ui_automation.pages.FileDownloadPage;
import ui_automation.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class FileDownloadSteps {
    WebDriver driver = Driver.getInstance().getDriver();
    FileDownloadPage fileDownloadPage = new FileDownloadPage();


    @Given("user navigates to  Download Page")
    public void user_navigates_to_Download_Page() {
        driver.get("http://localhost:7080/download");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Then("user downloads a document on  Download Page")
    public void userDownloadsADocumentOnDownloadPage() throws InterruptedException {
        fileDownloadPage.fileDownload.click();
        Thread.sleep(5000);


    }



}