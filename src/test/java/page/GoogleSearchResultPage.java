package page;

import model.ProcessData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;


import static waits.CustomWebElementWaits.waitBeforeChoosingMenuOptionAfterClick;

public class GoogleSearchResultPage extends AbstractPage{
    protected GoogleSearchResultPage(WebDriver driver/*, ProcessData data*/) {
        super(driver/*, data*/);
    }
    private final Logger logger = LogManager.getRootLogger();

    @Override
    protected GoogleSearchResultPage openPage() {
        waitBeforeChoosingMenuOptionAfterClick(driver);
        logger.info("Opened page CloudGooglePageWithSearchingResultFrame");
        return this;
    }

    public CreateHomeGooglePageCalculator openCalculator(String universalAddress, String element) {
        waitBeforeChoosingMenuOptionAfterClick(universalAddress, element, driver).click();
        logger.info("Moved to PricingCalculatorPageFrame");
        return new CreateHomeGooglePageCalculator(driver/*, data*/);
    }
}
