package page;

import model.ProcessData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static waits.CustomWebElementWaits.waitBeforeChoosingMenuOptionAfterClick;

public class GoogleCloudHomePage extends AbstractPage{


    public GoogleCloudHomePage(WebDriver driver, ProcessData data) {
        super(driver, data);
        PageFactory.initElements(this.driver, this);
    }
    private static final String HOME_PAGE_URL = "https://cloud.google.com/";
    private final Logger logger = LogManager.getRootLogger();

    @Override
    public GoogleCloudHomePage openPage() {
        driver.navigate().to(HOME_PAGE_URL);
        logger.info("page opened");
        return this;
    }

    public GoogleSearchResultPage fillSearchInput(String universalAddress, String element, String inputText) {
        WebElement position = waitBeforeChoosingMenuOptionAfterClick(universalAddress, element, driver);
        position.click();
        position.sendKeys(inputText);
        position.sendKeys(Keys.ENTER);
        logger.info("searching" + inputText);
        return new GoogleSearchResultPage(driver, data);
    }
}
