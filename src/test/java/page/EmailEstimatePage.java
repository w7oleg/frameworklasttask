package page;

import model.ProcessData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.ComparisonResults.comparisonResultsEmailWithDataSite;
import static utils.TabsUtils.openNewTab;
import static waits.CustomWebElementWaits.waitBeforeChoosingMenuOptionAfterClick;

public class EmailEstimatePage extends AbstractPage {
    private final Logger logger = LogManager.getRootLogger();
    private static final String HOME_PAGE_URL = "https://tempmail.io/ru/";//https://tempmail.io/ru/

    @FindBy(xpath = "//a[@onclick='copyToClipboard()']")
    private WebElement linkCopyRandomAddress;

    @FindBy(xpath = "//h3[contains(text(), 'USD')]")
    private WebElement fieldTotalPriceEstimateBill;

    protected EmailEstimatePage(WebDriver driver/*, ProcessData data*/) {
        super(driver/*, data*/);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public EmailEstimatePage openPage() {
        driver.navigate().to(HOME_PAGE_URL);
        logger.info("page opened");
        return this;
    }


    public EmailEstimatePage copyEmailAddress(String universalAddress, String element) {
        waitBeforeChoosingMenuOptionAfterClick(linkCopyRandomAddress, driver).click();
        logger.info("copy Email Address");
        return this;
    }

    public CreateHomeGooglePageCalculator comeBackToCalculator() {
        openNewTab(0, driver);
        logger.info("come back to Calculator");
        return new CreateHomeGooglePageCalculator(driver/*, data*/);
    }

    public EmailEstimatePage pressCheckMailButton(String universalAddress, String element) {
        waitBeforeChoosingMenuOptionAfterClick(universalAddress, element, driver).click();
        logger.info("press Check Mail Button");
        return this;
    }

    public String thisComparisonResultsReceivedEmailWithDataSite(/*String universalAddress, String element*/) {
//        logger.info("comparison Results Received Email WithDataSite");
//        return comparisonResultsEmailWithDataSite(universalAddress, element, driver);
       return fieldTotalPriceEstimateBill.getText();
    }
}
