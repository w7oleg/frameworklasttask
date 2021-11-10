package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import waits.CustomWebElementWaits;

import java.time.Duration;
import java.util.Collection;

import static utils.LocatorUtils.positionElement;
import static waits.CustomWebElementWaits.*;

public class GoogleSearchResultPage extends AbstractPage {
    protected GoogleSearchResultPage(WebDriver driver) {
        super(driver);
    }
    private static long WAIT_TIMEOUT_SECONDS = 10;

//    @FindBy(xpath = "//a[contains(text(), 'Google Cloud Platform Pricing')]")//a[b[contains(text(),'Calculator')]]
//    private WebElement searchResult1;
//
//    @FindBy(xpath = "//a[b[contains(text(),'Calculator')]]")
//    private WebElement searchResult2;

    String str="//a[contains(text(), 'Google Cloud Platform Pricing')]";

    @Override
    protected GoogleSearchResultPage openPage() {
        waitPageLoad(driver);
        logger.info("Opened page CloudGooglePageWithSearchingResultFrame");
        return this;
    }

    public CreateHomeGooglePageCalculator openCalculator() {
        String str1 = "//a[contains(text(), 'Google Cloud Platform Pricing')]";
        String str2 = "//a[b[contains(text(),'Calculator')]]";
        int i = driver.findElements(By.xpath("//a[contains(text(), 'Google Cloud Platform Pricing')]")).size();
        if (i > 0) {
            positionElement(str1, driver).click();
        }else{
            positionElement(str2, driver).click();
            }
            logger.info("Moved to PricingCalculatorPageFrame");
            return new CreateHomeGooglePageCalculator(driver);
        }

    }
