package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_TechGlobalTest extends Base{


    @Test
    public void testApplicationFormHeading() {
        driver.get("https://www.techglobalschool.com/");


     //REDUNDANT  WebElement heading1 = tgApplicationPage.heading1;

        // String expectedHeading = "Application Form";
        // String actualHeading = heading1.getText();

        Assert.assertTrue(tgApplicationPage.heading1.isDisplayed());

        Assert.assertEquals(tgApplicationPage.heading1.getText(), "Application Form" );
    }




}
