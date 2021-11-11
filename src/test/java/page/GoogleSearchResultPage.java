package page;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

import java.util.NoSuchElementException;

import static utils.LocatorUtils.positionElement;
import static waits.CustomWebElementWaits.waitPageLoad;


public class GoogleSearchResultPage extends AbstractPage {
    protected GoogleSearchResultPage(WebDriver driver) {
        super(driver);
    }

    String locatorOfTheFirstVersionOfThePage = "//a[contains(text(), 'Google Cloud Platform Pricing')]";
    String locatorOfTheSecondPageOption = "//a[b[contains(text(),'Calculator')]]";

    @Override
    protected GoogleSearchResultPage openPage() {
        waitPageLoad(driver);
        logger.info("Opened page CloudGooglePageWithSearchingResultFrame");
        return this;
    }

    public CreateHomeGooglePageCalculator openCalculator() {
        try {
            positionElement(locatorOfTheFirstVersionOfThePage, driver).click();
        } catch (TimeoutException | NoSuchElementException e) {
            System.out.println("the first version of the page was not found, I turn to the third version" + e);
        }

        try {
            positionElement(locatorOfTheSecondPageOption, driver).click();
        } catch (NoSuchElementException e) {
            System.out.println("the first option worked" + e);
        }
        return new CreateHomeGooglePageCalculator(driver);
    }
}
