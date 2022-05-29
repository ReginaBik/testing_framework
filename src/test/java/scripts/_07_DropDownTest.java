package scripts;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ExpediaPage;
import utilities.DropdownHandler;
import utilities.Waiter;

public class _07_DropDownTest extends Base {

    /*
    Go to https://www.facebook.com/
    Click on "Create New Account" link
    Enter below information and click on Sign Up button
    First name = John
    Last Name = Doe
    Email address = johndoe55555@gmail.com
    Password = abcd1234
    Birthday = April 1, 1990
    Gender = Male
    Validate below error message is displayed with expected text
    Please choose a more secure password. It should be longer than 6 characters, unique to you, and difficult for others to guess.
     */


    @Test(priority = 1, description = "TC763 Validate Facebook Sign In error message for password")
    public void testUnsecurePasswordMessage() {
        driver.get("https://www.facebook.com/");

        facebookPage.registerLink.click();
        facebookPage.firstNameInputBox.sendKeys("John");
        facebookPage.lastNameInputBox.sendKeys("Doe");
        facebookPage.emailOrPhoneInputBox.sendKeys("johndoe6666666@gmail.com");
        facebookPage.emailReEnterInputBox.sendKeys("johndoe6666666@gmail.com");
        facebookPage.passwordInputBox.sendKeys("abcd1234");

        DropdownHandler.selectOptionByIndex(facebookPage.monthDropdown, 3);
        DropdownHandler.selectOptionByVisibleText(facebookPage.dayDropdown, "1");
        DropdownHandler.selectOptionByValue(facebookPage.yearDropdown, "1990");
/*
        //To be able to select an option from dropdown we need an instance of Select class
        Select monthSelector = new Select(facebookPage.monthDropdown);
        //monthSelector.selectByValue("4"); // selection by value
        //monthSelector.selectByVisibleText("Apr"); // selection by visible text
        monthSelector.selectByIndex(3); // selection by index - index starts from zero

        //Select day as 1

        Select daySelector = new Select(facebookPage.dayDropdown);
        daySelector.selectByValue("1");


        //Select year as 1990
        Select yearSelector = new Select(facebookPage.yearDropdown);
        yearSelector.selectByValue("1990");
        */


        facebookPage.genderRadioButtons.get(1).click();
        facebookPage.signUpButton.click();


        String expectedMessage = "Please choose a more secure password. It should be longer than 6 characters, unique to you, and difficult for others to guess.";
        //new WebDriverWait(driver, 30).until(ExpectedConditions.textToBePresentInElement(facebookPage.errorMessage, expectedMessage));
        Waiter.waitUntilTextToBePresentInElement(driver, 60, facebookPage.errorMessage, expectedMessage);
        Assert.assertEquals(facebookPage.errorMessage.getText(), expectedMessage);
    }

        @Test(priority = 2, description = "TC578: Validate Expedia dropdowns")
        public void testExpediaDropdown(){
            driver.get("https://www.expedia.com/");
            expediaPage.moreTravelDropdown.click();
            expediaPage.flights.click();
            expediaPage.flightTypesDropdown.click();

            expediaPage.flightOptions.get(1).click();

            Assert.assertEquals(expediaPage.flightTypesDropdown.getText(), "Premium economy");
        }

        @Test(priority = 3, description = "TC6565: test shop by button")
        public void testEbayDropdown(){

        }

  }











