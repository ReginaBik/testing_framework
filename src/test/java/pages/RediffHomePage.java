package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePage {
    public RediffHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "div[class ='cellone']")
    public WebElement BSESellOne;

    @FindBy(css = "div[class ='celltwo']")
    public WebElement NSESellTwo;

}
