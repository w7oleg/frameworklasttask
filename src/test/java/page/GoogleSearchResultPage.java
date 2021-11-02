package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static waits.CustomWebElementWaits.*;

public class GoogleSearchResultPage extends AbstractPage {
    protected GoogleSearchResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[b[contains(text(),'Calculator')]]")
    private WebElement searchResult;

    @Override
    protected GoogleSearchResultPage openPage() {
        waitPageLoad(driver);
        logger.info("Opened page CloudGooglePageWithSearchingResultFrame");
        return this;
    }

    public CreateHomeGooglePageCalculator openCalculator() {
        waitElementToBeClickable(searchResult, driver).click();
        logger.info("Moved to PricingCalculatorPageFrame");
        return new CreateHomeGooglePageCalculator(driver);
    }
}
