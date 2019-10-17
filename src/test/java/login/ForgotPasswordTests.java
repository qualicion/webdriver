package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertTrue;


public class ForgotPasswordTests extends BaseTests {
    @Test
    public void testPasswordReset(){
        ForgotPasswordPage forgotPassword = homePage.clickForgotPasswordLink();
        forgotPassword.enterEmail("oduniyiapp@gmail.com");
        EmailSentPage emailSentPage = forgotPassword.clickRetrievePasswordButton();
        assertTrue(emailSentPage.getEmailSentAlert()
                    .contains("Your e-mail's been sent!"),
                   "Alert text is incorrect");
    }
}
