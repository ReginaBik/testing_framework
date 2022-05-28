package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class GoogleSearchPage {

    public HTMLInputElement storeLink;

    public GoogleSearchPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "q")
    public WebElement searchInputBox;
}

