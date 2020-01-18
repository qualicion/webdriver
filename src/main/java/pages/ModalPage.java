package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModalPage {
    private WebDriver driver;
    private By modalTitle = By.cssSelector("div.modal-title");
    private By modalText = By.cssSelector(".modal-body");
    private By modalCloseButton = By.cssSelector("div.modal-footer");

    public ModalPage(WebDriver driver){
        this.driver = driver;
    }

    public String getModalTitle(){
        return driver.findElement(modalTitle).getText();
    }

    public String getModalText(){
        return driver.findElement(modalText).getText();
    }

    public void clickCloseButton() {
        driver.findElement(modalCloseButton).click();
    }
}
