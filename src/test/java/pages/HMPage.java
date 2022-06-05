package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HMPage {
    public HMPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(@class, \"BodyText-module--general__32l6J USP-module--linkText__161tE\") ]")
    public WebElement hmLogo;





}
