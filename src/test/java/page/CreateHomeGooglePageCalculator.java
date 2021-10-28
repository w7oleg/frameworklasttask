package page;

import model.InstanceForm;
import model.ProcessData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TabsUtils;

import java.util.List;

import static utils.ComputeEngineUtils.active;
import static utils.LocatorUtils.positionElement;
import static utils.ResultUtils.saveResult;
import static waits.CustomWebElementWaits.waitBeforeChoosingMenuOptionAfterClick;

public class CreateHomeGooglePageCalculator extends AbstractPage {


    private final Logger logger = LogManager.getRootLogger();

    @FindBy(css = "#cloud-site > devsite-iframe > iframe")
    private WebElement iFrame;

    @FindBy(xpath = "//h2[@class='md-title']/b[contains(text(), 'USD')]")
    //private List<WebElement> result;
    private WebElement result;

    @FindBy(id = "myFrame")
    private WebElement iFrameCalculatorAfterIFrame;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement inputEmail;

    ProcessData data= new ProcessData();
    public CreateHomeGooglePageCalculator(WebDriver driver/*, ProcessData data*/) {
        super(driver/*, data*/);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public CreateHomeGooglePageCalculator openPage() {
        waitBeforeChoosingMenuOptionAfterClick(driver);
        logger.info("Opened page CloudGooglePageWithSearchingResultFrame");
        return this;
    }

    public CreateHomeGooglePageCalculator activationComputeEngine(String universalAddress, String element) {
        active(driver, iFrame, iFrameCalculatorAfterIFrame);
        logger.info("Moved to PricingCalculatorPageFrame");
        return this;
    }

    public CreateHomeGooglePageCalculator choiceNumberOfInstances(String universalAddress, String element) {
        WebElement position = waitBeforeChoosingMenuOptionAfterClick(universalAddress, element, driver);
        position.click();
        position.sendKeys(InstanceForm.getChoiceNumberOfInstances());
        logger.info("Entered instances" + element);
        return this;
    }

    public CreateHomeGooglePageCalculator choiceOperationSystem(String universalAddress, String element
            , String operationSystem, String locatorDown) {
        positionElement(universalAddress, element, driver).click();
        positionElement(locatorDown, operationSystem, driver).click();
        logger.info("Entered Operation System" + operationSystem);
        return this;
    }

    public CreateHomeGooglePageCalculator choiceMachineClass(String universalAddress, String element
            , String machineClass, String locatorDown) {
        positionElement(universalAddress, element, driver).click();
        positionElement(locatorDown, machineClass, driver).click();
        logger.info("Entered Machine Class" + machineClass);
        return this;
    }

    public CreateHomeGooglePageCalculator choiceSeries(String universalAddress, String element, String series
            , String locatorDown) {
        positionElement(universalAddress, element, driver).click();
        positionElement(locatorDown, series, driver).click();
        logger.info("Entered Series" + series);
        return this;
    }

    public CreateHomeGooglePageCalculator choiceMachineType(String universalAddress, String element, String type
            , String locatorDown) {
        positionElement(universalAddress, element, driver).click();
        positionElement(locatorDown, type, driver).click();
        logger.info("Entered MachineType" + type);
        return this;
    }

    public CreateHomeGooglePageCalculator addGPUs(String universalAddress, String element) {
        positionElement(universalAddress, element, driver).click();
        logger.info("Entered addGPUs");
        return this;
    }

    public CreateHomeGooglePageCalculator choiceNumberGPUs(String universalAddress, String element, String number
            , String locatorDown) {
        positionElement(universalAddress, element, driver).click();
        positionElement(locatorDown, number, driver).click();
        logger.info("Entered Number GPUs" + number);
        return this;
    }

    public CreateHomeGooglePageCalculator choiceTypeGPU(String universalAddress, String element, String type
            , String locatorDown) {
        positionElement(universalAddress, element, driver).click();
        positionElement(locatorDown, type, driver).click();
        logger.info("Entered Type GPU" + type);
        return this;
    }

    public CreateHomeGooglePageCalculator choiceLocalSSD(String universalAddress, String element, String local
            , String locatorDown) {
        positionElement(universalAddress, element, driver).click();
        positionElement(locatorDown, local, driver).click();
        logger.info("Entered Local SSD" + local);
        return this;
    }

    public CreateHomeGooglePageCalculator choiceDatacenterLocation(String universalAddress, String element, String center
            , String locatorDown) {
        positionElement(universalAddress, element, driver).click();
        positionElement(locatorDown, center, driver).click();
        logger.info("Entered Datacenter Location" + center);
        return this;
    }

    public CreateHomeGooglePageCalculator choiceCommittedUsage(String universalAddress, String element, String period
            , String locatorDown) {
        positionElement(universalAddress, element, driver).click();
        positionElement(locatorDown, period, driver).click();
        logger.info("Entered Committed Usage" + period);
        return this;
    }

    public CreateHomeGooglePageCalculator pressAddToEstimate(String universalAddress, String element) {
        waitBeforeChoosingMenuOptionAfterClick(universalAddress, element, driver).click();
        logger.info("Entered Add To Estimate");
        return this;
    }

    public CreateHomeGooglePageCalculator saveResultEstimate() {
      //  saveResult(/*data*/data.setCurrentPriceInCalculator(), result);
        data.setCurrentPriceInCalculator(result.getText());
        logger.info("Entered save Result Estimate");
        return this;
    }

    public CreateHomeGooglePageCalculator pressButtonEmailEstimate(String universalAddress, String element) {
        positionElement(universalAddress, element, driver).click();
        logger.info("Entered press Button EmailEstimate");
        return this;
    }

    public EmailEstimatePage openNewTab() {
        TabsUtils.openNewTab(1, driver);
        logger.info("open New Tab");
        return new EmailEstimatePage(driver/*, data*/);
    }

    public CreateHomeGooglePageCalculator enterEmail(String universalAddress, String element) {
        WebElement position = waitBeforeChoosingMenuOptionAfterClick(universalAddress, element, driver);
        position.sendKeys(Keys.LEFT_CONTROL, "v");
        logger.info("enter Email");
        return this;
    }

    public CreateHomeGooglePageCalculator pressButtonSendEmail(String universalAddress, String element) {
        waitBeforeChoosingMenuOptionAfterClick(universalAddress, element, driver).click();
        logger.info("press Button Send Email");
        return this;
    }

    public EmailEstimatePage returnToPageEmail() {
        TabsUtils.openNewTab(1, driver);
        logger.info("return to Page Email");
        return new EmailEstimatePage(driver/*, data*/);
    }
}
