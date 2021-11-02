package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.TabsUtils.openNewTab;
import static waits.CustomWebElementWaits.waitElementToBeClickable;

public class EmailEstimatePage extends AbstractPage {
    private static final String HOME_PAGE_URL = "https://tempmail.io/ru/";

    @FindBy(xpath = "//a[@onclick='copyToClipboard()']")
    private WebElement linkCopyRandomAddress;

    @FindBy(xpath = "//h3[contains(text(), 'USD')]")
    private WebElement fieldTotalPriceEstimateBill;

    @FindBy(xpath = "//*[@id='email_list']/div[2]/div/div/a/span[2]")
    private WebElement locatorCheckEmail;

    protected EmailEstimatePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public EmailEstimatePage openPage() {
        driver.navigate().to(HOME_PAGE_URL);
        logger.info("page opened");
        return this;
    }

    public EmailEstimatePage copyEmailAddress() {
        waitElementToBeClickable(linkCopyRandomAddress, driver).click();
        logger.info("copy Email Address");
        return this;
    }

    public CreateHomeGooglePageCalculator comeBackToCalculator() {
        openNewTab(0, driver);
        logger.info("come back to Calculator");
        return new CreateHomeGooglePageCalculator(driver);
    }

    public EmailEstimatePage pressCheckMailButton() {
        waitElementToBeClickable(locatorCheckEmail, driver).click();
        logger.info("press Check Mail Button");
        return this;
    }

    public String thisComparisonResultsReceivedEmailWithDataSite() {
        return fieldTotalPriceEstimateBill.getText();
    }
}
