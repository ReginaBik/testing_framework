package scripts;

import net.sourceforge.htmlunit.corejs.javascript.JavaScriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import utilities.Waiter;

public class _14_Scrolling extends Base{
    @Test
    public void testScroll(){
        driver.get("https://www.techglobalschool.com/");
        actions.moveToElement(tgHomePage.registerForIntroLink).perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript ("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", tgHomePage.registerForIntroLink);
        Waiter.pause(10);
    }
}
