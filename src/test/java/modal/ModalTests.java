package modal;

import base.BaseTests;
import org.testng.annotations.Test;

public class ModalTests extends BaseTests {
    @Test

    public void modalTest(){
        var modalPage = homePage.clickEntryAdLink();
        modalPage.getModalTitle();
        modalPage.getModalText();
        modalPage.clickCloseButton();
    }
}
