package ui_automation.utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;

public class AlertHelper {
    private static final Logger oLog = LogManager.getLogger(AlertHelper.class);

    public AlertHelper() {
        oLog.debug("AlertHelper : " + Driver.getInstance().getDriver().hashCode());
    }

    public static Alert getAlert() {
        oLog.debug("");
        return Driver.getInstance().getDriver().switchTo().alert();
    }

    public static void AcceptAlert() {
        oLog.info("");
        getAlert().accept();
    }

    public static void DismissAlert() {
        oLog.info("");
        getAlert().dismiss();
    }

    public static String getAlertText() {
        String text = getAlert().getText();
        oLog.info(text);
        return text;
    }

    public static boolean isAlertPresent() {
        try {
            Driver.getInstance().getDriver().switchTo().alert();
            oLog.info("true");
            return true;
        } catch (NoAlertPresentException e) {
            // Ignore
            oLog.info("false");
            return false;
        }
    }

    public static void AcceptAlertIfPresent() {
        if (!isAlertPresent())
            return;
        AcceptAlert();
        oLog.info("");
    }

    public static void DismissAlertIfPresent() {

        if (!isAlertPresent())
            return;
        DismissAlert();
        oLog.info("");
    }

    public static void AcceptPrompt(String text) {

        if (!isAlertPresent())
            return;

        Alert alert = getAlert();
        alert.sendKeys(text);
        alert.accept();
        oLog.info(text);
    }

}
