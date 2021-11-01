package page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static waits.CustomWebElementWaits.waitBeforeChoosingMenuOptionAfterClick;

public class GoogleSearchResultPage extends AbstractPage {
    protected GoogleSearchResultPage(WebDriver driver) {
        super(driver);
    }

    private final Logger logger = LogManager.getRootLogger();

    @FindBy(xpath = "//a[b[contains(text(),'Calculator')]]")
    private WebElement searchResult;

    @Override
    protected GoogleSearchResultPage openPage() {
        waitBeforeChoosingMenuOptionAfterClick(driver);
        logger.info("Opened page CloudGooglePageWithSearchingResultFrame");
        return this;
    }

    public CreateHomeGooglePageCalculator openCalculator() {
        waitBeforeChoosingMenuOptionAfterClick(searchResult, driver).click();
        logger.info("Moved to PricingCalculatorPageFrame");
        return new CreateHomeGooglePageCalculator(driver);
    }
}
