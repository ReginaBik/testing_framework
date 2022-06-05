package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _11_TicketMasterTest extends Base{

    @Test(priority = 1, description = "TC142: Validate title is displayed")
    public void testTicketMasterLogo(){
        driver.get("https://www.ticketmaster.com/");

        Assert.assertTrue(ticketMasterPage.ticketMasterLogo.isDisplayed(), "TicketMaster Logo is not failed");
    }

}
