package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_TechGlobalTest extends Base{


    @Test
    public void testApplicationFormHeading() {
        driver.get("https://www.techglobalschool.com/");


        WebElement heading1 = driver.findElement(By.cssSelector("#comp-kh9s3kyz3 span span"));
        // String expectedHeading = "Application Form";
        // String actualHeading = heading1.getText();

        Assert.assertTrue(heading1.isDisplayed());

        Assert.assertEquals(heading1.getText(), "Application Form" );
    }




}