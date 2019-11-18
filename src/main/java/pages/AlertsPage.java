package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class AlertsPage {
    private WebDriver driver;
    private By triggerJSAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerJSConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerJSPrompt = By.xpath("//button[@onclick='jsPrompt()']");
    private By jsAlertResult = By.id("result");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert() {
        driver.findElement(triggerJSAlertButton).click();
    }

    public void triggerConfirm() {
        driver.findElement(triggerJSConfirmButton).click();
    }

    public void triggerPrompt() {
        driver.findElement(triggerJSPrompt).click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void cancelJSAlert() {
        driver.switchTo().alert().dismiss();
    }

    public String getResult() {
        return driver.findElement(jsAlertResult).getText();
    }

    public String getJSConfirmAlert() {
        return driver.switchTo().alert().getText();
    }

    public void enterPromptInput(String text) {
            driver.switchTo().alert().sendKeys(text);
        }
    }