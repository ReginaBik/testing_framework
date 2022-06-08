package scripts;

import org.testng.annotations.Test;

public class _10_WindowHandlers extends Base {

    /*
TEST CASE 1: Validate FaceBook social media icon for TechGlobal School
1. Go to https://www.techglobalschool.com/
2. Click on FaceBook icon in the footer
3. Validate user is routed to https://www.facebook.com/techglobalschool
 */

    @Test(priority = 1, description = " TEST CASE 1: Validate FaceBook social media icon for TechGlobal School")
    public void testTechGlobalSchoolFaceBookIcon(){
        driver.get("https://www.techglobalschool.com/apply-now");



    }




}
