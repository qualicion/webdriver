package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class AlertTests extends BaseTests {
    @Test
    public void testAcceptAlert(){
      var alertsPage = homePage.clickJavaScriptAlerts();
      alertsPage.triggerAlert();
      alertsPage.acceptAlert();
      assertEquals(alertsPage.getResult(), ("You successfully clicked an alert"),
                "Alert text is incorrect");
    }

    @Test
    public void testGetAndCancelAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.getJSConfirmAlert();
        alertsPage.cancelJSAlert();
        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");

    }

    @Test
    public void testEnterTextAndAccept() {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        String text = "Tunde is an excellent programmer!";
        alertsPage.enterPromptInput(text);
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResult(), ("You entered: " + text),
                "Alert is incorrect");
    }
}