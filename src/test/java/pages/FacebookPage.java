package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FacebookPage {

    public FacebookPage(WebDriver driver){
        PageFactory.initElements(driver, this );
    }

    @FindBy(xpath = "//a[@data-testid='open-registration-form-button']")
    public WebElement registerLink;

    @FindBy(css = "._8esa")
    public List<WebElement> genderRadioButtons;



}
