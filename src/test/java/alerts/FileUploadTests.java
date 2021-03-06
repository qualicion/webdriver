package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload() {
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("/Users/boduniyi/Desktop/Hey.txt");
        assertEquals(uploadPage.getUploadedFiles(), "Hello.txt", "Uploaded ");
    }
}