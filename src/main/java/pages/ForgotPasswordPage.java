package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ForgotPasswordPage {
    private WebDriver driver;
    private By emailTextBox = By.id("email");
    private By retrievePasswordButton = By.id("form_submit");


    public ForgotPasswordPage (WebDriver driver){
        this.driver = driver;
    }

    public void enterEmail(String email){
        driver.findElement(emailTextBox).sendKeys(email);
    }

    public EmailSentPage clickRetrievePasswordButton(){
        driver.findElement(retrievePasswordButton).click();
        return new EmailSentPage(driver);
    }
}
