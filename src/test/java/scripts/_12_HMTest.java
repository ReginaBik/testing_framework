package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _12_HMTest extends Base {

    @Test(priority = 1, description = "TC012: Validate logo")
    public void logo(){
        driver.get("https://www2.hm.com/en_us/index.html");
        Assert.assertTrue(hmPage.hmLogo.isDisplayed(), "logo validation passed");
            }

}
