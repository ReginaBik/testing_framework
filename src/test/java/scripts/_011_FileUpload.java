package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Waiter;

public class _011_FileUpload extends Base {
    @Test(priority = 1, description = "File Upload")
    public void testFileUpload1(){
        driver.get("http://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("File Upload");
        Waiter.pause(2);

        heroAppPage.chooseFileInputBox.sendKeys("/Users/reginabiktimirova/IdeaProjects/testng_framework/MyFileHorror.xls");
        Waiter.pause(2);
        heroAppPage.uploadFileButton.click();
        Waiter.pause(2);

        //Locate 2 more elements
        Assert.assertEquals(heroAppPage.fileUploadedH3.getText(), "File Uploaded!");
        Assert.assertEquals(heroAppPage.uploadedFileText.getText(), "MyFileHorror.xls");

    }

    @Test(priority = 2, description = "File Download")
    public void testFileDownload1(){
        driver.get("http://the-internet.herokuapp.com/");
        heroAppPage.clickOnLink("File Download");
        Waiter.pause(2);
 }





    }

